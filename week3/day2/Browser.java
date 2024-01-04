package week3.day2;

//Super class
public class Browser {

	String browserName;
	String browserVersion;
	
	public void openURL() {
		System.out.println("Open the given url");
	}
	
	public void closeBrowser() {
		System.out.println("Close all the opened windows");
	}
	
	public void navigateBack() {
		System.out.println("Go back to the previous page");
	}
	
	
}
