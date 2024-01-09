package week4.day1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		//Set<WrapperClass> variabe/object name = new implementationClass <WrapperClass>();
		
		/*
		 * HashSet --> Random order (Hashing algorithom)
		 * TreeSet --> Ascii order
		 * LinkedHashSet --> Insertion order
		 * */
		Set<String> mentors = new HashSet<String>();
		mentors.add("Gokul");
		mentors.add("Vineeth");
		mentors.add("Vinoth");
		mentors.add("Ragu");
		mentors.add("Dilip");
		mentors.add("Aravind");
		mentors.add("Gokul");
		mentors.add("Vineeth");
		mentors.add("Vinoth");
		mentors.add("Ragu");
		mentors.add("Dilip");
		mentors.add("Aravind");
		
		
		System.out.println(mentors);
		
		mentors.remove("Gokul");
		
		System.out.println(mentors);
		
		mentors.remove("Babu");
		System.out.println(mentors);
		
		mentors.clear();
		System.out.println(mentors);
		System.out.println(mentors.isEmpty());
		
		System.out.println("==========================================");
		
		Set<String> coaches = new TreeSet<String>();
		coaches.add("Hari");
		coaches.add("Babu");
		coaches.add("Sudarshan");
		coaches.add("Mohan");
		
		System.out.println(coaches);
		
		System.out.println("==========================================");
		
		
		Set<String> testLeafEmployee = new LinkedHashSet<String>();
		testLeafEmployee.add("Babu");
		testLeafEmployee.add("Hari");
		testLeafEmployee.add("Gokul");
		testLeafEmployee.add("Vinoth");
		testLeafEmployee.add("Ragu");
		testLeafEmployee.add("Vineeth");
//		testLeafEmployee.get(0)
		System.out.println(testLeafEmployee);
	
		List<String> tlEmployee = new ArrayList<String>(testLeafEmployee);
		tlEmployee.addAll(testLeafEmployee);
		System.out.println(tlEmployee);
		tlEmployee.get(0);
		
	}

}
