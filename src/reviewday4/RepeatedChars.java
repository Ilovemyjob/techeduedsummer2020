package reviewday4;

import java.util.Scanner;

public class RepeatedChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ask use enter a mname and a character,
		 check how many caracter is repeated
		 in the name using loops in the name
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("enter name");
		String name = scan.nextLine();
		System.out.println("enter a char");
		char a = scan.next().charAt(0);
		int counter = 0;
		for(int i=0; i<=name.length()-1; i++) {
			if(name.charAt(i)==a) {
				counter++;
			}
		}
	System.out.println("number of char" + " = " + counter);
		
//	System.out.println();
//		String name1 = scan.nextLine();
//		System.out.println("char");
//		char b= scan.next().charAt(0);             =============>bunu calistiramadim cunkku usttekiyle 
	                                                           //ayni ustteki silinince calisiyor
//		    
//		int count = 0;
//		for (int k=0;k<name1.length();k++) {
//			if(name1.charAt(k)==b) {
//			
//			count++;
//			}
//	
//		}
//		System.out.println(count);
//		
	}

}
