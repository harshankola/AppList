/**
 * 
 */
package com.hts.applist;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * @author Harrsh
 * 
 */
public class LoginActivity extends Activity {

	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 * check whether user has logged into his google account,
	 * checking the sync setting will do it.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Account[] accounts = AccountManager.get(this).getAccountsByType(
				"com.google");
		if (accounts.length > 0) {
			startActivity(new Intent(this,
					com.hts.applist.ApplistActivity.class));
		} else
			finish();
	}

}
