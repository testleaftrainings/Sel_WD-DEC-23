package week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/drag.xhtml");
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/LeafgroundDrag.png");
		FileUtils.copyFile(source, target);
		WebElement dragWE = driver.findElement(By.id("form:conpnl"));
		File screenshot = dragWE.getScreenshotAs(OutputType.FILE);
		File path = new File("./snaps/dragWebElement.png");
		FileUtils.copyFile(screenshot, path);
	}

}
