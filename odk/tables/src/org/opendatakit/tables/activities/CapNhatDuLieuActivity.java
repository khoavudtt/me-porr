package org.opendatakit.tables.activities;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.opendatakit.tables.R;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import dtt.company.bean.LinkURL;
import dtt.company.bean.Log;
import dtt.company.bean.ThongTinDongBo;
import dtt.company.bean.User;
import dtt.company.json.JSONParser;
import dtt.company.sqlite.Sqlite;

public class CapNhatDuLieuActivity extends Activity {
	private TextView taikhoan;
	private TextView donvi;
	private TextView hoten;
	private TextView giamsat;
	private Dialog succDialog;
	private Dialog errDialog;

	JSONParser jParser = new JSONParser();
	private ProgressDialog pDialog;
	JSONParser jsonParser = new JSONParser();

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.capnhatdulieu);
		View dongbo = (View) findViewById(R.id.bt_post);
		View vsgdinh = (View) findViewById(R.id.vsgdinh);
		View kehoach_nuoc = (View) findViewById(R.id.kehoach_nuoc);
		taikhoan = (TextView) findViewById(R.id.txt_tk);
		// matkhau = (EditText) findViewById(R.id.txt_mk);
		hoten = (TextView) findViewById(R.id.txt_kiemdem);
		donvi = (TextView) findViewById(R.id.donvi);
		giamsat = (TextView) findViewById(R.id.giamsat);
		User user = Sqlite.createTaikhoanDangNhap();
		taikhoan.setText(user.getTen());
		hoten.setText(user.getHovaten());
		donvi.setText(user.getTinh() + "-" + user.getCode());
		if (user.getGiamsatvien().equals("null")) {
			giamsat.setText(getString(R.string.chuaxacdinh));
		} else {
			giamsat.setText(user.getGiamsatvien());
		}

		dongbo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				try {
					new Capnhatdulieu().execute();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		vsgdinh.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(getApplicationContext(),
						KeHoachVeSinhActivity.class));
			}
		});
		kehoach_nuoc.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(getApplicationContext(),
						KeHoachNuocActivity.class));
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater menuInflater = this.getMenuInflater();
		menuInflater.inflate(R.menu.capnhatdulieu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.capnhatdulieu_home:
			startActivity(new Intent(this, WebViewActivity.class));
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	public void insertThongTinKeHoach(String tungay, String denngay,
			String nam, String daketthucdieutra, String thongtinID,
			String kehoachkiemdemid) {
		SQLiteDatabase db;
		db = openOrCreateDatabase("kehoach.db",
				SQLiteDatabase.CREATE_IF_NECESSARY, null);
		try {
			final String CREATE_TABLE_CONTAIN = "CREATE TABLE IF NOT EXISTS tbl_Kehoach("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "tungay TEXT,"
					+ "denngay TEXT,"
					+ "nam TEXT,"
					+ "daketthucdieutra TEXT,"
					+ "thongtinID TEXT," + "kehoachkiemdemid TEXT);";
			db.rawQuery(CREATE_TABLE_CONTAIN, null);
			Toast.makeText(CapNhatDuLieuActivity.this, "table created ",
					Toast.LENGTH_LONG).show();
		} catch (Exception e) {
			Toast.makeText(CapNhatDuLieuActivity.this, "ERROR " + e.toString(),
					Toast.LENGTH_LONG).show();
		}
	}

	private void createthongtinkehoachnuoc() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		try {
			final String tbl_thongtinkehoach = "CREATE TABLE IF NOT EXISTS tbl_thongtinkehoach("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "nam TEXT,"
					+ "tungay TEXT,"
					+ "denngay TEXT,"
					+ "kehoachkiemdemid TEXT,"
					+ "trangthai TEXT,"
					+ "daketthucdieutra TEXT," + "id_daunoi TEXT);";

			db.execSQL(tbl_thongtinkehoach);
			String query = "DELETE  FROM tbl_thongtinkehoach";
			db.execSQL(query);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void createthongtinkehoachvs() {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		try {
			final String tbl_thongtinkehoachvs = "CREATE TABLE IF NOT EXISTS tbl_thongtinkehoachvs("
					+ "ID INTEGER primary key AUTOINCREMENT,"
					+ "nam TEXT,"
					+ "tungay TEXT,"
					+ "denngay TEXT,"
					+ "kehoachkiemdemid TEXT,"
					+ "trangthai TEXT,"
					+ "daketthucdieutra TEXT," + "id_daunoi TEXT);";
			db.execSQL(tbl_thongtinkehoachvs);
			String query = "DELETE  FROM tbl_thongtinkehoachvs";
			db.execSQL(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void createThongTinKeHoachCongTrinh() {
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
			String querycogntrinh = "DELETE  FROM tbl_thongtinkehoachcongtrinh";
			db.execSQL(querycogntrinh);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addThongTinkeHoach(String nam, String tungay, String denngay,
			String daketthucdieutra, String id_daunoi, String trangthai,
			String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String time = null;
		try {
			String sql = "INSERT INTO tbl_thongtinkehoach (id_daunoi,nam,tungay,denngay,trangthai,daketthucdieutra,kehoachkiemdemid) VALUES("
					+ "'"
					+ id_daunoi
					+ "',"
					+ "'"
					+ nam
					+ "',"
					+ "'"
					+ tungay
					+ "',"
					+ "'"
					+ denngay
					+ "',"
					+ "'"
					+ trangthai
					+ "',"
					+ "'"
					+ daketthucdieutra
					+ "',"
					+ "'"
					+ kehoachkiemdemid
					+ "'" + ")";
			db.execSQL(sql);
		} catch (Exception e) {
			Toast.makeText(CapNhatDuLieuActivity.this, "ERROR " + e.toString(),
					Toast.LENGTH_LONG).show();
		}
	}

	public void addThongTinkeHoachvs(String nam, String tungay, String denngay,
			String daketthucdieutra, String id_daunoi, String trangthai,
			String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String time = null;
		try {
			String sql = "INSERT INTO tbl_thongtinkehoachvs (id_daunoi,nam,tungay,denngay,trangthai,daketthucdieutra,kehoachkiemdemid) VALUES("
					+ "'"
					+ id_daunoi
					+ "',"
					+ "'"
					+ nam
					+ "',"
					+ "'"
					+ tungay
					+ "',"
					+ "'"
					+ denngay
					+ "',"
					+ "'"
					+ trangthai
					+ "',"
					+ "'"
					+ daketthucdieutra
					+ "',"
					+ "'"
					+ kehoachkiemdemid
					+ "'" + ")";
			db.execSQL(sql);

		} catch (Exception e) {
			Toast.makeText(CapNhatDuLieuActivity.this, "ERROR " + e.toString(),
					Toast.LENGTH_LONG).show();
		}
	}

	public void addThongTinkeHoachCongTrinh(String nam, String tungay,
			String denngay, String daketthucdieutra, String id_congtrinh,
			String trangthai, String kehoachkiemdemid) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		try {
			s.append("INSERT INTO tbl_thongtinkehoachcongtrinh (id_congtrinh,nam,tungay,denngay,trangthai,daketthucdieutra,kehoachkiemdemid) VALUES(");
			s.append(id_congtrinh).append(",").append(nam).append(",'")
					.append(tungay).append("','").append(denngay).append("','")
					.append(trangthai).append("',").append(daketthucdieutra)
					.append(",").append(kehoachkiemdemid).append(")");
			String query = s.toString();
			db.execSQL(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addDaunoi(int id, int kehoachkiemdemnuocid, String tenchuho,
			String maxa, String mahuyen, String matinh, int daunoinuocid,
			String thonxom, String gioitinhchuho, String songuoitrongho,
			String thanhphanhogiadinh, String BiMatNuoc, String ChiSoDongHo,
			String ChinhSach, String ChuHoDungDS, String CoBeChuaNuoc,
			String CoNguoiONhaKhong, String DaKetThucDieuTra,
			String DaTungDucKhong, String DauNoiChua, String GhiChu,
			String GioiTinhChuHo, String GioiTinhChuHoHienTai,
			String GioiTinhNguoiTraLoi, String HoTenNguoiTraLoi,
			String LaChuHoKhong, String LoaiKhac, String LoaiKhacTungCo,
			String LyDoKhongDungDS, String LyDoKhongHoanThanh, String MauNuoc,
			String MauNuocTungCo, String MuiNuoc, String MuiNuocTungCo,
			String NuocTrongKhong, String SoGioTrungBinh, String SoLanMatNuoc,
			String SoSeryDongHo, String TenChuHoHienTai, String TenDanToc,
			String TimThayNha, String TinhTrangBe, String ToaDoDiaChi_latitude,
			String ToaDoDiaChi_longitude, String ViNuoc, String ViNuocTungCo,
			String VoiNuocChayKhong, String thoigiandauhopdong,
			String thoigiandaunoithucte, String anhdaunoi, String anhbechua,
			String anhdongho) {

		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		s.append(
				"INSERT INTO kdv_dnn_hogiadinh (ID,_id,_form_id,_savepoint_timestamp,"
						+ "_sync_state,TenChuHo,MaHuyen,MaTinh,MaXa,DAUNOINUOCID,GioiTinhChuHo,KEHOACHKIEMDEMNUOCID,SoNguoiTrongHo,ThanhPhanHoGD,"
						+ "BiMatNuoc,ChiSoDongHo,ChinhSach,ChuHoDungDS,CoBeChuaNuoc,CoNguoiONhaKhong,DaKetThucDieuTra,DaTungDucKhong,DauNoiChua,GhiChu,GioiTinhChuHo"
						+ ",GioiTinhChuHoHienTai,GioiTinhNguoiTraLoi,HoTenNguoiTraLoi,LaChuHoKhong,LoaiKhac,LoaiKhacTungCo,LyDoKhongDungDS"
						+ ",LyDoKhongHoanThanh,MauNuoc,MauNuocTungCo,MuiNuoc,MuiNuocTungCo,NuocTrongKhong,SoGioTrungBinh,"
						+ "SoLanMatNuoc,SoSeryDongHo,TenChuHoHienTai,TenDanToc,TimThayNha,TinhTrangBe,ToaDoDiaChi_latitude,"
						+ "ToaDoDiaChi_longitude,ViNuoc,ViNuocTungCo,VoiNuocChayKhong,ThonXom,thoigiandauhopdong,thoigiandaunoithucte,AnhBeChua_uriFragment,AnhDauNoi_uriFragment,AnhDongHo_uriFragment,AnhBeChua_contentType,AnhDauNoi_contentType,"
						+ "AnhDongHo_contentType,_savepoint_creator,_savepoint_type,_locale,_filter_type) VALUES(")
				.append(id)
				.append(",'uuid:")
				.append(id)
				.append("','kdv_dnn_hogiadinh','2015-08-12T08:06:51.151000000','new_row','")
				.append(tenchuho).append("','").append(mahuyen).append("','")
				.append(matinh).append("','").append(maxa).append("',")
				.append(daunoinuocid).append(",");
		if (gioitinhchuho.equals("null")) {
			s.append("null,");
		} else {
			s.append(gioitinhchuho).append(",");
		}
		s.append(kehoachkiemdemnuocid).append(",");
		if (songuoitrongho.equals("null")) {
			s.append("null,");
		} else {
			s.append(songuoitrongho).append(",");
		}
		if (thanhphanhogiadinh.equals("null")) {
			s.append("null,");
		} else {
			s.append(thanhphanhogiadinh).append(",");
		}
		if (BiMatNuoc.equals("null") || BiMatNuoc.equals("0")) {
			s.append("null,");
		} else {
			s.append(BiMatNuoc).append(",");
		}
		if (ChiSoDongHo.equals("null") || ChiSoDongHo.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(ChiSoDongHo).append("',");
		}
		if (ChinhSach.equals("null") || ChinhSach.equals("0")) {
			s.append("null,");
		} else {
			s.append(ChinhSach).append(",");
		}
		if (ChuHoDungDS.equals("null") || ChuHoDungDS.equals("0")) {
			s.append("null,");
		} else {
			s.append(ChuHoDungDS).append(",");
		}
		if (CoBeChuaNuoc.equals("null") || CoBeChuaNuoc.equals("0")) {
			s.append("null,");
		} else {
			s.append(CoBeChuaNuoc).append(",");
		}
		if (CoNguoiONhaKhong.equals("null") || CoNguoiONhaKhong.equals("0")) {
			s.append("null,");
		} else {
			s.append(CoNguoiONhaKhong).append(",");
		}
		if (DaKetThucDieuTra.equals("null") || DaKetThucDieuTra.equals("0")) {
			s.append("null,");
		} else {
			s.append(DaKetThucDieuTra).append(",");
		}
		if (DaTungDucKhong.equals("null") || DaTungDucKhong.equals("0")) {
			s.append("null,");
		} else {
			s.append(DaTungDucKhong).append(",");
		}
		if (DauNoiChua.equals("null") || DauNoiChua.equals("0")) {
			s.append("null,");
		} else {
			s.append(DauNoiChua).append(",");
		}
		if (GhiChu.equals("null") || GhiChu.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(GhiChu).append("',");
		}
		if (GioiTinhChuHo.equals("null")) {
			s.append("null,");
		} else {
			s.append(GioiTinhChuHo).append(",");
		}
		if (GioiTinhChuHoHienTai.equals("null")) {
			s.append("null,");
		} else {
			s.append(GioiTinhChuHoHienTai).append(",");
		}
		if (GioiTinhNguoiTraLoi.equals("null")
				|| GioiTinhNguoiTraLoi.equals("")) {
			s.append("null,");
		} else {
			s.append(GioiTinhNguoiTraLoi).append(",");
		}
		if (HoTenNguoiTraLoi.equals("null") || HoTenNguoiTraLoi.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(HoTenNguoiTraLoi).append("',");
		}
		if (LaChuHoKhong.equals("null") || LaChuHoKhong.equals("0")) {
			s.append("null,");
		} else {
			s.append(LaChuHoKhong).append(",");
		}
		if (LoaiKhac.equals("null") || LoaiKhac.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(LoaiKhac).append("',");
		}
		if (LoaiKhacTungCo.equals("null") || LoaiKhacTungCo.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(LoaiKhacTungCo).append("',");
		}
		if (LyDoKhongDungDS.equals("null") || LyDoKhongDungDS.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(LyDoKhongDungDS).append("',");
		}
		if (LyDoKhongHoanThanh.equals("null") || LyDoKhongHoanThanh.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(LyDoKhongHoanThanh).append("',");
		}
		if (MauNuoc.equals("null") || MauNuoc.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(MauNuoc).append("',");
		}
		if (MauNuocTungCo.equals("null") || MauNuocTungCo.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(MauNuocTungCo).append("',");
		}
		if (MuiNuoc.equals("null") || MuiNuoc.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(MuiNuoc).append("',");
		}
		if (MuiNuocTungCo.equals("null") || MuiNuocTungCo.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(MuiNuocTungCo).append("',");
		}
		if (NuocTrongKhong.equals("null") || NuocTrongKhong.equals("0")) {
			s.append("null,");
		} else {
			s.append(NuocTrongKhong).append(",");
		}
		if (SoGioTrungBinh.equals("null") || SoGioTrungBinh.equals("0")) {
			s.append("null,");
		} else {
			s.append(SoGioTrungBinh).append(",");
		}
		if (SoLanMatNuoc.equals("null") || SoLanMatNuoc.equals("0")) {
			s.append("null,");
		} else {
			s.append(SoLanMatNuoc).append(",");
		}
		if (SoSeryDongHo.equals("null") || SoSeryDongHo.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(SoSeryDongHo).append("',");
		}
		if (TenChuHoHienTai.equals("null") || TenChuHoHienTai.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(TenChuHoHienTai).append("',");
		}
		if (TenDanToc.equals("null") || TenDanToc.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(TenDanToc).append("',");
		}
		if (TimThayNha.equals("null") || TimThayNha.equals("0")) {
			s.append("null,");
		} else {
			s.append(TimThayNha).append(",");
		}
		if (TinhTrangBe.equals("null") || TinhTrangBe.equals("0")) {
			s.append("null,");
		} else {
			s.append(TinhTrangBe).append(",");
		}
		if (ToaDoDiaChi_latitude.equals("null")
				|| ToaDoDiaChi_latitude.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(ToaDoDiaChi_latitude).append("',");
		}
		if (ToaDoDiaChi_longitude.equals("null")
				|| ToaDoDiaChi_longitude.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(ToaDoDiaChi_longitude).append("',");
		}
		if (ViNuoc.equals("null") || ViNuoc.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(ViNuoc).append("',");
		}
		if (ViNuocTungCo.equals("null") || ViNuocTungCo.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(ViNuocTungCo).append("',");
		}
		if (VoiNuocChayKhong.equals("null") || VoiNuocChayKhong.equals("0")) {
			s.append("null,");
		} else {
			s.append(VoiNuocChayKhong).append(",");
		}
		if (thonxom.equals("null") || thonxom.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(thonxom).append("',");
		}
		if (thoigiandauhopdong.equals("null") || thoigiandauhopdong.equals("")) {
			s.append("null,");
		} else {
			s.append("'" + thoigiandauhopdong + "T05:00:00.000000000',");
		}
		if (thoigiandaunoithucte.equals("null")
				|| thoigiandaunoithucte.equals("")) {
			s.append("null,");

		} else {
			s.append("'" + thoigiandaunoithucte + "T05:00:00.000000000',");
		}
		if (anhbechua == null) {
			s.append("null,");
		} else {
			s.append("'" + anhbechua + "',");
		}
		if (anhdaunoi == null) {
			s.append("null,");
		} else {
			s.append("'" + anhdaunoi + "',");
		}
		if (anhdongho == null) {
			s.append("null,");
		} else {
			s.append("'" + anhdongho + "',");
		}
		s.append("'image/*','image/*','image/*','anonymous','INCOMPLETE','default','DEFAULT')");
		String query = s.toString();
		db.execSQL(query);
	}

	private static String uploadfile(String url, String path, String tinh,
			String huyen, String xa) {
		String err = null;
		String LOCAL = "opendatakit/tables/";
		String name_iamge = null;
		String resultbechua[] = path.split("[/]");
		name_iamge = resultbechua[4];
		String sentpath = tinh + "/" + huyen + "/" + xa + "/" + name_iamge;
		File file = new File(Environment.getExternalStorageDirectory()
				+ File.separator + LOCAL + path);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			err = Log.KHONGTIMTHAY + e.getMessage();
		}
		if (err == null) {
			Bitmap bm = BitmapFactory.decodeStream(fis);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			bm.compress(Bitmap.CompressFormat.JPEG, 30, baos);
			byte[] b = baos.toByteArray();
			String encodedImage = Base64.encodeToString(b, Base64.DEFAULT);
			ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
			nameValuePairs.add(new BasicNameValuePair("image", encodedImage));
			nameValuePairs.add(new BasicNameValuePair("path", sentpath));
			try {
				HttpClient httpclient = new DefaultHttpClient();
				HttpPost httppost = new HttpPost(url);
				httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
				HttpResponse response = httpclient.execute(httppost);
				HttpEntity entity = response.getEntity();
				String outPut = EntityUtils.toString(entity);
			} catch (Exception e) {
				err = Log.ERR_NETWORD;

			}
		}
		return err;
	}

	private ThongTinDongBo getdataNuoc(String idkiemdem) {
		ThongTinDongBo tt = new ThongTinDongBo();
		String err = null;
		int count = 0;
		int countgui = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String time = Sqlite.getTimeampnuoc();
		String query;
		if (time == null) {
			query = "SELECT  * FROM kdv_dnn_hogiadinh  where  _savepoint_timestamp >'2015-08-12T08:06:51.151000000'";
		} else {
			query = "SELECT  * FROM kdv_dnn_hogiadinh where  _savepoint_timestamp >"
					+ "'" + time + "'";
		}
		Cursor cursor = db.rawQuery(query, null);
		JSONArray json = new JSONArray();
		if (cursor.moveToFirst()) {
			do {
				String anhdaunoi = null;
				String anhdongho = null;
				String anhbechua = null;
				String AnhDauNoi_uriFragment = cursor.getString(cursor
						.getColumnIndex("AnhDauNoi_uriFragment"));
				String AnhDongHo_uriFragment = cursor.getString(cursor
						.getColumnIndex("AnhDongHo_uriFragment"));
				String AnhBeChua_uriFragment = cursor.getString(cursor
						.getColumnIndex("AnhBeChua_uriFragment"));
				String mahuyen = cursor.getString(cursor
						.getColumnIndex("MaHuyen"));
				String matinh = cursor.getString(cursor
						.getColumnIndex("MaTinh"));
				String maxa = cursor.getString(cursor.getColumnIndex("MaXa"));
				JSONObject row = new JSONObject();
				if (mahuyen != null
						&& maxa != null
						&& matinh != null
						&& cursor.getString(cursor.getColumnIndex("TenChuHo")) != null
						&& cursor.getString(cursor.getColumnIndex("ThonXom")) != null) {
					try {
						countgui = countgui + 1;
						if (AnhDauNoi_uriFragment != null) {
							String name[] = null;
							name = AnhDauNoi_uriFragment.split("/");
							anhdaunoi = "/images/daunoinuoc/" + matinh + "/"
									+ mahuyen + "/" + maxa + "/" + name[4];
						}
						if (AnhDongHo_uriFragment != null) {
							String name[] = null;
							name = AnhDongHo_uriFragment.split("/");
							anhdongho = "/images/daunoinuoc/" + matinh + "/"
									+ mahuyen + "/" + maxa + "/" + name[4];
						}
						if (AnhBeChua_uriFragment != null) {
							String name[] = null;
							name = AnhBeChua_uriFragment.split("/");
							anhbechua = "/images/daunoinuoc/" + matinh + "/"
									+ mahuyen + "/" + maxa + "/" + name[4];
						}
						row.put("id",
								cursor.getInt(cursor.getColumnIndex("ID")));
						row.put("anhdaunoi", anhdaunoi);
						row.put("anhdongho", anhdongho);
						row.put("anhbechua", anhbechua);
						row.put("chinhsach", cursor.getString(cursor
								.getColumnIndex("ChinhSach")));
						row.put("bimatnuoc", cursor.getString(cursor
								.getColumnIndex("BiMatNuoc")));
						row.put("chisodongho", cursor.getString(cursor
								.getColumnIndex("ChiSoDongHo")));
						row.put("chuhodungds", cursor.getString(cursor
								.getColumnIndex("ChuHoDungDS")));
						row.put("cobechua", cursor.getString(cursor
								.getColumnIndex("CoBeChuaNuoc")));
						row.put("conguoionhakhong", cursor.getString(cursor
								.getColumnIndex("CoNguoiONhaKhong")));
						row.put("daunoinuocid", cursor.getString(cursor
								.getColumnIndex("DAUNOINUOCID")));
						row.put("daketthucdieutra", cursor.getString(cursor
								.getColumnIndex("DaKetThucDieuTra")));
						row.put("datungduckhong", cursor.getString(cursor
								.getColumnIndex("DaTungDucKhong")));
						row.put("daunoichua", cursor.getString(cursor
								.getColumnIndex("DauNoiChua")));
						row.put("ghichu", cursor.getString(cursor
								.getColumnIndex("GhiChu")));
						row.put("gioitinhchuho", cursor.getString(cursor
								.getColumnIndex("GioiTinhChuHo")));
						row.put("gioitinhchuhohientai", cursor.getString(cursor
								.getColumnIndex("GioiTinhChuHoHienTai")));
						row.put("gioitinhnguoitraloi", cursor.getString(cursor
								.getColumnIndex("GioiTinhNguoiTraLoi")));
						row.put("hotennguoitraloi", cursor.getString(cursor
								.getColumnIndex("HoTenNguoiTraLoi")));
						row.put("imei",
								cursor.getString(cursor.getColumnIndex("IMEI")));
						row.put("kehoachkiemdemnuocid", cursor.getString(cursor
								.getColumnIndex("KEHOACHKIEMDEMNUOCID")));
						row.put("lachuhokhong", cursor.getString(cursor
								.getColumnIndex("LaChuHoKhong")));
						row.put("loaikhac", cursor.getString(cursor
								.getColumnIndex("LoaiKhac")));
						row.put("loaikhactungco", cursor.getString(cursor
								.getColumnIndex("LoaiKhacTungCo")));
						row.put("lydokhongdungds", null);
						row.put("lydokhonghoanthanh", cursor.getString(cursor
								.getColumnIndex("LyDoKhongHoanThanh")));
						row.put("maxa", maxa);
						row.put("matinh", matinh);
						row.put("mahuyen", mahuyen);
						row.put("maunuoc", cursor.getString(cursor
								.getColumnIndex("MauNuoc")));
						row.put("maunuoctungco", cursor.getString(cursor
								.getColumnIndex("MauNuocTungCo")));
						row.put("muinuoc", cursor.getString(cursor
								.getColumnIndex("MuiNuoc")));
						row.put("muinuoctungco", cursor.getString(cursor
								.getColumnIndex("MuiNuocTungCo")));
						row.put("ngaykiemdem", cursor.getString(cursor
								.getColumnIndex("NgayKiemDem")));
						row.put("nuoctrongkhong", cursor.getString(cursor
								.getColumnIndex("NuocTrongKhong")));
						row.put("sogiotrungbinh", cursor.getString(cursor
								.getColumnIndex("SoGioTrungBinh")));
						row.put("solanmatnuoc", cursor.getString(cursor
								.getColumnIndex("SoLanMatNuoc")));
						row.put("songuoitrongho", cursor.getString(cursor
								.getColumnIndex("SoNguoiTrongHo")));
						row.put("tenchuho", cursor.getString(cursor
								.getColumnIndex("TenChuHo")));
						row.put("tenchuhohientai", cursor.getString(cursor
								.getColumnIndex("TenChuHoHienTai")));
						row.put("tendantoc", cursor.getString(cursor
								.getColumnIndex("TenDanToc")));
						row.put("thanhphanhogd", cursor.getString(cursor
								.getColumnIndex("ThanhPhanHoGD")));
						row.put("thoigiandaunoihopdong", cursor
								.getString(cursor
										.getColumnIndex("ThoiGianDauHopDong")));
						row.put("thoigiandaunoithucte", cursor.getString(cursor
								.getColumnIndex("ThoiGianDauNoiThucTe")));
						row.put("thonxom", cursor.getString(cursor
								.getColumnIndex("ThonXom")));
						row.put("timthaynha", cursor.getString(cursor
								.getColumnIndex("TimThayNha")));
						row.put("tinhtrangbe", cursor.getString(cursor
								.getColumnIndex("TinhTrangBe")));
						row.put("voinuoccochaykhong", cursor.getString(cursor
								.getColumnIndex("VoiNuocChayKhong")));
						row.put("vinuoctungco", cursor.getString(cursor
								.getColumnIndex("ViNuocTungCo")));
						row.put("vinuoc", cursor.getString(cursor
								.getColumnIndex("ViNuoc")));
						row.put("toadodiachi_longitude",
								cursor.getDouble(cursor
										.getColumnIndex("ToaDoDiaChi_longitude")));
						row.put("toadodiachi_latitude", cursor.getDouble(cursor
								.getColumnIndex("ToaDoDiaChi_latitude")));
						row.put("soserydongho", cursor.getString(cursor
								.getColumnIndex("SoSeryDongHo")));
						row.put("savepoint", cursor.getString(cursor
								.getColumnIndex("_savepoint_timestamp")));
						row.put("idkiemtra", idkiemdem);
						row.put("idmobile",
								cursor.getString(cursor.getColumnIndex("_id")));
						json.put(row);

						if (AnhDauNoi_uriFragment != null) {
							err = uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_NUOC,
									AnhDauNoi_uriFragment, matinh, mahuyen,
									maxa);
							if (err != null) {
								if (err.equals(Log.ERR_NETWORD)) {
									tt.setErr(err);
									return tt;
								}
							}
						}
						if (AnhDongHo_uriFragment != null) {
							err = uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_NUOC,
									AnhDongHo_uriFragment, matinh, mahuyen,
									maxa);
							if (err != null) {
								if (err.equals(Log.ERR_NETWORD)) {
									tt.setErr(err);
									return tt;
								}
							}
						}
						if (AnhBeChua_uriFragment != null) {
							err = uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_NUOC,
									AnhBeChua_uriFragment, matinh, mahuyen,
									maxa);
							if (err != null) {
								if (err.equals(Log.ERR_NETWORD)) {
									tt.setErr(err);
									return tt;
								}

							}
						}

					} catch (JSONException e) {
						err = e.getMessage();
						tt.setErr(err);
						return tt;
					}
				} else {
					count = count + 1;
				}
			} while (cursor.moveToNext());
		}
		HttpPost post = new HttpPost(Sqlite.taoBangThayDoiUrl()
				+ LinkURL.URL_DONGBO_NUOC);
		HttpResponse response;
		HttpClient client = new DefaultHttpClient();
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 10000);
		StringEntity se;
		InputStream is = null;
		String result = "";
		try {
			se = new StringEntity(json.toString(), "UTF-8");
			post.setHeader("Accept", "application/json");
			post.setHeader("Content-type", "application/json;charset=utf-8");
			post.setEntity(se);
		} catch (UnsupportedEncodingException e1) {
			err = e1.getMessage();
			tt.setErr(err);
			return tt;
		}
		try {
			response = client.execute(post);
			if (response != null) {
				HttpEntity entity = response.getEntity();
				is = entity.getContent();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(is, "UTF-8"), 8);
				StringBuilder sb = new StringBuilder();
				String line = null;
				while ((line = reader.readLine()) != null) {
					sb.append(line + "\n");
				}
				is.close();
				result = sb.toString();
				JSONArray jArray;
				try {
					jArray = new JSONArray(result);
					for (int i = 0; i < jArray.length(); i++) {
						JSONObject json_data = jArray.getJSONObject(i);
						int istrung = json_data.getInt("istrung");
						if (istrung == 0) {
							String id_daunoi = json_data.getString("id_daunoi");
							String idmobie = json_data.getString("id_mobile");
							String idkehoach = json_data
									.getString("id_kehoach");
							String idthongtin = json_data
									.getString("id_thongtinkiemdem");
							updateID(id_daunoi, idmobie, idkehoach, idthongtin);
						}
						if (istrung == 1) {
							Sqlite.createThongTinTrung(
									json_data.getString("id_mobile"),
									Sqlite.nuoc, Sqlite.lasery);
						}
						if (istrung == 2) {
							Sqlite.createThongTinTrung(
									json_data.getString("id_mobile"),
									Sqlite.nuoc, Sqlite.ladiachi);
						}
					}
				} catch (JSONException e) {
					tt.setErr(err);
					return tt;
				}
			}
		} catch (ClientProtocolException e) {
			tt.setErr(err);
			return tt;
		} catch (IOException e) {
			tt.setErr(err);
			return tt;
		}
		tt.setKhonghoplenuoc(count);
		tt.setTongguinuoc(countgui);
		return tt;
	}

	private void updateID(String iddaunoi, String idmobie, String idkehoach,
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

	// start vệ sinh môi trường
	private String kiemtrakehoachdongvesinh(String id) {
		String err = null;
		InputStream is = null;
		String result = "";
		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		nameValuePairs.add(new BasicNameValuePair("id", id));
		// http post
		String a = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(Sqlite.taoBangThayDoiUrl()
					+ LinkURL.URL_KEHOACHDONG_VESINH);
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			is = entity.getContent();

		} catch (Exception e) {
			err = Log.ERR_NETWORD;
			return err;
		}

		// convert response to string
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "UTF-8"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			result = sb.toString();
		} catch (Exception e) {
			err = e.getMessage();
			return err;
		}
		// parse json data
		try {
			JSONArray jArray = new JSONArray(result);
			for (int i = 0; i < jArray.length(); i++) {
				JSONObject json_data = jArray.getJSONObject(i);
				String CONFIG_FORDER = Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
				SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER,
						null, 0);
				String query = "DELETE FROM kdv_vs_hogiadinh where KEHOACHKIEMDEMVESINHID="
						+ json_data.getInt("id");
				String querycc = "DELETE FROM kdv_vs_congtrinhcongcong where KEHOACHKIEMDEMVESINHID="
						+ json_data.getInt("id");
				db.execSQL(query);
				db.execSQL(querycc);

			}
		} catch (JSONException e) {
			err = e.getMessage();
			return err;
		}
		return err;

	}

	private void updateIDVSinh(String idvesinh, String idmobie,
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

	private void updateIDVSinhcc(int loai, String idvesinhcc, String idmobie,
			String idkehoach, String idthongtincc, String idmap) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String sql = "UPDATE kdv_vs_congtrinhcongcong SET ID =" + idthongtincc
				+ "," + "KEHOACHKIEMDEMVESINHID =" + idkehoach
				+ ",VESINHCONGTRINHID ='" + idvesinhcc + "' where _id=" + "'"
				+ idmobie + "'";
		String sqltruong = "UPDATE kdv_vs_chitietcongtrinhtruonghoc SET ID ='"
				+ idthongtincc + "' where ID_MAPPING=" + "'" + idmap + "'";
		String sqlyte = "UPDATE kdv_vs_chitietcongtrinhyte SET ID ='"
				+ idthongtincc + "' where ID_MAPPING=" + "'" + idmap + "'";
		db.execSQL(sql);
		if (loai == 1) {
			db.execSQL(sqltruong);
		}
		if (loai == 2) {
			db.execSQL(sqlyte);
		}

	}

	private ThongTinDongBo getdataVSinhGD(String idkiemdemvien) {
		String err = null;
		ThongTinDongBo tt = new ThongTinDongBo();
		int count = 0;
		int countgui = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String time = Sqlite.getTimeamp_vs();
		String query;
		if (time == null) {
			query = "SELECT * FROM kdv_vs_hogiadinh where _savepoint_timestamp >'2015-08-12T08:06:51.151000000'";
		} else {
			query = "SELECT * FROM kdv_vs_hogiadinh where _savepoint_timestamp >"
					+ "'" + time + "'";
		}
		Cursor cursor = db.rawQuery(query, null);
		JSONArray json = new JSONArray();
		if (cursor.moveToFirst()) {
			do {
				String AnhBeChua = null;
				String AnhToanCanh = null;
				String AnhTrongNhaTieu = null;
				JSONObject row = new JSONObject();
				try {
					String mahuyen = cursor.getString(cursor
							.getColumnIndex("MaHuyen"));
					String matinh = cursor.getString(cursor
							.getColumnIndex("MaTinh"));
					String maxa = cursor.getString(cursor
							.getColumnIndex("MaXa"));
					String AnhBeChua_uriFragment = cursor.getString(cursor
							.getColumnIndex("AnhBeChua_uriFragment"));
					String AnhToanCanh_uriFragment = cursor.getString(cursor
							.getColumnIndex("AnhToanCanh_uriFragment"));
					String AnhTrongNhaTieu_uriFragment = cursor
							.getString(cursor
									.getColumnIndex("AnhTrongNhaTieu_uriFragment"));
					if (mahuyen != null
							&& matinh != null
							&& maxa != null
							&& cursor.getString(cursor
									.getColumnIndex("TenChuHo")) != null
							&& cursor.getString(cursor
									.getColumnIndex("ThonXom")) != null) {
						countgui = countgui + 1;
						if (AnhBeChua_uriFragment != null) {
							String name[] = null;
							name = AnhBeChua_uriFragment.split("/");
							AnhBeChua = "/images/vesinhgiadinh/" + matinh + "/"
									+ mahuyen + "/" + maxa + "/" + name[4];
						}
						if (AnhToanCanh_uriFragment != null) {
							String name[] = null;
							name = AnhToanCanh_uriFragment.split("/");
							AnhToanCanh = "/images/vesinhgiadinh/" + matinh
									+ "/" + mahuyen + "/" + maxa + "/"
									+ name[4];
						}
						if (AnhTrongNhaTieu_uriFragment != null) {
							String name[] = null;
							name = AnhTrongNhaTieu_uriFragment.split("/");
							AnhTrongNhaTieu = "/images/vesinhgiadinh/" + matinh
									+ "/" + mahuyen + "/" + maxa + "/"
									+ name[4];
						}
						row.put("id",
								cursor.getInt(cursor.getColumnIndex("ID")));
						row.put("vesinhgiadinhid", cursor.getInt(cursor
								.getColumnIndex("VESINHGIADINHID")));
						row.put("anhtoancanh", AnhToanCanh);
						row.put("anhbechua", AnhBeChua);
						row.put("anhtrongnhatieu", AnhTrongNhaTieu);
						row.put("chitietvonvay", cursor.getString(cursor
								.getColumnIndex("ChiTietVonVay")));
						row.put("chuhodungds", cursor.getString(cursor
								.getColumnIndex("ChuHoDungDS")));
						row.put("conguoionha", cursor.getString(cursor
								.getColumnIndex("CoNguoiONha")));
						row.put("conhatieu", cursor.getString(cursor
								.getColumnIndex("CoNhaTieu")));
						row.put("cuaphanbitkin", cursor.getString(cursor
								.getColumnIndex("CuaPhanBitKin")));
						row.put("daketthucdieutra", cursor.getString(cursor
								.getColumnIndex("DaKetThucDieuTra")));
						row.put("delamvesinh", cursor.getString(cursor
								.getColumnIndex("DeLamVeSinh")));
						row.put("duchemuagio", cursor.getString(cursor
								.getColumnIndex("DuCheMuaGio")));
						row.put("ghichu", cursor.getString(cursor
								.getColumnIndex("GhiChu")));
						row.put("gioitinhchuho", cursor.getString(cursor
								.getColumnIndex("GioiTinhChuHo")));
						row.put("gioitinhchuhohientai", cursor.getString(cursor
								.getColumnIndex("GioiTinhChuHoHienTai")));
						row.put("gioitinhnguoitraloi", cursor.getString(cursor
								.getColumnIndex("GioiTinhNguoiTraLoi")));
						row.put("hotennguoitraloi", cursor.getString(cursor
								.getColumnIndex("HoTenNguoiTraLoi")));
						row.put("imei",
								cursor.getString(cursor.getColumnIndex("IMEI")));
						row.put("kehoachkiemdemvesinhid", cursor.getInt(cursor
								.getColumnIndex("KEHOACHKIEMDEMVESINHID")));
						row.put("lachuhokhong", cursor.getString(cursor
								.getColumnIndex("LaChuHoKhong")));
						row.put("loainguonnuoc", cursor.getString(cursor
								.getColumnIndex("LoaiNguonNuoc")));
						row.put("khoangcachnguonnuoc", cursor.getString(cursor
								.getColumnIndex("KhoangCachNguonNuoc")));
						row.put("lydokhonghoanthanh", cursor.getString(cursor
								.getColumnIndex("LyDoKhongHoanThanh")));
						row.put("loainhatieu", cursor.getString(cursor
								.getColumnIndex("LoaiNhaTieu")));
						row.put("duoccaitao", cursor.getString(cursor
								.getColumnIndex("DuocCaiTao")));
						row.put("loainhatieucu", cursor.getString(cursor
								.getColumnIndex("LoaiNhaTieuCu")));
						row.put("maxa",
								cursor.getString(cursor.getColumnIndex("MaXa")));
						row.put("matinh", cursor.getString(cursor
								.getColumnIndex("MaTinh")));
						row.put("mahuyen", cursor.getString(cursor
								.getColumnIndex("MaHuyen")));
						row.put("muivesinh", cursor.getString(cursor
								.getColumnIndex("MuiVeSinh")));
						row.put("namxaydung", cursor.getString(cursor
								.getColumnIndex("NamXayDung")));
						row.put("thangxaydung", cursor.getString(cursor
								.getColumnIndex("ThangXayDung")));
						row.put("napbecontot", cursor.getString(cursor
								.getColumnIndex("NapBeConTot")));
						row.put("tranrangoai", cursor.getString(cursor
								.getColumnIndex("TranRaNgoai")));
						row.put("ngapkhimualon", cursor.getString(cursor
								.getColumnIndex("NgapKhiMuaLon")));
						row.put("ngaykiemdem", cursor.getString(cursor
								.getColumnIndex("NgayKiemDem")));
						row.put("nguonvon", cursor.getString(cursor
								.getColumnIndex("NguonVon")));
						row.put("nuocthaididau", cursor.getString(cursor
								.getColumnIndex("NuocThaiDiDau")));
						row.put("phiatrenkindao", cursor.getString(cursor
								.getColumnIndex("PhiaTrenKinDao")));
						row.put("sancaotrentoithieu", cursor.getString(cursor
								.getColumnIndex("SanCaoTrenToiThieu")));
						row.put("songuoitrongho", cursor.getString(cursor
								.getColumnIndex("SoNguoiTrongHo")));
						row.put("tenchuhohientai", cursor.getString(cursor
								.getColumnIndex("TenChuHoHienTai")));
						row.put("tenchuho", cursor.getString(cursor
								.getColumnIndex("TenChuHo")));
						row.put("vesinhsachse", cursor.getString(cursor
								.getColumnIndex("VeSinhSachSe")));
						row.put("tendantoc", cursor.getString(cursor
								.getColumnIndex("TenDanToc")));
						row.put("thanhphanhogd", cursor.getString(cursor
								.getColumnIndex("ThanhPhanHoGD")));
						row.put("thonxom", cursor.getString(cursor
								.getColumnIndex("ThonXom")));
						row.put("kinhdo", cursor.getDouble(cursor
								.getColumnIndex("ToaDoDiaChi_longitude")));
						row.put("vido", cursor.getDouble(cursor
								.getColumnIndex("ToaDoDiaChi_latitude")));
						row.put("idmobile",
								cursor.getString(cursor.getColumnIndex("_id")));
						row.put("idkiemdemvien", idkiemdemvien);
						row.put("chinhsach", cursor.getString(cursor
								.getColumnIndex("ChinhSach")));
						row.put("timthaynha", cursor.getString(cursor
								.getColumnIndex("TimThayNha")));
						json.put(row);

						if (AnhToanCanh_uriFragment != null) {
							err = uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_VESINH,
									AnhToanCanh_uriFragment, matinh, mahuyen,
									maxa);
							if (err != null) {
								if (err.equals(Log.ERR_NETWORD)) {
									tt.setErr(err);
									return tt;
								}
							}
						}
						if (AnhTrongNhaTieu_uriFragment != null) {
							err = uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_VESINH,
									AnhTrongNhaTieu_uriFragment, matinh,
									mahuyen, maxa);
							if (err != null) {
								if (err.equals(Log.ERR_NETWORD)) {
									tt.setErr(err);
									return tt;
								}
							}
						}
						if (AnhBeChua_uriFragment != null) {
							err = uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_VESINH,
									AnhBeChua_uriFragment, matinh, mahuyen,
									maxa);
							if (err != null) {
								if (err.equals(Log.ERR_NETWORD)) {
									tt.setErr(err);
									return tt;
								}
							}
						}
					} else {
						count = count + 1;
					}
				} catch (JSONException e) {

					err = e.getMessage();
				}
			} while (cursor.moveToNext());
		}
		HttpPost post = new HttpPost(Sqlite.taoBangThayDoiUrl()
				+ LinkURL.URL_VS_DONGBO);
		HttpResponse response;
		HttpClient client = new DefaultHttpClient();
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 10000);
		StringEntity se;
		InputStream is = null;
		String result = "";
		try {
			se = new StringEntity(json.toString(), "UTF-8");
			post.setHeader("Accept", "application/json");
			post.setHeader("Content-type", "application/json;charset=utf-8");
			post.setEntity(se);
			try {
				response = client.execute(post);
				if (response != null) {
					HttpEntity entity = response.getEntity();
					is = entity.getContent();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(is, "UTF-8"), 8);
					StringBuilder sb = new StringBuilder();
					String line = null;
					while ((line = reader.readLine()) != null) {
						sb.append(line + "\n");
					}
					is.close();
					result = sb.toString();
					JSONArray jArray;
					try {
						jArray = new JSONArray(result);
						for (int i = 0; i < jArray.length(); i++) {
							JSONObject json_data = jArray.getJSONObject(i);
							if (json_data.getInt("latrung") == 0) {
								String id_vesinh = json_data
										.getString("id_vesinh");
								String idmobie = json_data
										.getString("id_mobile");
								String idkehoach = json_data
										.getString("id_kehoach");
								String id_thongtinvs = json_data
										.getString("id_thongtinvs");
								updateIDVSinh(id_vesinh, idmobie, idkehoach,
										id_thongtinvs);
							} else {
								Sqlite.createThongTinTrung(
										json_data.getString("id_mobile"),
										Sqlite.vesinh, Sqlite.ladiachi);
							}
						}
					} catch (JSONException e) {
						err = e.getMessage();
						tt.setErr(err);
						return tt;
					}
				}

			} catch (ClientProtocolException e) {
				err = e.getMessage();
				tt.setErr(err);
				return tt;
			} catch (IOException e) {
				err = e.getMessage();
				tt.setErr(err);
				return tt;
			}
		} catch (UnsupportedEncodingException e) {
			err = e.getMessage();
			tt.setErr(err);
			return tt;
		}
		tt.setKhonghoplevesinh(count);
		tt.setTongguivesinh(countgui);
		return tt;
	}

	private String kiemtrakehoachDongNuoc(String id) {
		String err = null;
		InputStream is = null;
		String result = "";
		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		nameValuePairs.add(new BasicNameValuePair("id", id));
		String a = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(Sqlite.taoBangThayDoiUrl()
					+ LinkURL.URL_KEHOACHDONG);
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			is = entity.getContent();

		} catch (Exception e) {
			err = e.getMessage();
		}
		// convert response to string
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "UTF-8"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			result = sb.toString();
		} catch (Exception e) {
			err = e.getMessage();
		}
		// parse json data
		try {
			JSONArray jArray = new JSONArray(result);
			for (int i = 0; i < jArray.length(); i++) {
				JSONObject json_data = jArray.getJSONObject(i);
				String CONFIG_FORDER = Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
				SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER,
						null, 0);
				String query = "DELETE FROM kdv_dnn_hogiadinh where KEHOACHKIEMDEMNUOCID="
						+ json_data.getInt("id");
				db.execSQL(query);
			}
		} catch (JSONException e) {
			err = e.getMessage();
		}
		return err;
	}

	private ThongTinDongBo addVeSinhGiaDinhMoi(String idkiemdemvien) {
		ThongTinDongBo tt = new ThongTinDongBo();
		String err = null;
		int jcount = 0;
		InputStream is = null;
		String result = "";
		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		nameValuePairs.add(new BasicNameValuePair("id", idkiemdemvien));
		String a = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(Sqlite.taoBangThayDoiUrl()
					+ LinkURL.URL_GETVESINH);
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			is = entity.getContent();

		} catch (Exception e) {
			tt.setErr(Log.ERR_NETWORD);
			return tt;
		}

		// convert response to string
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "UTF-8"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			result = sb.toString();
		} catch (Exception e) {
			tt.setErr(e.getMessage());
			return tt;

		}
		try {
			JSONArray jArray = new JSONArray(result);
			for (int i = 0; i < jArray.length(); i++) {
				JSONObject json_data = jArray.getJSONObject(i);
				String CONFIG_FORDER = Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
				SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER,
						null, 0);
				String query = "SELECT  * FROM kdv_vs_hogiadinh where ID="
						+ json_data.getInt("id");
				Cursor cursor = db.rawQuery(query, null);
				int r = cursor.getCount();
				if (r < 1) {
					jcount = jcount + 1;
					int id, vesinhgiadinhid, kehoachkiemdemvesinhid;
					String matinh, mahuyen, maxa, thonxom, tenchuho, gioitinhchuho, chinhsach, conguoionha, gioitinhnguoitraloi, namxaydung;
					String timthaynha, hotennguoitraloi, lachuhokhong, tendantoc, kinhdo;
					String vido, thanhphanhogd, chuhodungds, lydokhongdungds, tenchuhohientai, gioitinhchuhohientai;
					String conhatieu, loainhatieu, anhtoancanh, anhtrongnhatieu, nguonvon, chitietvonvay, duoccaitao, loainhatieucu, vesinhsachse, delamvesinh, muivesinh, phiatrenkindao, duchemuagio, sancaotrentoithieu, napbecontot, cuaphanbitkin, tranrangoai;
					String nuocthaididau, khoangcachnguonnuoc, ngapkhimualon, ghichu, daketthucdieutra, lydokhonghoanthanh, imei, taikhoan, danhgiakiemdem, songuoitrongho, thangxaydung, loainguonnuoc, anhbechua;
					String anhbechuatable = null, anhtoancanhtable = null, anhtrongnhatieutable = null;
					id = json_data.getInt("id");
					anhtoancanh = json_data.getString("anhtoancanh");
					if (!anhtoancanh.equals("null") && !anhtoancanh.equals("")) {
						String name[] = null;
						name = anhtoancanh.split("/");
						anhtoancanhtable = "tables/kdv_vs_hogiadinh/instances/uuid_000/"
								+ name[6];
					}
					anhbechua = json_data.getString("anhbechua");
					if (!anhbechua.equals("null") && !anhbechua.equals("")) {
						String name[] = null;
						name = anhbechua.split("/");
						anhbechuatable = "tables/kdv_vs_hogiadinh/instances/uuid_000/"
								+ name[6];
					}
					anhtrongnhatieu = json_data.getString("anhtrongnhatieu");
					if (!anhtrongnhatieu.equals("null")
							&& !anhtrongnhatieu.equals("")) {
						String name[] = null;
						name = anhtrongnhatieu.split("/");
						anhtrongnhatieutable = "tables/kdv_vs_hogiadinh/instances/uuid_000/"
								+ name[6];
					}
					vesinhgiadinhid = json_data.getInt("vesinhgiadinhid");
					kehoachkiemdemvesinhid = json_data
							.getInt("kehoachkiemdemvesinhid");
					chinhsach = json_data.getString("chinhsach");
					namxaydung = json_data.getString("namxaydung");
					conguoionha = json_data.getString("conguoionha");
					gioitinhnguoitraloi = json_data
							.getString("gioitinhnguoitraloi");
					matinh = json_data.getString("matinh");
					mahuyen = json_data.getString("mahuyen");
					maxa = json_data.getString("maxa");
					thonxom = json_data.getString("thonxom");
					tenchuho = json_data.getString("tenchuho");
					gioitinhchuho = json_data.getString("gioitinhchuho");
					timthaynha = json_data.getString("timthaynha");
					hotennguoitraloi = json_data.getString("hotennguoitraloi");
					lachuhokhong = json_data.getString("lachuhokhong");
					tendantoc = json_data.getString("tendantoc");
					kinhdo = json_data.getString("kinhdo");
					vido = json_data.getString("vido");
					thanhphanhogd = json_data.getString("thanhphanhogd");
					chuhodungds = json_data.getString("chuhodungds");
					lydokhongdungds = json_data.getString("lydokhongdungds");
					tenchuhohientai = json_data.getString("tenchuhohientai");
					gioitinhchuhohientai = json_data
							.getString("gioitinhchuhohientai");
					conhatieu = json_data.getString("conhatieu");
					loainhatieu = json_data.getString("loainhatieu");
					nguonvon = json_data.getString("nguonvon");
					chitietvonvay = json_data.getString("chitietvonvay");
					duoccaitao = json_data.getString("duoccaitao");
					loainhatieucu = json_data.getString("loainhatieucu");
					vesinhsachse = json_data.getString("vesinhsachse");
					delamvesinh = json_data.getString("delamvesinh");
					muivesinh = json_data.getString("muivesinh");
					phiatrenkindao = json_data.getString("phiatrenkindao");
					duchemuagio = json_data.getString("duchemuagio");
					sancaotrentoithieu = json_data
							.getString("sancaotrentoithieu");
					napbecontot = json_data.getString("napbecontot");
					cuaphanbitkin = json_data.getString("cuaphanbitkin");
					tranrangoai = json_data.getString("tranrangoai");
					nuocthaididau = json_data.getString("nuocthaididau");
					khoangcachnguonnuoc = json_data
							.getString("khoangcachnguonnuoc");

					ngapkhimualon = json_data.getString("ngapkhimualon");
					ghichu = json_data.getString("ghichu");
					daketthucdieutra = json_data.getString("daketthucdieutra");
					lydokhonghoanthanh = json_data
							.getString("lydokhonghoanthanh");
					songuoitrongho = json_data.getString("songuoitrongho");
					thangxaydung = json_data.getString("thangxaydung");
					loainguonnuoc = json_data.getString("loainguonnuoc");
					insertvesinhgiadinh(id, vesinhgiadinhid,
							kehoachkiemdemvesinhid, matinh, mahuyen, maxa,
							thonxom, tenchuho, gioitinhchuho, timthaynha,
							hotennguoitraloi, lachuhokhong, tendantoc,
							daketthucdieutra, songuoitrongho, thanhphanhogd,
							chitietvonvay, chinhsach, chuhodungds, conguoionha,
							conhatieu, cuaphanbitkin, daketthucdieutra,
							delamvesinh, duchemuagio, duoccaitao, ghichu,
							gioitinhchuho, gioitinhchuhohientai,
							gioitinhnguoitraloi, hotennguoitraloi,
							khoangcachnguonnuoc, lachuhokhong, loainguonnuoc,
							loainhatieu, loainhatieucu, lydokhonghoanthanh,
							muivesinh, namxaydung, napbecontot, ngapkhimualon,
							nguonvon, nuocthaididau, phiatrenkindao,
							sancaotrentoithieu, songuoitrongho,
							tenchuhohientai, tendantoc, thangxaydung,
							thanhphanhogd, timthaynha, vido, kinhdo,
							tranrangoai, vesinhsachse, anhbechuatable,
							anhtrongnhatieutable, anhtoancanhtable);

				} else {
					String kethucdieutra = json_data
							.getString("daketthucdieutra");
					if (kethucdieutra != null) {
						if (kethucdieutra.equals("3")) {
							Sqlite.updateKetThucDieuTraVeSinh(json_data
									.getInt("id"));
						}
					}
				}
			}
		} catch (JSONException e) {
			tt.setErr(e.getMessage());
			return tt;
		}
		tt.setTongvesinh(jcount);
		return tt;

	}

	private void insertvesinhgiadinh(int id, int vesinhid,
			int kehoachkiemdemvesinhid, String matinh, String mahuyen,
			String maxa, String thonxom, String tenchuho, String gioitinhchuho,
			String timthaynha, String hotennguoitraloi, String lachuhokhong,
			String tendantoc, String daketthucdieutra, String songuoitrongho,
			String thanhphanhogd, String ChiTietVonVay, String ChinhSach,
			String ChuHoDungDS, String CoNguoiONha, String CoNhaTieu,
			String CuaPhanBitKin, String DaKetThucDieuTra, String DeLamVeSinh,
			String DuCheMuaGio, String DuocCaiTao, String GhiChu,
			String GioiTinhChuHo, String GioiTinhChuHoHienTai,
			String GioiTinhNguoiTraLoi, String HoTenNguoiTraLoi,
			String KhoangCachNguonNuoc, String LaChuHoKhong,
			String LoaiNguonNuoc, String LoaiNhaTieu, String LoaiNhaTieuCu,
			String LyDoKhongHoanThanh, String MuiVeSinh, String NamXayDung,
			String NapBeConTot, String NgapKhiMuaLon, String NguonVon,
			String NuocThaiDiDau, String PhiaTrenKinDao,
			String SanCaoTrenToiThieu, String SoNguoiTrongHo,
			String TenChuHoHienTai, String TenDanToc, String ThangXayDung,
			String ThanhPhanHoGD, String TimThayNha,
			String ToaDoDiaChi_latitude, String ToaDoDiaChi_longitude,
			String TranRaNgoai, String VeSinhSachSe, String anhbechua,
			String anhtrongnhatieu, String anhtoancanh) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		s.append(
				"INSERT INTO kdv_vs_hogiadinh (ID,_id,_form_id,_savepoint_timestamp,"
						+ "_sync_state,KEHOACHKIEMDEMVESINHID,VESINHGIADINHID,ChiTietVonVay,"
						+ "ChinhSach,ChuHoDungDS,CoNguoiONha,CoNhaTieu,CuaPhanBitKin,"
						+ "DaKetThucDieuTra,DeLamVeSinh,DuCheMuaGio,DuocCaiTao,GhiChu,"
						+ "GioiTinhChuHo,GioiTinhChuHoHienTai,GioiTinhNguoiTraLoi,"
						+ "HoTenNguoiTraLoi,KhoangCachNguonNuoc,LaChuHoKhong,LoaiNguonNuoc"
						+ ",LoaiNhaTieu,LoaiNhaTieuCu,LyDoKhongHoanThanh,MaHuyen,MaTinh,"
						+ "MaXa,MuiVeSinh,NamXayDung,NapBeConTot,NgapKhiMuaLon,NguonVon,"
						+ "NuocThaiDiDau,PhiaTrenKinDao,SanCaoTrenToiThieu,SoNguoiTrongHo,"
						+ "TenChuHo,TenChuHoHienTai,TenDanToc,ThangXayDung,ThanhPhanHoGD,"
						+ "ThonXom,TimThayNha,ToaDoDiaChi_latitude,ToaDoDiaChi_longitude,"
						+ "TranRaNgoai,VeSinhSachSe,AnhBeChua_uriFragment,AnhToanCanh_uriFragment,AnhTrongNhaTieu_uriFragment,AnhBeChua_contentType,AnhToanCanh_contentType,"
						+ "AnhTrongNhaTieu_contentType,_savepoint_creator,_savepoint_type"
						+ ",_locale,_filter_type) VALUES (")
				.append(id)
				.append(",'uuid:")
				.append(id)
				.append("','kdv_vs_hogiadinh','2015-08-12T08:06:51.151000000','new_row',")
				.append(kehoachkiemdemvesinhid).append(",").append(vesinhid)
				.append(",");
		if (ChiTietVonVay.equals("null") || ChiTietVonVay.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(ChiTietVonVay).append("',");
		}
		if (ChinhSach.equals("null") || ChinhSach.equals("0")) {
			s.append("null,");
		} else {
			s.append(ChinhSach).append(",");
		}
		if (ChuHoDungDS.equals("null") || ChuHoDungDS.equals("0")) {
			s.append("null,");
		} else {
			s.append(ChuHoDungDS).append(",");
		}
		if (CoNguoiONha.equals("null") || CoNguoiONha.equals("0")) {
			s.append("null,");
		} else {
			s.append(CoNguoiONha).append(",");
		}
		if (CoNhaTieu.equals("null") || CoNhaTieu.equals("0")) {
			s.append("null,");
		} else {
			s.append(CoNhaTieu).append(",");
		}
		if (CuaPhanBitKin.equals("null") || CuaPhanBitKin.equals("0")) {
			s.append("null,");
		} else {
			s.append(CuaPhanBitKin).append(",");
		}
		if (DaKetThucDieuTra.equals("null") || DaKetThucDieuTra.equals("0")) {
			s.append("null,");
		} else {
			s.append(DaKetThucDieuTra).append(",");
		}
		if (DeLamVeSinh.equals("null") || DeLamVeSinh.equals("0")) {
			s.append("null,");
		} else {
			s.append(DeLamVeSinh).append(",");
		}
		if (DuCheMuaGio.equals("null") || DuCheMuaGio.equals("0")) {
			s.append("null,");
		} else {
			s.append(DuCheMuaGio).append(",");
		}
		if (DuocCaiTao.equals("null") || DuocCaiTao.equals("0")) {
			s.append("null,");
		} else {
			s.append(DuocCaiTao).append(",");
		}
		if (GhiChu.equals("null") || GhiChu.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(GhiChu).append("',");
		}
		if (GioiTinhChuHo.equals("null")) {
			s.append("null,");
		} else {
			s.append(GioiTinhChuHo).append(",");
		}
		if (GioiTinhChuHoHienTai.equals("null")) {
			s.append("null,");
		} else {
			s.append(GioiTinhChuHoHienTai).append(",");
		}
		if (GioiTinhNguoiTraLoi.equals("null")
				|| GioiTinhNguoiTraLoi.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(GioiTinhNguoiTraLoi).append("',");
		}
		if (HoTenNguoiTraLoi.equals("null") || HoTenNguoiTraLoi.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(HoTenNguoiTraLoi).append("',");
		}
		if (KhoangCachNguonNuoc.equals("null")
				|| KhoangCachNguonNuoc.equals("0")) {
			s.append("null,");
		} else {
			s.append(KhoangCachNguonNuoc).append(",");
		}
		if (LaChuHoKhong.equals("null") || LaChuHoKhong.equals("0")) {
			s.append("null,");
		} else {
			s.append(LaChuHoKhong).append(",");
		}
		if (LoaiNguonNuoc.equals("null") || LoaiNguonNuoc.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(LoaiNguonNuoc).append("',");
		}
		if (LoaiNhaTieu.equals("null") || LoaiNhaTieu.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(LoaiNhaTieu).append("',");
		}
		if (LoaiNhaTieuCu.equals("null") || LoaiNhaTieuCu.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(LoaiNhaTieuCu).append("',");
		}
		if (LyDoKhongHoanThanh.equals("null") || LyDoKhongHoanThanh.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(LyDoKhongHoanThanh).append("',");
		}
		if (mahuyen.equals("null") || mahuyen.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(mahuyen).append("',");
		}
		if (matinh.equals("null") || matinh.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(matinh).append("',");
		}
		if (maxa.equals("null") || maxa.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(maxa).append("',");
		}
		if (MuiVeSinh.equals("null") || MuiVeSinh.equals("0")) {
			s.append("null,");
		} else {
			s.append(MuiVeSinh).append(",");
		}
		if (NamXayDung.equals("null") || NamXayDung.equals("0")) {
			s.append("null,");
		} else {
			s.append(NamXayDung).append(",");
		}
		if (NapBeConTot.equals("null") || NapBeConTot.equals("0")) {
			s.append("null,");
		} else {
			s.append(NapBeConTot).append(",");
		}
		if (NgapKhiMuaLon.equals("null") || NgapKhiMuaLon.equals("0")) {
			s.append("null,");
		} else {
			s.append(NgapKhiMuaLon).append(",");
		}
		if (NguonVon.equals("null") || NguonVon.equals("0")) {
			s.append("null,");
		} else {
			s.append(NguonVon).append(",");
		}
		if (NuocThaiDiDau.equals("null") || NuocThaiDiDau.equals("0")) {
			s.append("null,");
		} else {
			s.append(NuocThaiDiDau).append(",");
		}
		if (PhiaTrenKinDao.equals("null") || PhiaTrenKinDao.equals("0")) {
			s.append("null,");
		} else {
			s.append(PhiaTrenKinDao).append(",");
		}
		if (SanCaoTrenToiThieu.equals("null") || SanCaoTrenToiThieu.equals("0")) {
			s.append("null,");
		} else {
			s.append(SanCaoTrenToiThieu).append(",");
		}
		if (SoNguoiTrongHo.equals("null") || SoNguoiTrongHo.equals("0")) {
			s.append("null,");
		} else {
			s.append(SoNguoiTrongHo).append(",");
		}
		if (tenchuho.equals("null") || tenchuho.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(tenchuho).append("',");
		}
		if (TenChuHoHienTai.equals("null") || TenChuHoHienTai.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(TenChuHoHienTai).append("',");
		}
		if (TenDanToc.equals("null") || TenDanToc.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(TenDanToc).append("',");
		}
		if (ThangXayDung.equals("null") || ThangXayDung.equals("0")) {
			s.append("null,");
		} else {
			s.append(ThangXayDung).append(",");
		}
		if (ThanhPhanHoGD.equals("null") || ThanhPhanHoGD.equals("0")) {
			s.append("null,");
		} else {
			s.append(ThanhPhanHoGD).append(",");
		}
		if (thonxom.equals("null") || thonxom.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(thonxom).append("',");
		}
		if (TimThayNha.equals("null") || TimThayNha.equals("0")) {
			s.append("null,");
		} else {
			s.append(TimThayNha).append(",");
		}
		if (ToaDoDiaChi_latitude.equals("null")
				|| ToaDoDiaChi_latitude.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(ToaDoDiaChi_latitude).append("',");
		}
		if (ToaDoDiaChi_longitude.equals("null")
				|| ToaDoDiaChi_longitude.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(ToaDoDiaChi_longitude).append("',");
		}
		if (TranRaNgoai.equals("null") || TranRaNgoai.equals("0")) {
			s.append("null,");
		} else {
			s.append("'").append(TranRaNgoai).append("',");
		}
		if (VeSinhSachSe.equals("null") || VeSinhSachSe.equals("0")) {
			s.append("null,");
		} else {
			s.append("'").append(VeSinhSachSe).append("',");
		}
		if (anhbechua == null) {
			s.append("null,");
		} else {
			s.append("'").append(anhbechua).append("',");
		}
		if (anhtoancanh == null) {
			s.append("null,");
		} else {
			s.append("'").append(anhtoancanh).append("',");
		}
		if (anhtrongnhatieu == null) {
			s.append("null,");
		} else {
			s.append("'").append(anhtrongnhatieu).append("',");
		}
		s.append("'image/*','image/*','image/*','anonymous','INCOMPLETE','default','DEFAULT')");
		String query = s.toString();
		db.execSQL(query);

	}

	private String tinhtongsohotieutruong(String idmap) {
		String tong = null;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String query = "SELECT SUM(SoHoTieu) as tong FROM kdv_vs_chitietcongtrinhtruonghoc where ID_MAPPING='"
				+ idmap + "'";
		Cursor cursor = db.rawQuery(query, null);
		if (cursor.moveToFirst()) {
			do {
				tong = cursor.getString(cursor.getColumnIndex("tong"));
			} while (cursor.moveToNext());
		}

		return tong;
	}

	private String tinhtongsohotieuyte(String idmap) {
		String tong = null;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String query = "SELECT SUM(SoHoTieu) as tong FROM kdv_vs_chitietcongtrinhyte where ID_MAPPING='"
				+ idmap + "'";
		Cursor cursor = db.rawQuery(query, null);
		if (cursor.moveToFirst()) {
			do {
				tong = cursor.getString(cursor.getColumnIndex("tong"));
			} while (cursor.moveToNext());
		}

		return tong;
	}

	private ThongTinDongBo getDaTaVeSinhTruongHoc(String idkiemdem) {
		String ERR = null;
		ThongTinDongBo tt = new ThongTinDongBo();
		int count = 0;
		int countgui = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String time = Sqlite.getTimeamp_cc();
		String query;
		if (time == null) {
			query = "select c._id as c_id,t._id as t_id, c.ID as c_ID,c.KEHOACHKIEMDEMVESINHID as c_khid,c.VESINHCONGTRINHID as c_vesinhid,c.ID_MAPPING as idmap,* from kdv_vs_congtrinhcongcong c left join kdv_vs_chitietcongtrinhtruonghoc t on  c.ID_MAPPING=t.ID_MAPPING where (c.LoaiCongTrinh='01' or c.LoaiCongTrinh='02' or c.LoaiCongTrinh='03') and c._savepoint_timestamp >'2015-08-12T08:06:51.151000000'";
		} else {
			query = "select c._id as c_id,t._id as t_id, c.ID as c_ID,c.KEHOACHKIEMDEMVESINHID as c_khid,c.VESINHCONGTRINHID as c_vesinhid,c.ID_MAPPING as idmap,* from kdv_vs_congtrinhcongcong c left join kdv_vs_chitietcongtrinhtruonghoc t on  c.ID_MAPPING=t.ID_MAPPING where (c.LoaiCongTrinh='01' or c.LoaiCongTrinh='02' or c.LoaiCongTrinh='03') and c._savepoint_timestamp >"
					+ "'" + time + "'";
		}
		Cursor cursor = db.rawQuery(query, null);
		JSONArray json = new JSONArray();
		if (cursor.moveToFirst()) {
			do {
				JSONObject row = new JSONObject();
				String anhchungnhan = null;
				String anhbechua = null;
				String anhtrongnhatieu = null;
				String anhtoancanh = null;
				String AnhChupChungNhan_uriFragment = cursor.getString(cursor
						.getColumnIndex("AnhChupChungNhan_uriFragment"));
				String AnhBeChua_uriFragment = cursor.getString(cursor
						.getColumnIndex("AnhBeChua_uriFragment"));
				String AnhTrongNhaTieu_uriFragment = cursor.getString(cursor
						.getColumnIndex("AnhTrongNhaTieu_uriFragment"));
				String AnhToanCanh_uriFragment = cursor.getString(cursor
						.getColumnIndex("AnhToanCanh_uriFragment"));
				String matinh = cursor.getString(cursor
						.getColumnIndex("MaTinh"));
				String mahuyen = cursor.getString(cursor
						.getColumnIndex("MaHuyen"));
				String maxa = cursor.getString(cursor.getColumnIndex("MaXa"));
				if (matinh != null
						&& mahuyen != null
						&& maxa != null
						&& cursor.getString(cursor
								.getColumnIndex("TenCongTrinh")) != null
						&& cursor.getString(cursor.getColumnIndex("DiaChi")) != null
						&& cursor.getString(cursor
								.getColumnIndex("LoaiCongTrinh")) != null) {
					countgui = countgui + 1;
					try {
						if (AnhChupChungNhan_uriFragment != null) {
							String name[] = null;
							name = AnhChupChungNhan_uriFragment.split("/");
							anhchungnhan = "/images/vesinhct/" + matinh + "/"
									+ mahuyen + "/" + maxa + "/" + name[4];
						}
						if (AnhBeChua_uriFragment != null) {
							String name[] = null;
							name = AnhBeChua_uriFragment.split("/");
							anhbechua = "/images/vesinhct/" + matinh + "/"
									+ mahuyen + "/" + maxa + "/" + name[4];
						}
						if (AnhTrongNhaTieu_uriFragment != null) {
							String name[] = null;
							name = AnhTrongNhaTieu_uriFragment.split("/");
							anhtrongnhatieu = "/images/vesinhct/" + matinh
									+ "/" + mahuyen + "/" + maxa + "/"
									+ name[4];
						}
						if (AnhToanCanh_uriFragment != null) {
							String name[] = null;
							name = AnhToanCanh_uriFragment.split("/");
							anhtoancanh = "/images/vesinhct/" + matinh + "/"
									+ mahuyen + "/" + maxa + "/" + name[4];
						}
						row.put("id",
								cursor.getString(cursor.getColumnIndex("c_ID")));
						row.put("anhchungnhan", anhchungnhan);
						row.put("anhbechua", anhbechua);
						row.put("anhtrongnhatieu", anhtrongnhatieu);
						row.put("anhtoancanh", anhtoancanh);
						row.put("daketthucdieutra", cursor.getString(cursor
								.getColumnIndex("DaKetThucDieuTra")));
						row.put("datqcvn", cursor.getString(cursor
								.getColumnIndex("DatQCVN")));
						row.put("vesinhcongtrinhid", cursor.getInt(cursor
								.getColumnIndex("c_vesinhid")));
						row.put("dattieuchuanhvs", cursor.getString(cursor
								.getColumnIndex("DatTieuChuanHVS")));
						row.put("vaitrochucdanh", cursor.getString(cursor
								.getColumnIndex("VaiTroChucDanh")));
						row.put("diachi", cursor.getString(cursor
								.getColumnIndex("DiaChi")));
						row.put("ghichu", cursor.getString(cursor
								.getColumnIndex("GhiChu")));
						row.put("gioitinhnguoitraloi", cursor.getString(cursor
								.getColumnIndex("GioiTinhNguoiTraLoi")));
						row.put("hotennguoitraloi", cursor.getString(cursor
								.getColumnIndex("HoTenNguoiTraLoi")));
						row.put("kehoachkiemdemvesinhid", cursor
								.getString(cursor.getColumnIndex("c_khid")));
						row.put("loaicongtrinh", cursor.getString(cursor
								.getColumnIndex("LoaiCongTrinh")));
						row.put("loainguonnuoc", cursor.getString(cursor
								.getColumnIndex("LoaiNguonNuoc")));
						row.put("lydokhonghoanthanh", cursor.getString(cursor
								.getColumnIndex("LyDoKhongHoanThanh")));
						row.put("mahuyen", mahuyen);
						row.put("matinh", matinh);
						row.put("imei",
								cursor.getString(cursor.getColumnIndex("IMEI")));
						row.put("maxa", maxa);
						row.put("ngaykiemdem", cursor.getString(cursor
								.getColumnIndex("NgayKiemDem")));
						row.put("soca",
								cursor.getString(cursor.getColumnIndex("SoCa")));
						row.put("sodienthoai", cursor.getString(cursor
								.getColumnIndex("SoDienThoai")));
						row.put("songuoitrongca", cursor.getString(cursor
								.getColumnIndex("SoNguoiTrongCa")));
						row.put("sonhatieu", cursor.getString(cursor
								.getColumnIndex("SoNhaTieu")));
						row.put("tencongtrinh", cursor.getString(cursor
								.getColumnIndex("TenCongTrinh")));
						row.put("vido", cursor.getDouble(cursor
								.getColumnIndex("ToaDoCongTrinh_latitude")));
						row.put("kinhdo", cursor.getDouble(cursor
								.getColumnIndex("ToaDoCongTrinh_longitude")));
						row.put("idkiemdem", idkiemdem);
						row.put("id_mobile",
								cursor.getString(cursor.getColumnIndex("c_id")));
						row.put("chitietcongtrinhruatay",
								cursor.getString(cursor
										.getColumnIndex("ChiTietCongTrinhRuaTay")));
						row.put("cocongtrinhruatay", cursor.getString(cursor
								.getColumnIndex("CoCongTrinhRuaTay")));
						row.put("cuaphanbitkin", cursor.getString(cursor
								.getColumnIndex("CuaPhanBitKin")));
						row.put("delamvesinh", cursor.getString(cursor
								.getColumnIndex("DeLamVeSinh")));
						row.put("duchemuagio", cursor.getString(cursor
								.getColumnIndex("DuCheMuaGio")));
						row.put("idmap", cursor.getString(cursor
								.getColumnIndex("idmap")));
						row.put("khoangcachnguonnuoc", cursor.getString(cursor
								.getColumnIndex("KhoangCachNguonNuoc")));
						row.put("loainhatieu", cursor.getString(cursor
								.getColumnIndex("LoaiNhaTieu")));
						row.put("muivesinh", cursor.getString(cursor
								.getColumnIndex("MuiVeSinh")));
						row.put("napbecontot", cursor.getString(cursor
								.getColumnIndex("NapBeConTot")));
						row.put("ngapkhimualon", cursor.getString(cursor
								.getColumnIndex("NgapKhiMuaLon")));
						row.put("nuocthaididau", cursor.getString(cursor
								.getColumnIndex("NuocThaiDiDau")));
						row.put("phiatrenkindao", cursor.getString(cursor
								.getColumnIndex("PhiaTrenKinDao")));
						row.put("sancaotrentoithieu", cursor.getString(cursor
								.getColumnIndex("SanCaoTrenToiThieu")));
						row.put("sohotieu", cursor.getString(cursor
								.getColumnIndex("SoHoTieu")));
						row.put("tennhatieu", cursor.getString(cursor
								.getColumnIndex("TenNhaTieu")));
						row.put("tranrangoai", cursor.getString(cursor
								.getColumnIndex("TranRaNgoai")));
						row.put("vesinhsachse", cursor.getString(cursor
								.getColumnIndex("VeSinhSachSe")));
						row.put("savepoint", cursor.getString(cursor
								.getColumnIndex("_savepoint_timestamp")));
						String tongho = tinhtongsohotieutruong(cursor
								.getString(cursor.getColumnIndex("idmap")));
						row.put("tongsohotieu", tongho);
						json.put(row);

						if (AnhChupChungNhan_uriFragment != null) {
							uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_CONGTRINH,
									AnhChupChungNhan_uriFragment, matinh,
									mahuyen, maxa);
						}
						if (AnhBeChua_uriFragment != null) {
							uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_CONGTRINH,
									AnhBeChua_uriFragment, matinh, mahuyen,
									maxa);
						}
						if (AnhTrongNhaTieu_uriFragment != null) {
							uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_CONGTRINH,
									AnhTrongNhaTieu_uriFragment, matinh,
									mahuyen, maxa);
						}
						if (AnhToanCanh_uriFragment != null) {
							uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_CONGTRINH,
									AnhToanCanh_uriFragment, matinh, mahuyen,
									maxa);
						}

					} catch (JSONException e) {
						tt.setErr(e.getMessage());
						return tt;
					}
				} else {
					count = count + 1;
				}
			} while (cursor.moveToNext());
		}
		HttpPost post = new HttpPost(Sqlite.taoBangThayDoiUrl()
				+ LinkURL.URL_DONGBO_CONGTRINH);
		HttpResponse response;
		HttpClient client = new DefaultHttpClient();
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 10000);
		StringEntity se;
		InputStream is = null;
		String result = "";
		try {
			se = new StringEntity(json.toString(), "UTF-8");
			post.setHeader("Accept", "application/json");
			post.setHeader("Content-type", "application/json;charset=utf-8");
			post.setEntity(se);
			try {
				response = client.execute(post);
				if (response != null) {
					HttpEntity entity = response.getEntity();
					is = entity.getContent();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(is, "UTF-8"), 8);
					StringBuilder sb = new StringBuilder();
					String line = null;
					while ((line = reader.readLine()) != null) {
						sb.append(line + "\n");
					}
					is.close();
					result = sb.toString();
					JSONArray jArray;
					jArray = new JSONArray(result);
					for (int i = 0; i < jArray.length(); i++) {
						JSONObject json_data = jArray.getJSONObject(i);
						String id_vesinhcc = json_data.getString("id_vesinhct");
						String idmobie = json_data.getString("id_mobile");
						String idkehoach = json_data.getString("id_kehoach");
						String id_thongtinvs = json_data
								.getString("id_thongtinvsct");
						String id_map = json_data.getString("idmap");
						updateIDVSinhcc(1, id_vesinhcc, idmobie, idkehoach,
								id_thongtinvs, id_map);
					}

				}
			} catch (ClientProtocolException e) {
				tt.setErr(e.getMessage());
				return tt;
			} catch (IOException e) {
				tt.setErr(e.getMessage());
				return tt;
			} catch (JSONException e) {
				tt.setErr(e.getMessage());
				return tt;
			}
		} catch (UnsupportedEncodingException e) {

			tt.setErr(e.getMessage());
			return tt;
		}
		tt.setKhonghoplecc(count);
		tt.setTongguicongtrinhtruong(countgui);
		return tt;
	}

	private ThongTinDongBo getVSCTYTE(String idkiemdem) {
		ThongTinDongBo tt = new ThongTinDongBo();
		int count = 0;
		int countgui = 0;
		String ERR = null;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String time = Sqlite.getTimeamp_cc();
		String query;
		if (time == null) {
			query = "select c._id as c_id,t._id as t_id, c.ID as c_ID,c.KEHOACHKIEMDEMVESINHID as c_khid,c.VESINHCONGTRINHID as c_vesinhid,c.ID_MAPPING as idmap,* from kdv_vs_congtrinhcongcong c left join kdv_vs_chitietcongtrinhyte t on  c.ID_MAPPING=t.ID_MAPPING where c.LoaiCongTrinh='04' and c._savepoint_timestamp >'2015-08-12T08:06:51.151000000'";
		} else {
			query = "select c._id as c_id,t._id as t_id, c.ID as c_ID,c.KEHOACHKIEMDEMVESINHID as c_khid,c.VESINHCONGTRINHID as c_vesinhid,c.ID_MAPPING as idmap,* from kdv_vs_congtrinhcongcong c left join kdv_vs_chitietcongtrinhyte t on  c.ID_MAPPING=t.ID_MAPPING where c.LoaiCongTrinh='04' and c._savepoint_timestamp >"
					+ "'" + time + "'";
		}
		Cursor cursor = db.rawQuery(query, null);
		int r = cursor.getCount();
		JSONArray json = new JSONArray();
		if (cursor.moveToFirst()) {
			do {
				JSONObject row = new JSONObject();
				String anhchungnhan = null;
				String anhbechua = null;
				String anhtrongnhatieu = null;
				String anhtoancanh = null;
				String AnhChupChungNhan_uriFragment = cursor.getString(cursor
						.getColumnIndex("AnhChupChungNhan_uriFragment"));
				String AnhBeChua_uriFragment = cursor.getString(cursor
						.getColumnIndex("AnhBeChua_uriFragment"));
				String AnhTrongNhaTieu_uriFragment = cursor.getString(cursor
						.getColumnIndex("AnhTrongNhaTieu_uriFragment"));
				String AnhToanCanh_uriFragment = cursor.getString(cursor
						.getColumnIndex("AnhToanCanh_uriFragment"));
				String matinh = cursor.getString(cursor
						.getColumnIndex("MaTinh"));
				String mahuyen = cursor.getString(cursor
						.getColumnIndex("MaHuyen"));
				String maxa = cursor.getString(cursor.getColumnIndex("MaXa"));
				if (matinh != null
						&& mahuyen != null
						&& maxa != null
						&& cursor.getString(cursor.getColumnIndex("DiaChi")) != null
						&& cursor.getString(cursor
								.getColumnIndex("LoaiCongTrinh")) != null
						&& cursor.getString(cursor
								.getColumnIndex("TenCongTrinh")) != null) {
					countgui = countgui + 1;
					try {
						if (AnhChupChungNhan_uriFragment != null) {
							String name[] = null;
							name = AnhChupChungNhan_uriFragment.split("/");
							anhchungnhan = "/images/vesinhct/" + matinh + "/"
									+ mahuyen + "/" + maxa + "/" + name[4];
						}
						if (AnhBeChua_uriFragment != null) {
							String name[] = null;
							name = AnhBeChua_uriFragment.split("/");
							anhbechua = "/images/vesinhct/" + matinh + "/"
									+ mahuyen + "/" + maxa + "/" + name[4];
						}
						if (AnhTrongNhaTieu_uriFragment != null) {
							String name[] = null;
							name = AnhTrongNhaTieu_uriFragment.split("/");
							anhtrongnhatieu = "/images/vesinhct/" + matinh
									+ "/" + mahuyen + "/" + maxa + "/"
									+ name[4];
						}
						if (AnhToanCanh_uriFragment != null) {
							String name[] = null;
							name = AnhToanCanh_uriFragment.split("/");
							anhtoancanh = "/images/vesinhct/" + matinh + "/"
									+ mahuyen + "/" + maxa + "/" + name[4];
						}
						row.put("id",
								cursor.getString(cursor.getColumnIndex("c_ID")));
						row.put("anhchungnhan", anhchungnhan);
						row.put("anhbechua", anhbechua);
						row.put("anhtrongnhatieu", anhtrongnhatieu);
						row.put("anhtoancanh", anhtoancanh);
						row.put("daketthucdieutra", cursor.getString(cursor
								.getColumnIndex("DaKetThucDieuTra")));
						row.put("datqcvn", cursor.getString(cursor
								.getColumnIndex("DatQCVN")));
						row.put("vesinhcongtrinhid", cursor.getInt(cursor
								.getColumnIndex("c_vesinhid")));
						row.put("dattieuchuanhvs", cursor.getString(cursor
								.getColumnIndex("DatTieuChuanHVS")));
						row.put("diachi", cursor.getString(cursor
								.getColumnIndex("DiaChi")));
						row.put("ghichu", cursor.getString(cursor
								.getColumnIndex("GhiChu")));
						row.put("vaitrochucdanh", cursor.getString(cursor
								.getColumnIndex("VaiTroChucDanh")));
						row.put("gioitinhnguoitraloi", cursor.getString(cursor
								.getColumnIndex("GioiTinhNguoiTraLoi")));
						row.put("hotennguoitraloi", cursor.getString(cursor
								.getColumnIndex("HoTenNguoiTraLoi")));

						row.put("kehoachkiemdemvesinhid", cursor
								.getString(cursor.getColumnIndex("c_khid")));
						row.put("loaicongtrinh", cursor.getString(cursor
								.getColumnIndex("LoaiCongTrinh")));
						row.put("loainguonnuoc", cursor.getString(cursor
								.getColumnIndex("LoaiNguonNuoc")));
						row.put("lydokhonghoanthanh", cursor.getString(cursor
								.getColumnIndex("LyDoKhongHoanThanh")));
						row.put("mahuyen", mahuyen);
						row.put("matinh", matinh);
						row.put("imei",
								cursor.getString(cursor.getColumnIndex("IMEI")));
						row.put("maxa", maxa);
						row.put("ngaykiemdem", cursor.getString(cursor
								.getColumnIndex("NgayKiemDem")));
						row.put("soca",
								cursor.getString(cursor.getColumnIndex("SoCa")));
						row.put("sodienthoai", cursor.getString(cursor
								.getColumnIndex("SoDienThoai")));
						row.put("songuoitrongca", cursor.getString(cursor
								.getColumnIndex("SoNguoiTrongCa")));
						row.put("sonhatieu", cursor.getString(cursor
								.getColumnIndex("SoNhaTieu")));
						row.put("tencongtrinh", cursor.getString(cursor
								.getColumnIndex("TenCongTrinh")));
						row.put("vido", cursor.getDouble(cursor
								.getColumnIndex("ToaDoCongTrinh_latitude")));
						row.put("kinhdo", cursor.getDouble(cursor
								.getColumnIndex("ToaDoCongTrinh_longitude")));
						row.put("idkiemdem", idkiemdem);
						row.put("id_mobile",
								cursor.getString(cursor.getColumnIndex("c_id")));
						row.put("chitietcongtrinhruatay",
								cursor.getString(cursor
										.getColumnIndex("ChiTietCongTrinhRuaTay")));
						row.put("cocongtrinhruatay", cursor.getString(cursor
								.getColumnIndex("CoCongTrinhRuaTay")));
						row.put("cuaphanbitkin", cursor.getString(cursor
								.getColumnIndex("CuaPhanBitKin")));
						row.put("delamvesinh", cursor.getString(cursor
								.getColumnIndex("DeLamVeSinh")));
						row.put("duchemuagio", cursor.getString(cursor
								.getColumnIndex("DuCheMuaGio")));
						row.put("idmap", cursor.getString(cursor
								.getColumnIndex("idmap")));
						row.put("khoangcachnguonnuoc", cursor.getString(cursor
								.getColumnIndex("KhoangCachNguonNuoc")));
						row.put("loainhatieu", cursor.getString(cursor
								.getColumnIndex("LoaiNhaTieu")));
						row.put("muivesinh", cursor.getString(cursor
								.getColumnIndex("MuiVeSinh")));
						row.put("napbecontot", cursor.getString(cursor
								.getColumnIndex("NapBeConTot")));
						row.put("ngapkhimualon", cursor.getString(cursor
								.getColumnIndex("NgapKhiMuaLon")));
						row.put("nuocthaididau", cursor.getString(cursor
								.getColumnIndex("NuocThaiDiDau")));
						row.put("phiatrenkindao", cursor.getString(cursor
								.getColumnIndex("PhiaTrenKinDao")));
						row.put("sancaotrentoithieu", cursor.getString(cursor
								.getColumnIndex("SanCaoTrenToiThieu")));
						row.put("sohotieu", cursor.getString(cursor
								.getColumnIndex("SoHoTieu")));
						row.put("tennhatieu", cursor.getString(cursor
								.getColumnIndex("TenNhaTieu")));
						row.put("tranrangoai", cursor.getString(cursor
								.getColumnIndex("TranRaNgoai")));
						row.put("vesinhsachse", cursor.getString(cursor
								.getColumnIndex("VeSinhSachSe")));
						row.put("savepoint", cursor.getString(cursor
								.getColumnIndex("_savepoint_timestamp")));
						String tongho = tinhtongsohotieuyte(cursor
								.getString(cursor.getColumnIndex("idmap")));
						row.put("tongsohotieu", tongho);
						json.put(row);

						if (AnhChupChungNhan_uriFragment != null) {
							uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_CONGTRINH,
									AnhChupChungNhan_uriFragment, matinh,
									mahuyen, maxa);
						}
						if (AnhBeChua_uriFragment != null) {
							uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_CONGTRINH,
									AnhBeChua_uriFragment, matinh, mahuyen,
									maxa);
						}
						if (AnhTrongNhaTieu_uriFragment != null) {
							uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_CONGTRINH,
									AnhTrongNhaTieu_uriFragment, matinh,
									mahuyen, maxa);
						}
						if (AnhToanCanh_uriFragment != null) {
							uploadfile(Sqlite.taoBangThayDoiUrl()
									+ LinkURL.URL_UPLOADFILE_CONGTRINH,
									AnhToanCanh_uriFragment, matinh, mahuyen,
									maxa);
						}

					} catch (JSONException e) {
						tt.setErr(e.getMessage());
						return tt;
					}
				} else {
					count = count + 1;
				}
			} while (cursor.moveToNext());
		}
		HttpPost post = new HttpPost(Sqlite.taoBangThayDoiUrl()
				+ LinkURL.URL_DONGBO_CONGTRINH);
		HttpResponse response;
		HttpClient client = new DefaultHttpClient();
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 10000);
		StringEntity se;
		InputStream is = null;
		String result = "";
		try {
			se = new StringEntity(json.toString(), "UTF-8");
			post.setHeader("Accept", "application/json");
			post.setHeader("Content-type", "application/json;charset=utf-8");
			post.setEntity(se);
			try {
				response = client.execute(post);
				if (response != null) {
					HttpEntity entity = response.getEntity();
					is = entity.getContent();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(is, "UTF-8"), 8);
					StringBuilder sb = new StringBuilder();
					String line = null;
					while ((line = reader.readLine()) != null) {
						sb.append(line + "\n");
					}
					is.close();
					result = sb.toString();
					JSONArray jArray;
					jArray = new JSONArray(result);
					for (int i = 0; i < jArray.length(); i++) {
						JSONObject json_data = jArray.getJSONObject(i);
						String id_vesinhcc = json_data.getString("id_vesinhct");
						String idmobie = json_data.getString("id_mobile");
						String idkehoach = json_data.getString("id_kehoach");
						String id_thongtinvs = json_data
								.getString("id_thongtinvsct");
						String id_map = json_data.getString("idmap");
						updateIDVSinhcc(2, id_vesinhcc, idmobie, idkehoach,
								id_thongtinvs, id_map);
					}

				}
			} catch (ClientProtocolException e) {
				tt.setErr(e.getMessage());
				return tt;
			} catch (IOException e) {
				tt.setErr(e.getMessage());
				return tt;
			} catch (JSONException e) {
				tt.setErr(e.getMessage());
				return tt;
			}
		} catch (UnsupportedEncodingException e) {
			tt.setErr(e.getMessage());
			return tt;
		}
		tt.setKhonghoplecc(count);
		tt.setTongguicongtrinh(countgui);
		return tt;

	}

	private ThongTinDongBo getDaunoiMoi(String idkiemdemvien) {
		ThongTinDongBo ttdb = new ThongTinDongBo();
		String err = null;
		int jcount = 0;
		InputStream is = null;
		String result = "";
		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		nameValuePairs.add(new BasicNameValuePair("id", idkiemdemvien));
		// http post
		String a = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(Sqlite.taoBangThayDoiUrl()
					+ LinkURL.url_all_daunoi);
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			is = entity.getContent();
		} catch (Exception e) {
			ttdb.setErr(Log.ERR_NETWORD);
			return ttdb;
		}
		// convert response to string
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "UTF-8"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			result = sb.toString();
		} catch (Exception e) {
			ttdb.setErr(e.getMessage());
			return ttdb;
		}
		// parse json data
		try {
			JSONArray jArray = new JSONArray(result);
			for (int i = 0; i < jArray.length(); i++) {
				JSONObject json_data = jArray.getJSONObject(i);
				String CONFIG_FORDER = Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
				SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER,
						null, 0);

				String query = "SELECT  * FROM kdv_dnn_hogiadinh where ID="
						+ json_data.getInt("id");
				Cursor cursor = db.rawQuery(query, null);
				int r = cursor.getCount();
				if (r < 1) {
					jcount = jcount + 1;
					int id, kehoachkiemdemnuocid, daunoinuocid;
					String tenchuho, gioitinhchuho, maxa, mahuyen, matinh, thonxom, songuoitrongho, thanhphanhogiadinh, BiMatNuoc, ChiSoDongHo, ChinhSach, ChuHoDungDS, CoBeChuaNuoc, CoNguoiONhaKhong, DaKetThucDieuTra, DaTungDucKhong, DauNoiChua, GhiChu, GioiTinhChuHo, GioiTinhChuHoHienTai, GioiTinhNguoiTraLoi, HoTenNguoiTraLoi, LaChuHoKhong, LoaiKhac, LoaiKhacTungCo, LyDoKhongDungDS, LyDoKhongHoanThanh, MauNuoc, MauNuocTungCo, MuiNuoc, MuiNuocTungCo, NuocTrongKhong, SoGioTrungBinh, SoLanMatNuoc, SoSeryDongHo, TenChuHoHienTai, TenDanToc, TimThayNha, TinhTrangBe, ToaDoDiaChi_latitude, ToaDoDiaChi_longitude, ViNuoc, ViNuocTungCo, VoiNuocChayKhong;
					String thoigiandauhopdong, thoigiandaunoithucte;
					String anhdongho, anhdaunoi, anhbechua;
					String anhdaunoitable = null, anhdonghotable = null, anhbechuatable = null;
					id = json_data.getInt("id");
					anhdongho = json_data.getString("anhdongho");
					if (!anhdongho.equals("null") && !anhdongho.equals("")) {
						String name[] = null;
						name = anhdongho.split("/");
						anhdonghotable = "tables/kdv_vs_hogiadinh/instances/uuid_000/"
								+ name[6];
					}
					anhdaunoi = json_data.getString("anhdaunoi");
					if (!anhdaunoi.equals("null") && !anhdaunoi.equals("")) {
						String name[] = null;
						name = anhdaunoi.split("/");
						anhdaunoitable = "tables/kdv_vs_hogiadinh/instances/uuid_000/"
								+ name[6];
					}
					anhbechua = json_data.getString("anhbechua");
					if (!anhbechua.equals("null") && !anhbechua.equals("")) {
						String name[] = null;
						name = anhbechua.split("/");
						anhbechuatable = "tables/kdv_vs_hogiadinh/instances/uuid_000/"
								+ name[6];
					}
					kehoachkiemdemnuocid = json_data.getInt("kehoachkiemdemid");
					daunoinuocid = json_data.getInt("daunoinuocid");
					tenchuho = json_data.getString("tenchuho");
					gioitinhchuho = json_data.getString("gioitinhchuho");
					maxa = json_data.getString("maxa");
					mahuyen = json_data.getString("mahuyen");
					matinh = json_data.getString("matinh");
					thonxom = json_data.getString("thonxom");
					songuoitrongho = json_data.getString("songuoitrongho");
					thanhphanhogiadinh = json_data.getString("thanhphanhogd");
					BiMatNuoc = json_data.getString("bimatnuoc");
					ChiSoDongHo = json_data.getString("chisodongho");
					ChinhSach = json_data.getString("chinhsach");
					ChuHoDungDS = json_data.getString("chuhodungds");
					CoBeChuaNuoc = json_data.getString("cobechuanuoc");
					CoNguoiONhaKhong = json_data.getString("conguoionha");
					DaKetThucDieuTra = json_data.getString("daketthucdieutra");
					DaTungDucKhong = json_data.getString("datungduckhong");
					DauNoiChua = json_data.getString("daunoichua");
					GhiChu = json_data.getString("ghichu");
					GioiTinhChuHo = json_data.getString("gioitinhchuho");
					GioiTinhChuHoHienTai = json_data
							.getString("gioitinhchuhohientai");
					GioiTinhNguoiTraLoi = json_data
							.getString("gioitinhnguoitraloi");
					HoTenNguoiTraLoi = json_data.getString("hotennguoitraloi");
					LaChuHoKhong = json_data.getString("lachuhokhong");
					LoaiKhac = json_data.getString("loaikhac");
					LoaiKhacTungCo = json_data.getString("loaikhactungco");
					LyDoKhongDungDS = json_data.getString("lydokhongdungds");
					LyDoKhongHoanThanh = json_data
							.getString("lydokhonghoanthanh");
					MauNuoc = json_data.getString("maunuoc");
					MauNuocTungCo = json_data.getString("maunuoctungco");
					MuiNuoc = json_data.getString("muinuoc");
					MuiNuocTungCo = json_data.getString("muinuoctungco");
					NuocTrongKhong = json_data.getString("nuoctrongkhong");
					SoGioTrungBinh = json_data.getString("sogiotrungbinh");
					SoLanMatNuoc = json_data.getString("solanmatnuoc");
					SoSeryDongHo = json_data.getString("soserydongho");
					TenChuHoHienTai = json_data.getString("tenchuhohientai");
					TenDanToc = json_data.getString("tendantoc");
					TimThayNha = json_data.getString("timthaynha");
					TinhTrangBe = json_data.getString("tinhtrangbe");
					ToaDoDiaChi_latitude = json_data.getString("vido");
					ToaDoDiaChi_longitude = json_data.getString("kinhdo");
					ViNuoc = json_data.getString("vinuoc");
					ViNuocTungCo = json_data.getString("vinuoctungco");
					VoiNuocChayKhong = json_data.getString("voinuocchaykhong");
					thoigiandauhopdong = json_data
							.getString("thoigiandauhopdong");
					thoigiandaunoithucte = json_data
							.getString("thoigiandaunoithucte");

					addDaunoi(id, kehoachkiemdemnuocid, tenchuho, maxa,
							mahuyen, matinh, daunoinuocid, thonxom,
							gioitinhchuho, songuoitrongho, thanhphanhogiadinh,
							BiMatNuoc, ChiSoDongHo, ChinhSach, ChuHoDungDS,
							CoBeChuaNuoc, CoNguoiONhaKhong, DaKetThucDieuTra,
							DaTungDucKhong, DauNoiChua, GhiChu, GioiTinhChuHo,
							GioiTinhChuHoHienTai, GioiTinhNguoiTraLoi,
							HoTenNguoiTraLoi, LaChuHoKhong, LoaiKhac,
							LoaiKhacTungCo, LyDoKhongDungDS,
							LyDoKhongHoanThanh, MauNuoc, MauNuocTungCo,
							MuiNuoc, MuiNuocTungCo, NuocTrongKhong,
							SoGioTrungBinh, SoLanMatNuoc, SoSeryDongHo,
							TenChuHoHienTai, TenDanToc, TimThayNha,
							TinhTrangBe, ToaDoDiaChi_latitude,
							ToaDoDiaChi_longitude, ViNuoc, ViNuocTungCo,
							VoiNuocChayKhong, thoigiandauhopdong,
							thoigiandaunoithucte, anhdaunoitable,
							anhbechuatable, anhdonghotable);
				} else {
					String kethucdieutra = json_data
							.getString("daketthucdieutra");
					if (kethucdieutra != null) {
						if (kethucdieutra.equals("3")) {
							Sqlite.updateKetThucDieuTraNuoc(json_data
									.getInt("id"));
						}
					}
				}
			}
		} catch (JSONException e) {
			ttdb.setErr(e.getMessage());
			return ttdb;
		}
		ttdb.setTongdaunoinuoc(jcount);
		return ttdb;

	}

	private ThongTinDongBo getdulieumoicc(String id_kiemdemvien) {
		ThongTinDongBo tt = new ThongTinDongBo();
		String err = null;
		int jcount = 0;
		InputStream is = null;
		String result = "";
		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		nameValuePairs.add(new BasicNameValuePair("id", id_kiemdemvien));
		// http post
		String a = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(Sqlite.taoBangThayDoiUrl()
					+ LinkURL.URL_VESINHCONGTRINHMOI);
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			is = entity.getContent();
		} catch (Exception e) {
			tt.setErr(Log.ERR_NETWORD);
			return tt;
		}
		// convert response to string
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "UTF-8"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			result = sb.toString();
		} catch (Exception e) {
			tt.setErr(e.getMessage());
			return tt;
		}
		// parse json data
		try {
			JSONArray jArray = new JSONArray(result);
			for (int i = 0; i < jArray.length(); i++) {
				JSONObject json_data = jArray.getJSONObject(i);
				String CONFIG_FORDER = Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
				SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER,
						null, 0);
				String query = "SELECT  * FROM kdv_vs_congtrinhcongcong where ID="
						+ json_data.getInt("id");
				String querytruong = "SELECT  * FROM kdv_vs_chitietcongtrinhtruonghoc where ID="
						+ json_data.getInt("id");
				String queryyte = "SELECT  * FROM kdv_vs_chitietcongtrinhyte where ID="
						+ json_data.getInt("id");
				Cursor cursor = db.rawQuery(query, null);
				int cc = cursor.getCount();
				int truong = cursor.getCount();
				int yte = cursor.getCount();
				if (cc < 1 && truong < 1 && yte < 1) {
					jcount = jcount + 1;
					int id;
					int vesinhcongtrinhid;
					String loaicongtrinh;
					int kehoachkiemdemvesinhid = 0;
					String tencongtrinh, matinh, mahuyen, maxa, ngaykiemdem, diachi, hotennguoitraloi;
					String sodienthoai, gioitinhnguoitraloi, vaitrochucdanh, soca, songuoitrongca;
					String kinhdo, vido, loainguonnuoc, datqcvn, dattieuchuanhvs, sohotieu, sonhatieu;
					String loainhatieu, vesinhsachse, delamvesinh, muivesinh, phiatrenkindao, duchemuagio;
					String sancaotrentoithieu, napbecontot, cuaphanbitkin, tranrangoai, nuocthaididau;
					String khoangcachnguonnuoc, ngapkhimualon, cocongtrinhruatay, chitietcongtrinhruatay;
					String ghichu, daketthucdieutra, lydokhonghoanthanh, imei, idmap, sancaotoithieu;
					String tennhatieu;
					id = json_data.getInt("id");
					kehoachkiemdemvesinhid = json_data
							.getInt("kehoachkiemdemvesinhid");
					vesinhcongtrinhid = json_data.getInt("vesinhcongtrinhid");
					loaicongtrinh = json_data.getString("loaicongtrinh");
					tencongtrinh = json_data.getString("tencongtrinh");
					matinh = json_data.getString("matinh");
					mahuyen = json_data.getString("mahuyen");
					maxa = json_data.getString("maxa");
					ngaykiemdem = json_data.getString("ngaykiemdem");
					diachi = json_data.getString("diachi");
					hotennguoitraloi = json_data.getString("hotennguoitraloi");
					sodienthoai = json_data.getString("sodienthoai");
					gioitinhnguoitraloi = json_data
							.getString("gioitinhnguoitraloi");
					vaitrochucdanh = json_data.getString("vaitrochucdanh");
					soca = json_data.getString("soca");
					songuoitrongca = json_data.getString("songuoitrongca");
					kinhdo = json_data.getString("kinhdo");
					vido = json_data.getString("vido");
					loainguonnuoc = json_data.getString("loainguonnuoc");
					if (loainguonnuoc.equals("null")
							|| loainguonnuoc.equals("")) {
						loainguonnuoc = "0";
					}
					datqcvn = json_data.getString("datqcvn");
					dattieuchuanhvs = json_data.getString("dattieuchuanhvs");
					sonhatieu = json_data.getString("sonhatieu");
					ghichu = json_data.getString("ghichu");
					daketthucdieutra = json_data.getString("daketthucdieutra");
					lydokhonghoanthanh = json_data
							.getString("lydokhonghoanthanh");
					sancaotoithieu = json_data.getString("sancaotoithieu");
					tennhatieu = json_data.getString("tennhatieu");
					addCongTrinhMoi(id, vesinhcongtrinhid, loaicongtrinh,
							kehoachkiemdemvesinhid, tencongtrinh, matinh,
							mahuyen, maxa, ngaykiemdem, diachi,
							hotennguoitraloi, sodienthoai, gioitinhnguoitraloi,
							vaitrochucdanh, soca, songuoitrongca, kinhdo, vido,
							loainguonnuoc, datqcvn, dattieuchuanhvs, sonhatieu,
							ghichu, daketthucdieutra, lydokhonghoanthanh,
							sancaotoithieu, tennhatieu);
				} else {
					String kethucdieutra = json_data
							.getString("daketthucdieutra");
					if (kethucdieutra != null) {
						if (kethucdieutra.equals("3")) {
							Sqlite.updateKetThucDieuTraCongTrinh(json_data
									.getInt("id"));
						}
					}
				}

			}
		} catch (JSONException e) {
			tt.setErr(e.getMessage());
			return tt;
		}
		tt.setTongcongtrinh(jcount);
		return tt;

	}

	public void addCongTrinhMoi(int id, int vesinhcongtrinhid,
			String loaicongtrinh, int kehoachkiemdemvesinhid,
			String tencongtrinh, String matinh, String mahuyen, String maxa,
			String ngaykiemdem, String diachi, String hotennguoitraloi,
			String sodienthoai, String gioitinhnguoitraloi,
			String vaitrochucdanh, String soca, String songuoitrongca,
			String kinhdo, String vido, String loainguonnuoc, String datqcvn,
			String dattieuchuanhvs, String sonhatieu, String ghichu,
			String daketthucdieutra, String lydokhonghoanthanh,
			String sancaotoithieu, String tennhatieu) {
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		StringBuilder s = new StringBuilder();
		s.append(
				"INSERT INTO kdv_vs_congtrinhcongcong (ID,_id,_form_id,_savepoint_timestamp,"
						+ "_sync_state,DaKetThucDieuTra,DatQCVN,DatTieuChuanHVS,DiaChi,GhiChu,GioiTinhNguoiTraLoi"
						+ ",HoTenNguoiTraLoi,ID_MAPPING,KEHOACHKIEMDEMVESINHID,LoaiCongTrinh,"
						+ "LoaiNguonNuoc,LyDoKhongHoanThanh,MaHuyen,MaTinh,MaXa,SoCa,"
						+ "SoDienThoai,SoNguoiTrongCa,SoNhaTieu,TenCongTrinh,ToaDoCongTrinh_longitude,"
						+ "ToaDoCongTrinh_latitude,VESINHCONGTRINHID,VaiTroChucDanh,AnhChupChungNhan_contentType,"
						+ "_savepoint_creator,_savepoint_type,_locale,_filter_type) VALUES (")
				.append(id)
				.append(",'uuid:")
				.append(id)
				.append("','kdv_vs_congtrinhcongcong','2015-08-12T08:06:51.151000000','new_row',");
		if (daketthucdieutra.equals("0")) {
			s.append("null,");
		} else {
			s.append(daketthucdieutra).append(",");
		}
		if (datqcvn.equals("0")) {
			s.append("null,");
		} else {
			s.append(datqcvn).append(",");
		}
		if (dattieuchuanhvs.equals("0")) {
			s.append("null,");
		} else {
			s.append(dattieuchuanhvs).append(",");
		}
		if (diachi.equals("null") || diachi.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(diachi).append("',");
		}
		if (ghichu.equals("null") || ghichu.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(ghichu).append("',");
		}
		if (gioitinhnguoitraloi.equals("null")
				|| gioitinhnguoitraloi.equals("")
				|| gioitinhnguoitraloi.equals("0")) {
			s.append("null,");
		} else {
			s.append(gioitinhnguoitraloi).append(",");
		}
		if (hotennguoitraloi.equals("null") || hotennguoitraloi.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(hotennguoitraloi).append("',");
		}
		s.append(id).append(",").append(kehoachkiemdemvesinhid).append(",'0")
				.append(loaicongtrinh).append("','").append(loainguonnuoc)
				.append("',");
		if (lydokhonghoanthanh.equals("null") || lydokhonghoanthanh.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(lydokhonghoanthanh).append("',");
		}
		s.append("'").append(mahuyen).append("','").append(matinh)
				.append("','").append(maxa).append("',");
		if (soca.equals("0") || soca.equals("null")) {
			s.append("null,");
		} else {
			s.append(soca).append(",");
		}
		if (sodienthoai.equals("null") || sodienthoai.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(sodienthoai).append("',");
		}
		if (songuoitrongca.equals("null") || songuoitrongca.equals("")
				|| songuoitrongca.equals("0")) {
			s.append("null,");
		} else {
			s.append(songuoitrongca).append(",");
		}
		if (sonhatieu.equals("null") || sonhatieu.equals("")
				|| sonhatieu.equals("0")) {
			s.append("null,");
		} else {
			s.append(sonhatieu).append(",");
		}
		s.append("'").append(tencongtrinh).append("',");
		if (kinhdo.equals("null") || kinhdo.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(kinhdo).append("',");
		}
		if (vido.equals("null") || vido.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(vido).append("',");
		}
		s.append(vesinhcongtrinhid).append(",");
		if (vaitrochucdanh.equals("null") || vaitrochucdanh.equals("")) {
			s.append("null,");
		} else {
			s.append("'").append(vaitrochucdanh).append("',");

		}
		s.append("'image/*','anonymous','INCOMPLETE','default','DEFAULT')");
		String sqlbuider = s.toString();
		db.execSQL(sqlbuider);

	}

	private String getThongTinKeHoachnuoc(String id) {
		String err = null;
		int jcount = 0;
		InputStream is = null;
		String result = "";
		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		nameValuePairs.add(new BasicNameValuePair("id", id));
		String a = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(Sqlite.taoBangThayDoiUrl()
					+ LinkURL.URL_THONGTINKEHOACH);
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			is = entity.getContent();

		} catch (Exception e) {
			err = Log.ERR_NETWORD;
			return err;
		}

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "UTF-8"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			result = sb.toString();
		} catch (Exception e) {
			err = e.getMessage();
		}
		createthongtinkehoachnuoc();
		try {
			JSONArray jArray = new JSONArray(result);
			for (int i = 0; i < jArray.length(); i++) {
				JSONObject json_data = jArray.getJSONObject(i);
				String tungay;
				String denngay;
				String nam;
				String id_daunoi;
				String kehoachkiemdemid;
				String daketthucdieutra;
				String trangthai;
				tungay = json_data.getString("tungay");
				denngay = json_data.getString("denngay");
				nam = json_data.getString("nam");
				id_daunoi = json_data.getString("id");
				if (json_data.getString("ngaydong") == "null") {
					trangthai = "Đang Thực Hiện";
				} else {
					trangthai = "Đã Kết Thúc";
				}
				kehoachkiemdemid = json_data.getString("kehoachkiemdemid");
				daketthucdieutra = json_data.getString("daketthucdieutra");
				addThongTinkeHoach(nam, tungay, denngay, daketthucdieutra,
						id_daunoi, trangthai, kehoachkiemdemid);
			}

		} catch (JSONException e) {
			err = e.getMessage();
			return err;
		}
		return err;

	}

	private String getThongTinKeHoachVS(String id) {
		String err = null;
		int jcount = 0;
		InputStream is = null;
		String result = "";
		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		nameValuePairs.add(new BasicNameValuePair("id", id));
		String a = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(Sqlite.taoBangThayDoiUrl()
					+ LinkURL.URL_THONGTINKEHOACHVESNH);
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			is = entity.getContent();
		} catch (Exception e) {
			err = Log.ERR_NETWORD;
			return err;
		}
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "UTF-8"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			result = sb.toString();
		} catch (Exception e) {
			err = e.getMessage();
			return err;
		}
		createthongtinkehoachvs();
		// parse json data
		try {
			JSONArray jArray = new JSONArray(result);
			for (int i = 0; i < jArray.length(); i++) {
				JSONObject json_data = jArray.getJSONObject(i);
				String tungay;
				String denngay;
				String nam;
				String id_daunoi;
				String kehoachkiemdemid;
				String daketthucdieutra;
				String trangthai;
				tungay = json_data.getString("tungay");
				denngay = json_data.getString("denngay");
				nam = json_data.getString("nam");
				id_daunoi = json_data.getString("id");
				if (json_data.getString("ngaydong") == "null") {
					trangthai = "Đang Thực Hiện";
				} else {
					trangthai = "Đã Kết Thúc";
				}
				kehoachkiemdemid = json_data.getString("kehoachkiemdemid");
				daketthucdieutra = json_data.getString("daketthucdieutra");
				addThongTinkeHoachvs(nam, tungay, denngay, daketthucdieutra,
						id_daunoi, trangthai, kehoachkiemdemid);
			}
		} catch (JSONException e) {
			err = e.getMessage();
			return err;
		}
		return err;
	}

	private String getThongTinKeHoachCongTrinh(String idkiemdemvien) {
		String err = null;
		int jcount = 0;
		InputStream is = null;
		String result = "";
		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		nameValuePairs.add(new BasicNameValuePair("idkiemdemvien",
				idkiemdemvien));
		String a = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(Sqlite.taoBangThayDoiUrl()
					+ LinkURL.URL_THONGTINKEHOACHCONGTRINH);
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			is = entity.getContent();
		} catch (Exception e) {
			err = Log.ERR_NETWORD;
			return err;
		}
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "UTF-8"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			result = sb.toString();
		} catch (Exception e) {
			err = e.getMessage();
			return err;
		}
		createThongTinKeHoachCongTrinh();
		try {
			JSONArray jArray = new JSONArray(result);
			for (int i = 0; i < jArray.length(); i++) {
				JSONObject json_data = jArray.getJSONObject(i);
				String tungay, denngay, nam, id_congtrinh, kehoachkiemdemid, daketthucdieutra, trangthai;
				tungay = json_data.getString("tungay");
				denngay = json_data.getString("denngay");
				nam = json_data.getString("nam");
				id_congtrinh = json_data.getString("id");
				if (json_data.getString("ngaydong") == "null") {
					trangthai = Log.DANGTHUCHIEN;
				} else {
					trangthai = Log.DAKETTHUC;
				}
				kehoachkiemdemid = json_data.getString("kehoachkiemdemid");
				daketthucdieutra = json_data.getString("daketthucdieutra");
				addThongTinkeHoachCongTrinh(nam, tungay, denngay,
						daketthucdieutra, id_congtrinh, trangthai,
						kehoachkiemdemid);
			}
		} catch (JSONException e) {
			err = e.getMessage();
			return err;
		}
		return err;
	}

	private class Capnhatdulieu extends
			AsyncTask<String, String, ThongTinDongBo> {
		private String err = null;

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			pDialog = new ProgressDialog(CapNhatDuLieuActivity.this);
			pDialog.setMessage(getString(R.string.message));
			pDialog.setIndeterminate(false);
			pDialog.setCancelable(false);
			pDialog.show();
		}

		@Override
		protected ThongTinDongBo doInBackground(String... urls) {
			ThongTinDongBo tt = new ThongTinDongBo();
			JSONObject row = new JSONObject();
			User user = Sqlite.createTaikhoanDangNhap();
			try {
				row.put("taikhoan", user.getTen());
				row.put("matkhau", user.getPass());
			} catch (JSONException e1) {
				tt.setErr(e1.getMessage());
				// err = e1.getMessage();
				return tt;
			}
			HttpPost post = new HttpPost(Sqlite.taoBangThayDoiUrl()
					+ LinkURL.URL_LOGIN);
			HttpResponse response;
			HttpClient client = new DefaultHttpClient();
			HttpConnectionParams
					.setConnectionTimeout(client.getParams(), 10000);
			StringEntity se;
			String result = "";
			try {
				se = new StringEntity(row.toString(), "UTF-8");
				post.setHeader("Accept", "application/json");
				post.setHeader("Content-type", "application/json;charset=utf-8");
				post.setEntity(se);
				response = client.execute(post);
				if (response != null) {
					InputStream in = response.getEntity().getContent(); // Get
					StringBuilder sb = new StringBuilder();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(in));
					String line = null;
					while ((line = reader.readLine()) != null) {
						sb.append(line);
					}
					result = sb.toString();
					JSONArray jArray;
					JSONObject json = new JSONObject(result);
					int id = json.getInt("id");
					int nuoc = json.getInt("nuoc");
					int vesinh = json.getInt("vesinh");

					if (id == 0) {
						tt.setErr(Log.ERR_USER);
						return tt;
					}
					Sqlite.taobangthongtinTrung();
					if (nuoc == 1) {
						tt.setCheckloai(1);
						err = kiemtrakehoachDongNuoc(String.valueOf(id));
						if (err != null) {
							tt.setErr(err);
							return tt;
						}
						ThongTinDongBo addnuoc = getDaunoiMoi(String
								.valueOf(id));
						tt.setErr(addnuoc.getErr());
						tt.setTongdaunoinuoc(addnuoc.getTongdaunoinuoc());
						if (tt.getErr() != null) {
							return tt;
						}
						ThongTinDongBo ttnuoc = getdataNuoc(String.valueOf(id));
						tt.setErr(ttnuoc.getErr());
						tt.setKhonghoplenuoc(ttnuoc.getKhonghoplenuoc());
						tt.setTongguinuoc(ttnuoc.getTongguinuoc());
						if (tt.getErr() != null) {
							return tt;
						}

						err = getThongTinKeHoachnuoc(String.valueOf(id));
						if (err != null) {
							tt.setErr(err);
							return tt;
						}
					}
					if (vesinh == 1) {
						tt.setCheckloai(2);
						err = kiemtrakehoachdongvesinh(String.valueOf(id));
						if (err != null) {
							tt.setErr(err);
							return tt;
						}
						ThongTinDongBo addvs = addVeSinhGiaDinhMoi(String
								.valueOf(id));
						tt.setErr(addvs.getErr());
						tt.setTongvesinh(addvs.getTongvesinh());
						if (tt.getErr() != null) {
							return tt;
						}
						ThongTinDongBo ttgetdata = getdataVSinhGD(String
								.valueOf(id));
						tt.setErr(ttgetdata.getErr());
						tt.setKhonghoplevesinh(ttgetdata.getKhonghoplevesinh());
						tt.setTongguivesinh(ttgetdata.getTongguivesinh());
						if (tt.getErr() != null) {
							return tt;
						}

						err = getThongTinKeHoachVS(String.valueOf(id));
						if (err != null) {
							tt.setErr(err);
							return tt;
						}
						ThongTinDongBo ttcc = getdulieumoicc(String.valueOf(id));
						tt.setTongcongtrinh(ttcc.getTongcongtrinh());
						tt.setErr(ttcc.getErr());
						if (tt.getErr() != null) {
							return tt;
						}
						ThongTinDongBo gettruong = getDaTaVeSinhTruongHoc(String
								.valueOf(id));
						tt.setErr(gettruong.getErr());
						tt.setKhonghoplecc(gettruong.getKhonghoplecc());
						tt.setTongguicongtrinhtruong(gettruong
								.getTongguicongtrinhtruong());
						if (tt.getErr() != null) {
							return tt;
						}
						ThongTinDongBo ttdatayte = getVSCTYTE(String
								.valueOf(id));
						tt.setKhonghoplecc(tt.getKhonghoplecc()
								+ ttdatayte.getKhonghoplecc());
						tt.setErr(ttdatayte.getErr());
						tt.setTongguicongtrinh(tt.getTongguicongtrinhtruong()
								+ ttdatayte.getTongguicongtrinh());
						if (tt.getErr() != null) {
							return tt;
						}

						err = getThongTinKeHoachCongTrinh(String.valueOf(id));
						tt.setErr(err);
					}
					return tt; // the
				}
			} catch (ClientProtocolException e) {
				tt.setErr(Log.ERR_NETWORD);
				return tt;
			} catch (IOException e) {
				tt.setErr(Log.ERR_NETWORD);
				return tt;
			} catch (JSONException e) {
				tt.setErr(e.getMessage());
				return tt;
			}
			return tt;
		}

		@Override
		protected void onPostExecute(ThongTinDongBo result) {
			if (result.getErr() == null) {
				Sqlite.insertlastpoint();
				showDialogThanhcong(result);
			} else {
				if (result.getErr().equals(Log.ERR_NETWORD)) {
					showDialogLoi(Log.ERR_NETWORD);
				} else {
					showDialogLoi(result.getErr());
				}
			}
			pDialog.dismiss();
		}
	}

	private void showDialogThanhcong(ThongTinDongBo thongTinDongBo) {
		succDialog = new Dialog(CapNhatDuLieuActivity.this);
		succDialog.getWindow().setBackgroundDrawableResource(
				android.R.color.transparent);
		succDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		succDialog.setContentView(R.layout.success);
		View lbCancel = (View) succDialog.findViewById(R.id.btok_sc);
		Button lbChitiet = (Button) succDialog.findViewById(R.id.bt_chitiet);
		TextView tongdaunoi = (TextView) succDialog
				.findViewById(R.id.tongdaunoi);
		TextView tongvesinh = (TextView) succDialog
				.findViewById(R.id.tongvesinh);
		TextView tongguivesinh = (TextView) succDialog
				.findViewById(R.id.tongguivesinh);
		TextView tongguicongtrinh = (TextView) succDialog
				.findViewById(R.id.tongguicongtrinh);
		TextView tongcongtrinh = (TextView) succDialog
				.findViewById(R.id.tongcongtrinh);
		TextView khonghoplenuoc = (TextView) succDialog
				.findViewById(R.id.khonghoplenuoc);
		TextView khonghoplevesinh = (TextView) succDialog
				.findViewById(R.id.khonghoplevesinh);
		TextView khonghoplecongtrinh = (TextView) succDialog
				.findViewById(R.id.khonghoplecongcong);
		// Sqlite.updateTimeThongTinTrung();
		if (Sqlite.getTongThongTinTrung() > 0) {
			lbChitiet.setVisibility(View.VISIBLE);
			lbChitiet.setText(Sqlite.getTongThongTinTrung()
					+ getString(R.string.chitiet));
			lbChitiet.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					succDialog.dismiss();
					startActivity(new Intent(getApplicationContext(),
							ThongTinTrungActivity.class));
				}
			});
		}
		if (thongTinDongBo.getKhonghoplenuoc() > 0) {
			khonghoplenuoc.setText(Log.khonghopledaunoi
					+ thongTinDongBo.getKhonghoplenuoc());
		}
		if (thongTinDongBo.getKhonghoplevesinh() > 0) {
			khonghoplenuoc.setText(Log.khonghoplevs
					+ thongTinDongBo.getKhonghoplevesinh());
		}
		if (thongTinDongBo.getKhonghoplecc() > 0) {
			khonghoplenuoc.setText(Log.khonghoplecc
					+ thongTinDongBo.getKhonghoplecc());
		}
		if (thongTinDongBo.getCheckloai() == 2) {
			int tongbanghiguivesinh = thongTinDongBo.getTongguivesinh()
					- Sqlite.countTrungVeSinh();
			tongdaunoi.setVisibility(View.GONE);
			tongvesinh.setText(Log.hogdmoi + thongTinDongBo.getTongvesinh());
			tongcongtrinh.setText(Log.congtrinhmoi
					+ thongTinDongBo.getTongcongtrinh());
			tongguivesinh.setText(getString(R.string.tongguivs)
					+ tongbanghiguivesinh);
			tongguicongtrinh.setText(getString(R.string.tongguict)
					+ thongTinDongBo.getTongguicongtrinh());
		} else {
			tongdaunoi.setText(Log.daunoimoi
					+ thongTinDongBo.getTongdaunoinuoc());
			int tongguinuoc = thongTinDongBo.getTongguinuoc()
					- Sqlite.countTrungNuoc();
			tongvesinh.setText(getString(R.string.tongguinuoc) + tongguinuoc);
		}
		lbCancel.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				succDialog.dismiss();
			}
		});
		succDialog.show();
	}

	private void showDialogLoi(String log) {
		errDialog = new Dialog(CapNhatDuLieuActivity.this);
		errDialog.getWindow().setBackgroundDrawableResource(
				android.R.color.transparent);
		errDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		errDialog.setContentView(R.layout.err_network);
		TextView lbtrangthai = (TextView) errDialog
				.findViewById(R.id.lb_trangthai);
		View lbCancel = (View) errDialog.findViewById(R.id.bt_okuser);
		lbtrangthai.setText(log);
		lbCancel.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				errDialog.dismiss();
			}
		});
		errDialog.show();
	}

}
