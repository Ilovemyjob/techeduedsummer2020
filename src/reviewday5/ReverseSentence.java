package reviewday5;

public class ReverseSentence {

	
		// TODO Auto-generated method stub
//		!Create a method: reverseString
//		!It should accept a string sentences
//		! And return the reverse of that string sentences.
//		! E.g:
//		!String str ="I love Java"; !Output:"Java love I”
		 public static void main(String[] args) {
		        String str = "I love Java";
		        String reversedString=reverseString(str);
		        System.out.println(reversedString);
		    }
		    // return = result, return type = result type
		    // A moethod can be VOID or have a RETURN TYPE(String, int, byte, char)
		    // If a method has a return type, Then that method MUST have return keyword at
		    // the end!
		    public static String reverseString(String sentence) {
		        String reversed = "";
		        // split
		        String[] splitted = sentence.split(" ");// [I, love, Java]
		        // splitted[0] splitted[1] splitted[length-1]
		        for (int i = splitted.length - 1; i >= 0; i--) {
		            reversed += splitted[i] + " ";
		        }
		        
		        //We can use split method to put each word as an Array
		    
		        return reversed;// I always have to have return because this method is not void

		
		
	}
	
	
	
	
	
	
}
