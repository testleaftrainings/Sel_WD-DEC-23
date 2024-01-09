package week4.day1;

import java.time.Duration;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortMobilePrice {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("inputValEnter")).sendKeys("phones"+Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> listOfMobiles = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<Integer> allMobilePrice = new LinkedList<Integer>();
		List<String> allPriceStr = new LinkedList<String>();
 		for (int i = 0; i < listOfMobiles.size(); i++) {
			String mobilePrice = listOfMobiles.get(i).getText();
			String priceStr = mobilePrice.replaceAll("[^0-9]", "");
			int price = Integer.parseInt(priceStr);
			allMobilePrice.add(price);
			allPriceStr.add(priceStr);
		}
		Collections.sort(allMobilePrice);
		System.out.println("The mobile phone prices are : \n "+allMobilePrice);
		Collections.sort(allPriceStr);
		System.out.println("The mobile phone prices string value are : \n "+allPriceStr);
		driver.close();
	}

}
