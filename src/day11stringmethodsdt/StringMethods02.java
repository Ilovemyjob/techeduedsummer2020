package day11stringmethodsdt;

public class StringMethods02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 13) trim() method will delete the space characters from the
				//        beginning and ending of the String
			
				String str = " Java  ";
				//Before trim()
				System.out.println(str);
				System.out.println(str.length());//7
				
				//After trim()
//				str=str.trim(); ==> thats possible
//				System.out.println(str);
				
				
				System.out.println(str.trim());
				
				System.out.println(str.trim().length());//4
				
				// 14)indexOf() method returns the index of 1st occurrence of the character
				String s = "Java is easy";
				
				System.out.println(s.indexOf('a'));//1
				System.out.println(s.indexOf("s"));//6
				//In indexOf() method you can use Strings and chars as parameters
				
				System.out.println(s.indexOf("is"));//It will return index of i ==> 5
				//If you look for index of multiple characters you will get
				//the index of first character
				
				System.out.println(s.indexOf('x'));
				//-1 because x is not exist in the String
				
				System.out.println(s.indexOf('a', 4));
				//After the 4th index(inclusive) what is the index of 
				//first occurrence of 'a' ==> 9
				
				s.indexOf("a", 3);
				//After the 3th index(inclusive) what is the index of 
				//first occurrence 'a' ==> 3
				
				// 15)lastIndexOf() method will return the index of last occurrence
				//                  of a character
				String t = "Learn java learn";
				System.out.println(t.lastIndexOf('a'));//13
				System.out.println(t.lastIndexOf("ar"));//13, it returned the first index
				
				System.out.println(t.lastIndexOf('z', 5));//1
			
//		String str = " Java  ";
//		System.out.println(str.trim());
//		System.out.println(str.trim().length());
//		String s = "Java is easy";
//		System.out.println(s.indexOf("v"));
//		System.out.println(s.indexOf("easy"));
//		System.out.println(s.indexOf('a', 7));
//		System.out.println(s.indexOf('v'));
//		System.out.println(s.indexOf('a', 7));
		System.out.println(t.lastIndexOf("a",5));
				
		
//		String str = " Java  ";
//		
//		System.out.println(str);
//		System.out.println(str.length());
//		
//		
//		
//		System.out.println(str.trim());
//		System.out.println(str.trim().length());
//		
//		String s = "Java is easy";
//		
//		System.out.println(s.indexOf('a'));
//		System.out.println(s.indexOf("s"));
//		
//		System.out.println(s.indexOf("is"));
//
//		System.out.println(s.indexOf('a', 4));
//		
//		System.out.println(s.indexOf("a", 3));
//		
//		
//		String t = "Learn java learn";
		
	
	
	
	
	
	}

}
