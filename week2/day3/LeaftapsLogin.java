package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLogin {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//Locate the username field
		WebElement username = driver.findElement(By.id("username"));
		//Enter the username as demosalesmanager
		username.sendKeys("demosalesmanager");
		
		//Locate the password field
		WebElement password = driver.findElement(By.name("PASSWORD"));
		//Enter the password as crmsfa
		password.sendKeys("crmsfa");
		
		
		// shortcut --> ctrl+2 , l ---> Assign to local variable
		WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
		loginBtn.click();
		
		//Get the title
		/* String title = driver.findElement(By.tagName("title")).getText();
		 * System.out.println(title);
		 */
			
		String title = driver.getTitle();
		System.out.println(title);
		
		//Locate and click the crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//get title for my home page
		String myHomepageTitle = driver.getTitle();
		if(myHomepageTitle.contains("My Home")) {
			System.out.println("My Home Page verified Successfully");
		}else {
			System.out.println("Unable to verify the My Home Page");
		}
		
		
		
		
	}

}
