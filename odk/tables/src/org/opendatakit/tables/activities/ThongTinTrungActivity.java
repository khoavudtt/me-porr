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
import java.util.List;

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
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import dtt.company.bean.LinkURL;
import dtt.company.bean.Log;
import dtt.company.bean.ThongTinDongBo;
import dtt.company.bean.ThongTinTrung;
import dtt.company.bean.User;
import dtt.company.sqlite.Sqlite;
import dtt.company.sqlite.SqliteCapNhat;

public class ThongTinTrungActivity extends Activity {
	private Dialog errDialog;
	ArrayAdapter<ThongTinTrung> adapter;
	MyCustomAdapter dataAdapter = null;
	private ProgressDialog pDialog;
	private Dialog succDialog;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thongtincapnhat);
		ListView listViewsery = (ListView) findViewById(R.id.listviewtrung);
		View sery = (View) findViewById(R.id.thongtintrungsery);
		View bt_sery = (View) findViewById(R.id.bt_xoasery);
		View bt_capnhattrung = (View) findViewById(R.id.bt_capnhattrung);
		bt_capnhattrung.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				ArrayList<ThongTinTrung> countryList = dataAdapter.countryList;
				if (countryList.size() == 0) {
					showDialogLoi(getString(R.string.banchuachontrung));
				} else {
					showDialogXacNhan();
					//
				}

			}
		});
		bt_sery.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				showDialogXacNhanXoa();
			}
		});
		List<String> namesery = Sqlite.getThongTinTrungsery();
		List<String> diachi = Sqlite.getThongTinTrungDiaChi();
		if (namesery.size() == 0) {
			sery.setVisibility(View.GONE);
			bt_sery.setVisibility(View.GONE);
		}
		if (diachi.size() == 0) {
			bt_capnhattrung.setVisibility(View.GONE);

		}
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, namesery);
		listViewsery.setAdapter(arrayAdapter);
		displayListView();
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

	private class CapNhatThongTinTrung extends
			AsyncTask<String, String, ThongTinDongBo> {
		private String err = null;

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			pDialog = new ProgressDialog(ThongTinTrungActivity.this);
			pDialog.setMessage(getString(R.string.message));
			pDialog.setIndeterminate(false);
			pDialog.setCancelable(false);
			pDialog.show();
		}

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

			HttpPost post = new HttpPost(Sqlite.taoBangThayDoiUrl()+LinkURL.URL_LOGIN);
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
					ArrayList<ThongTinTrung> countryList = dataAdapter.countryList;
					for (int i = 0; i < countryList.size(); i++) {
						ThongTinTrung country = countryList.get(i);
						if (country.isSelected()
								&& country.getKey().equals("1")) {
							ThongTinDongBo ttnuoc = getdataNuocTrung(
									String.valueOf(id), country.getCode());
							tt.setErr(ttnuoc.getErr());
							if (tt.getErr() != null) {
								return tt;
							}
						}
						if (country.isSelected()
								&& country.getKey().equals("2")) {
							ThongTinDongBo ttgetdata = getdataVSinhGDTrung(
									String.valueOf(id), country.getCode());
							tt.setErr(ttgetdata.getErr());
							if (tt.getErr() != null) {
								return tt;
							}
						}
					}
					return tt;
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
				showDialogThanhCong();
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

	private void showDialogThanhCong() {
		succDialog = new Dialog(ThongTinTrungActivity.this);
		succDialog.getWindow().setBackgroundDrawableResource(
				android.R.color.transparent);
		succDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		succDialog.setContentView(R.layout.thanhcongtrung);
		View lbok = (View) succDialog.findViewById(R.id.btok_thanhcong);
		lbok.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				succDialog.dismiss();
				ArrayList<ThongTinTrung> countryList = dataAdapter.countryList;
				for (int i = 0; i < countryList.size(); i++) {
					ThongTinTrung country = countryList.get(i);
					if (country.isSelected()) {
						Sqlite.capnhatthongtintrung(country.getCode());
					}
				}
				displayListView();
			}
		});
		succDialog.show();
	}

	private void showDialogLoi(String log) {
		errDialog = new Dialog(ThongTinTrungActivity.this);
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

	private ThongTinDongBo getdataNuocTrung(String idkiemdem, String _id) {
		ThongTinDongBo tt = new ThongTinDongBo();
		String err = null;
		int count = 0;
		int countgui = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String query;
		query = "SELECT  * FROM kdv_dnn_hogiadinh where  _id ='" + _id + "'";
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
							err = uploadfile(Sqlite.taoBangThayDoiUrl()+LinkURL.URL_UPLOADFILE_NUOCTrung,
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
							err = uploadfile(Sqlite.taoBangThayDoiUrl()+LinkURL.URL_UPLOADFILE_NUOCTrung,
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
							err = uploadfile(Sqlite.taoBangThayDoiUrl()+LinkURL.URL_UPLOADFILE_NUOCTrung,
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
		HttpPost post = new HttpPost(Sqlite.taoBangThayDoiUrl()+LinkURL.URL_DONGBO_NUOCTRUNG);
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

						String id_daunoi = json_data.getString("id_daunoi");
						String idmobie = json_data.getString("id_mobile");
						String idkehoach = json_data.getString("id_kehoach");
						String idthongtin = json_data
								.getString("id_thongtinkiemdem");
						SqliteCapNhat.updateID(id_daunoi, idmobie, idkehoach,
								idthongtin);

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

	private ThongTinDongBo getdataVSinhGDTrung(String idkiemdemvien, String _id) {
		String err = null;
		ThongTinDongBo tt = new ThongTinDongBo();
		int count = 0;
		int countgui = 0;
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		SQLiteDatabase db = SQLiteDatabase.openDatabase(CONFIG_FORDER, null, 0);
		String query;
		query = "SELECT  * FROM kdv_vs_hogiadinh where  _id='" + _id + "'";
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
							err = uploadfile(Sqlite.taoBangThayDoiUrl()+LinkURL.URL_VS_DONGBOTRUNGIMAGE,
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
							err = uploadfile(Sqlite.taoBangThayDoiUrl()+LinkURL.URL_VS_DONGBOTRUNGIMAGE,
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
							err = uploadfile(Sqlite.taoBangThayDoiUrl()+LinkURL.URL_VS_DONGBOTRUNGIMAGE,
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
		HttpPost post = new HttpPost(Sqlite.taoBangThayDoiUrl()+LinkURL.URL_VS_DONGBOTRUNG);
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
							String id_vesinh = json_data.getString("id_vesinh");
							String idmobie = json_data.getString("id_mobile");
							String idkehoach = json_data
									.getString("id_kehoach");
							String id_thongtinvs = json_data
									.getString("id_thongtinvs");
							SqliteCapNhat.updateIDVSinh(id_vesinh, idmobie,
									idkehoach, id_thongtinvs);

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

	private void showDialogXacNhan() {
		errDialog = new Dialog(ThongTinTrungActivity.this);
		errDialog.getWindow().setBackgroundDrawableResource(
				android.R.color.transparent);
		errDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		errDialog.setContentView(R.layout.xoasery);
		View lbOk = (View) errDialog.findViewById(R.id.bt_ok);
		View lbCancel = (View) errDialog.findViewById(R.id.bt_huy);
		TextView mss_xacnhan = (TextView) errDialog
				.findViewById(R.id.mss_xacnhan);
		mss_xacnhan.setText(getString(R.string.xacnhanguitrung).toString());
		lbOk.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				errDialog.dismiss();
				try {
					new CapNhatThongTinTrung().execute();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		lbCancel.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				errDialog.dismiss();
			}
		});
		errDialog.show();
	}

	private void showDialogXacNhanXoa() {
		errDialog = new Dialog(ThongTinTrungActivity.this);
		errDialog.getWindow().setBackgroundDrawableResource(
				android.R.color.transparent);
		errDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		errDialog.setContentView(R.layout.xoasery);
		View lbOk = (View) errDialog.findViewById(R.id.bt_ok);
		View lbCancel = (View) errDialog.findViewById(R.id.bt_huy);
		TextView mss_xacnhan = (TextView) errDialog
				.findViewById(R.id.mss_xacnhan);
		lbOk.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				errDialog.dismiss();
				Sqlite.deletetrungsery();
				onCreate(null);

			}
		});
		lbCancel.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				errDialog.dismiss();
			}
		});
		errDialog.show();
	}

	private void displayListView() {
		View diachi = (View) findViewById(R.id.thongtintrungdiachi);

		ArrayList<ThongTinTrung> namediachi = Sqlite
				.getThongTinTrungDiaChiCheck();
		if (namediachi.size() == 0) {
			diachi.setVisibility(View.GONE);
		}
		// create an ArrayAdaptar from the String Array
		dataAdapter = new MyCustomAdapter(this, R.layout.thongtintrung_item,
				namediachi);
		ListView listView = (ListView) findViewById(R.id.listviewtrungdiachi);
		// Assign adapter to ListView
		listView.setAdapter(dataAdapter);

	}

	private class MyCustomAdapter extends ArrayAdapter<ThongTinTrung> {

		private ArrayList<ThongTinTrung> countryList;

		public MyCustomAdapter(Context context, int textViewResourceId,
				ArrayList<ThongTinTrung> countryList) {
			super(context, textViewResourceId, countryList);
			this.countryList = new ArrayList<ThongTinTrung>();
			this.countryList.addAll(countryList);
		}

		private class ViewHolder {
			TextView code;
			TextView key;
			TextView name;
			CheckBox chbox;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			ViewHolder holder = null;

			if (convertView == null) {
				LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				convertView = vi.inflate(R.layout.thongtintrung_item, null);

				holder = new ViewHolder();
				holder.code = (TextView) convertView.findViewById(R.id.code);
				holder.name = (TextView) convertView.findViewById(R.id.name);
				holder.key = (TextView) convertView.findViewById(R.id.key);
				holder.chbox = (CheckBox) convertView.findViewById(R.id.chbox);
				convertView.setTag(holder);

				holder.chbox.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						CheckBox cb = (CheckBox) v;
						ThongTinTrung tt = (ThongTinTrung) cb.getTag();
						tt.setSelected(cb.isChecked());
					}
				});
			} else {
				holder = (ViewHolder) convertView.getTag();
			}

			ThongTinTrung tt = countryList.get(position);
			holder.code.setText(" (" + tt.getCode() + ")");
			holder.name.setText(tt.getName());
			holder.key.setText(tt.getKey());
			holder.chbox.setChecked(tt.isSelected());
			holder.chbox.setTag(tt);
			return convertView;

		}

	}
}
