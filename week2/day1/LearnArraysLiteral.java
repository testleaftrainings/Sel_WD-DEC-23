package week2.day1;

public class LearnArraysLiteral {

	public static void main(String[] args) {
		// syntax --> dataType variable[] = {};
		String names[] = {"Gokul", "Aathi", "Sethu", "Stalin", "Sooriya Narayanan", "Sangeetha"};
		
		System.out.println(names);
		// index of an Arrays starts --> 0
		System.out.println(names[3]);
		 	String name = "Divya";
		
		String n4 = names[4];
		System.out.println(n4);
		
		System.out.println(names[5]);
//		System.out.println(names[6] ="narmatha");
		System.out.println(names[0]="Sekar");
		
		int length = names.length; //length---> property 
		System.out.println("length of the names[] --> " + length);
		
		System.out.println("The Arrays are ------------>");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}

