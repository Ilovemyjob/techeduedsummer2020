package day06ifelsestatementdt;

import java.util.Scanner;

public class IfElseIf03 {
	
	public static void main(String[] args) {
		/*
		 Type java code by using if-else if() statement.
         A school has following rules for grading system:
         1. Below 50 - D    2. 50 to 60 - C    3. 60 to 80 - B.   4. Above 80 - A 
         Ask user to enter marks and print the corresponding grade.
		*/
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		int grade = scan.nextInt();
		//1. Way
		if(grade<0) {
			System.out.println("Negative grades are not valid");
		}else if(grade>=0 && grade<50) {
			System.out.println("D");
		}else if(grade>=50 && grade<60 ) {
			System.out.println("C");
		}else if(grade>=60 && grade<80) {
			System.out.println("B");
		}else if(grade>=80 && grade<=100) {
			System.out.println("A");
		}else {
			System.out.println("Greater than 100 is not valid");
		}
		//2. Way
		if(grade<0) {
			System.out.println("Negative grades are not valid");
		}else if(grade<50) {
			System.out.println("D");
		}else if(grade<60) {
			System.out.println("C");
		}else if(grade<80) {
			System.out.println("B");
		}else if(grade<=100){
			System.out.println("A");
		}else {
			System.out.println("Greater than 100 is not valid");
		}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter grade");
//		int grade=scan.nextInt();
//		
//		if(grade<0) {
//			System.out.println("not negative");
//		}else if(grade<50) {
//			System.out.println("D");
//		}else if(grade<60) {
//			System.out.println("C");
//		}else if(grade<80) {
//			System.out.println("B");
//		}else if(grade<100) {
//			System.out.println("A");
//		}else {
//			System.out.println("not more than 100");
//		}
		
		
		
		
		
		
		
		 scan.close();
	}
	
}