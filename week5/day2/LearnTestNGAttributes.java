package week5.day2;

import org.testng.annotations.Test;

public class LearnTestNGAttributes {
	
	@Test(invocationTimeOut = 1000)
	public void createLead() throws InterruptedException {
		Thread.sleep(1200);
		System.out.println("Create Lead");
	}
	
	@Test(dependsOnMethods = "createLead")
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	
	@Test(dependsOnMethods = "deleteLead", alwaysRun = true)
	public void createAccount() {
		System.out.println("Create Account ");
	}
	
}