package day07nestedifternarydt;

import java.util.Scanner;

public class NestedIf01 {
	
	public static void main(String[] args) {
		/*
		 * ask user to enter gender and age.
		 * if the gender is "male" and the age is less then 20 print "Boy"
		 * otherwise print "Man" on the console.
		 * If the gender "female" and the age is less than 20 print "Girl"
		 otherwise print "Woman" on the console.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter your gender");
		//If you want to convert all characters in a String to lower case use toLowerCase()
		//If you want to convert all characters in a String to upper case use toUpperCase()
		String gender = scan.next();
		System.out.println("Please, enter your age");
		int age = scan.nextInt();
		
		if(gender.equalsIgnoreCase("male")) {
			
			if(age<20) {
				System.out.println("Boy");
			}else {
				System.out.println("Man");
			}
					
		}else if(gender.equalsIgnoreCase("female")) {
			
			if(age<20) {
				System.out.println("Girl");
			}else {
				System.out.println("Woman");
			}
			
		}else{
			System.out.println("Undefined gender");
		}
	
	//	Scanner scan = new Scanner(System.in);
//		System.out.println("gender");
//		String gender = scan.next();
//		System.out.println("age");
//		int age = scan.nextInt();
//		
//		if(gender.equalsIgnoreCase("male")) {
//			if(age<20) {
//				System.out.println("boy");
//			}else {
//				System.out.println("man");
//			}
//			
//		}else if(gender.equalsIgnoreCase("female")){
//			if(age<20) {
//				System.out.println("girl");
//			}else {
//				System.out.println("woman");
//			}
//			
//			
//		}else {
//			System.out.println("gay");
//		}
		scan.close();
	}
	
}