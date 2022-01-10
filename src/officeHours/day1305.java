package officeHours;

public class day1305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Write a java program to convert octal numbers to decimal
Ask to user to enter an octal number than write a return method that accepts given octal number as parameter
  *  if it is not an octal number prints "It is not an octal number"
  *  if it is an octal number prints the decimal value
Eg: Input 1238 Output : It is not an octal number
 Input 145 Output : Decimal value of given octal number is = 101
		 */
		
		 int octal= 345;
	        octalToDecimal(octal);
	    }
	    
	    public static void octalToDecimal(int octal) {
	        
	        int decimal=0;
	        int digitValue=1;
	        int replaceValue=1;
	        
	        while (octal>0) {
	            
	            digitValue=octal%10;
	            decimal=decimal+digitValue*replaceValue;
	            replaceValue*=8;
	            octal=octal/10;
	        } System.out.println(decimal);

		
	}

}
