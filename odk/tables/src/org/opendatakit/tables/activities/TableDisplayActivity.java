/*
F * Copyright (C) 2014 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.opendatakit.tables.activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.CharEncoding;
import org.opendatakit.aggregate.odktables.rest.RFC4180CsvReader;
import org.opendatakit.common.android.data.PossibleTableViewTypes;
import org.opendatakit.common.android.data.TableViewType;
import org.opendatakit.common.android.data.UserTable;
import org.opendatakit.common.android.database.DatabaseFactory;
import org.opendatakit.common.android.utilities.ODKDatabaseUtils;
import org.opendatakit.common.android.utilities.TableUtil;
import org.opendatakit.common.android.utilities.WebLogger;
import org.opendatakit.tables.R;
import org.opendatakit.tables.fragments.DetailViewFragment;
import org.opendatakit.tables.fragments.GraphViewFragment;
import org.opendatakit.tables.fragments.ListViewFragment;
import org.opendatakit.tables.fragments.MapListViewFragment;
import org.opendatakit.tables.fragments.SpreadsheetFragment;
import org.opendatakit.tables.fragments.TableMapInnerFragment;
import org.opendatakit.tables.fragments.TableMapInnerFragment.TableMapInnerFragmentListener;
import org.opendatakit.tables.utils.ActivityUtil;
import org.opendatakit.tables.utils.CollectUtil;
import org.opendatakit.tables.utils.Constants;
import org.opendatakit.tables.utils.IntentUtil;
import org.opendatakit.tables.utils.SQLQueryStruct;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import dtt.company.adapter.Adapter;
import dtt.company.adapter.Model;
import dtt.company.sqlite.Sqlite;
import dtt.company.sqlite.SqliteLoc;
import dtt.company.sqlite.TimTenSqlite;

/**
 * Displays information about a table. List, Map, and Detail views are all
 * displayed via this activity.
 * 
 * @author sudar.sam@gmail.com
 *
 */
public class TableDisplayActivity extends AbsTableActivity implements
		TableMapInnerFragmentListener {
	private AutoCompleteTextView autoComplete;
	private LinearLayout timkiemten;
	private ArrayAdapter<String> adapter1;
	final Context context = this;
	List<Model> list = new ArrayList<Model>();
	ArrayAdapter<Model> adapter;
	private static final String TAG = TableDisplayActivity.class
			.getSimpleName();
	private static final String INTENT_KEY_CURRENT_FRAGMENT = "saveInstanceCurrentFragment";
	String id = this.getTableId();

	/**
	 * The fragment types this activity could be displaying.
	 * 
	 * @author sudar.sam@gmail.com
	 *
	 */
	public enum ViewFragmentType {
		SPREADSHEET, LIST, MAP, DETAIL;
	}

	/**
	 * The {@link UserTable} that is being displayed in this activity.
	 */
	private UserTable mUserTable;
	private String sapxep, timkiem, key, page, oder_check, loc, keyloc, timten;
	private int position_check, oder_position, loc_position;

	/**
	 * The type of fragment that is currently being displayed.
	 */
	private ViewFragmentType mCurrentFragmentType;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle extras = getIntent().getExtras();
		String all = extras.getString("all");
		loc = extras.getString("loc");
		timten = extras.getString("timten");
		keyloc = extras.getString("loc_position");
		sapxep = extras.getString("oder");
		timkiem = extras.getString("timkiem");
		page = extras.getString("page");
		key = extras.getString("vitri");
		oder_check = extras.getString("oder_position");
		if (key != null) {
			this.position_check = Integer.parseInt(key);
		}
		if (oder_check != null) {
			this.oder_position = Integer.parseInt(oder_check);
		}
		if (keyloc != null) {
			this.loc_position = Integer.parseInt(keyloc);
		}
		if ("null".equals(timkiem)) {
			timkiem = null;
			position_check = 0;
		}

		// see if we saved the state

		if (all != null) {
			if (all.equals("1")) {
				this.initializeBackingTable(null, null);
				this.loc_position = 0;
				this.position_check = 0;
				this.oder_position = 0;

			}
			if (all.equals("0")) {
				if (timkiem == null && loc == null) {
					this.initializeBackingTable(sapxep, null);

				}
				if (timkiem == null && loc != null) {
					String dieukienloc;
					if (this.getTableId().equals("kdv_vs_congtrinhcongcong")) {
						dieukienloc = "DiaChi='" + loc + "'";
					} else {
						dieukienloc = "ThonXom='" + loc + "'";
					}
					this.initializeBackingTable(sapxep, dieukienloc);
				}
				if (timkiem != null && loc == null) {
					this.initializeBackingTable(sapxep, timkiem);
				}
				if (timkiem != null && loc != null) {
					StringBuilder s = new StringBuilder();
					if (this.getTableId().equals("kdv_vs_congtrinhcongcong")) {
						s.append(timkiem).append(" and DiaChi='").append(loc)
								.append("'");
					} else {
						s.append(timkiem).append(" and ThonXom='").append(loc)
								.append("'");
					}
					String dieukienloc = s.toString();
					this.initializeBackingTable(sapxep, dieukienloc);
				}
			}
		}
		if (all == null) {
			if (timten != null) {
				String timkiemten = "TenChuHo='" + timten + "'";
				if (this.getTableId().equals("kdv_vs_congtrinhcongcong")) {
					timkiemten = "TenCongTrinh='" + timten + "'";
				}
				this.initializeBackingTable(null, timkiemten);
			} else {

				if (timkiem == null && loc == null) {
					this.initializeBackingTable(sapxep, null);

				}
				if (timkiem == null && loc != null) {
					String dieukienloc;
					if (this.getTableId().equals("kdv_vs_congtrinhcongcong")) {
						dieukienloc = "DiaChi='" + loc + "'";
					} else {
						dieukienloc = "ThonXom='" + loc + "'";
					}
					this.initializeBackingTable(sapxep, dieukienloc);
				}
				if (timkiem != null && loc == null) {

					this.initializeBackingTable(sapxep, timkiem);
				}
				if (timkiem != null && loc != null) {
					StringBuilder s = new StringBuilder();
					if (this.getTableId().equals("kdv_vs_congtrinhcongcong")) {
						s.append(timkiem).append(" and DiaChi='").append(loc)
								.append("'");
					} else {
						s.append(timkiem).append(" and ThonXom='").append(loc)
								.append("'");
					}
					String dieukienloc = s.toString();
					this.initializeBackingTable(sapxep, dieukienloc);
				}

			}
		}
		// this.initializeBackingTable(sapxep, timkiem);
		if (page != null) {
			if (page.toUpperCase().equals("SPREADSHEET")) {
				this.mCurrentFragmentType = ViewFragmentType.SPREADSHEET;
			}
			if (page.toUpperCase().equals("LIST")) {
				this.mCurrentFragmentType = ViewFragmentType.LIST;

			}
			if (page.toUpperCase().equals("MAP")) {
				this.mCurrentFragmentType = ViewFragmentType.MAP;
			}

		} else {
			this.mCurrentFragmentType = this
					.retrieveFragmentTypeToDisplay(savedInstanceState);
		}

		this.setContentView(R.layout.activity_table_display_activity);
		if (this.mCurrentFragmentType == ViewFragmentType.LIST) {
			autoComplete = (AutoCompleteTextView) findViewById(R.id.autoComplete);
			timkiemten = (LinearLayout) findViewById(R.id.timkiemten);
			timkiemten.setVisibility(View.VISIBLE);
			getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
			List<String> list = new ArrayList<String>();
			if (this.getTableId().equals("kdv_dnn_hogiadinh")) {
				list = TimTenSqlite.getTenChuHo();
			}
			if (this.getTableId().equals("kdv_vs_hogiadinh")) {
				list = TimTenSqlite.getTenChuHoVeSinh();
			}
			if (this.getTableId().equals("kdv_vs_congtrinhcongcong")) {
				list = TimTenSqlite.getTenChuHoCongTrinh();
			}
			adapter1 = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1, list);

			autoComplete.setAdapter(adapter1);
			autoComplete.setThreshold(1);
			autoComplete.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					// Toast.makeText(
					// getBaseContext(),
					// "MultiAutoComplete: " + "you add color "
					// + arg0.getItemAtPosition(arg2),
					// Toast.LENGTH_LONG).show();
					String name = arg0.getItemAtPosition(arg2).toString();
					Intent intent = getIntent();
					intent.putExtra("timten", name);
					startActivity(intent);
				}
			});
		}

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		return false;
		// Disable back button..............
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		this.mCurrentFragmentType = this
				.retrieveFragmentTypeToDisplay(savedInstanceState);
		WebLogger.getLogger(getAppName()).i(
				TAG,
				"[onRestoreInstanceState] current fragment type: "
						+ this.mCurrentFragmentType);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		WebLogger.getLogger(getAppName()).d(TAG, "[onDestroy]");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		if (this.mCurrentFragmentType != null) {
			WebLogger.getLogger(getAppName()).i(
					TAG,
					"[onSaveInstanceState] saving current fragment type: "
							+ this.mCurrentFragmentType.name());
			outState.putString(INTENT_KEY_CURRENT_FRAGMENT,
					this.mCurrentFragmentType.name());
		} else {
			WebLogger.getLogger(getAppName()).i(TAG,
					"[onSaveInstanceState] no current fragment type to save");
		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		WebLogger.getLogger(getAppName()).i(TAG, "[onResume]");
		this.initializeDisplayFragment();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.clear();
		MenuInflater menuInflater = this.getMenuInflater();
		// clear the menu so that we don't double inflate
		switch (this.getCurrentFragmentType()) {
		case SPREADSHEET:
		case LIST:
		case MAP:
			menuInflater.inflate(R.menu.top_level_table_menu, menu);
			SQLiteDatabase db = null;
			PossibleTableViewTypes viewTypes = null;

			try {
				db = DatabaseFactory.get().getDatabase(this, getAppName());
				viewTypes = new PossibleTableViewTypes(db, getTableId(),
						getColumnDefinitions());
			} finally {
				if (db != null) {
					db.close();
				}
			}
			this.enableAndDisableViewTypes(viewTypes, menu);
			this.selectCorrectViewType(menu);
			break;
		case DETAIL:
			menuInflater.inflate(R.menu.detail_view_menu, menu);
			break;

		}
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.top_level_table_menu_timkiem:
			this.showDialogTimkiem();
			return true;
		case R.id.top_level_table_menu_all:
			Intent intent = getIntent();
			intent.putExtra("all", "1");
			startActivity(intent);
			return true;
		case R.id.top_level_table_menu_sapxep:
			this.showDialogOder();
			return true;

		case R.id.top_level_table_menu_loctimkiem:
			this.showDialogLocNuoc();
			return true;
		case R.id.top_level_table_menu_view_spreadsheet_view:
			this.showSpreadsheetFragment();
			return true;
		case R.id.top_level_table_menu_view_list_view:
			this.showListFragment();
			return true;
		case R.id.top_level_table_menu_table_home:
			startActivity(new Intent(this, WebViewActivity.class));
			return true;
		case R.id.top_level_table_menu_view_map_view:
			this.showMapFragment();
			return true;
		case R.id.top_level_table_menu_add:
			WebLogger.getLogger(getAppName()).d(TAG,
					"[onOptionsItemSelected] add selected");
			ActivityUtil.addRow(this, this.getAppName(), this.getTableId(),
					this.getColumnDefinitions(), null);
			return true;
			// case R.id.top_level_table_menu_table_properties:
			// ActivityUtil
			// .launchTableLevelPreferencesActivity(
			// this,
			// this.getAppName(),
			// this.getTableId(),
			// TableLevelPreferencesActivity.FragmentType.TABLE_PREFERENCE);
			// return true;
		case R.id.menu_edit_row:
			// We need to retrieve the row id.
			DetailViewFragment detailViewFragment = this
					.findDetailViewFragment();
			if (detailViewFragment == null) {
				WebLogger.getLogger(getAppName()).e(
						TAG,
						"[onOptionsItemSelected] trying to edit row, but detail view "
								+ " fragment null");
				Toast.makeText(this,
						getString(R.string.cannot_edit_row_please_try_again),
						Toast.LENGTH_LONG).show();
			}
			String rowId = detailViewFragment.getRowId();
			if (rowId == null) {
				WebLogger
						.getLogger(getAppName())
						.e(TAG,
								"[onOptionsItemSelected trying to edit row, but row id is null");
				Toast.makeText(this,
						getString(R.string.cannot_edit_row_please_try_again),
						Toast.LENGTH_LONG).show();
			}
			ActivityUtil.editRow(this, this.getAppName(), this.getTableId(),
					this.getColumnDefinitions(), rowId);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private void showDialogTimkiem() {
		int i, j = 0, n;
		int k = 0;
		final List<String[]> tile = readCsv(context);
		final ViewFragmentType fage = this.mCurrentFragmentType;
		for (n = 0; n < tile.size(); n++) {
			if ("filter".equals(tile.get(n)[0])) {
				j++;
			}
		}
		String[] name = new String[j];
		final Dialog dialog = new Dialog(context);
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		dialog.getWindow().setBackgroundDrawableResource(
				android.R.color.transparent);
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		View layout = inflater.inflate(R.layout.dialog_sapxep, null);
		dialog.addContentView(layout, new LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		dialog.setContentView(R.layout.dialog_sapxep);
		final ListView lv = (ListView) dialog.findViewById(R.id.list_oder);
		TextView title = (TextView) dialog.findViewById(R.id.title);
		title.setText("Lọc theo trạng thái");
		for (i = 0; i < tile.size(); i++) {
			if ("filter".equals(tile.get(i)[0])) {
				name[k] = tile.get(i)[1].toString();
				k++;
			}
		}
		List<Model> list = new ArrayList<Model>();
		for (String elementKey : name) {
			list.add(new Model(elementKey));

		}

		if (position_check >= 0) {

			Model m = new Model(name[position_check], true);
			list.set(position_check, m);
		}
		adapter = new Adapter(this, list);
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				RadioButton checkbox = (RadioButton) view.getTag(R.id.radioBT);
				checkbox.setChecked(true);
				Model model = (Model) (lv.getItemAtPosition(position));
				String selectedFromList = model.getName();
				for (int n = 0; n < tile.size(); n++) {
					if (selectedFromList.equals(tile.get(n)[1])) {
						String mj = tile.get(n)[2].toString();
						Intent intent = getIntent();
						StringBuilder s = new StringBuilder();
						s.append(mj);
						intent.putExtra("timkiem", s.toString());
						intent.putExtra("vitri", String.valueOf(position));
						intent.putExtra("all", "0");
						switch (fage) {
						case SPREADSHEET:
							intent.putExtra("page", "SPREADSHEET");
							break;
						case LIST:
							intent.putExtra("page", "LIST");
							break;
						case MAP:
							intent.putExtra("page", "MAP");
							break;
						case DETAIL:
							intent.putExtra("page", "DETAIL");
							break;
						default:
							break;
						}
						finish();
						startActivity(intent);

					}
				}

			}

		});
		dialog.show();

	}

	private void showDialogOder() {
		int i, j = 0, n;
		int k = 0;
		final List<String[]> tile = readCsv(context);
		for (n = 0; n < tile.size(); n++) {
			if ("sort".equals(tile.get(n)[0])) {
				j++;
			}
		}
		String[] name = new String[j];
		final ViewFragmentType fage = this.mCurrentFragmentType;
		final Dialog dialog = new Dialog(context);

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		dialog.getWindow().setBackgroundDrawableResource(
				android.R.color.transparent);
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		View layout = inflater.inflate(R.layout.dialog_sapxep, null);
		dialog.addContentView(layout, new LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		dialog.setContentView(R.layout.dialog_sapxep);
		final ListView lv = (ListView) dialog.findViewById(R.id.list_oder);
		TextView title = (TextView) dialog.findViewById(R.id.title);
		title.setText("Sắp xếp theo");
		for (i = 0; i < tile.size(); i++) {
			if ("sort".equals(tile.get(i)[0])) {
				name[k] = tile.get(i)[1].toString();
				k++;
			}
		}
		List<Model> list = new ArrayList<Model>();
		for (String elementKey : name) {
			list.add(new Model(elementKey));
		}
		if (oder_position >= 0) {
			Model m = new Model(name[oder_position], true);
			list.set(oder_position, m);
		}
		adapter = new Adapter(this, list);
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Model model = (Model) (lv.getItemAtPosition(position));
				String selectedFromList = model.getName();
				for (int n = 0; n < tile.size(); n++) {
					if (selectedFromList.equals(tile.get(n)[1])) {
						String oder_key = tile.get(n)[2].toString();
						Intent intent = getIntent();
						intent.putExtra("oder", oder_key);
						intent.putExtra("oder_position",
								String.valueOf(position));
						intent.putExtra("all", "0");
						switch (fage) {
						case SPREADSHEET:
							intent.putExtra("page", "SPREADSHEET");
							break;
						case LIST:
							intent.putExtra("page", "LIST");
							break;
						case MAP:
							intent.putExtra("page", "MAP");
							break;
						case DETAIL:
							intent.putExtra("page", "DETAIL");
							break;
						default:
							break;
						}
						finish();
						startActivity(intent);
					}
				}

			}

		});
		dialog.show();
	}

	private void showDialogLocNuoc() {
		final ViewFragmentType fage = this.mCurrentFragmentType;
		final Dialog dialog = new Dialog(context);
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		dialog.getWindow().setBackgroundDrawableResource(
				android.R.color.transparent);
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		View layout = inflater.inflate(R.layout.dialog_loc, null);
		dialog.addContentView(layout, new LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		dialog.setContentView(R.layout.dialog_loc);
		final ListView lv = (ListView) dialog.findViewById(R.id.list_loc);
		TextView title = (TextView) dialog.findViewById(R.id.title);
		List<Model> list = new ArrayList<Model>();
		if (this.getTableId().equals("kdv_dnn_hogiadinh")) {
			list = SqliteLoc.getThonNuoc();
		}
		if (this.getTableId().equals("kdv_vs_hogiadinh")) {
			list = SqliteLoc.getThonGiaDinh();
		}
		if (this.getTableId().equals("kdv_vs_congtrinhcongcong")) {
			list = SqliteLoc.getThonCongCong();
		}
		if (loc_position >= 0 && list.size() > 0) {
			Model m = new Model(list.get(loc_position).getName(), true);
			list.set(loc_position, m);
		}
		if (list.size() == 0) {
			title.setText(getString(R.string.dialogloc));
		}
		adapter = new Adapter(this, list);
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Model model = (Model) (lv.getItemAtPosition(position));
				String selectedFromList = model.getName();
				Intent intent = getIntent();
				intent.putExtra("loc", selectedFromList);
				intent.putExtra("loc_position", String.valueOf(position));
				intent.putExtra("all", "0");
				intent.putExtra("timkiem", "null");
				switch (fage) {
				case SPREADSHEET:
					intent.putExtra("page", "SPREADSHEET");
					break;
				case LIST:
					intent.putExtra("page", "LIST");
					break;
				case MAP:
					intent.putExtra("page", "MAP");
					break;
				case DETAIL:
					intent.putExtra("page", "DETAIL");
					break;
				default:
					break;
				}
				finish();
				startActivity(intent);
			}
		});
		dialog.show();
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case Constants.RequestCodes.LAUNCH_CHECKPOINT_RESOLVER:
		case Constants.RequestCodes.LAUNCH_CONFLICT_RESOLVER:
			// these are no-ops on return, as the onResume() method will deal
			// with
			// any fall-out from them.
			this.refreshDataTable();
			this.refreshDisplayFragment();
			break;
		// For now, we will just refresh the table if something could have
		// changed.
		case Constants.RequestCodes.ADD_ROW_COLLECT:
			if (resultCode == Activity.RESULT_OK) {
				WebLogger
						.getLogger(getAppName())
						.d(TAG,
								"[onActivityResult] result ok, refreshing backing table");
				CollectUtil.handleOdkCollectAddReturn(getBaseContext(),
						getAppName(), getTableId(), resultCode, data);

				this.refreshDataTable();
				// We also want to cause the fragments to redraw themselves, as
				// their
				// data may have changed.
				this.refreshDisplayFragment();
			} else {
				WebLogger.getLogger(getAppName()).d(
						TAG,
						"[onActivityResult] result canceled, not refreshing backing "
								+ "table");
			}
			break;
		case Constants.RequestCodes.EDIT_ROW_COLLECT:
			if (resultCode == Activity.RESULT_OK) {
				WebLogger
						.getLogger(getAppName())
						.d(TAG,
								"[onActivityResult] result ok, refreshing backing table");
				CollectUtil.handleOdkCollectEditReturn(getBaseContext(),
						getAppName(), getTableId(), resultCode, data);

				this.refreshDataTable();
				// We also want to cause the fragments to redraw themselves, as
				// their
				// data may have changed.
				this.refreshDisplayFragment();
			} else {
				WebLogger.getLogger(getAppName()).d(
						TAG,
						"[onActivityResult] result canceled, not refreshing backing "
								+ "table");
			}
			break;
		case Constants.RequestCodes.ADD_ROW_SURVEY:
		case Constants.RequestCodes.EDIT_ROW_SURVEY:
			if (resultCode == Activity.RESULT_OK) {
				WebLogger
						.getLogger(getAppName())
						.d(TAG,
								"[onActivityResult] result ok, refreshing backing table");
			} else {
				WebLogger
						.getLogger(getAppName())
						.d(TAG,
								"[onActivityResult] result canceled, refreshing backing table");
			}
			// verify that the data table doesn't contain checkpoints...
			// always refresh, as survey may have done something
			this.refreshDataTable();
			this.refreshDisplayFragment();
			break;
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

	/**
	 * Disable or enable those menu items corresponding to view types that are
	 * currently invalid or valid, respectively. The inflatedMenu must have
	 * already been created from the resource.
	 * 
	 * @param validViewTypes
	 * @param inflatedMenu
	 */
	private void enableAndDisableViewTypes(
			PossibleTableViewTypes possibleViews, Menu inflatedMenu) {
		MenuItem spreadsheetItem = inflatedMenu
				.findItem(R.id.top_level_table_menu_view_spreadsheet_view);
		MenuItem listItem = inflatedMenu
				.findItem(R.id.top_level_table_menu_view_list_view);
		MenuItem mapItem = inflatedMenu
				.findItem(R.id.top_level_table_menu_view_map_view);

		spreadsheetItem.setEnabled(possibleViews.spreadsheetViewIsPossible());
		listItem.setEnabled(possibleViews.listViewIsPossible());
		mapItem.setEnabled(possibleViews.mapViewIsPossible());

	}

	/**
	 * Selects the correct view type that is being displayed by the
	 * {@link ITopLevelTableMenuActivity}.
	 * 
	 * @param impl
	 * @param inflatedMenu
	 */
	private void selectCorrectViewType(Menu inflatedMenu) {
		ViewFragmentType currentFragment = this.getCurrentFragmentType();
		if (currentFragment == null) {
			WebLogger
					.getLogger(getAppName())
					.e(TAG,
							"did not find a current fragment type. Not selecting view.");
			return;
		}
		MenuItem menuItem = null;
		switch (currentFragment) {
		case SPREADSHEET:
			menuItem = inflatedMenu
					.findItem(R.id.top_level_table_menu_view_spreadsheet_view);
			menuItem.setChecked(true);
			break;
		case LIST:
			menuItem = inflatedMenu
					.findItem(R.id.top_level_table_menu_view_list_view);
			menuItem.setChecked(true);
			break;
		case MAP:
			menuItem = inflatedMenu
					.findItem(R.id.top_level_table_menu_view_map_view);
			menuItem.setChecked(true);
			break;
		default:
			WebLogger.getLogger(getAppName()).e(TAG,
					"view type not recognized: " + currentFragment);
		}
	}

	@Override
	protected void onStart() {
		super.onStart();
		WebLogger.getLogger(getAppName()).i(TAG, "[onStart]");
	}

	public void refreshDisplayFragment() {
		WebLogger.getLogger(getAppName()).d(TAG, "[refreshDisplayFragment]");
		this.helperInitializeDisplayFragment(true);
	}

	protected void initializeDisplayFragment() {
		this.helperInitializeDisplayFragment(false);
	}

	/**
	 * Initialize the correct display fragment based on the result of
	 * {@link #retrieveTableIdFromIntent()}. Initializes Spreadsheet if none is
	 * present in Intent.
	 */
	private void helperInitializeDisplayFragment(boolean createNew) {
		switch (this.mCurrentFragmentType) {
		case SPREADSHEET:
			this.showSpreadsheetFragment(createNew);
			break;
		case DETAIL:
			this.showDetailFragment(createNew);
			break;
		case LIST:
			this.showListFragment(createNew);
			break;
		case MAP:
			this.showMapFragment(createNew);
			break;

		default:
			WebLogger.getLogger(getAppName()).e(
					TAG,
					"ViewFragmentType not recognized: "
							+ this.mCurrentFragmentType);
			break;
		}
	}

	/**
	 * Set the current type of fragment that is being displayed.
	 * 
	 * @param currentType
	 */
	protected void setCurrentFragmentType(ViewFragmentType currentType) {
		this.mCurrentFragmentType = currentType;
		this.invalidateOptionsMenu();
	}

	/**
	 * @return the {@link ViewFragmentType} that was passed in the intent, or
	 *         null if none exists.
	 */
	protected ViewFragmentType retrieveViewFragmentTypeFromIntent() {
		if (this.getIntent().getExtras() == null) {
			return null;
		}
		String viewFragmentTypeStr = this.getIntent().getExtras()
				.getString(Constants.IntentKeys.TABLE_DISPLAY_VIEW_TYPE);
		if (viewFragmentTypeStr == null) {
			return null;
		} else {
			ViewFragmentType result = ViewFragmentType
					.valueOf(viewFragmentTypeStr);
			return result;
		}
	}

	/**
	 * Get the {@link ViewFragmentType} that should be displayed. Any type in
	 * the passed in bundle takes precedence, on the assumption that is was from
	 * a saved instance state. Next is any type that was passed in the Intent.
	 * If neither is present, the value corresponding to
	 * {@link TableUtil#getDefaultViewType()} wins. If none is present, returns
	 * {@link ViewFragmentType#SPREADSHEET}.
	 * 
	 * @return
	 */
	protected ViewFragmentType retrieveFragmentTypeToDisplay(
			Bundle savedInstanceState) {
		// 1) First check the passed in bundle.
		if (savedInstanceState != null
				&& savedInstanceState.containsKey(INTENT_KEY_CURRENT_FRAGMENT)) {
			String instanceTypeStr = savedInstanceState
					.getString(INTENT_KEY_CURRENT_FRAGMENT);
			WebLogger.getLogger(getAppName()).i(
					TAG,
					"[retrieveFragmentTypeToDisplay] found type in saved instance"
							+ " state: " + instanceTypeStr);
			return ViewFragmentType.valueOf(instanceTypeStr);
		}
		WebLogger.getLogger(getAppName()).i(
				TAG,
				"[retrieveFragmentTypeToDisplay] didn't find fragment type "
						+ "in saved instance state");
		// 2) then check the intent
		ViewFragmentType result = retrieveViewFragmentTypeFromIntent();
		if (result == null) {
			// 3) then use the default
			TableViewType type;
			SQLiteDatabase db = null;
			try {
				db = DatabaseFactory.get().getDatabase(this, getAppName());
				type = TableUtil.get().getDefaultViewType(db, getTableId());
			} finally {
				if (db != null) {
					db.close();
				}
			}
			result = this.getViewFragmentTypeFromViewType(type);
		}
		if (result == null) {
			// 4) last case, do spreadsheet
			WebLogger.getLogger(getAppName()).i(
					TAG,
					"[retrieveFragmentTypeToDisplay] no view type found, "
							+ "defaulting to spreadsheet");
			result = ViewFragmentType.SPREADSHEET;
		}
		return result;
	}

	/**
	 * Get the {@link ViewFragmentType} that corresponds to
	 * {@link TableViewType}. If no match is found, returns null.
	 * 
	 * @param viewType
	 * @return
	 */
	public ViewFragmentType getViewFragmentTypeFromViewType(
			TableViewType viewType) {
		switch (viewType) {
		case SPREADSHEET:
			return ViewFragmentType.SPREADSHEET;
		case MAP:
			return ViewFragmentType.MAP;
		case LIST:
			return ViewFragmentType.LIST;
		default:
			WebLogger.getLogger(getAppName()).e(TAG,
					"viewType " + viewType + " not recognized.");
			return null;
		}
	}

	/**
	 * Initialize {@link TableDisplayActivity#mUserTable}.
	 */
	private void initializeBackingTable(String sapxep, String timkiem) {
		UserTable userTable = this.retrieveUserTable(sapxep, timkiem);
		this.mUserTable = userTable;
	}

	/**
	 * Get the {@link UserTable} that is being held by this activity.
	 * 
	 * @return
	 */
	public UserTable getUserTable() {
		return this.mUserTable;
	}

	/**
	 * Refresh the data being displayed.
	 */
	public void refreshDataTable() {
		this.initializeBackingTable(null, null);
	}

	/**
	 * Get the {@link UserTable} from the database that should be displayed.
	 * 
	 * @return
	 */
	UserTable retrieveUserTable(String sapxep, String timkiem) {
		SQLQueryStruct sqlQueryStruct = this
				.retrieveSQLQueryStatStructFromIntent();
		SQLiteDatabase db = null;
		try {
			db = DatabaseFactory.get().getDatabase(this, getAppName());
			UserTable result = ODKDatabaseUtils.get().rawSqlQuery(db,
					this.getAppName(), this.getTableId(),
					getColumnDefinitions(), timkiem,
					sqlQueryStruct.selectionArgs, sqlQueryStruct.groupBy,
					sqlQueryStruct.having, sapxep,
					sqlQueryStruct.orderByDirection);
			return result;
		} finally {
			if (db != null) {
				db.close();
			}
		}
	}

	/**
	 * Retrieve the {@link SQLQueryStruct} specified in the {@link Intent} that
	 * restricts the current table.
	 * 
	 * @return
	 */
	SQLQueryStruct retrieveSQLQueryStatStructFromIntent() {
		SQLQueryStruct result = IntentUtil.getSQLQueryStructFromBundle(this
				.getIntent().getExtras());
		return result;
	}

	/**
	 * Show the spreadsheet fragment, creating a new one if it doesn't yet
	 * exist.
	 */
	public void showSpreadsheetFragment() {
		this.showSpreadsheetFragment(false);
	}

	/**
	 * Show the spreadsheet fragment.
	 * 
	 * @param createNew
	 */
	public void showSpreadsheetFragment(boolean createNew) {
		this.setCurrentFragmentType(ViewFragmentType.SPREADSHEET);
		this.updateChildViewVisibility(ViewFragmentType.SPREADSHEET);
		FragmentManager fragmentManager = this.getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		// Hide all the other fragments.
		this.hideAllOtherViewFragments(ViewFragmentType.SPREADSHEET,
				fragmentTransaction);
		// Try to retrieve one already there.
		SpreadsheetFragment spreadsheetFragment = (SpreadsheetFragment) fragmentManager
				.findFragmentByTag(Constants.FragmentTags.SPREADSHEET);
		if (spreadsheetFragment == null) {
			WebLogger.getLogger(getAppName()).d(
					TAG,
					"[showSpreadsheetFragment] no existing spreadshseet "
							+ "fragment found");
		} else {
			WebLogger.getLogger(getAppName()).d(
					TAG,
					"[showSpreadsheetFragment] existing spreadsheet fragment "
							+ "found");
		}
		WebLogger.getLogger(getAppName()).d(TAG,
				"[showSpreadsheetFragment] createNew is: " + createNew);
		if (spreadsheetFragment == null || createNew) {
			if (spreadsheetFragment != null) {
				WebLogger.getLogger(getAppName()).d(TAG,
						"[showSpreadsheetFragment] removing existing fragment");
				// Get rid of the existing fragment
				fragmentTransaction.remove(spreadsheetFragment);
			}
			spreadsheetFragment = this.createSpreadsheetFragment();
			fragmentTransaction.add(
					R.id.activity_table_display_activity_one_pane_content,
					spreadsheetFragment, Constants.FragmentTags.SPREADSHEET);
		} else {
			fragmentTransaction.show(spreadsheetFragment);
		}
		fragmentTransaction.commit();
	}

	/**
	 * Hide every fragment except that specified by fragmentToKeepVisible.
	 * 
	 * @param fragmentToKeepVisible
	 * @param fragmentTransaction
	 *            the transaction on which the calls to hide the fragments is to
	 *            be performed
	 */
	private void hideAllOtherViewFragments(
			ViewFragmentType fragmentToKeepVisible,
			FragmentTransaction fragmentTransaction) {
		FragmentManager fragmentManager = this.getFragmentManager();
		// First acquire all the possible fragments.
		Fragment spreadsheet = fragmentManager
				.findFragmentByTag(Constants.FragmentTags.SPREADSHEET);
		Fragment list = fragmentManager
				.findFragmentByTag(Constants.FragmentTags.LIST);
		Fragment graphManager = fragmentManager
				.findFragmentByTag(Constants.FragmentTags.GRAPH_MANAGER);
		Fragment mapList = fragmentManager
				.findFragmentByTag(Constants.FragmentTags.MAP_LIST);
		Fragment mapInner = fragmentManager
				.findFragmentByTag(Constants.FragmentTags.MAP_INNER_MAP);
		Fragment detailFragment = fragmentManager
				.findFragmentByTag(Constants.FragmentTags.DETAIL_FRAGMENT);
		Fragment graphViewFragment = fragmentManager
				.findFragmentByTag(Constants.FragmentTags.GRAPH_VIEW);
		if (fragmentToKeepVisible != ViewFragmentType.SPREADSHEET
				&& spreadsheet != null) {
			fragmentTransaction.hide(spreadsheet);
		}
		if (fragmentToKeepVisible != ViewFragmentType.LIST && list != null) {
			fragmentTransaction.hide(list);
		}

		if (fragmentToKeepVisible != ViewFragmentType.DETAIL
				&& detailFragment != null) {
			fragmentTransaction.hide(detailFragment);
		}

		if (fragmentToKeepVisible != ViewFragmentType.MAP) {
			if (mapList != null) {
				fragmentTransaction.hide(mapList);
			}
			if (mapInner != null) {
				fragmentTransaction.hide(mapInner);
			}
		}
	}

	/**
	 * Create a {@link SpreadsheetFragment} to be displayed in the activity.
	 * 
	 * @return
	 */
	SpreadsheetFragment createSpreadsheetFragment() {
		SpreadsheetFragment result = new SpreadsheetFragment();
		return result;
	}

	public void showMapFragment() {
		this.showMapFragment(false);
	}

	public void showMapFragment(boolean createNew) {
		this.setCurrentFragmentType(ViewFragmentType.MAP);
		this.updateChildViewVisibility(ViewFragmentType.MAP);
		// Set the list view file name.
		String fileName = IntentUtil.retrieveFileNameFromBundle(this
				.getIntent().getExtras());
		if (fileName == null) {
			SQLiteDatabase db = null;
			try {
				db = DatabaseFactory.get().getDatabase(this, getAppName());
				fileName = TableUtil.get().getMapListViewFilename(db,
						getTableId());
			} finally {
				if (db != null) {
					db.close();
				}
			}
		}
		FragmentManager fragmentManager = this.getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		this.hideAllOtherViewFragments(ViewFragmentType.MAP,
				fragmentTransaction);
		MapListViewFragment mapListViewFragment = (MapListViewFragment) fragmentManager
				.findFragmentByTag(Constants.FragmentTags.MAP_LIST);
		TableMapInnerFragment innerMapFragment = (TableMapInnerFragment) fragmentManager
				.findFragmentByTag(Constants.FragmentTags.MAP_INNER_MAP);
		if (mapListViewFragment == null
				|| (fileName != null && !fileName.equals(mapListViewFragment
						.getFileName())) || createNew) {
			if (mapListViewFragment != null) {
				// remove the old fragment
				WebLogger.getLogger(getAppName()).d(TAG,
						"[showMapFragment] removing old map list fragment");
				fragmentTransaction.remove(mapListViewFragment);
			}
			WebLogger.getLogger(getAppName()).d(TAG,
					"[showMapFragment] creating new map list fragment");
			mapListViewFragment = this.createMapListViewFragment(fileName);
			fragmentTransaction.add(R.id.map_view_list, mapListViewFragment,
					Constants.FragmentTags.MAP_LIST);
		} else {
			WebLogger.getLogger(getAppName()).d(TAG,
					"[showMapFragment] existing map list fragment found");
			fragmentTransaction.show(mapListViewFragment);
		}
		if (innerMapFragment == null || createNew) {
			if (innerMapFragment != null) {
				// remove the old fragment
				WebLogger.getLogger(getAppName()).d(TAG,
						"[showMapFragment] removing old inner map fragment");
				fragmentTransaction.remove(innerMapFragment);
			}
			WebLogger.getLogger(getAppName()).d(TAG,
					"[showMapFragment] creating new inner map fragment");
			innerMapFragment = this.createInnerMapFragment();
			fragmentTransaction.add(R.id.map_view_inner_map, innerMapFragment,
					Constants.FragmentTags.MAP_INNER_MAP);
			innerMapFragment.listener = this;
		} else {
			WebLogger.getLogger(getAppName()).d(TAG,
					"[showMapFragment] existing inner map fragment found");
			innerMapFragment.listener = this;
			fragmentTransaction.show(innerMapFragment);
		}
		fragmentTransaction.commit();
	}

	/**
	 * Create the {@link TableMapInnerFragment} that will be displayed as the
	 * map.
	 * 
	 * @return
	 */
	TableMapInnerFragment createInnerMapFragment() {
		TableMapInnerFragment result = new TableMapInnerFragment();
		return result;
	}

	/**
	 * Create the {@link MapListViewFragment} that will be displayed with the
	 * map view.
	 * 
	 * @param listViewFileName
	 *            the file name of the list view that will be displayed
	 * @return
	 */
	MapListViewFragment createMapListViewFragment(String listViewFileName) {
		MapListViewFragment result = new MapListViewFragment();
		Bundle listArguments = new Bundle();
		IntentUtil.addFileNameToBundle(listArguments, listViewFileName);
		result.setArguments(listArguments);
		return result;
	}

	public void showListFragment() {
		this.showListFragment(false);
	}

	public void showListFragment(boolean createNew) {
		this.setCurrentFragmentType(ViewFragmentType.LIST);
		this.updateChildViewVisibility(ViewFragmentType.LIST);
		// Try to use a passed file name. If one doesn't exist, try to use the
		// default.
		String fileName = IntentUtil.retrieveFileNameFromBundle(this
				.getIntent().getExtras());
		if (fileName == null) {
			SQLiteDatabase db = null;
			try {
				db = DatabaseFactory.get().getDatabase(this, getAppName());
				fileName = TableUtil.get()
						.getListViewFilename(db, getTableId());
			} finally {
				if (db != null) {
					db.close();
				}
			}
		}
		FragmentManager fragmentManager = this.getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		this.hideAllOtherViewFragments(ViewFragmentType.LIST,
				fragmentTransaction);
		ListViewFragment listViewFragment = (ListViewFragment) fragmentManager
				.findFragmentByTag(Constants.FragmentTags.LIST);
		if (listViewFragment == null || createNew) {
			if (listViewFragment == null) {
				WebLogger.getLogger(getAppName()).d(TAG,
						"[showListFragment] existing list fragment not found");
			} else {
				// remove the old fragment
				WebLogger.getLogger(getAppName()).d(TAG,
						"[showListFragment] removing old list fragment");
				fragmentTransaction.remove(listViewFragment);
			}
			listViewFragment = this.createListViewFragment(fileName);
			fragmentTransaction.add(
					R.id.activity_table_display_activity_one_pane_content,
					listViewFragment, Constants.FragmentTags.LIST);
		} else {
			WebLogger.getLogger(getAppName()).d(TAG,
					"[showListFragment] existing list fragment found");
			fragmentTransaction.show(listViewFragment);
		}
		fragmentTransaction.commit();
	}

	/**
	 * Create a {@link ListViewFragment} to be used by the activity.
	 * 
	 * @param fileName
	 *            the file name to be displayed
	 */
	ListViewFragment createListViewFragment(String fileName) {
		ListViewFragment result = new ListViewFragment();
		Bundle arguments = new Bundle();
		IntentUtil.addFileNameToBundle(arguments, fileName);
		result.setArguments(arguments);
		return result;
	}

	/**
	 * Create a {@link GraphViewFragment} to be added to the activity.
	 * 
	 * @param graphName
	 * @return
	 */

	public void showDetailFragment() {
		this.showDetailFragment(false);
	}

	public void showDetailFragment(boolean createNew) {
		this.setCurrentFragmentType(ViewFragmentType.DETAIL);
		this.updateChildViewVisibility(ViewFragmentType.DETAIL);
		FragmentManager fragmentManager = this.getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		this.hideAllOtherViewFragments(ViewFragmentType.DETAIL,
				fragmentTransaction);
		String fileName = IntentUtil.retrieveFileNameFromBundle(this
				.getIntent().getExtras());
		// Try and use the default.
		if (fileName == null) {
			WebLogger.getLogger(getAppName()).d(TAG,
					"[showDetailFragment] fileName not found in Intent");
			SQLiteDatabase db = null;
			try {
				db = DatabaseFactory.get().getDatabase(this, getAppName());
				fileName = TableUtil.get().getDetailViewFilename(db,
						getTableId());
			} finally {
				if (db != null) {
					db.close();
				}
			}
		}
		String rowId = IntentUtil.retrieveRowIdFromBundle(this.getIntent()
				.getExtras());
		// Try to retrieve one that already exists.
		DetailViewFragment detailViewFragment = (DetailViewFragment) fragmentManager
				.findFragmentByTag(Constants.FragmentTags.DETAIL_FRAGMENT);
		if (detailViewFragment == null || createNew) {
			if (detailViewFragment != null) {
				WebLogger
						.getLogger(getAppName())
						.d(TAG,
								"[showDetailViewFragment] removing old detail view fragment");
				fragmentTransaction.remove(detailViewFragment);
			} else {
				WebLogger
						.getLogger(getAppName())
						.d(TAG,
								"[showDetailViewFragment] no existing detail view fragment found");
			}
			detailViewFragment = this.createDetailViewFragment(fileName, rowId);

			fragmentTransaction.add(
					R.id.activity_table_display_activity_one_pane_content,
					detailViewFragment, Constants.FragmentTags.DETAIL_FRAGMENT);
		} else {
			WebLogger
					.getLogger(getAppName())
					.d(TAG,
							"[showDetailViewFragment] existing detail view fragment found");
			fragmentTransaction.show(detailViewFragment);
		}

		fragmentTransaction.commit();
	}

	/**
	 * Create a {@link DetailViewFragment} to be used with the fragments.
	 * 
	 * @param fileName
	 * @param rowId
	 * @return
	 */
	DetailViewFragment createDetailViewFragment(String fileName, String rowId) {
		DetailViewFragment result = new DetailViewFragment();
		Bundle bundle = new Bundle();
		IntentUtil.addRowIdToBundle(bundle, rowId);
		IntentUtil.addFileNameToBundle(bundle, fileName);
		result.setArguments(bundle);
		return result;
	}

	/**
	 * Update the content view's children visibility for viewFragmentType. This
	 * is required due to the fact that not all the fragments make use of the
	 * same children views within the activity.
	 * 
	 * @param viewFragmentType
	 */
	void updateChildViewVisibility(ViewFragmentType viewFragmentType) {
		// The map fragments occupy a different view than the single pane
		// content. This is because the map is two views--the list and the map
		// itself. So, we need to hide and show the others as appropriate.
		View onePaneContent = this
				.findViewById(R.id.activity_table_display_activity_one_pane_content);
		View mapContent = this
				.findViewById(R.id.activity_table_display_activity_map_content);
		switch (viewFragmentType) {
		case DETAIL:
		case LIST:
		case SPREADSHEET:
			onePaneContent.setVisibility(View.VISIBLE);
			mapContent.setVisibility(View.GONE);
			return;
		case MAP:
			onePaneContent.setVisibility(View.GONE);
			mapContent.setVisibility(View.VISIBLE);
			return;
		default:
			WebLogger.getLogger(getAppName()).e(
					TAG,
					"[updateChildViewVisibility] unrecognized type: "
							+ viewFragmentType);
		}
	}

	/**
	 * Retrieve the {@link DetailViewFragment} that is associated with this
	 * activity.
	 * 
	 * @return the fragment, or null if it is not present
	 */
	DetailViewFragment findDetailViewFragment() {
		FragmentManager fragmentManager = this.getFragmentManager();
		DetailViewFragment result = (DetailViewFragment) fragmentManager
				.findFragmentByTag(Constants.FragmentTags.DETAIL_FRAGMENT);
		return result;
	}

	/**
	 * Return the {@link ViewFragmentType} that is currently being displayed.
	 */
	public ViewFragmentType getCurrentFragmentType() {
		return this.mCurrentFragmentType;
	}

	/**
	 * Invoked by TableMapInnerFragment when an item has been selected
	 */
	@Override
	public void onSetSelectedItemIndex(int i) {
		MapListViewFragment mapListViewFragment = this
				.findMapListViewFragment();
		if (mapListViewFragment == null) {
			WebLogger.getLogger(getAppName()).e(TAG,
					"[onSetIndex] mapListViewFragment is null! Returning");
			return;
		} else {
			mapListViewFragment.setIndexOfSelectedItem(i);
		}
	}

	/**
	 * Invoked by TableMapInnerFragment when an item has stopped being selected
	 */
	public void setNoItemSelected() {
		MapListViewFragment mapListViewFragment = this
				.findMapListViewFragment();
		if (mapListViewFragment == null) {
			WebLogger
					.getLogger(getAppName())
					.e(TAG,
							"[setNoItemSelected] mapListViewFragment is null! Returning");
			return;
		} else {
			mapListViewFragment.setNoItemSelected();
		}
	}

	/**
	 * Find a {@link MapListViewFragment} that is associated with this activity.
	 * If not present, returns null.
	 * 
	 * @return
	 */
	MapListViewFragment findMapListViewFragment() {
		FragmentManager fragmentManager = this.getFragmentManager();
		MapListViewFragment result = (MapListViewFragment) fragmentManager
				.findFragmentByTag(Constants.FragmentTags.MAP_LIST);
		return result;
	}

	private void copynavbar() throws IOException {

		String tableid = this.getTableId();

		String CONFIG_dist = "opendatakit/tables/tables/" + tableid
				+ "/navbar.handlebars";
		String CONFIG_scr = "opendatakit/tables/framework/survey/templates/navbar.handlebars";
		File dst = new File(Environment.getExternalStorageDirectory()
				+ File.separator + CONFIG_dist);
		File scr = new File(Environment.getExternalStorageDirectory()
				+ File.separator + CONFIG_scr);
		if (scr.exists()) {
			InputStream in = new FileInputStream(
					Environment.getExternalStorageDirectory() + File.separator
							+ CONFIG_dist);
			OutputStream out = new FileOutputStream(
					Environment.getExternalStorageDirectory() + File.separator
							+ CONFIG_scr);
			// Transfer bytes from in to out
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		}

	}

	private void copygeo() throws IOException {

		String tableid = this.getTableId();

		String CONFIG_dist = "opendatakit/tables/tables/" + tableid
				+ "/geopoint.handlebars";
		String CONFIG_scr = "opendatakit/tables/framework/survey/templates/geopoint.handlebars";
		File dst = new File(Environment.getExternalStorageDirectory()
				+ File.separator + CONFIG_dist);
		File scr = new File(Environment.getExternalStorageDirectory()
				+ File.separator + CONFIG_scr);
		if (scr.exists()) {
			InputStream in = new FileInputStream(
					Environment.getExternalStorageDirectory() + File.separator
							+ CONFIG_dist);
			OutputStream out = new FileOutputStream(
					Environment.getExternalStorageDirectory() + File.separator
							+ CONFIG_scr);
			// Transfer bytes from in to out
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		}

	}

	private List<String[]> readCsv(Context context) {
		String tableid = this.getTableId();
		List<String[]> questionList = new ArrayList<String[]>();
		File file = null;
		FileInputStream in = null;
		InputStreamReader input = null;
		RFC4180CsvReader cr = null;
		String CONFIG_FORDER = "opendatakit/tables/tables/" + tableid
				+ "/config.csv";
		try {
			file = new File(Environment.getExternalStorageDirectory()
					+ File.separator + CONFIG_FORDER);
			in = new FileInputStream(file);
			input = new InputStreamReader(in, CharEncoding.UTF_8);
			cr = new RFC4180CsvReader(input);
			String[] row;
			row = cr.readNext();
			while ((row = cr.readNext()) != null) {
				questionList.add(row);
			}
			cr.close();

			input.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return questionList;
	}

}
