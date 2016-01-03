package org.opendatakit.tables.activities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.opendatakit.tables.R;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import dtt.company.adapter.AdapterKehoachNuoc;
import dtt.company.bean.ThongTinKeHoach;

public class KeHoachNuocActivity extends Activity {
	ArrayAdapter<ThongTinKeHoach> adapter;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kehoachnuoclist);
		ListView lv = (ListView) findViewById(R.id.list_kehoachnuoc);
		List<ThongTinKeHoach> list = createthongtinkehoach();
		adapter = new AdapterKehoachNuoc(this, list);
		lv.setAdapter(adapter);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.top_level_next:
			startActivity(new Intent(this, CapNhatDuLieuActivity.class));
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater menuInflater = this.getMenuInflater();
		menuInflater.inflate(R.menu.trolai, menu);
		return super.onCreateOptionsMenu(menu);
	}

	private List<ThongTinKeHoach> createthongtinkehoach() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String time = null;
		List<ThongTinKeHoach> list = new ArrayList<ThongTinKeHoach>();
		try {
			final String tbl_thongtinkehoach = "CREATE TABLE IF NOT EXISTS tbl_thongtinkehoach("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "nam TEXT,"
					+ "tungay TEXT,"
					+ "denngay TEXT,"
					+ "trangthai TEXT,"
					+ "daketthucdieutra TEXT,"
					+ "kehoachkiemdemid TEXT,"
					+ "id_daunoi TEXT);";
			db.execSQL(tbl_thongtinkehoach);
			String query = "SELECT *  FROM tbl_thongtinkehoach GROUP BY kehoachkiemdemid ORDER BY trangthai ASC";
			Cursor cursor = db.rawQuery(query, null);

			if (cursor.moveToFirst()) {
				do {
					ThongTinKeHoach tt_kh = new ThongTinKeHoach();
					String tungays[] = cursor.getString(
							cursor.getColumnIndex("tungay")).split("[-]");
					String denngays[] = cursor.getString(
							cursor.getColumnIndex("denngay")).split("[-]");
					String tungay = tungays[2] + "/" + tungays[1] + "/"
							+ tungays[0];
					String denngay = denngays[2] + "/" + denngays[1] + "/"
							+ denngays[0];
					tt_kh.setTungay(tungay);
					tt_kh.setDenngay(denngay);
					tt_kh.setTrangthai(cursor.getString(cursor
							.getColumnIndex("trangthai")));
					String tongso = tongSo(cursor.getString(cursor
							.getColumnIndex("kehoachkiemdemid")));
					tt_kh.setTongso(tongso);
					tt_kh.setDahoanthanh(tongDaketthuc(cursor.getString(cursor
							.getColumnIndex("kehoachkiemdemid"))));
					tt_kh.setChuakiemdem(tongChuakiemdem(cursor
							.getString(cursor
									.getColumnIndex("kehoachkiemdemid"))));
					tt_kh.setChuahoanthanh(tongchuaketthuc(cursor
							.getString(cursor
									.getColumnIndex("kehoachkiemdemid"))));
					list.add(tt_kh);
				} while (cursor.moveToNext());
			}

		} catch (Exception e) {
			Toast.makeText(KeHoachNuocActivity.this, "ERROR " + e.toString(),
					Toast.LENGTH_LONG).show();
		}
		return list;
	}

	private String tongSo(String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoach where kehoachkiemdemid= "
				+ "'" + kehoachkiemdemid + "'";
		Cursor cursor = db.rawQuery(query, null);
		String tongso = null;
		if (cursor.moveToFirst()) {
			do {
				tongso = cursor.getString(cursor.getColumnIndex("tongso"));
			} while (cursor.moveToNext());
		}
		return tongso;

	}

	private String tongDaketthuc(String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoach where daketthucdieutra='1' and kehoachkiemdemid= "
				+ "'" + kehoachkiemdemid + "'";
		Cursor cursor = db.rawQuery(query, null);
		String tongso = null;
		if (cursor.moveToFirst()) {
			do {
				tongso = cursor.getString(cursor.getColumnIndex("tongso"));
			} while (cursor.moveToNext());
		}
		return tongso;

	}

	private String tongChuakiemdem(String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoach where (daketthucdieutra is null or daketthucdieutra='0') and kehoachkiemdemid= "
				+ "'" + kehoachkiemdemid + "'";
		Cursor cursor = db.rawQuery(query, null);
		String tongso = null;
		if (cursor.moveToFirst()) {
			do {
				tongso = cursor.getString(cursor.getColumnIndex("tongso"));
			} while (cursor.moveToNext());
		}
		return tongso;

	}

	private String tongchuaketthuc(String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoach where daketthucdieutra='2' and kehoachkiemdemid= "
				+ "'" + kehoachkiemdemid + "'";
		Cursor cursor = db.rawQuery(query, null);
		String tongso = null;
		if (cursor.moveToFirst()) {
			do {
				tongso = cursor.getString(cursor.getColumnIndex("tongso"));
			} while (cursor.moveToNext());
		}
		return tongso;

	}
}
