package day03scannerincrement;

public class TypeCasting01 {
	
	public static void main(String[] args) {
		//byte < short < int < long < float < double	
		//Auto Widening: To convert small data type to large data type.
		//Convertin small to large is easy, because of that Java can do it
		//automatically
		byte num1 = 112;
		short num2 = num1;
		
		int a = 2;
		double b = a;
		
		int c = (int)b;
		
		int num3 = 2345;
		double num4 = num3;
		
		//byte < short < int < long < float < double
		//Explicit Narrowing:If you convert large data type to small
		//you have to type the name of the small data type before the 
		//variable name.
		long num5 = 657;
		short num6 = (short)num5;
		
		double num7 = 12.56;
		double num = 5/2f;
		float num8 = (float)num7;
		
		//Example
		short num9 = 520;
		byte num10 =  (byte) num9;
		
		System.out.println(num8);
		
	}
}