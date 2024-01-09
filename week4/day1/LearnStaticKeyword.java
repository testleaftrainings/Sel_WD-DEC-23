package week4.day1;

public class LearnStaticKeyword {
	
	int x = 10; // global variable
	
	static int z = 15; // static variable
	
	
	// non static method
	public void normalMethod() {
		System.out.println("This is normal method");
		System.out.println(x); // gobal variable
		System.out.println(z); // static variable
	}
	
	
	//static method
	public static void staticMethod() {
		System.out.println("This is static method");
//		System.out.println(x); // gobal variable
		System.out.println(z); // static variable
	}

	public static void main(String[] args) {
		int y = 5; // local variable
		System.out.println(z);
//		normalMethod();
//		System.out.println(x); --> 
		staticMethod();
		
		System.out.println("=====================");
		
		LearnStaticKeyword lsk = new LearnStaticKeyword();
		lsk.normalMethod();
		System.out.println(lsk.x);
	}
	
	static {
		System.out.println("Static two");
	}
	
	
	static {
		System.out.println("===========================");
		System.out.println("static block");
		System.out.println("===========================");
	}

}
