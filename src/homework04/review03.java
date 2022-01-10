package homework04;

import java.util.Scanner;

public class review03 {
//	Ask user to enter the values of length and width of a rectangle,
	//then check if it is square or not
//	
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("lenght");
	int a = input.nextInt();
	System.out.println("width");
	
	int b = input.nextInt();
	
	if(a==b) {
		System.out.println("square");
	}else if(a!=b) {
		System.out.println("rectangle");
	}else {
		System.out.println("not valid");
	}
	
	input.close();
	
	
	
	
	
	}
}
