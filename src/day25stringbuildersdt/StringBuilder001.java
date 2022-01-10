package day25stringbuildersdt;

public class StringBuilder001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		System.out.println(join(str));//javax
		System.out.println(str);//java
		
		str=join(str);// changing pointer asingment original not change
		System.out.println(str); // javax 
	
	
		StringBuilder sb1 =new StringBuilder("duke");
		String str1 = sb1.toString();
		String str2 = new String(str1);
		
		System.out.println(str1==str2); 
	System.out.println(str2);
	}

	public static String join (String str) {
		return str + "X";
	}
	// javax 


}
