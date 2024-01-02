package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		
		//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//Maximize
				driver.manage().window().maximize();
				
				//load the url
				driver.get("http://leaftaps.com/opentaps/");
				
				//Locate the username field
				WebElement username = driver.findElement(By.id("username"));
				//Enter the username as demosalesmanager
				username.sendKeys("demosalesmanager");
				
				//Locate the password field
				WebElement password = driver.findElement(By.name("PASSWORD"));
				//Enter the password as crmsfa
				password.sendKeys("crmsfa");
				
				
				// shortcut --> ctrl+2 , l ---> Assign to local variable
				WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
				loginBtn.click();
				
				//Get the title
				/* String title = driver.findElement(By.tagName("title")).getText();
				 * System.out.println(title);
				 */
					
				String title = driver.getTitle();
				System.out.println(title);
				
				//Locate and click the crmsfa link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//get title for my home page
				String myHomepageTitle = driver.getTitle();
				if(myHomepageTitle.contains("My Home")) {
					System.out.println("My Home Page verified Successfully");
				}else {
					System.out.println("Unable to verify the My Home Page");
				}
				
				//Click on the Leads tab
				driver.findElement(By.linkText("Leads")).click();
				
				// Click on the create Lead link
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter the company name as Testleaf
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				
				//Enter the firstName as Gokul
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
				
				//Enter the lastName as Sekar
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
				
				
				//Locate the source dd
				WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
				
				Select sourceDD = new Select(sourceWE);
				
				sourceDD.selectByIndex(4);// Employee --> by using index
				
				//Locate the Industry dd
				WebElement industryWE = driver.findElement(By.id("createLeadForm_industryEnumId"));
				//Instanta the Select Class for industryWE
				Select industryDD = new Select(industryWE);
				industryDD.selectByValue("IND_SOFTWARE"); // Choose computer software using value
				
				//Locate the ownership dd
				WebElement ownershipWE = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select ownerShipDD = new Select(ownershipWE);
				ownerShipDD.selectByVisibleText("Partnership");// Choose Partnership by using visible text
				
				
				
				
				
				// click on the create lead button
				driver.findElement(By.name("submitButton")).click();
				
				
				//Get Lead id
				String leadIdWithCname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				System.out.println("leadIdWithCname --> " + leadIdWithCname);
				String leadId = leadIdWithCname.replaceAll("[^0-9]", "");
				System.out.println("Lead id is "+leadId);
			
	}

}
