package day14whiledowhiledt;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Interview Question
		 Type java code by using while loop, 
        Write a program that prompts the user to input a positive integer. 
        It should then print factorial of that number. 
                     5 factorial(5!) = 1x2x3x4x5
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		
//		int pro=1;
//		for(int i=1;i<=num;i++) {
//			pro*=i;
		//}
		//1. Way by using for-loop
		int product=1;
		
		for(int i=1; i<=num; i++) {		
			product = product * i;			
		}		
		System.out.println(product);
		
		
//		int i = 1;
//		int pro = 1;
//		while(i<=num) {
//			pro*=i;
//			i++;
//		}
//			System.out.println(pro);
		//2. Way by using while loop
		int prdct = 1;
		int k =1;
		while(k<=num) {
			prdct = prdct * k;
			k++;
		}
		System.out.println(prdct);	
	
		
		
		
		
		
	}

}
