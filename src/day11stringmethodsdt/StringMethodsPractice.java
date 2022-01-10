package day11stringmethodsdt;

import java.util.Scanner;

public class StringMethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1) Ask user to enter a password which has 
		 *      a)At least two words with space between them
		 *      b)It should have at least 9 characters in total 
		 *      c)At least one upper case, one lower case, a number, and a special character
		 *      d)At the beginning use one space, at the end use double space
		 *           Note: For every step use your password 
		 *           Example for password: " Hey Come1?  "    
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a password according to the given rules");
			String p = scan.nextLine();
			
		 // 2) Find the index of the initials of the words in your password
		 //    index of the first word is 1.
			//System.out.println(p.indexOf('H'));
			System.out.println(p.indexOf('H'));//1
			System.out.println(p.indexOf('C'));//5
			
		 // 3) Find the last index of any character which is repeated in your password
			System.out.println(p.lastIndexOf('e'));//8
			   
		 //4) Replace * for all numbers in your password
			//System.out.println(p.replaceAll("\\d", "*"));
			System.out.println(p.replaceAll("\\d", "*")); 
		   
		 // 5) Replace ? for all non-words in your password
		//	System.out.println(p.replaceAll("\\W", "?"));
		    System.out.println(p.replaceAll("\\W", "?")); //?Hey?Come1???
			
		 // 6) Replace // for the second character of your password
		  //  System.out.println(p.replaceAll("H", "//"));
		    System.out.println(p.replace("H", "//")); // ==>  //ey Come1		       
		  
		 // 7) Print your password without any space at the beginning and 
		 //    at the end of the password.
		 //    Find the length of your password before trim and after trim.
		  //  System.out.println("before" + p.length());
		   // System.out.println("after" + p.trim().length());
		    System.out.println("Before trim: " + p.length());
		    System.out.println("After trim: " + p.trim().length());
		      
		 // 8) Print your password on the console by starting from the 4th character
		    System.out.println(p.substring(3));//y Come1?   
		             
		 // 9) Print the characters of your password from 2nd character to 7th character 
		//    System.out.println(p.indexOf(1,	 7));
		     System.out.println(p.substring(1, 7)); // Hey Co
		   
		 // 10)Print your password on the console like all characters are in upper case
		     System.out.println(p.toUpperCase());// HEY COME1?  
		       	
		 // 11)Print your password on the console like all characters in lower case 
		     System.out.println(p.toLowerCase());//  hey come1?  
		       
		     scan.close();

	/*	

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a password according to the given rules");
			String p = scan.nextLine();
		 // 2) Find the index of the initials of the words in your password
		 //    index of the first word is 1.
			
        System.out.println(p.startsWith(prefix));


		 // 3) Find the last index of any character which is repeated in your password
			   
			   
		 //4) Replace * for all numbers in your password
			   
		   
		 // 5) Replace ? for all non-words in your password
		       
			
		 // 6) Replace // for the second character of your password   
		       System.out.println(p.replace("H", "//"));
		  
		 // 7) Print your password without any space at the beginning and 
		 //    at the end of the password.
		 //    Find the length of your password before trim and after trim.
		      System.out.println("before trim:" + p.length());
		      System.out.println("after trim:" + p.trim().length());
		 
		 // 8) Print your password on the console by starting from the 4th character
		      System.out.println(p.)
		       		       
		 // 9) Print the characters of your password from 2nd character to 7th character 
		      
		   
		 // 10)Print your password on the console like all characters in upper case
		       System.out.println(p.toUpperCase());
			
		 // 11)Print your password on the console like all characters in lower case      
	
		System.out.println(p.toLowerCase());
		
		*/
		
		
	}

}
