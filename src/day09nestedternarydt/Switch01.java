package day09nestedternarydt;

import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		
		/*
		 Type code which types “even” for even integers, 
		 and “odd” for odd integers on console. 
		 Use if else if and switch
		 
		 If the user pressed 1, 2, 3 the program will print the number that is pressed; 
otherwise, program will print "Not allowed".
		 */
		int a = 5;
		
		if(a==1) {
			System.out.println("one");
		}else if(a==2) {
			System.out.println("two");
		}else if(a==3) {
			System.out.println("three");
		}else {
			System.out.println("not allow");
		}
			
		switch(a) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("not allow");
		
		
		}
		
//		int a = 1;
//	
//		switch(a) {
//		case 1:
//			System.out.println("one");
//			break;
//		case 2:
//			System.out.println("two");
//			break;
//		case 3:
//			System.out.println("three");
//			break;
//		default:
//			System.out.println("not allowed");
//			
	
	

		
		
	
		
		
		
		
		
		
	}
}
