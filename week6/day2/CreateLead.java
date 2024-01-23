package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{
	
	

	@Test(dataProvider = "fetchData")
	public  void runCreateLead(String cname, String fname, String lname, String phno) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		
	
		

	}
	
	
/*	@DataProvider(name="fetchData", indices = {0})
	public String[][] getData() throws IOException {
		/*String[][] data = new String[3][4]; // for instansitation it starts from 1 ,1
		
		// For declaring a data it starts from 0,0 
		
		data[0][0]= "Testleaf";
		data[0][1] = "Gokul";
		data[0][2] = "Sekar";
		data[0][3] = "99";
		
		data[1][0]= "Qeagle";
		data[1][1] = "Babu";
		data[1][2] = "Manickam";
		data[1][3] = "98";
		
		data[2][0]= "Testleaf";
		data[2][1] = "Hari";
		data[2][2] = "R";
		data[2][3] = "97";
		
		return data;
		String[][] excelData = DataLibrary.readExcel();
		return excelData;
		
		return DataLibrary.readExcel("createLead");
		
	}

*/

	@BeforeTest
	public void setData() {
		excelFileName = "createLead";
		sheetIndexPosition = 0;
		
	
	}


}
