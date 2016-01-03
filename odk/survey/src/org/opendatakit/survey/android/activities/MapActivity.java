package org.opendatakit.survey.android.activities;

import org.opendatakit.survey.android.R;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends Activity implements OnMyLocationChangeListener {
	private final LatLng LOCATION_BURNABY = new LatLng(49.27645, -122.917587);
	private final LatLng LOCATION_SURRREY = new LatLng(49.187500, -122.849000);
	private Location mLocation;
	private GoogleMap map;
	Button mCancelLocation, mLocationStatus, mAcceptLocation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map);

		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
				.getMap();

		map.addMarker(new MarkerOptions().position(LOCATION_SURRREY).title(
				"Find me here!"));
		map.setMyLocationEnabled(true);
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

	public void onClick_City(View v) {
		// CameraUpdate update =
		// CameraUpdateFactory.newLatLng(LOCATION_BURNABY);
		map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(
				LOCATION_BURNABY, 9);
		map.animateCamera(update);
	}

	public void onClick_Burnaby(View v) {
		map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(
				LOCATION_BURNABY, 14);
		map.animateCamera(update);

	}

	public void onClick_Surrey(View v) {
		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(
				LOCATION_SURRREY, 16);
		map.animateCamera(update);

	}

	@Override
	public void onMyLocationChange(Location location) {
		mLocation = location;
		// TODO Auto-generated method stub
		TextView tvLocation = (TextView) findViewById(R.id.location_status);
		double latitude = location.getLatitude();
		double longitude = location.getLongitude();
		double ac = location.getAccuracy();
		double de = location.getAltitude();
		LatLng latLng = new LatLng(latitude, longitude);
		map.moveCamera(CameraUpdateFactory.newLatLng(latLng));
		map.animateCamera(CameraUpdateFactory.zoomTo(15));
		tvLocation.setText("Latitude:" + latitude + ", Longitude:" + longitude
				+ ",accc:" + ac);
	}

	private void returnLocation() {
		android.os.Debug.waitForDebugger();
		if (mLocation != null) {
			Intent i = new Intent();
			i.putExtra(MainMenuActivity.LOCATION_LATITUDE_RESULT,
					mLocation.getLatitude());
			i.putExtra(MainMenuActivity.LOCATION_LONGITUDE_RESULT,
					mLocation.getLongitude());
			i.putExtra(MainMenuActivity.LOCATION_ALTITUDE_RESULT,
					mLocation.getAltitude());
			i.putExtra(MainMenuActivity.LOCATION_ACCURACY_RESULT,
					Double.valueOf(mLocation.getAccuracy()));
			setResult(RESULT_OK, i);
		}
		finish();
	}

}
