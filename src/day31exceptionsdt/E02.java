package day31exceptionsdt;

public class E02 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		/*
		 1)If when you type code,you do not get any red underline, but after running you get
		   red messages on the console, it means you are getting "Run Time Exceptions" ok
		   
		 2)ArithmeticException is an example of  "Run Time Exceptions", If you do something wrong
		   according to math rules, Java throws ArithmeticException ok
		   
		 3)If Java finds a problem, stops execution(does not run the next lines) and throws exception. ok
		
		 4)For Compile Time Exceptions you have to handle exceptions but for Run Time Exceptions no need to 
		 handle. Java will throw exception even you did not handle, it is optional. -java show the prb and excepton  ok
		 */	
			
			int x = 12;
			int y = 0;
			
			System.out.println(x / y);

	}

}
