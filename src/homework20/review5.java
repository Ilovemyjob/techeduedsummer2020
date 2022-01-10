package homework20;

import java.util.Arrays;
import java.util.Scanner;

public class review5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
//		For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14.
//		Hint: Use split()
	
	
	Scanner scan= new Scanner(System.in);
	System.out.println("enter");
	String all = scan.nextLine();
	
	String b []= all.split(" ");
	System.out.println(Arrays.toString(b));
	System.out.println(b.length);
	
	
	
	
	
//	String a [] = all.split(" "); 
//	System.out.println(Arrays.toString(a));
//	System.out.println(a.length);
//	
	
	
	
	
	}

}
