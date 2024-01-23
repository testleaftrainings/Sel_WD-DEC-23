package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

public RemoteWebDriver driver;
	

	@Parameters({"username","password", "url", "browser"})
	@BeforeMethod
	public void preCondition(String uname, String pwd, String url, String browser) {
		
		switch(browser) {
		case "chrome" :
			driver  = new ChromeDriver();
			break;
			
		case "edge" :
			driver = new EdgeDriver();
			break;
			
		case "firefox" :
			driver = new FirefoxDriver();
			break;
			
		default :
			driver = new ChromeDriver();
		}
		
//		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("url : " + url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		System.out.println("username : " + uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		System.out.println("password : " + pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	 
}
