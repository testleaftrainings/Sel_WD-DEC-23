package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		//List<Wrapper class> variableName = new Implementation class<Wrapper class> ();
		
		List<String> mentors = new ArrayList<String>();
		mentors.add("Gokul");
		mentors.add("Dilip");
		mentors.add("Ragu");
		mentors.add("Vinoth");
		mentors.add("Vineeth");
		System.out.println(mentors);
		mentors.add(3, "Subraja");
		mentors.add(3,"Ranjini");
		System.out.println(mentors);
		
		System.out.println(mentors.get(2));
		
		System.out.println(mentors.size());
		
		mentors.remove("Vijay");
		mentors.remove("Gokul");
		mentors.remove(3);
		System.out.println(mentors);
		
//		mentors.clear();
		
		System.out.println(mentors.contains("Gokul"));
		System.out.println("Is empty : "+mentors.isEmpty());
		System.out.println(mentors);
		
//		String[] array = (String[]) mentors.toArray();
		
		List<String> coaches = new LinkedList<String>();
		coaches.add("Babu");
		coaches.add("Hari");
		coaches.add("sudharsan");
		coaches.add("Mohan");
		
		mentors.addAll(coaches);
		System.out.println(mentors);
		mentors.addAll(1, coaches);
		System.out.println(mentors);
		Collections.sort(mentors);
		System.out.println("==================");
		System.out.println(mentors);
		mentors.removeAll(coaches);
		System.out.println(mentors);
	}

}
