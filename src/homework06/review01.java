package homework06;

import java.util.Scanner;

public class review01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Ask user to enter his/her age. If the age is between 18 and 65 then output will be “You should work”,
//		else output will be “No need to work”
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("age");
		int age = scan.nextInt();
		if(age>=18 && age <=65) {
			System.out.println("work");
		}else {
			System.out.println("no work");	
			}
		
	}

}
