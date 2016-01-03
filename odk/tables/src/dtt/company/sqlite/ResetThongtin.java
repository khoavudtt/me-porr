package dtt.company.sqlite;

import java.io.File;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

public class ResetThongtin {
	public static int getCountHogd() {
		int count = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		try {
			s.append("SELECT * FROM kdv_vs_hogiadinh");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			count = cursor.getCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;

	}

	public static int getCountDauNoi() {
		int count = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		try {
			s.append("SELECT * FROM kdv_dnn_hogiadinh");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			count = cursor.getCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;

	}

	public static int getCountCongTrinh() {
		int count = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		try {
			s.append("SELECT * FROM kdv_vs_congtrinhcongcong");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			count = cursor.getCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;

	}

	public static void xoaDuLieu() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		try {
			String querydnn = "DELETE  FROM kdv_dnn_hogiadinh";
			String queryvs = "DELETE  FROM kdv_vs_hogiadinh";
			String querycc = "DELETE  FROM kdv_vs_congtrinhcongcong";
			String queryth = "DELETE  FROM kdv_vs_chitietcongtrinhyte";
			String queryyt = "DELETE  FROM kdv_vs_chitietcongtrinhtruonghoc";
			String querykhn = "DELETE  FROM tbl_thongtinkehoach";
			String querykhvs = "DELETE  FROM tbl_thongtinkehoachvs";
			String querykhct = "DELETE  FROM tbl_thongtinkehoachcongtrinh";
			db.execSQL(querydnn);
			db.execSQL(queryvs);
			db.execSQL(querycc);
			db.execSQL(queryyt);
			db.execSQL(queryth);
			db.execSQL(querykhn);
			db.execSQL(querykhvs);
			db.execSQL(querykhct);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
