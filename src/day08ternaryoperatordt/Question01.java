package day08ternaryoperatordt;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Ask user to enter his/her age and gender. 
		 If the age is more than 65 and the gender is male
     then output will be “Hey man you retired!” else output will be “No need to work"
		 */
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter gender");
		String gender = scan.next();
		
		System.out.println("Enter age");
		int age = scan.nextInt();
		
		if(age>65 && gender.equalsIgnoreCase("male")) {
			System.out.println("You retired");
			
		}else {
			System.out.println("no need to work");
		}
		
		scan.close();
		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter gender");
		String gender = scan.next();
		System.out.println("Enter age");
		int age = scan.nextInt();
		
		if (age>65 && gender.equalsIgnoreCase("male")) {
			System.out.println("retired");
		}else {
			System.out.println("not retired");
		}
		

	}

}
