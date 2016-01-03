package org.opendatakit.tables.activities;

import org.opendatakit.tables.R;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import dtt.company.sqlite.ResetThongtin;

public class ThongTinDuLieuActivity extends Activity {
	private TextView daunoi, vesinh, congtrinh;
	private Dialog xacnhandl;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thongtindulieu);
		daunoi = (TextView) findViewById(R.id.tongdaunoi_tt);
		vesinh = (TextView) findViewById(R.id.tongvesinh_tt);
		congtrinh = (TextView) findViewById(R.id.tongcongtrinh_tt);
		daunoi.setText(getString(R.string.thongtintongdaunoi)
				+ ResetThongtin.getCountDauNoi());
		vesinh.setText(getString(R.string.thongtintonghogd)
				+ ResetThongtin.getCountHogd());
		congtrinh.setText(getString(R.string.thongtintongcongtrinh)
				+ ResetThongtin.getCountCongTrinh());
		Button bt_xoa = (Button) findViewById(R.id.bt_xoadulieu);
		bt_xoa.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				showDialogThanhCong();
			}
		});

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.top_level_next:
			startActivity(new Intent(this, WebViewActivity.class));
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

	private void showDialogThanhCong() {
		xacnhandl = new Dialog(ThongTinDuLieuActivity.this);
		xacnhandl.getWindow().setBackgroundDrawableResource(
				android.R.color.transparent);
		xacnhandl.requestWindowFeature(Window.FEATURE_NO_TITLE);
		xacnhandl.setContentView(R.layout.xoadulieu);
		View lbOk = (View) xacnhandl.findViewById(R.id.bt_ok);
		View lbCancel = (View) xacnhandl.findViewById(R.id.bt_huy);
		lbOk.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				ResetThongtin.xoaDuLieu();
				xacnhandl.dismiss();
				onCreate(null);
//				daunoi.setText(getString(R.string.thongtintongdaunoi)
//						+ ResetThongtin.getCountDauNoi());
//				vesinh.setText(getString(R.string.thongtintonghogd)
//						+ ResetThongtin.getCountHogd());
//				congtrinh.setText(getString(R.string.thongtintongcongtrinh)
//						+ ResetThongtin.getCountCongTrinh());
				// startActivity(new Intent(getApplicationContext(),
				// ThongTinDuLieuActivity.class));

			}
		});
		lbCancel.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				xacnhandl.dismiss();
			}
		});
		xacnhandl.show();
	}
}
