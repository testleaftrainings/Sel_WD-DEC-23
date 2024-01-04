package week3.day2;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a, float b) {
		System.out.println(a+b);
	}
	
	public void add(float a, float b) {
		System.out.println(a+b);
	}
	
	public void add(float a, int b, float c) {
		System.out.println(a+b+c);
		System.out.println("c -->" + c);
	}
	public void sub() {
		
	}
	
	public void mulitple() {
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10,20);
		cal.add(20, 30,10);
		cal.add(10, 50.6f);
		cal.add(10.4f, 11.3f);
		cal.add(11.1f, 10, 13.47f);
		cal.add(11.45f, 10, 20);
	}

}
