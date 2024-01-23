package week6.day1;

public class LearnSwtichCase {

	public static void main(String[] args) {
		
		String browser = "edge";
		//Syntax switch(variable for the condition) {}
		// It will be case sensitive
		// All the case end with break statement
		
		/*if(browser.equals("Chrome")) {
			
		}*/
		
		
		switch(browser) {
		
		case "Chrome":
			System.out.println("Launch Chrome browser");
			break;
		case "Edge" :
			System.out.println("Launch Edge Browser");
			break;
			
		case "Safari" :
			System.out.println("Launch Safari browser");
			break;
			
		case "Firefox" :
			System.out.println("Launch FireFox Browser");
			break;
		
		default :
			 System.out.println("Launch Internet Explorer");
			 
		}
		
		

	}

}
