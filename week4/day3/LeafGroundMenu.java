package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundMenu {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/menu.xhtml");
		Actions action = new Actions(driver);
		WebElement customersWE = driver.findElement(By.xpath("//span[text()='Customers']/parent::a"));
		WebElement newWE = driver.findElement(By.xpath("//span[text()='New']/parent::a"));
		WebElement customerWE = driver.findElement(By.xpath("//span[text()='Customer']/parent::a"));
		
		action.click(customersWE).pause(2000).moveToElement(newWE).pause(2000).click(customerWE).perform();
		
		WebElement customersUnderSlide = driver.findElement(By.xpath("(//span[text()='Customers']/parent::a)[2]"));
		WebElement saveBtn = driver.findElement(By.xpath("(//span[text()='Save']/parent::a)[2]"));
		action.contextClick(customersUnderSlide).pause(Duration.ofSeconds(2)).click(saveBtn).perform();
	}

}
