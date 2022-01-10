package homework07;

import java.util.Scanner;

public class review_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Type java code by using nested if statement,
//		If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
//		“Perfect even number” otherwise, the output will be “Good even number.”
//		If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
//		“Perfect odd number” otherwise, the output will be “Good odd number.”
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("number");
		
		int a = scan.nextInt();
		
		String result = a%2==0 ? a%3==0 ? "Perfect even number" : "Good even number" : a%3==0 ? "Perfect odd number" : "Good odd number";
		System.out.println(result);
		
		
		if(a%2==0) {
			if(a%3==0) {
				System.out.println("Perfect even number");
			}else {
				System.out.println("Good even number");
			}
			
		}else 
			if(a%3==0) {
				System.out.println("Perfect odd number");
			}else {
				System.out.println("Good odd number");
			}
	
		
	}

}
