package homework15;

import java.util.Scanner;

public class review06 {


 public static void main(String[] args) {
//		Ask user to enter a name.
//		If the name contains the letter ‘a’ then print "Won!" on the console
//		otherwise ask user to enter another name.
//		Use do-while loop.
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		
		do {
			System.out.println("enter a name");
		name=scan.next();
		
		if (!(name.contains("a"))) {
		
		System.out.println("wrong");	
		}	
	}while(!(name.contains("a")));
		
         System.out.println("won");
         scan.close();
         
         
 }
 } 
         
         