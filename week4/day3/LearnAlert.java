package week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/alert.xhtml");
		
		// Simple Alert
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Thread.sleep(2000);
		// Transfer driver control into the alert, when alert is present. and we can resue the same alert object in the upcoming alert also.
		Alert alert = driver.switchTo().alert();  
		String firstAlertMsg = alert.getText();
		System.out.println("firstAlertMsg : " +firstAlertMsg);
		alert.accept(); // Accept the alert 
		
		
		// Confirmation Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		String secondAlertMsg = alert.getText();  // Get text(information/message) from the alert.
		System.out.println("secondAlertMsg : " +secondAlertMsg);
		alert.dismiss(); // Reject the alert
		
		// Prompt alert
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[text()='Show']")).click();
		String thirdAlertMsg = alert.getText();  // Get text(information/message) from the alert.
		System.out.println("thirdAlertMsg : " +thirdAlertMsg);
		alert.sendKeys("Hello!!"); // To pass input to the alert.
		alert.accept();
		
		
		//Non-Modal Alert --> Inspectable (Normal webElement) (need to handle the alert)
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		
	}

}
