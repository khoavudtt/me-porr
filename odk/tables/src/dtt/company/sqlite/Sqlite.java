package dtt.company.sqlite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.opendatakit.tables.R;
import org.opendatakit.tables.activities.CapNhatDuLieuActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.widget.Toast;
import dtt.company.bean.Country;
import dtt.company.bean.ThongTinTrung;
import dtt.company.bean.User;

public class Sqlite {
	public static String nuoc = "1";
	public static String vesinh = "2";
	public static String congcong = "3";
	public static String lasery = "1";
	public static String ladiachi = "0";
	private static String URL_host = "http://pforr.vn";

	public static void createThongTinTrung(String uid, String key, String lasery) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder p = new StringBuilder();
		try {
			p.append("INSERT INTO tbl_thongtintrung(key,uid,lasery) VALUES(")
					.append(key).append(",'").append(uid).append("',")
					.append(lasery).append(")");
			String them = p.toString();
			db.execSQL(them);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	public static void updateTimeThongTinTrung() {
//		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
//				+ File.separator
//				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
//		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
//		String time = Sqlite.getTimeampnuoc();
//		if (time != null) {
//			
//		}
//		String timevs = Sqlite.getTimeamp_vs();
//
//		try {
//			// nuoc
//			StringBuilder s = new StringBuilder();
//			s.append("SELECT * FROM tbl_thongtintrung where key=1");
//			String query = s.toString();
//			Cursor cursor = db.rawQuery(query, null);
//			if (cursor.moveToFirst()) {
//				do {
//					StringBuilder p = new StringBuilder();
//					String id = cursor.getString(cursor.getColumnIndex("uid"));
//					p.append(
//							"UPDATE kdv_dnn_hogiadinh SET _savepoint_timestamp ='")
//							.append(time).append("' where _id='").append(id)
//							.append("'");
//					String queryname = p.toString();
//					db.execSQL(queryname);
//				} while (cursor.moveToNext());
//			}
//
//			// vesinh
//			StringBuilder vs = new StringBuilder();
//			vs.append("SELECT * FROM tbl_thongtintrung where key=2");
//			String queryvs = vs.toString();
//			Cursor cursorvs = db.rawQuery(queryvs, null);
//			if (cursorvs.moveToFirst()) {
//				do {
//					StringBuilder vstime = new StringBuilder();
//					String id = cursorvs.getString(cursorvs
//							.getColumnIndex("uid"));
//					vstime.append(
//							"UPDATE kdv_vs_hogiadinh SET _savepoint_timestamp ='")
//							.append(timevs).append("' where _id='").append(id)
//							.append("'");
//					String queryvstime = vstime.toString();
//					db.execSQL(queryvstime);
//				} while (cursorvs.moveToNext());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

	public static void insertTaikhoan(String ten, String pass,
			String hotenkiemdem, String giamsat, String tinh, String code) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		try {
			String query = "DELETE  FROM tbl_taikhoankiemdem";
			db.execSQL(query);
			String sql = "INSERT INTO tbl_taikhoankiemdem (ten,pass,hoten,tinh,code,giamsat) VALUES("
					+ "'"
					+ ten
					+ "','"
					+ pass
					+ "','"
					+ hotenkiemdem
					+ "','"
					+ tinh + "','" + code + "','" + giamsat + "'" + ")";
			db.execSQL(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void taobangthongtinTrung() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		try {
			s.append("CREATE TABLE IF NOT EXISTS tbl_thongtintrung(ID INTEGER primary key AUTOINCREMENT,key TEXT,lasery TEXT,uid TEXT)");
			String query = s.toString();
			String xoa_trung = "DELETE FROM tbl_thongtintrung";
			db.execSQL(query);
			db.execSQL(xoa_trung);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int countTrungNuoc() {
		int cnt = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		try {
			s.append("SELECT * FROM tbl_thongtintrung where key=1");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			cnt = cursor.getCount();
			cursor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;

	}

	public static int countDauNoiNuoc() {
		int cnt = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		try {
			s.append("SELECT * FROM kdv_dnn_hogiadinh");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			cnt = cursor.getCount();
			cursor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;

	}

	public static int countVeSinh() {
		int cnt = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		try {
			s.append("SELECT * FROM kdv_vs_hogiadinh");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			cnt = cursor.getCount();
			cursor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;

	}

	public static int countTrungVeSinh() {
		int cnt = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		try {
			s.append("SELECT * FROM tbl_thongtintrung where key=2");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			cnt = cursor.getCount();
			cursor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;

	}

	public static void capnhatthongtintrung(String uid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		try {
			s.append("CREATE TABLE IF NOT EXISTS tbl_thongtintrung(ID INTEGER primary key AUTOINCREMENT,key TEXT,lasery TEXT,uid TEXT)");
			String query = s.toString();
			String xoa_trung = "DELETE FROM tbl_thongtintrung where uid='"
					+ uid + "'";
			db.execSQL(query);
			db.execSQL(xoa_trung);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int getTongThongTinTrung() {
		int count = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		try {
			s.append("SELECT * FROM tbl_thongtintrung");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			count = cursor.getCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;

	}

	public static List<String> getThongTinTrungsery() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		StringBuilder p = new StringBuilder();
		List<String> ar = new ArrayList<String>();
		try {
			s.append("SELECT * FROM tbl_thongtintrung where lasery=1");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					String uid = cursor.getString(cursor.getColumnIndex("uid"));
					p.append("SELECT * FROM kdv_dnn_hogiadinh where _id='")
							.append(uid).append("'");
					String queryname = p.toString();
					Cursor cursorname = db.rawQuery(queryname, null);
					if (cursorname.moveToFirst()) {
						do {
							ar.add(cursorname.getString(cursorname
									.getColumnIndex("TenChuHo")));
						} while (cursorname.moveToNext());
					}

				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ar;

	}

	public static void deletetrungsery() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		StringBuilder p = new StringBuilder();
		List<String> ar = new ArrayList<String>();
		try {
			s.append("SELECT * FROM tbl_thongtintrung where lasery=1");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					String uid = cursor.getString(cursor.getColumnIndex("uid"));
					p.append("SELECT * FROM kdv_dnn_hogiadinh where _id='")
							.append(uid).append("'");
					String queryname = p.toString();
					Cursor cursorname = db.rawQuery(queryname, null);
					if (cursorname.moveToFirst()) {
						do {
							ar.add(cursorname.getString(cursorname
									.getColumnIndex("TenChuHo")));
						} while (cursorname.moveToNext());
					}
					String querydelete = "Delete from kdv_dnn_hogiadinh where _id='"
							+ uid + "'";
					db.execSQL(querydelete);

				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static List<String> getThongTinTrungDiaChi() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		List<String> ar = new ArrayList<String>();
		try {
			s.append("SELECT * FROM tbl_thongtintrung where lasery=0");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					String uid = cursor.getString(cursor.getColumnIndex("uid"));
					int key = cursor.getInt(cursor.getColumnIndex("key"));
					if (key == 1) {
						StringBuilder p = new StringBuilder();
						p.append("SELECT * FROM kdv_dnn_hogiadinh where _id='")
								.append(uid).append("'");
						String queryname = p.toString();
						Cursor cursorname = db.rawQuery(queryname, null);
						if (cursorname.moveToFirst()) {
							do {
								ar.add(cursorname.getString(cursorname
										.getColumnIndex("TenChuHo")));
							} while (cursorname.moveToNext());
						}
					}
					if (key == 2) {
						StringBuilder p = new StringBuilder();
						p.append("SELECT * FROM kdv_vs_hogiadinh where _id='")
								.append(uid).append("'");
						String queryname = p.toString();
						Cursor cursorname = db.rawQuery(queryname, null);
						if (cursorname.moveToFirst()) {
							do {
								ar.add(cursorname.getString(cursorname
										.getColumnIndex("TenChuHo")));
							} while (cursorname.moveToNext());
						}

					}

				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ar;

	}

	public static ArrayList<ThongTinTrung> getThongTinTrungDiaChiCheck() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		ArrayList<ThongTinTrung> ar = new ArrayList<ThongTinTrung>();
		try {
			s.append("SELECT * FROM tbl_thongtintrung where lasery=0");
			String query = s.toString();
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					String uid = cursor.getString(cursor.getColumnIndex("uid"));
					String key = cursor.getString(cursor.getColumnIndex("key"));
					ThongTinTrung tt = new ThongTinTrung();
					tt.setKey(key);
					tt.setCode(uid);
					if (key.equals("1")) {
						StringBuilder p = new StringBuilder();
						p.append(
								"SELECT TenChuHo FROM kdv_dnn_hogiadinh where _id='")
								.append(uid).append("'");
						String queryname = p.toString();
						Cursor cursorname = db.rawQuery(queryname, null);
						tt.setCode(uid);
						if (cursorname.moveToFirst()) {
							do {
								tt.setName(cursorname.getString(cursorname
										.getColumnIndex("TenChuHo")));
							} while (cursorname.moveToNext());
						}
						ar.add(tt);
					}
					if (key.equals("2")) {
						StringBuilder p = new StringBuilder();
						p.append(
								"SELECT TenChuHo FROM kdv_vs_hogiadinh where _id='")
								.append(uid).append("'");
						String queryname = p.toString();
						Cursor cursorname = db.rawQuery(queryname, null);
						tt.setCode(uid);
						if (cursorname.moveToFirst()) {
							do {
								tt.setName(cursorname.getString(cursorname
										.getColumnIndex("TenChuHo")));
							} while (cursorname.moveToNext());
						}
						ar.add(tt);
					}

				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ar;

	}

	public static void insertlastpoint() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		try {
			final String CREATE_TABLE_Lastpontnuoc = "CREATE TABLE IF NOT EXISTS tbl_lastpointnuoc("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "Timestamp DATETIME DEFAULT CURRENT_TIMESTAMP);";
			final String CREATE_TABLE_Lastpontgiaginh = "CREATE TABLE IF NOT EXISTS tbl_lastpointgiadinh("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "Timestamp DATETIME DEFAULT CURRENT_TIMESTAMP);";
			final String CREATE_TABLE_Lastpontcongtrinh = "CREATE TABLE IF NOT EXISTS tbl_lastpointcongtrinh("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "Timestamp DATETIME DEFAULT CURRENT_TIMESTAMP);";
			db.execSQL(CREATE_TABLE_Lastpontnuoc);
			db.execSQL(CREATE_TABLE_Lastpontgiaginh);
			db.execSQL(CREATE_TABLE_Lastpontcongtrinh);
			db.execSQL("Delete from tbl_lastpointnuoc");
			db.execSQL("Delete from tbl_lastpointgiadinh");
			db.execSQL("Delete from tbl_lastpointcongtrinh");

			String query = "SELECT _savepoint_timestamp FROM kdv_dnn_hogiadinh ORDER BY _savepoint_timestamp DESC LIMIT 1";
			Cursor cursor = db.rawQuery(query, null);
			String query_cc = "SELECT _savepoint_timestamp FROM kdv_vs_congtrinhcongcong ORDER BY _savepoint_timestamp DESC LIMIT 1";
			Cursor cursor_cc = db.rawQuery(query_cc, null);
			String queryvs = "SELECT _savepoint_timestamp FROM kdv_vs_hogiadinh ORDER BY _savepoint_timestamp DESC LIMIT 1";
			Cursor cursorvs = db.rawQuery(queryvs, null);
			List<String> results_nuoc = new ArrayList<String>();
			List<String> resultsvs = new ArrayList<String>();
			List<String> resultsvscc = new ArrayList<String>();
			if (cursor.moveToFirst()) {
				do {
					String timenuoc = cursor.getString(cursor
							.getColumnIndex("_savepoint_timestamp"));
					results_nuoc.add(timenuoc);

				} while (cursor.moveToNext());
			}
			if (cursor_cc.moveToFirst()) {
				do {
					String timecc = cursor_cc.getString(cursor_cc
							.getColumnIndex("_savepoint_timestamp"));
					resultsvscc.add(timecc);

				} while (cursor_cc.moveToNext());
			}
			if (cursorvs.moveToFirst()) {
				do {
					String timevs = cursorvs.getString(cursorvs
							.getColumnIndex("_savepoint_timestamp"));
					resultsvs.add(timevs);

				} while (cursorvs.moveToNext());
			}

			if (results_nuoc.size() >= 1) {
				StringBuilder p = new StringBuilder();
				p.append(
						"INSERT INTO tbl_lastpointnuoc (ID,Timestamp) VALUES(1,'")
						.append(results_nuoc.get(0)).append("')");
				String queryis = p.toString();
				db.execSQL(queryis);
			}

			if (resultsvs.size() >= 1) {
				StringBuilder p = new StringBuilder();
				p.append(
						"INSERT INTO tbl_lastpointgiadinh (ID,Timestamp) VALUES(1,'")
						.append(resultsvs.get(0)).append("')");
				String queryis = p.toString();
				db.execSQL(queryis);
			}
			if (resultsvscc.size() >= 1) {
				StringBuilder p = new StringBuilder();
				p.append(
						"INSERT INTO tbl_lastpointcongtrinh (ID,Timestamp) VALUES(1,'")
						.append(resultsvscc.get(0)).append("')");
				String queryis = p.toString();
				db.execSQL(queryis);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static String getTimeampnuoc() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String time = null;
		try {
			final String CREATE_TABLE_Lastpontnuoc = "CREATE TABLE IF NOT EXISTS tbl_lastpointnuoc("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "Timestamp DATETIME DEFAULT CURRENT_TIMESTAMP);";
			db.execSQL(CREATE_TABLE_Lastpontnuoc);
			String query = "SELECT Timestamp FROM tbl_lastpointnuoc Where ID=1";
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					time = cursor.getString(cursor.getColumnIndex("Timestamp"));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}

	public static String getTimeamp_vs() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String time = null;
		try {
			final String tbl_lastpointgiadinh = "CREATE TABLE IF NOT EXISTS tbl_lastpointgiadinh("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "Timestamp DATETIME DEFAULT CURRENT_TIMESTAMP);";
			db.execSQL(tbl_lastpointgiadinh);
			String query = "SELECT Timestamp FROM tbl_lastpointgiadinh Where ID=1";
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					time = cursor.getString(cursor.getColumnIndex("Timestamp"));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}

	public static String getTimeamp_cc() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String time = null;
		try {
			final String tbl_lastpointgiadinh = "CREATE TABLE IF NOT EXISTS tbl_lastpointcongtrinh("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "Timestamp DATETIME DEFAULT CURRENT_TIMESTAMP);";
			db.execSQL(tbl_lastpointgiadinh);
			String query = "SELECT Timestamp FROM tbl_lastpointcongtrinh Where ID=1";
			Cursor cursor = db.rawQuery(query, null);
			if (cursor.moveToFirst()) {
				do {
					time = cursor.getString(cursor.getColumnIndex("Timestamp"));
				} while (cursor.moveToNext());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}

	public static void updateKetThucDieuTraNuoc(int id) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		s.append("UPDATE kdv_dnn_hogiadinh SET DaKetThucDieuTra =3 where ID=")
				.append(id);
		String query = s.toString();
		db.execSQL(query);
	}

	public static void updateKetThucDieuTraVeSinh(int id) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		s.append("UPDATE kdv_vs_hogiadinh SET DaKetThucDieuTra =3 where ID=")
				.append(id);
		String query = s.toString();
		db.execSQL(query);
	}

	public static void updateKetThucDieuTraCongTrinh(int id) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		s.append(
				"UPDATE kdv_vs_congtrinhcongcong SET DaKetThucDieuTra =3 where ID=")
				.append(id);
		String query = s.toString();
		db.execSQL(query);
	}

	// thành lập url
	public static String taoBangThayDoiUrl() {
		String url = null;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		StringBuilder q = new StringBuilder();
		try {
			s.append("CREATE TABLE IF NOT EXISTS tbl_url(ID INTEGER primary key AUTOINCREMENT,url TEXT)");
			String query = s.toString();
			db.execSQL(query);
			String queryselect = "SELECT url FROM tbl_url";
			Cursor cursor = db.rawQuery(queryselect, null);
			if (cursor.moveToFirst()) {
				do {
					url = cursor.getString(cursor.getColumnIndex("url"));
				} while (cursor.moveToNext());
			}
			q.append("INSERT INTO tbl_url (ID,url) VALUES(1,'")
					.append(URL_host).append("')");
			String queryis = q.toString();
			if (url == null) {
				db.execSQL(queryis);
				Cursor cursorsl = db.rawQuery("SELECT url FROM tbl_url", null);
				if (cursorsl.moveToFirst()) {
					do {
						url = cursorsl
								.getString(cursorsl.getColumnIndex("url"));
					} while (cursorsl.moveToNext());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return url;

	}

	public static void thaydoiSever(String url) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		StringBuilder q = new StringBuilder();
		try {
			s.append("CREATE TABLE IF NOT EXISTS tbl_url(ID INTEGER primary key AUTOINCREMENT,url TEXT)");
			String query = s.toString();
			db.execSQL(query);
			db.execSQL("Delete from tbl_url");
			q.append("INSERT INTO tbl_url (ID,url) VALUES(1,'").append(url)
					.append("')");
			String queryis = q.toString();
			db.execSQL(queryis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static User createTaikhoanDangNhap() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		ArrayList<User> results = new ArrayList<User>();
		User u = new User();
		try {
			final String CREATE_TABLE_CONTAIN = "CREATE TABLE IF NOT EXISTS tbl_taikhoankiemdem("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "ten TEXT,"
					+ "tinh TEXT,"
					+ "code TEXT,"
					+ "hoten TEXT,"
					+ "giamsat TEXT," + "pass TEXT);";
			db.execSQL(CREATE_TABLE_CONTAIN);
			String query = "SELECT * FROM tbl_taikhoankiemdem";
			Cursor cursor = db.rawQuery(query, null);

			if (cursor.moveToFirst()) {
				do {
					String ten = cursor.getString(cursor.getColumnIndex("ten"));
					String pass = cursor.getString(cursor
							.getColumnIndex("pass"));
					String hovaten = cursor.getString(cursor
							.getColumnIndex("hoten"));
					String giamsat = cursor.getString(cursor
							.getColumnIndex("giamsat"));
					String tinh = cursor.getString(cursor
							.getColumnIndex("tinh"));
					String code = cursor.getString(cursor
							.getColumnIndex("code"));

					u.setTen(ten);
					u.setPass(pass);
					u.setHovaten(hovaten);
					u.setGiamsatvien(giamsat);
					u.setCode(code);
					u.setTinh(tinh);
					// results.add(u);

				} while (cursor.moveToNext());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
}
