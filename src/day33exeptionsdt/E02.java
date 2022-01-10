package day33exeptionsdt;

public class E02 {
	/*
	 Create a getAge() method
	 For negative ages throw exception
	*/

	public static void main(String[] args) {
//		try {
//			getAge1(-12);
//		}catch(IllegalArgumentException b) {
//			System.out.println(b.getMessage());
//		}
		try {			
			getAge(-12);			
		}catch(IllegalArgumentException e) {			
			System.out.println(e.getMessage());			
		}
	}	
//	public static void getAge1(int age) {
//		if(age<0) {
//			throw new IllegalArgumentException("dont use negative");
//			
//		}else {
//			System.out.println(age);
//		}
	//}	
		
		public static void getAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException("Do not use negative values for age");
		}else {
			System.out.println(age);
		}
		

	}
}
