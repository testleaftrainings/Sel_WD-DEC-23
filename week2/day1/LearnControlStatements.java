package week2.day1;

import java.util.Iterator;

public class LearnControlStatements {

	// Control statements ---->for, for each, while, do while
	// loop --> to iterate 
	public static void main(String[] args) {
		
		
		
//		Syntax ---> for(initalization; Condition; incremental/decremental){}
//		for(int i=1;i<=100; i++ ) {
//			System.out.println("Hello!!");
//		}
		

		// i++ ---> post Condtion;
		// ++i ---> pre Condition;
		
		int a = 10;
//		a++ ---> a= a+1
		System.out.println("a value before preCondition "+ a);
		System.out.println(++a);
		System.out.println("a value after preConditon : " + a);
		System.out.println("final a value : " + a);
		
//		int b = 10;
		
		int x = 1;
		System.out.println("============Pre condition===================");
		System.out.println("X ----> " + x);
		System.out.println("++X ----> " + (++x)); // x =1, x = x+1 ,x =2;
		System.out.println("X ----> " + x);
		
		System.out.println("============Post condition===================");
		int y =1;
		System.out.println("y ---> " + y);
		System.out.println("y++ ---> " + (y++));// y =1 ---> y = y+1 --> y=2
		System.out.println("y ---> " + y);
		
		
		System.out.println("Print from 1 to 10");
		for(int i=1; i<=10; ++i) {
			System.out.println(i);
		}
		
		System.out.println("print from 10 to 1" );
		for(int i =10; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("Print even number from 1 to 20");
		for(int i=1; i<=20; i++) {
			
			if((i%2)==0) {
				System.out.println(i);
			}
			
		}
		
	}

}
