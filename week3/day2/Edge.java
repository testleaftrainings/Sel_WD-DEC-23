package week3.day2;

public class Edge extends Browser{

	
	public void takeSnap() {
		System.out.println("Take a screenshot of the current web page");
	}
	
	public void clearCookies() {
		System.out.println("Clear the browser cookies");
	}
	
	public static void main(String[] args) {
		Edge edge = new Edge();
		edge.browserName= "Edge";
		edge.browserVersion ="115";
		System.out.println("Browser name "+edge.browserName);
		System.out.println("Browser version "+edge.browserVersion);
		edge.openURL();
		edge.takeSnap();
		edge.clearCookies();
		edge.navigateBack();
		edge.closeBrowser();
	}
	
}
