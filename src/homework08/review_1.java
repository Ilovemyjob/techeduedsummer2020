package homework08;

import java.util.Scanner;

public class review_1 {
	
	public static void main(String[] args) {
		
	
	/*
	  Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
	 */
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter an integer");
	int num = scan.nextInt();
	
	
	if(num%2==0 && num>0) {
		System.out.println("even");
	}else if(num >0) {
		System.out.println("odd");
	}else {
		System.out.println("negative number is not a even or odd number");
	}
	
	
	String result = (num%2==0 && num>0) ? "even" :num>0 ? "odd" :"false" ;
		System.out.println(result);
	
		
		
		System.out.println(num%2==0 && num>0 ? "even" :num>0 ? "odd" :"false" );
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
scan.close();
	
	
	
	
	
	}
}
