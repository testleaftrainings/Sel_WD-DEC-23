package week5.day2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotation {
  @Test
  public void f() {
	  System.out.println("This is Test Annotation");
  }
  

  @Test
  public void f2() {
	  System.out.println("I'm a second Test annotation");
  }
  
  @Test
  public void f3() {
	  System.out.println("This is a third Test annotation");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method annotation");
  }

 

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class annotation");
  }

  

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test annotation");
  }

  

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("This is after suite annotation");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method annotation");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite annotation");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println(" This is before test annotation");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class annotation");
  }

}
