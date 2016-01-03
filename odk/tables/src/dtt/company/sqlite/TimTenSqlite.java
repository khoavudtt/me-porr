package dtt.company.sqlite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

public class TimTenSqlite {
	public static List<String> getTenChuHo() {

		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		List<String> ar = new ArrayList<String>();
		try {
			s.append("SELECT TenChuHo FROM kdv_dnn_hogiadinh");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					ar.add(cursor.getString(cursor.getColumnIndex("TenChuHo")));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ar;

	}
	public static List<String> getTenChuHoVeSinh() {

		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		List<String> ar = new ArrayList<String>();
		try {
			s.append("SELECT TenChuHo FROM kdv_vs_hogiadinh");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					ar.add(cursor.getString(cursor.getColumnIndex("TenChuHo")));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ar;

	}
	public static List<String> getTenChuHoCongTrinh() {

		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		List<String> ar = new ArrayList<String>();
		try {
			s.append("SELECT TenCongTrinh FROM kdv_vs_congtrinhcongcong");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					ar.add(cursor.getString(cursor.getColumnIndex("TenCongTrinh")));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ar;

	}
}
