package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogini {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@testleaf.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		String forgottenPageTitle = driver.getTitle();
		if(forgottenPageTitle.contains("Forgotten")) {
			System.out.println("Forgotten page is verified");
		}else {
			System.out.println("Unable to verify the forgotten page");
		}
		
		driver.close();
		

	}

}
