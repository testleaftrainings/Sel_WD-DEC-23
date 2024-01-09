package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String companyName = "google";
		Set<Character> uniqueChar = new LinkedHashSet<Character>();
		char[] eachChar = companyName.toCharArray();
		for (int i = 0; i < eachChar.length; i++) {
			uniqueChar.add(eachChar[i]);
		}
		System.out.println(uniqueChar);
		
		String output ="";
		
		
//		 for(WrapperClass localVariableName : collectionWantToIterate)
		 	
		for(Character unique : uniqueChar) {
			System.out.println(unique);
			output = output + unique;
		}
		
		
		
		System.out.println(output);
		


	}

}
