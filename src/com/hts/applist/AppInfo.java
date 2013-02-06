/**
 * 
 */
package com.hts.applist;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Harrsh
 * 
 */
public class AppInfo {

	// List of Information the app must have
	private String AppName; // PackageItemInfo.name gives the name of app. label
							// has to be extracted using LoadLabel method
	private String AppDesciption;
	private int AppVersion; // PackageInfo.versionCode
	private int AppMinSDKVersion; // ApplicationInfo.targetSDKVersion field
									// gives this info
	private String AppInstalledDate; // PackageInfo.firstInstallTime(long
										// value), needs to be converted using
										// SDF.
	private String AppUpgradationDate; // PackageInfo.lastUpgradeTime(long
										// value) to be converted into date.
	private String AppLatestVersion; // PackageInfo.versionName gives string
										// containing latest version name
	private String AppLastUsageDate;
	private int AppUsageFrequency;

	public String getAppName() {
		return AppName;
	}

	public void setAppName(String appName) {
		AppName = appName;
	}

	public String getAppDesciption() {
		return AppDesciption;
	}

	public void setAppDesciption(String appDesciption) {
		AppDesciption = appDesciption;
	}

	public int getAppVersion() {
		return AppVersion;
	}

	public void setAppVersion(int appVersion) {
		AppVersion = appVersion;
	}

	public int getAppMinSDKVersion() {
		return AppMinSDKVersion;
	}

	public void setAppMinSDKVersion(int appMinSDKVersion) {
		AppMinSDKVersion = appMinSDKVersion;
	}

	public String getAppInstalledDate() {
		return AppInstalledDate;
	}

	public void setAppInstalledDate(long appInstalledDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ssa",
				Locale.getDefault());
		AppInstalledDate = sdf.format(new Date(appInstalledDate));
	}

	public String getAppUpgradationDate() {
		return AppUpgradationDate;
	}

	public void setAppUpgradationDate(long appUpgradationDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ssa",
				Locale.getDefault());
		AppUpgradationDate = sdf.format(new Date(appUpgradationDate));
	}

	public String getAppLatestVersion() {
		return AppLatestVersion;
	}

	public void setAppLatestVersion(String appLatestVersion) {
		AppLatestVersion = appLatestVersion;
	}

	public String getAppLastUsageDate() {
		return AppLastUsageDate;
	}

	public void setAppLastUsageDate(String appLastUsageDate) {
		AppLastUsageDate = appLastUsageDate;
	}

	public int getAppUsageFrequency() {
		return AppUsageFrequency;
	}

	public void setAppUsageFrequency(int appUsageFrequency) {
		AppUsageFrequency = appUsageFrequency;
	}
}
