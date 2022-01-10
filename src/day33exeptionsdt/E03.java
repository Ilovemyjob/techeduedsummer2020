package day33exeptionsdt;

public class E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long x = 1234;
		int y = (int)x;//Explicit narrowing
		
		try {			
		   String s = "John";
		   Integer z = Integer.parseInt(s);		   //pushing to change //parse=change
		}catch(NumberFormatException e) {			
			System.out.println("Strings cannot be parsed to integer");			
		}

//		try {
//			String s = "abc";
//			Integer z = Integer.parseInt(s);
//			
//		}catch(NumberFormatException a) {
//			System.out.println("no cast to string");
//		}
//		
//		
	}

}
