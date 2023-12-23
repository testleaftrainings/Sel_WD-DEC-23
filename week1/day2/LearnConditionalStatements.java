package week1.day2;

public class LearnConditionalStatements {

	public static void main(String[] args) {
		int a = 7;
		int b = 7;
		/// syntax  --> if(condition){}
		
		
		// single condition
		if(a<b) {
			System.out.println("A is greater than B");
		}
		
		// single condition with else(if not satisfied)
		if(a==b) {
			System.out.println("Both A and B are equal");
		}else {
			System.out.println(" Both A and B are not equal");
		}
		
		
		// Multiple condition ---> if else ladder
		
		// If you score marks above 90 --> play station.
		// if you score marks above 80 --> toys
		// if you score marks above 50 ---> ice cream
		// if you get below 50 ---> nothing
		
		float marks = 89.9f;
		
		if(marks>90) {
			System.out.println("Play Station");
		}else if(marks>80) {
			System.out.println("Toys");
		}else if (marks> 50) {
			System.out.println("Ice cream");
		}else if(marks<50) {
			System.out.println("ooops");
		}
		
		// && --> And , || ---> Or
		// deposit an amount of  50,000 and above and less than 2l--> pan card required
		// deposit --> above 100 and below 49,999  ---> pan card not required
		int depositAmount = 400;
		if((depositAmount>=50000) && (depositAmount<200000)) {
			System.out.println("Pan Card is required");
		}else if((depositAmount>100) && (depositAmount<50000) ) {
			System.out.println("Pan card not required");
		}else {
			System.out.println("unable to deposit");
		}
		
	}

}
