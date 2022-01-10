package day33exeptionsdt;

public class E01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {		
			divide(12, 0);			
		}catch(ArithmeticException a) {		
		
			// System.out.println(a); ==> That prints the name of the exception and the 
			  //                          reason of the exception
 
		//	 e.printStackTrace(); ==> That prints the name of the exception and the 
			                       //   reason of the exception and all traces of the exception		  
						
		}
			//		try {
//			add1();
//		}catch(RuntimeException b) {
//			System.out.println(b.getMessage());
//		}
//		}catch(RuntimeException e) {
//			System.out.println();
//		}
		
		try {
			add();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
			}
				
			
		
	}	
	public static void divide(int x, int y) {	
		System.out.println(x/y);	
		
	}
	
	public static void add() {
		throw new RuntimeException("I created that exception");
		// exeption throw-atiyor sonra o exeptiona gidiyor ve icinde yazilani cikatriyor
	}
//	public static void add1() {
//		throw new RuntimeException("i create");
//	}

}
