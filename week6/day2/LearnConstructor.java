package week6.day2;

public class LearnConstructor {
int a;
//syntax for constructor -- > access modifier className (){}

	public LearnConstructor() {
		this(3);
		System.out.println("Hello this is default constructor");
	}
	
	public LearnConstructor(int a) {
		this(1,"Hello");
		System.out.println("This is single argument constructor");
		
	}
	
	public LearnConstructor(int a, String x) {
		System.out.println("This is two argument constructor");
	}
	
	public static void main(String[] args) {
		LearnConstructor lc  = new LearnConstructor();
	}

}
