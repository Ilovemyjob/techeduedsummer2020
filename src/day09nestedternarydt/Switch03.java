package day09nestedternarydt;

import java.util.Scanner;

public class Switch03 {
	
	public static void main(String[] args) {
		/*
		 Use switch statement
		 Ask user to enter the name of a month
		 The program should print the number of month
		 For example March ==> 3, June ==> 6 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a month name");
		String month = scan.next().toLowerCase();
	
		switch(month) {
			case "january":
				System.out.println(1);
				break;
			case "february":
				System.out.println(2);
				break;
			case "march":
				System.out.println(3);
				break;
			case "april":
				System.out.println(4);
				break;
			case "may":
				System.out.println(5);
				break;
			case "june":
				System.out.println(6);
				break;
			case "july":
				System.out.println(7);
				break;
			case "august":
				System.out.println(8);
				break;
			case "september":
				System.out.println(9);
				break;
			case "october":
				System.out.println(10);
				break;
			case "nowember":
				System.out.println(12);
				break;
			case "december":
				System.out.println(12);
				break;
			default:
				System.out.println("Enter a valid month name");
		}		
		scan.close();
		
	//	 switch(month){
//			case "january" :
//				System.out.println(1);
//				break;
//			case "februar" :
//				System.out.println(2);
//				break;
//			case "march" :
//				System.out.println(3);
//				break;
//			case "April" :
//				System.out.println(4);
//				break;
//			case "May" :
//				System.out.println(5);
//				break;
//			case "June" :
//				System.out.println(6);
//				break;
//			case "July" :
//				System.out.println(7);
//				break;
//			case "August" :
//				System.out.println(8);
//				break;
//			case "September" :
//				System.out.println(9);
//				break;
//			case "October" :
//				System.out.println(10);
//				break;
//			case "November" :
//				System.out.println(11);
//				break;
//			case "December" :
//				System.out.println(12);
//				break;	
//			default :
//				System.out.println("what");
//				scan.close();
//			
	}
}