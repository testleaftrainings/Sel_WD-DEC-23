package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundInput {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Gokul");
		
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys(",India");
		
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled'])[1]")).clear();
		
		String retrivedText = driver.findElement(By.xpath("//input[contains(@name,'j_idt88:j_idt97')]")).getAttribute("value");
		System.out.println("retrivedText --> " +retrivedText);
	}

}
