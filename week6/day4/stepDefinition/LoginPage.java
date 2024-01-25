package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod {

	

	@Given ("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given ("Load the url as {string}")
	public void loadTheUrl(String url) {
		driver.get(url);
	}
	
	@Given ("Enter the {string} as {string}")
	public void enterUsername(String locator, String uname) {
		driver.findElement(By.id(locator)).sendKeys(uname);
	}
	
	@Given ("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When ("Click on the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then ("User land in the login sucessful page")
	public void verifyLogin() {
		
		List<WebElement> displayed = driver.findElements(By.xpath("//input[@value='Logout']"));
		if(displayed.size()==1) {
			System.out.println("User login is successfully");
		}else {
			System.out.println("Use a valid credentials for login");
		}
	}
	
	@Given ("Close the browser")
	public void closeBrowser() {
		driver.quit();
	}
	
	
}
