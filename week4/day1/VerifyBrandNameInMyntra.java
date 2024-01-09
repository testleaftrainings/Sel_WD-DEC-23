package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBrandNameInMyntra {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Shirt Men" + Keys.ENTER);
//		driver.findElement(By.xpath("//label[text()='Indian Terrain']/div")).click();
//		Thread.sleep(3000);
		List<WebElement> brandNameWE = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		int brandCount = brandNameWE.size();
		System.out.println("Indian Terrain shirt present in first resulting page : " + brandCount);
		for (int i = 0; i <brandCount; i++) {
//			WebElement webElement = brandNameWE.get(i);
//			String brandName = webElement.getText();
			String brandName = brandNameWE.get(i).getText();
			if(brandName.equalsIgnoreCase("Indian Terrain")) {
				System.out.println("Brand Name is verified which is "+ brandName +" " + i );
			}else {
				System.out.println("Unable to verify the brand Name " +brandName +" " + i );
			}
		}
	
		
		String mobilePrice = "Rs: 898";
		String price = mobilePrice.replaceAll("[^0-9]", ""); //898
		int priceInNumber = Integer.parseInt(price);
		System.out.println("priceInNumber " +priceInNumber );
		
//		int mobile = Integer.parseInt(mobilePrice);
//		System.out.println("Mobile " + mobile);
		
	}

}
