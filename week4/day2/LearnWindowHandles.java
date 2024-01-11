package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window address : "+parentWindow);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Bags" + Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='product-productMetaInfo']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		System.out.println("Parent window : "+window.get(0));
		System.out.println("Child window : "+window.get(1));
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	}

}
