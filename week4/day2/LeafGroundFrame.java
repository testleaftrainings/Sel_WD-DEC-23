package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/frame.xhtml");
		driver.switchTo().frame(0);// Handle a frame by using index, index starts from 0(zero).
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		//Back to main window/page 
		driver.switchTo().defaultContent();//
		WebElement clickMe1st = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside frame)']"));
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size());
		
		WebElement countFrame = driver.findElement(By.xpath("//h5[text()=' How many frames in this page?']/following-sibling::iframe"));
		driver.switchTo().frame(countFrame);
		String countText = driver.findElement(By.id("Click")).getText();
		System.out.println(countText);
		driver.switchTo().parentFrame();// get out from the current frame
		iframes = driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size());
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
	}

}
