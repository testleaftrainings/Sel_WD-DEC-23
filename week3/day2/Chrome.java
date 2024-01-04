package week3.day2;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Open the browser in incognito");
	}
	
	public void clearCache() {
		System.out.println("Clear the browser cache");
	}
	
	public static void main(String[] args) {
		Chrome chrome  = new Chrome();
		chrome.browserName= "Chrome";
		chrome.browserVersion ="117";
		System.out.println("Browser name "+chrome.browserName);
		System.out.println("Browser version "+chrome.browserVersion);
		chrome.openIncognito();
		chrome.openURL();
		chrome.clearCache();
		chrome.navigateBack();
		chrome.closeBrowser();
	}
}
