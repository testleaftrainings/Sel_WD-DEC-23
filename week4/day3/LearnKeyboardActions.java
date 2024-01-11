package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/input.xhtml");
		Actions action = new Actions(driver);
		WebElement nameField = driver.findElement(By.name("j_idt88:name"));
		action.sendKeys(nameField, "Gokul...................................").perform();
		
		action.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		action.keyDown(Keys.PAGE_UP).keyUp(Keys.PAGE_UP).perform();
		action.sendKeys(nameField, "").perform();
		action.keyDown(Keys.SHIFT).keyDown(Keys.HOME).keyUp(Keys.HOME).keyUp(Keys.SHIFT).perform();
		Thread.sleep(3000);
		action.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
	}

}
