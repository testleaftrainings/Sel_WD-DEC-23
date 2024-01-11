package week4.day4;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/drag.xhtml");
		List<WebElement> tableRow = driver.findElements(By.xpath("//h5[text()='Draggable Columns']/following::table[1]/tbody/tr"));
		int noOfRowsTable = tableRow.size(); // To get no of rows available in the table
		Set<String> listOfProductName = new LinkedHashSet<String>();
		
		for(int i=1; i<=noOfRowsTable; i++) {
			String productName = driver.findElement(By.xpath("//h5[text()='Draggable Columns']/following::table[1]/tbody/tr["+i+"]/td[1]")).getText();
			System.out.print(productName +"        ");
			listOfProductName.add(productName);
			String productQuantity = driver.findElement(By.xpath("//h5[text()='Draggable Columns']/following::table[1]/tbody/tr["+i+"]/td[3]")).getText();
			System.out.println(productQuantity);
		}
		
		if(noOfRowsTable==listOfProductName.size()) {
			System.out.println("There is no duplicate");
		}else {
			System.out.println("There is duplicate");
		}
		
	}

}
