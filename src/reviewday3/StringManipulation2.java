package reviewday3;

import java.util.Scanner;

public class StringManipulation2 {

	public static void main(String[] args) {
		/*
		 crate 2 name1 and name2
		 if name even add name2 in middle
		 if not "cannot be inserted
		 */
		String name1 = "mehmet";
		String name2 = "ahmet";
		// check if name1 has odd or even number of characters?
		boolean isTrue = name1.length() % 2 == 0;
		//boolean isTrue= name1.length()%2==0;
		
		String firstHalf = name1.substring(0, name1.length() / 2);
		// NOTE: Beginning index inclusive BUT end index ins exclusive
		String secondHalf = name1.substring(name1.length() / 2);
		if (isTrue) {  //isTrue==true we caN WRITE ALSO LIKE THIS
			System.out.println(firstHalf + name2 + secondHalf);
		} else {
			System.out.println("Name2 cannot be inserted in the name1");
		}

		//String first = name1.substring(0,name1.length()/2);
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("name1");
//		String name1 = scan.nextLine();
//		System.out.println("name2");
//		String name2 = scan.nextLine();
//		
//		if(name1.length()%2==0) {
//			System.out.println(name1.substring(0, name1.length()/2) 
//					+ name2 + name1.substring(name1.length()/2));
//		
//		}else {
//			System.out.println("not valid");
//		}
//		
	}

}
