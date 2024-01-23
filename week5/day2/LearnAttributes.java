package week5.day2;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	
	
	@Test(priority = 3)
	public void m2() {
		System.out.println("This is m2");
	}
	
	@Test(priority = -1)
	public void m3() {
		System.out.println("This is m3");
	}
	
	@Test(priority = 2, enabled = false)
	public void m1() {
		System.out.println("This is m1");
	}
	
	@Test (invocationTimeOut = 3000)
	public void m() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("This is m");
		
	}
	
	
	@Test (invocationCount = 5, invocationTimeOut = 3000, threadPoolSize = 3)
	public void f() throws InterruptedException {
		System.out.println("This is f");
		Thread.sleep(2000);
	}

}
