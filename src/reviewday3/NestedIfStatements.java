package reviewday3;

import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Create a class : “NestedIfStatements”
//		ask user to enter 2 birth dates 
//		Get the year, months, and day as integer
//		then find the older person using Nested if statements
//		Examples:
//		int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12, 
//		int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
//		Yusuf is Older
		
		Scanner scan = new Scanner(System.in);
		System.out.println("birthYearOfYusuf");
		int birthYearOfYusuf=scan.nextInt();
		
		System.out.println("birthMonthOfYusuf");
		int birthMonthOfYusuf=scan.nextInt();
		
		System.out.println("birthDayOfYusuf");
		int birthDayOfYusuf=scan.nextInt();
		
		System.out.println("birthYearOfMehmet");
		int birthYearOfMehmet=scan.nextInt();
		
		System.out.println("birthMonthOfMehmet");
		int birthMonthOfMehmet=scan.nextInt();
		
		System.out.println("birthDayOfMehmet");
		int birthDayOfMehmet=scan.nextInt();
		
		
		if(birthYearOfYusuf>birthYearOfMehmet) {
			System.out.println("Mehmet is Older");
		}
		else if(birthYearOfYusuf<birthYearOfMehmet) {
			System.out.println("yusuf is Older");
		}else {
			System.out.println("same");
		}
		
		
		if(birthMonthOfYusuf>birthMonthOfMehmet) {
			System.out.println("Mehmet is Older");
		}
		else if(birthMonthOfYusuf<birthMonthOfMehmet) {
			System.out.println("yusuf is Older");
		}else {
			System.out.println("same");
		}
			
		
		if(birthDayOfYusuf>birthDayOfMehmet) {
			System.out.println("Mehmet is Older");
		}
		else if(birthDayOfYusuf<birthDayOfMehmet) {
			System.out.println("yusuf is Older");
		}else {
			System.out.println("same");
		}
		
//		String return = (birthdayOfYusuf>birthYearOfMehmet)? "Mehmet is Older": "yusuf is Older";
//		System.out.println(return);
		
		
		
		
		
		
		
		
		
		
	}

}
