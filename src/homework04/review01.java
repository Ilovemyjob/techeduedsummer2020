package homework04;

import java.util.Scanner;

public class review01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Type java code, if an integer is even, output will be “The integer is even”.
//		If the integer is odd, output will be “The integer is odd”
//		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("integer");
		int a = scan.nextInt();
		
		if(a%2==0) {
			System.out.println("even");
			
		}else if(a%2!=0) {
			System.out.println("odd");
		}else
			System.out.println("not valid");
		
		
		
		
	}

}
