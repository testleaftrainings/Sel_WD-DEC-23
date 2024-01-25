package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead  extends ProjectSpecificMethod {
	
		
	
	@When ("Click on crmsfa")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@Then ("User land in  the Welcome page")
	public void verifyWelcomePage() {
		System.out.println(driver.getTitle());
	}
	
	@When ("Click on the leads tab")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When ("Click on the create lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	
	@Given  ("Enter the company name")
	public void enterCname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	}
	
	@Given ("Enter the first name")
	public void enterFname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
	}
	
	@Given ("Enter the last name")
	public void enterLname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
	}
	
	@When ("Click on the create lead button")
	public void clickCreateLeadBtn(){
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then ("Verify the lead is created")
	public void verifyCreateLead() {
		System.out.println(driver.getTitle());
	}
	
}
