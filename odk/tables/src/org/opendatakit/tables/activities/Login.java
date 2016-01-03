package org.opendatakit.tables.activities;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.opendatakit.common.android.data.Preferences;
import org.opendatakit.tables.R;
import org.opendatakit.tables.application.Tables;
import org.opendatakit.tables.fragments.InitializeTaskDialogFragment;
import org.opendatakit.tables.tasks.InitializeTask;

import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.text.method.PasswordTransformationMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import dtt.company.bean.LinkURL;
import dtt.company.bean.Log;
import dtt.company.bean.ThongTinDongBo;
import dtt.company.bean.User;
import dtt.company.sqlite.Sqlite;

public class Login extends AbsBaseActivity implements InitializeTask.Callbacks {
	private EditText taikhoan;
	private EditText matkhau;
	private TextView thongbao, vesion;
	private ProgressDialog pDialog;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		taikhoan = (EditText) findViewById(R.id.txt_tkhoan);
		matkhau = (EditText) findViewById(R.id.txt_matkhau);
		View dangnhap = (View) findViewById(R.id.bt_dangnhap);
		thongbao = (TextView) findViewById(R.id.txt_erro);
		vesion = (TextView) findViewById(R.id.vesion);
		final CheckBox showPasswordCheckBox = (CheckBox) findViewById(R.id.checkBox_showpass);
		showPasswordCheckBox.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (showPasswordCheckBox.isChecked()) {
					matkhau.setTransformationMethod(null);
				} else {
					matkhau.setTransformationMethod(new PasswordTransformationMethod());
				}
			}
		});
		String CONFIG_FORDER = Environment.getExternalStorageDirectory()
				+ File.separator
				+ "opendatakit/tables/metadata/webDb/http_localhost_8635/0000000000000001.db";
		File file = new File(CONFIG_FORDER);
		PackageInfo pinfo;
		try {
			pinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
			int versionNumber = pinfo.versionCode;
			String versionName = pinfo.versionName;
			vesion.setText(getString(R.string.vesion) + versionName);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (file.exists()) {
			User u = Sqlite.createTaikhoanDangNhap();
			taikhoan.setText(u.getTen());
		}

		dangnhap.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				User user = Sqlite.createTaikhoanDangNhap();
				String a = taikhoan.getText().toString();
				String b = matkhau.getText().toString();

				if (taikhoan.getText() == null || matkhau.getText() == null) {
					thongbao.setText(getString(R.string.loitaikhoan));
				} else {
					if (user.getPass() == null && user.getPass() == null) {
						new KiemTraTaiKhoan().execute();
					} else {
						if (user.getTen().equals(taikhoan.getText().toString())
								&& user.getPass().equals(
										matkhau.getText().toString())) {
							startActivity(new Intent(getApplicationContext(),
									WebViewActivity.class));

						} else {
							new KiemTraTaiKhoan().execute();
						}
					}
				}

			}

		});
	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(Intent.ACTION_MAIN);
		intent.addCategory(Intent.CATEGORY_HOME);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater menuInflater = this.getMenuInflater();
		menuInflater.inflate(R.menu.login, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.capnhatdulieu_menuurl:
			startActivity(new Intent(this, ThayDoiUrLActivity.class));
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private class KiemTraTaiKhoan extends
			AsyncTask<String, String, ThongTinDongBo> {
		private String err = null;

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			pDialog = new ProgressDialog(Login.this);
			pDialog.setMessage(getString(R.string.message_login));
			pDialog.setIndeterminate(false);
			pDialog.setCancelable(false);
			pDialog.show();
		}

		protected ThongTinDongBo doInBackground(String... urls) {
			ThongTinDongBo tt = new ThongTinDongBo();
			JSONObject row = new JSONObject();
			try {
				String tk = taikhoan.getText().toString();
				String mk = matkhau.getText().toString();
				row.put("taikhoan", tk);
				row.put("matkhau", mk);
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
					String kiemdemvien = json.getString("kiemdemvien");
					String giamsatvien = json.getString("giamsatvien");
					String tinh = json.getString("tinh");
					String code = json.getString("code");
					if (id == 0) {
						tt.setErr(Log.ERR_USER);
						return tt;
					} else {
						tt.setErr("ok");
						Sqlite.insertTaikhoan(taikhoan.getText().toString(),
								matkhau.getText().toString(), kiemdemvien,
								giamsatvien, tinh, code);
					}
				}
			} catch (UnsupportedEncodingException e) {
				tt.setErr(Log.ERR_NETWORD);
				return tt;
			} catch (ClientProtocolException e) {
				tt.setErr(Log.ERR_NETWORD);
				return tt;
			} catch (IOException e) {
				tt.setErr(Log.ERR_NETWORD);
				return tt;
			} catch (JSONException e) {
				tt.setErr(Log.ERR_NETWORD);
				return tt;
			}

			return tt;
		}

		@Override
		protected void onPostExecute(ThongTinDongBo result) {
			if (result.getErr().equals("ok")) {
				startActivity(new Intent(getApplicationContext(),
						WebViewActivity.class));
			}
			if (result.getErr().equals(Log.ERR_NETWORD)) {
				thongbao.setText(Log.ERR_NETWORD);
			}
			if (result.getErr().equals(Log.ERR_USER)) {
				thongbao.setText(Log.ERR_USER);
			}
			pDialog.dismiss();
		}
	}

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

	@Override
	public Preferences getPrefs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onImportsComplete() {
		Sqlite.taoBangThayDoiUrl();

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
}
