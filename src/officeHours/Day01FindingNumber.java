package officeHours;

import java.util.Random;
import java.util.Scanner;

public class Day01FindingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1-generate a rondom number
		
		Random rnd = new Random();
		int number = rnd.nextInt(100);
		System.out.println(number);
		//get data from user
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int guess = 1;
		
		
		do{
		
		
		System.out.println("enter a number");
		guess = scan.nextInt();
		
		
		if(guess>number) {
			System.out.println("your number bigger than mein ");
		}else if(guess<number) {
			System.out.println("your number smaller than mein");
		}else {
			System.out.println("correct number");
		}
		
		}while(guess != number);
		//compare 2 numbers
		//if equal to result
	}

}
