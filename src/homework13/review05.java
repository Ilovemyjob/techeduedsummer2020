package homework13;

import java.util.Scanner;

public class review05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Type java code by using while loop,
//		Write a program to count the factors of an integer which is entered by user
		
		Scanner scan = new Scanner(System.in);
		System.out.println("positive number");
		int num = scan.nextInt();
		
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		
		i++;
		
		

	}

}
}