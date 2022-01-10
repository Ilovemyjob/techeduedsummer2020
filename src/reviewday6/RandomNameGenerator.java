package reviewday6;

import java.util.ArrayList;
import java.util.List;

public class RandomNameGenerator {
    public static void main(String[] args) {

	
		// TODO Auto-generated method stub
		/* Create a class : RandomNameGenerator
	     * Step1: Ask user to enter his/her name //john walker
	     * Step2: Delete the spaces in the username//johnwalker
	     * Step3: Check if the username is already taken//list("sam","johnmary","johnwalker","johnwalker523463146")
	     * Step4: If there the username is not taken, then print: This username is available
	     * Step5: If the username is already taken, then print This username is already taken
	     * Step6: Then generate a random number, add to the name, and Print the new username 
	     */
		
	   List<String> userList=new ArrayList<>();
       userList.add("johnwalker");
       userList.add("johnmarry");
       userList.add("samwalton");
       userList.add("juliebrown");
       
       String myName ="ahmetbayram";
       for(String name:userList) {
    	   if(name.equalsIgnoreCase(myName)) {
    		   System.out.println("already taken");
    		   break;
    	   }else {
    		   System.out.println("available");
    		   break;
    	   }
      
       }
		
		
		
	}

}
