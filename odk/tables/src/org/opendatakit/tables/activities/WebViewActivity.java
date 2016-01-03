/*
 * Copyright (C) 2014 University of Washington
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

import org.opendatakit.common.android.data.Preferences;
import org.opendatakit.common.android.utilities.WebLogger;
import org.opendatakit.tables.R;
import org.opendatakit.tables.application.Tables;
import org.opendatakit.tables.fragments.InitializeTaskDialogFragment;
import org.opendatakit.tables.fragments.WebFragment;
import org.opendatakit.tables.tasks.InitializeTask;
import org.opendatakit.tables.utils.CollectUtil;
import org.opendatakit.tables.utils.Constants;
import org.opendatakit.tables.utils.IntentUtil;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;

/**
 * Displays a {@link WebView} that is not associated with a particular table.
 * 
 * @author sudar.sam@gmail.com
 *
 */
public class WebViewActivity extends AbsBaseActivity implements
		InitializeTask.Callbacks {

	private static final String TAG = WebViewActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		WebLogger.getLogger(getAppName()).d(TAG, "[onCreate]");
		this.setContentView(R.layout.activity_web_view_activity);
		WebFragment webFragment = (WebFragment) this.getFragmentManager()
				.findFragmentByTag(Constants.FragmentTags.WEB_FRAGMENT);
		// String fileName = this.retrieveFileName(savedInstanceState);
		String fileName = "assets/index.html";
		if (webFragment == null) {
			WebLogger.getLogger(getAppName()).d(TAG,
					"[onCreate] webFragment null, creating new");
			webFragment = new WebFragment();
			Bundle arguments = new Bundle();
			IntentUtil.addFileNameToBundle(arguments, fileName);
			webFragment.setArguments(arguments);
			this.getFragmentManager()
					.beginTransaction()
					.add(R.id.activity_web_view_activity_frame_layout,
							webFragment, Constants.FragmentTags.WEB_FRAGMENT)
					.commit();
		}
	};

	@Override
	protected void onResume() {
		super.onResume();
		// Check to see if we need to initialize.
		if (Tables.getInstance().shouldRunInitializationTask(mAppName)) {
			this.startInitializationTask();
			//
		}
		// showDialogdangNhap();
	}

	private void startInitializationTask() {
		InitializeTask initializeTask = new InitializeTask(this,
				this.getAppName());
		InitializeTaskDialogFragment initializeTaskDialogFragment = new InitializeTaskDialogFragment();
		initializeTaskDialogFragment.setTask(initializeTask);
		initializeTaskDialogFragment.setCallbacks(this);
		initializeTaskDialogFragment.setCancelable(false);
		initializeTask.setDialogFragment(initializeTaskDialogFragment);
		FragmentManager fragmentManager = this.getFragmentManager();
		initializeTaskDialogFragment.show(fragmentManager,
				InitializeTaskDialogFragment.TAG_FRAGMENT);
		// fire off the initializeTask
		Void v = null;
		initializeTask.execute(v);
		// if initialization task dies, don't try to restart it...
		Tables.getInstance().clearRunInitializationTask(mAppName);
	}

	/**
	 * Retrieve the file name from either the saved instance state or the
	 * {@link Intent} that was used to create the activity.
	 * 
	 * @param savedInstanceState
	 * @return
	 */
	protected String retrieveFileName(Bundle savedInstanceState) {
		String result = IntentUtil.retrieveFileNameFromSavedStateOrArguments(
				savedInstanceState, this.getIntent().getExtras());
		return result;
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent = new Intent(WebViewActivity.this, MainActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			intent.putExtra("EXIT", true);
			startActivity(intent);
		}
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater menuInflater = this.getMenuInflater();
		menuInflater.inflate(R.menu.web_view_activity, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.top_level_table_menu_sync:
			startActivity(new Intent(this, CapNhatDuLieuActivity.class));
			return true;
		case R.id.top_level_table_menu_thongtin:
			startActivity(new Intent(this, ThongTinDuLieuActivity.class));
			return true;
		case R.id.top_level_table_menu_logout:
			startActivity(new Intent(this, Login.class));
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		String tableId = this.getActionTableId();
		if (tableId != null) {

			switch (requestCode) {
			case Constants.RequestCodes.LAUNCH_CHECKPOINT_RESOLVER:
			case Constants.RequestCodes.LAUNCH_CONFLICT_RESOLVER:
				// don't let the user cancel out of these...
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
							getAppName(), tableId, resultCode, data);
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
							getAppName(), tableId, resultCode, data);
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
				break;
			}
			super.onActivityResult(requestCode, resultCode, data);
		}
	}

	@Override
	public Preferences getPrefs() {
		return null;
	}

	@Override
	public void onImportsComplete() {
		Intent i = new Intent(this, WebViewActivity.class);
		startActivity(i);

	}

}
