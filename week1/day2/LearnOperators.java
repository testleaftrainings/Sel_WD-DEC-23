package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		
		// add two numbers ---> +
		// sub two numbers ---> -
		// multi two numbers ---> *
		// divide two numbers ---> /
		// reminder ---> %
	
		int a = 10;
		int b = 20;
		int d = a+b;
		float c ;
		c = a+b;
		boolean f = (a==b);
		String firstName = "Gokul";
		String lastName = "Sekar";
		System.out.println("c ---> " + c);
		
		System.out.println("a-b  : " +( a-b));
		System.out.println("a * b : " +(a*b));
		System.out.println("c/a : "+(c/a));
		System.out.println("a/c : " + (a/c));
		System.out.println("a*%c : " +(a%c));
		
		System.out.println("===================");
		
		System.out.println("10 == 20 : "+(a==b));
		System.out.println("10 != 20"+(a!=b));
		System.out.println("30.0 > 20" +(c>b));
		System.out.println("20>=10"+(b>=a));
		System.out.println("20<10 :" +(b<a)  );
		System.out.println("30<=40" +(c<=40));
		
		System.out.print("============================");
		
		System.out.print(a+b+firstName+ lastName+ f+a+b);
		System.out.println(10+20);

	}

}
