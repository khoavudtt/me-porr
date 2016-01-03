package org.opendatakit.survey.android.activities;

import org.opendatakit.survey.android.R;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.Overlay;

public class GeoPointActivity extends Activity implements
		OnMyLocationChangeListener {
	private Location mLocation;
	private GoogleMap map;
	Button mCancelLocation, mLocationStatus, mAcceptLocation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		// Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.map);

		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
				.getMap();

		map.setMyLocationEnabled(true);
		// map.setTrafficEnabled(true);
		map.setOnMyLocationChangeListener(this);

		mCancelLocation = (Button) findViewById(R.id.cancel_location);
		mCancelLocation.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				finish();
			}
		});

		mAcceptLocation = (Button) findViewById(R.id.accept_location);
		mAcceptLocation.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				returnLocation();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onMyLocationChange(Location location) {
		mLocation = location;
		// TODO Auto-generated method stub
		TextView tvLocation = (TextView) findViewById(R.id.location_status);
		double latitude = location.getLatitude();
		double longitude = location.getLongitude();
		double ac = location.getAccuracy();
		LatLng latLng = new LatLng(latitude, longitude);
		map.addMarker(new MarkerOptions().position(latLng).title(
				"Vị trí của bạn!"));
		map.moveCamera(CameraUpdateFactory.newLatLng(latLng));
		map.animateCamera(CameraUpdateFactory.zoomTo(15));
		tvLocation.setText("Độ chính xác :" + (int) ac + "m");
	}

	private void returnLocation() {

		if (mLocation != null) {
			Intent i = new Intent();
			i.putExtra(MainMenuActivity.LOCATION_LATITUDE_RESULT,
					mLocation.getLatitude());
			i.putExtra(MainMenuActivity.LOCATION_LONGITUDE_RESULT,
					mLocation.getLongitude());
			i.putExtra(MainMenuActivity.LOCATION_ALTITUDE_RESULT,
					mLocation.getAltitude());
			i.putExtra(MainMenuActivity.LOCATION_ACCURACY_RESULT,
					Double.valueOf((int) mLocation.getAccuracy()));
			setResult(RESULT_OK, i);
		}
		finish();
	}

}
