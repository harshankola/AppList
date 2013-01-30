/**
 * 
 */
package com.hts.applist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author Harrsh
 * 
 */
public class SplashScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
	}

	/*
	 * This event handler passes on the control to login Activity,
	 * which deals with whether user has enabled google sync or not.
	 */
	public void login(View v) {
		// TODO Pass on control to login activity
		startActivity(new Intent(getApplicationContext(),
				com.hts.applist.LoginActivity.class));
	}

}
