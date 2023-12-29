package week2.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	/*
	 * (double slash)// ---> single line comment line , ctrl +/
	 *multi line comment line --> ctrl + shift + /
	 *un comment multi line comment ---> ctrl + shift + \
	 * 
	 * FirefoxDriver fd = new FirefoxDriver(); SafariDriver sd = new SafariDriver();
	 */
	

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\ChromeDriverFiles\\115\\chromedriver-win64\\chromedriver.exe");
		 * ChromeOptions option = new ChromeOptions();
		 * option.setBinary("C:\\ChromeDriverFiles\\115\\chrome-win64\\chrome.exe");
		 */
//		Launch the browser
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//To load the url
		driver.get("https://www.google.com/");
		
		//To maximize the window/browser
		driver.manage().window().maximize();
		
		// to wait for 2sec --> Java wait
		Thread.sleep(2000);
		
		// To close the window
		driver.close();
	}

}
