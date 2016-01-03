package dtt.water.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SessionManager {
	// Shared Preferences
	SharedPreferences pref;

	// Editor for Shared preferences
	Editor editor;

	// Context
	Context _context;

	// Shared pref mode
	int PRIVATE_MODE = 0;

	// Sharedpref file name
	public static final String TableId = "";

	// Constructor
	public SessionManager(Context context) {
		this._context = context;
		pref = _context.getSharedPreferences(TableId, PRIVATE_MODE);
		editor = pref.edit();
	}

	public void createTableIdSession(String tableId) {

		// Storing name in pref
		editor.putString(TableId, tableId);

		// commit changes
		editor.commit();
	}

	public void refresh() {

		// Clearing all user data from Shared Preferences
		editor.clear();
		editor.commit();

	}
}