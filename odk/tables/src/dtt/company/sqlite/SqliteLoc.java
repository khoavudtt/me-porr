package dtt.company.sqlite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import dtt.company.adapter.Model;

public class SqliteLoc {
	public static List<Model> getThonNuoc() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		List<Model> ar = new ArrayList<Model>();
		try {
			s.append("SELECT * FROM kdv_dnn_hogiadinh where ThonXom is not null group by ThonXom ORDER BY ThonXom asc");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					String thon = cursor.getString(cursor
							.getColumnIndex("ThonXom"));
					ar.add(new Model(thon));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ar;
	}

	public static List<Model> getThonGiaDinh() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();

		List<Model> ar = new ArrayList<Model>();
		try {
			s.append("SELECT * FROM kdv_vs_hogiadinh where ThonXom is not null group by ThonXom ORDER BY ThonXom asc");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					String thon = cursor.getString(cursor
							.getColumnIndex("ThonXom"));
					ar.add(new Model(thon));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ar;
	}

	public static List<Model> getThonCongCong() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		List<Model> ar = new ArrayList<Model>();
		try {
			s.append("SELECT * FROM kdv_vs_congtrinhcongcong where DiaChi is not null group by DiaChi ORDER BY DiaChi asc");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					String thon = cursor.getString(cursor
							.getColumnIndex("DiaChi"));
					ar.add(new Model(thon));

				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ar;

	}
}
