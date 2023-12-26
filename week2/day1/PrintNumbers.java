package week2.day1;

public class PrintNumbers {

	public static void main(String[] args) {
		PrintNumbers number = new PrintNumbers();
		number.printOddNumbers(1,40);
		number.printOddNumbers(1,100);
		number.printOddNumbers(50, 100);
		number.printOddNumbers(70, 80);

	}
	
	public void printOddNumbers(int intinalization, int condition) {
		System.out.println("Print odd number from "+intinalization+" to "+condition);
		for(int i =intinalization; i<=condition; i++) {
			if((i%2)==1) {
				System.out.println(i);
			}
		}
	}

}
