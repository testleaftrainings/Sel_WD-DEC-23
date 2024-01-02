package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {

	public static void main(String[] args)  {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create new account")).click();
		
//		Thread.sleep(2000);// it will wait for the entire timeout.
		
		driver.findElement(By.name("firstname")).sendKeys("Gokul");

	}

}
