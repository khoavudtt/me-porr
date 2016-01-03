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
import dtt.company.adapter.AdapterKeHoachVeSinh;
import dtt.company.bean.ThongTinKeHoachVeSinh;

public class KeHoachVeSinhActivity extends Activity {
	ArrayAdapter<ThongTinKeHoachVeSinh> adapter;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kehoachkiemdemvesinh);
		ListView lv = (ListView) findViewById(R.id.list_kehoachvesinh);
		createThongTinKeHoachCongCong();
		List<ThongTinKeHoachVeSinh> list = createthongtinkehoach();
		adapter = new AdapterKeHoachVeSinh(this, list);
		lv.setAdapter(adapter);
	}

	private List<ThongTinKeHoachVeSinh> createthongtinkehoach() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		List<ThongTinKeHoachVeSinh> list = new ArrayList<ThongTinKeHoachVeSinh>();
		try {
			final String tbl_thongtinkehoach = "CREATE TABLE IF NOT EXISTS tbl_thongtinkehoachvs("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "nam TEXT,"
					+ "tungay TEXT,"
					+ "denngay TEXT,"
					+ "trangthai TEXT,"
					+ "daketthucdieutra TEXT,"
					+ "kehoachkiemdemid TEXT,"
					+ "id_daunoi TEXT);";
			db.execSQL(tbl_thongtinkehoach);
			String query = "SELECT *  FROM tbl_thongtinkehoachvs GROUP BY kehoachkiemdemid ORDER BY trangthai ASC";
			Cursor cursor = db.rawQuery(query, null);
			String querycc = "SELECT *  FROM tbl_thongtinkehoachcongtrinh GROUP BY kehoachkiemdemid ORDER BY trangthai ASC";
			Cursor cursorcc = db.rawQuery(querycc, null);
			if (cursor.moveToFirst()) {
				do {
					ThongTinKeHoachVeSinh tt_kh = new ThongTinKeHoachVeSinh();
					String kehoachkiemdemid = cursor.getString(cursor
							.getColumnIndex("kehoachkiemdemid"));
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
					String tongsovs = tongSo(kehoachkiemdemid);
					tt_kh.setTongsovs(tongsovs);
					tt_kh.setDahoanthanhvs(tongDaketthuc(kehoachkiemdemid));
					tt_kh.setChuakiemdemvs(tongChuakiemdem(kehoachkiemdemid));
					tt_kh.setChuahoanthanhvs(tongchuaketthuc(kehoachkiemdemid));
					String tongsocc = tongSoCongCong(kehoachkiemdemid);
					tt_kh.setTongsocc(tongsocc);
					tt_kh.setDahoanthanhcc(tongDaKetThucCongCong(kehoachkiemdemid));
					tt_kh.setChuahoanthanhcc(tongChuaKetThucCongCong(kehoachkiemdemid));
					tt_kh.setChuakiemdemcc(tongChuaKiemDemCongCong(kehoachkiemdemid));
					list.add(tt_kh);
				} while (cursor.moveToNext());
			}
			if (cursorcc.moveToFirst()) {
				do {

					ThongTinKeHoachVeSinh tt_khcc = new ThongTinKeHoachVeSinh();
					String kehoachkiemdemid = cursorcc.getString(cursorcc
							.getColumnIndex("kehoachkiemdemid"));
					if (kiemTraKeHoachCongCong(kehoachkiemdemid) == 0) {
						String tungays[] = cursorcc.getString(
								cursorcc.getColumnIndex("tungay")).split("[-]");
						String denngays[] = cursorcc.getString(
								cursorcc.getColumnIndex("denngay"))
								.split("[-]");
						String tungay = tungays[2] + "/" + tungays[1] + "/"
								+ tungays[0];
						String denngay = denngays[2] + "/" + denngays[1] + "/"
								+ denngays[0];
						tt_khcc.setTungay(tungay);
						tt_khcc.setDenngay(denngay);
						tt_khcc.setTrangthai(cursorcc.getString(cursorcc
								.getColumnIndex("trangthai")));
						tt_khcc.setTongsovs("0");
						tt_khcc.setDahoanthanhvs("0");
						tt_khcc.setChuakiemdemvs("0");
						tt_khcc.setChuahoanthanhvs("0");
						String tongsocc = tongSoCongCong(kehoachkiemdemid);
						tt_khcc.setTongsocc(tongsocc);
						tt_khcc.setDahoanthanhcc(tongDaKetThucCongCong(kehoachkiemdemid));
						tt_khcc.setChuahoanthanhcc(tongChuaKetThucCongCong(kehoachkiemdemid));
						tt_khcc.setChuakiemdemcc(tongChuaKiemDemCongCong(kehoachkiemdemid));
						list.add(tt_khcc);
					}

				} while (cursorcc.moveToNext());
			}
		} catch (Exception e) {

		}
		return list;
	}

	private int kiemTraKeHoachCongCong(String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String query = "SELECT *  FROM tbl_thongtinkehoachvs Where kehoachkiemdemid='"
				+ kehoachkiemdemid + "'";
		Cursor cursor = db.rawQuery(query, null);
		int tong = cursor.getCount();
		return tong;
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

	private String tongDaketthuc(String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoachvs where daketthucdieutra='1' and kehoachkiemdemid= "
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

	private String tongSo(String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoachvs where kehoachkiemdemid= "
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

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoachvs where daketthucdieutra is null or daketthucdieutra='0' and kehoachkiemdemid= "
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

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoachvs where daketthucdieutra='2' and kehoachkiemdemid= "
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

	// vệ sinh công công

	private void createThongTinKeHoachCongCong() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		try {
			final String tbl_thongtinkehoachcongtrinh = "CREATE TABLE IF NOT EXISTS tbl_thongtinkehoachcongtrinh("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "nam TEXT,"
					+ "tungay TEXT,"
					+ "denngay TEXT,"
					+ "kehoachkiemdemid TEXT,"
					+ "trangthai TEXT,"
					+ "daketthucdieutra TEXT," + "id_congtrinh TEXT);";
			db.execSQL(tbl_thongtinkehoachcongtrinh);
		} catch (Exception e) {

		}

	}

	private String tongChuaKetThucCongCong(String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoachcongtrinh where daketthucdieutra='2' and kehoachkiemdemid= "
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

	private String tongChuaKiemDemCongCong(String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoachcongtrinh where (daketthucdieutra is null or daketthucdieutra='0') and kehoachkiemdemid= "
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

	private String tongDaKetThucCongCong(String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoachcongtrinh where daketthucdieutra='1' and kehoachkiemdemid= "
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

	private String tongSoCongCong(String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);

		String query = "SELECT count(kehoachkiemdemid) as tongso FROM tbl_thongtinkehoachcongtrinh where kehoachkiemdemid= "
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