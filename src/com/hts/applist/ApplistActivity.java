package com.hts.applist;

import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class ApplistActivity extends ListActivity {

	private List<ApplicationInfo> apps;
	private ArrayAdapter<ApplicationInfo> aa;

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.main);
		// Get Package Manager reference
		// Get the list of installed apps
		apps=getPackageManager().getInstalledApplications(PackageManager.GET_META_DATA);
		// Get the name of app and append (system) tag if its system app
		// Bind it to list view.
		aa=new ArrayAdapter<ApplicationInfo>(this, android.R.layout.simple_list_item_1, apps);
		setListAdapter(aa);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
