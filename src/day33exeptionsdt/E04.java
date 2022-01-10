package day33exeptionsdt;

public class E04 {

	public static void main(String[] args) {
		
		try {
			Object obj = new Integer(80);  //INTEGER must have parameter
			//data type can be parant and itself
			//we use Object otherswise cte
			String s = (String)obj;//Explicit narrowing
		}catch(ClassCastException e){
			System.out.println(e);
		//java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
//try {
//	
//
//			Object obj = new Integer(80);
//			String s = (String)obj;
//}catch(ClassCastException e) {
//	System.out.println(e);
//}

}
}
/*
 * Checked (Compile Time Exception): You have to handle
 1) FileNotFoundException ==> Path + Existence of the file
 2) IOException ==> read + write + close files/input-output
 
 Unchecked (Run Time Exceptions)
 3) ArithmeticException ==> Math rules for example dividing by 0
 4) NullPointerException ==> length() for null 
 5) ArrayIndexOutOfBoundsException ==> Using non-existing index for arrays
 6) IllegalArgumentException ==> for logical errors for example negatice numbers for age
 7) ClassCastException ==> If you try to cast Object class to String class 
 8) NumberFormatException ==> When you use parseInt() with a String which is not created by
                              digits

 */
}

