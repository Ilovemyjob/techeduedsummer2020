package officeHours;

import java.util.Scanner;

public class day02HidingName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("name");
		String name= scan.next();
		System.out.println("lastname");
		String lastname= scan.next();
		System.out.println("card number");
		String card= scan.next();
        
        if(card.length()!=16) {
        	System.out.println("not valid");
        }else {;
        name= name.substring(0,1).toUpperCase()+ name.substring(1).replaceAll("//w","*");
        lastname=lastname.substring(0,1).toUpperCase()+ lastname.substring(1).replaceAll("\\w","*");
        card="**** **** ****"+card.substring(card.length()-4);
                       System.out.println(name+" "+lastname+" "+card );
     
        }
        
        
        
        
	}

}
