package week3.day2;

public class Safari extends Browser{

	public void readerMode() {
		System.out.println("set the screen into the reader mode");
	}
	
	public void fullScreenMode() {
		System.out.println("Set the browser screen as full screen");
	}
	
	
	public static void main(String[] args) {
		Safari safari = new Safari();
		safari.browserName= "Safari";
		safari.browserVersion ="120";
		System.out.println("Browser name "+safari.browserName);
		System.out.println("Browser version "+safari.browserVersion);
		safari.openURL();
		safari.readerMode();
		safari.fullScreenMode();
		safari.navigateBack();
		safari.closeBrowser();
	}
	
}
