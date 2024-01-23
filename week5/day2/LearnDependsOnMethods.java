package week5.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	@Test
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	
	@Test(dependsOnMethods = {"week5.day1.CreateLead.runCreateLead"})
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	@Test(dependsOnMethods = {"createLead","editLead"})
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
	
	/*@Test
	public void mergeLead() {
		System.out.println("Merge Lead");
	}
	
	@Test(dependsOnMethods = "duplicateLead" , priority = 1)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	*/
}
