package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseActions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/drag.xhtml");
		Actions action = new Actions(driver);
		WebElement dragWE = driver.findElement(By.id("form:conpnl"));
//		action.clickAndHold(dragWE).moveByOffset(300, 0).release(dragWE).perform();// Perform method is mandatory to perform the action.
		Thread.sleep(2000);
//		action.clickAndHold(dragWE).moveByOffset(-150, 0).release(dragWE).perform();
		action.dragAndDropBy(dragWE, 300, 0).perform();
		action.dragAndDropBy(dragWE, -350, 0).perform();
		
		
		WebElement dragableWE = driver.findElement(By.id("form:drag_content"));
		WebElement dropWE = driver.findElement(By.id("form:drop_content"));
		action.dragAndDrop(dragableWE, dropWE).perform();
		
		WebElement nameCol = driver.findElement(By.xpath("//span[text()='Name']/.."));
		WebElement quantityCol = driver.findElement(By.xpath("//span[text()='Quantity']/.."));
		action.dragAndDrop(nameCol, quantityCol).perform();
		
		WebElement eop = driver.findElement(By.xpath("//label[text()='2022 - All Rights Reserved']"));
		action.scrollToElement(eop).perform();
		action.scrollByAmount(0, -100).perform();
	}

}
