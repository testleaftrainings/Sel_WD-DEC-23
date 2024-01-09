package week4.day1;

public class LearnKeyword extends LearnStaticKeyword{
	int x =100;
	public void normalMethod() {
		System.out.println("Nomral method in LearnKeyword class");
	}

	public void m1() {
		normalMethod();
		super.normalMethod();
		System.out.println(x);
		System.out.println(super.x);
		
	}
	
	public static void staticMethod() {
		System.out.println("Static method from learnkeyword clas");
	}
	
	public static void main(String[] args) {
//		staticMethod();
		System.out.println("=====================\n \n \n");
		LearnKeyword lk = new LearnKeyword();
		lk.m1();
	}

}
