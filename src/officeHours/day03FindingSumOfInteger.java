package officeHours;

public class day03FindingSumOfInteger {

    public static void main(String[] args) {

    	 /*
         * write a method which accepts a String as parameter 
         * and prints the sum of the digits, present in the given string 
         * Eg: input : ade1r4d3 output : 8 
         * Hint :
         * Use Character.isDigit() -first character digit or not
         *     Integer.valueOf()
         */

    	String input = "ade1r4d3";
    	sum(input);
    	
    }	
    //	1-create method
          public static void sum (String input) {
    //find sum of digit
        	  int sum = 0;
        	  for(int i=0;i<input.length();i++) {
        	       if(Character.isDigit(input.charAt(i))) {  // true or false
        	    	   sum+=  Integer.valueOf(""+input.charAt(i));    //   input.charAt(index); it is askii value not use
        	       }                                                 //"" basa eklemeyle sayilari topladi
        	       }
        	
        	  System.out.println(sum);
    	}
    	
    	
    	
    	
    	
    	
//	String input = "ade1r4d3";
//	sum(input);
//    }
//	
//    public static void sum(String input) {
//    	int sum = 0;
//    	for(int i=0;i<input.length();i++) {
//    		if(Character.isDigit(input.charAt(i))) {
//    			sum+=Integer.valueOf(""+input.charAt(i));
//    			
//    		}
//    	}
//    	
//    	System.out.println(sum);
   
    	
    	
    	
    	
    	
    	
    	
    	
    	
//    	String input= "1234";
//        sumOfDigit(input);
//        
//    }
//        //  1) Create method
//    public static void sumOfDigit (String input) {
//        
//    //  2) find sum of digits
//        
//        int sum = 0;
//        for (int i = 0; i < input.length(); i++) {
//            
//            if (Character.isDigit(input.charAt(i))) {
//                
//                sum+= Integer.valueOf(""+input.charAt(i));
//            }
//        }
//    //  3) print result
//        System.out.println("sum of digits : " + sum);
//        

    	
   
	
	
}
