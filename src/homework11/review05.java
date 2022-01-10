package homework11;

import java.util.Scanner;

public class review05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ask user to enter a word which has 4 letters and output will be inverse of the word.
//		For example; if user enters “MARK” output will be “KRAM
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" word which has 4 letters");
		String str = scan.nextLine() ;
		
		char ch1 = str.charAt(0);
				char ch2 = str.charAt(1);	
						char ch3 = str.charAt(2);
								char ch4 = str.charAt(3);
		System.out.println("" + ch4 + ch3 + ch2 + ch1);
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
			
		}
		
	
								
	}

}
