package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitClassroom {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[3]"))).click();
		
		Boolean textIsChanged = wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//button[@name='j_idt87:j_idt99']/span"), "Did you notice?"));
		System.out.println("textIsChanged : " +textIsChanged);
		
		driver.close();
	}

}
