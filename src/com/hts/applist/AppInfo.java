/**
 * 
 */
package com.hts.applist;

/**
 * @author Harrsh
 *
 */
public class AppInfo {

	// List of Information the app must have
	private String AppName; //PackageItemInfo.name gives the name of app. label has to be extracted using LoadLable method
	private String AppDesciption;
	private int AppVersion; //PackageInfo.versionCode
	private int AppMinSDKVersion; //ApplicationInfo.targetSDKVersion field gives this info
	private String AppInstalledDate; //PackageInfo.firstInstallTime(long value), needs to be converted using SDF.
	private String AppUpgradationDate; //PackageInfo.lastUpgradeTime(long value) to be converted into date.
	private String AppLatestVersion; //PackageInfo.versionName gives string containing latest version name
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
	public void setAppInstalledDate(String appInstalledDate) {
		AppInstalledDate = appInstalledDate;
	}
	public String getAppUpgradationDate() {
		return AppUpgradationDate;
	}
	public void setAppUpgradationDate(String appUpgradationDate) {
		AppUpgradationDate = appUpgradationDate;
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
