package org.opendatakit.tables.activities;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.opendatakit.tables.R;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import dtt.company.bean.Log;
import dtt.company.sqlite.Sqlite;

public class ThayDoiUrLActivity extends Activity {
	private ProgressDialog pDialog;
	private Dialog succDialog;
	private Dialog errDialog;
	private EditText txt_url;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thaydoiurl);
		txt_url = (EditText) findViewById(R.id.txt_url);
		String url = Sqlite.taoBangThayDoiUrl();
		Button bt_thaydoi = (Button) findViewById(R.id.bt_thaydoi);
		Button bt_huythaydoi = (Button) findViewById(R.id.bt_huythaydoi);
		txt_url.setText(url);
		bt_thaydoi.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				new XacNhanThayDoiUrl().execute();
			}
		});
		bt_huythaydoi.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(getApplicationContext(),
						Login.class));
			}
		});
	}

	private class XacNhanThayDoiUrl extends AsyncTask<String, String, String> {
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			pDialog = new ProgressDialog(ThayDoiUrLActivity.this);
			pDialog.setMessage(getString(R.string.message_xacnhan));
			pDialog.setIndeterminate(false);
			pDialog.setCancelable(false);
			pDialog.show();
		}

		@Override
		protected String doInBackground(String... params) {
			String ketqua = xacnhanthongtin();
			return ketqua;
		}

		@Override
		protected void onPostExecute(String result) {

			if (result != null) {
				if (result.equals("ok")) {
					showDialogThanhCong();
				}
				if (result.equals(Log.ERR_NETWORD)) {
					showDialogLoi(Log.ERR_NETWORD);
				}
				if (!result.equals("ok") && !result.equals(Log.ERR_NETWORD)) {
					showDialogLoi(Log.THAYDOILOI);
				}
			} else {
				showDialogLoi(Log.THAYDOILOI);
			}

			pDialog.dismiss();
		}
	}

	private void showDialogLoi(String log) {
		errDialog = new Dialog(ThayDoiUrLActivity.this);
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

	private void showDialogThanhCong() {
		succDialog = new Dialog(ThayDoiUrLActivity.this);
		succDialog.getWindow().setBackgroundDrawableResource(
				android.R.color.transparent);
		succDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		succDialog.setContentView(R.layout.thanhcongthaydoi);
		View lbok = (View) succDialog.findViewById(R.id.btok_thanhcong);
		View url_txt = (View) findViewById(R.id.txt_url);
		Sqlite.thaydoiSever(txt_url.getText().toString());
		lbok.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				succDialog.dismiss();
				startActivity(new Intent(getApplicationContext(),
						Login.class));
			}
		});
		succDialog.show();
	}

	private String xacnhanthongtin() {
		String link = txt_url.getText().toString()
				+ "/odv/xacnhantaikhoan/xacnhan";
		String err = null;
		InputStream is = null;
		String result = "";
		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		// http post
		String a = null;
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(link);
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
				sb.append(line);
			}
			is.close();
			result = sb.toString();
			if (result.equals("ok")) {
				return "ok";
			}
		} catch (Exception e) {
			err = e.getMessage();
			return err;
		}
		// parse json data
		return err;
	}

}
