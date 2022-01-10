package reviewday3;

import java.util.Scanner;

public class StringManipulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ask user to enter an e-mail address 
		//then if it contains "hotmail" replace it with "gmail" 
		//e.g: johnbrown@gmail.com ==> johnbrown@gmail.com
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter hotmail address");
		String hotmail=scan.nextLine();
		
		
		//hotmail1234@hotmail.com
		if(hotmail.contains("@hotmail")) {//to make sure user enters a hotmail
			//hotmail =>>> gmail:   replace g for hot
			String gmail=hotmail.replace("@hotmail.com", "@gmail.com");//order is important
			//String gmail= hotmail.replace("hotmail", "gmail")
			System.out.println(gmail);
		}else {
			System.out.println("You didn't enter a hotmail");
		}	
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("email");
//		String hotmail = input.nextLine();
//		if(hotmail.contains("hotmail")){
//		
//		String gmail=hotmail.replace("hotmail", "gmail");
//		
//		System.out.println("gmail");
//		
//	}else {
//		
	}

}
