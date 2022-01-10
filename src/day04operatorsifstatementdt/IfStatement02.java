package day04operatorsifstatementdt;

public class IfStatement02 {

public static void main(String[] args) {
	/*
	 Type code if-else statement
	 password is "JavaLearner" output "The password is true"
	 otherweise, output "The password is false"
	 */
	
		
		String password= "JavaLearner";
		
		if(password.equals("JavaLearner")) {
			System.out.println("The password is true");
//			if(password.equals("JavaLearner")) {
//				
//			}
		}
			
		//	if(password!="JavaLearner") {
		     if(!(password.equals("JavaLearner"))) {
				System.out.println("The password is false");
				
		}
	}
}	
	
 