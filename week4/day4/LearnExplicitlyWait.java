package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitlyWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement firstClickWE = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		firstClickWE.click();
		
		WebElement imHere = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		System.out.println(imHere.isDisplayed());
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[2]"))).click();
		
		Boolean invisiblityWE = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println("invisiblityWE : " + invisiblityWE);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click First Button']"))).click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='ui-growl ui-widget']")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']"))).click();
		
		driver.get("https://leafground.com/window.xhtml");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Open Multiple']"))).click();
		
		Boolean noOfWindows = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println("noOfWindows : " +noOfWindows);
	}

}
