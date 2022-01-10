package homework07;

import java.util.Scanner;

public class review_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Type java code by using nested if() statement.
//		Write a program to check if a year is leap year or not.
//		If the year is divisible by 100 then it must be divisible by 400.
//		If a year is not divisible by 100 then it must be divisible by 4
//		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("year");
		int a = scan.nextInt();
		
		String result = a%100==0 ? a%400==0 ? "leap" : "not leap" : a%4==0 ? "leap" : "not leap";
		System.out.println(result);
		
		if(a%100==0) {
			if(a%400==0) {
				System.out.println("leap");
			}else {
				System.out.println("not leap");
			}
			
		}else
			if(a%2==0) {
				System.out.println("leap");
			}else {
				System.out.println("not leap");
			}
			
		
	}

}
