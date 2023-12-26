package week2.day1;

import java.util.Arrays;
import java.util.Iterator;

public class LearnArraysInstantion {

	public static void main(String[] args) {
		
		//Syntax --> dataType variable[] = new dataType[size];
		
		int numbers[] = new int[7];
		
		numbers[0]= 10;
		numbers[1] = 12;
		numbers[2] = 3;
		numbers[3] = 7;
		numbers[4] = 51;
		numbers[5] = 68;
		
		System.out.println("Before sort");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
//		System.out.println(numbers);
//		System.out.println("number 5 >>"+numbers[5]);
//		System.out.println(numbers[6]);
//		System.out.println(numbers[1]=7);
		Arrays.sort(numbers);
		System.out.println("After sort");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			
			
		}
//		System.out.println("number 5 >>"+numbers[5]);
		System.out.println("===================");
		int[] descending = new int[numbers.length];
		int j=0;
		for (int i = numbers.length-1; i >0; i--) {	
			descending[j] = numbers[i];
			j++;
		}
		
		System.out.println("Desending -------->");
		for (int i = 0; i < descending.length; i++) {
			System.out.print(descending[i] +" ");
		}

		
		
	}
		
	public int[] sortReverse(int[] a ) {
		
		int[] descending = new int[a.length];
		int j=0;
		for (int i = a.length-1; i >0; i--) {	
			descending[j] = a[i];
			j++;
		}
		
		System.out.println("Desending -------->");
		for (int i = 0; i < descending.length; i++) {
			System.out.print(descending[i] +" ");
		}
		
		for (int i = 0; i < descending.length; i++) {
			a[i]= descending[i];
		}
		
		return a;
	}

}
