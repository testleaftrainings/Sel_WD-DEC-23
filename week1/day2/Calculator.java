package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int n1 = calc.add(2,3);
		System.out.println(n1);
		
		calc.add(1, 2, 3);
		
		System.out.println(calc.add(5,6));
		
		Car myCar = new Car();
		myCar.applyBreak();
		Mobile myMobile = new Mobile();
		myMobile.makeCall("Mom");
		
	}
	
	

	public int add(int a, int b) {
		int c = a+b; 
//		System.out.println(c);
		return c;
	}
	
	public void add(int c , int d, int e) {
		int x = c+d+e;
		System.out.println(x);
	}
	
}
