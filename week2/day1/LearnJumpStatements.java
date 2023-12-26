package week2.day1;

public class LearnJumpStatements {

	public static void main(String[] args) {
		
		
		for (int i =1; i <=10 ;i++) {
			if(i==3) {
				continue;// skip the iteration
			}
			
			if(i==7) {
				break; // it will stop the entire iteration
			}
			System.out.print(i+" ");
			
			
			
		}

	}

}
