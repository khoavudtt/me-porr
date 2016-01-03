package dtt.company.sqlite;

import java.io.File;

import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

public class SqliteCapNhat {
	public static void updateID(String iddaunoi, String idmobie, String idkehoach,
			String idthongtin) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String sql = "UPDATE kdv_dnn_hogiadinh SET ID =" + idthongtin + ","
				+ "KEHOACHKIEMDEMNUOCID =" + idkehoach + ",DAUNOINUOCID ='"
				+ iddaunoi + "' where _id=" + "'" + idmobie + "'";
		db.execSQL(sql);
	}
	public static void updateIDVSinh(String idvesinh, String idmobie,
			String idkehoach, String idthongtin) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String sql = "UPDATE kdv_vs_hogiadinh SET ID =" + idthongtin + ","
				+ "KEHOACHKIEMDEMVESINHID =" + idkehoach
				+ ",VESINHGIADINHID ='" + idvesinh + "' where _id=" + "'"
				+ idmobie + "'";
		db.execSQL(sql);
	}
}
