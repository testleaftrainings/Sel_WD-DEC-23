package week1.day2;

public class Car {
	// Gobal Variable --->  can able to access anywhere in the class
	String colour = "green";
	int noOfWheeels = 5;

	public static  void main(String[] arg) {
		//ClassName objectName = new ClassName();
		Car cooper = new Car();
		cooper.startCar();
		cooper.applyBreak();
		System.out.println(cooper.colour);
		cooper.changeCarColour();
		System.out.println(cooper.colour);
		
		
		System.out.println("====================");
		
		Car polo = new Car();
		int num = polo.playMusic();
		
		System.out.println(polo.colour);
	}   
	
	// accessModifier returnType methodName(inputArguments){}
	public void startCar() {
		System.out.println("I need a key of the car");
		System.out.println("Open the car and insert the key");
		System.out.println("Start the car");
	}

	public int playMusic() {
		//Local variable ----> can able to access only into the particular method
		int x =1;
		System.out.println("Play music");
		return 7;
	}
	
	public void applyBreak() {
		System.out.println("Apply the break");
		String x = "Hello!";
	}
	
	public void changeCarColour() {
		colour = "black";
		System.out.println(colour);
		float x = 2;
	}
		
}
