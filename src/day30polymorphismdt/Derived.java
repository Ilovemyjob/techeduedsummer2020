

package day30polymorphismdt;

public class Derived {
	
	//String Derived;
	public void getDetails(String temp) { // eger private yaparsak java can not see and nor c.t.e. enteresan
		System.out.println("Deruv class" + temp);
	}


	class Test extends Derived{
		
		// dont writepublilc more one in class name
//		public int getDetails(String temp) { 
		// if we chance signatue java think different class 
		//this is overriding prb
		//in overriding data type must be same
//		
		//System.out.println("Test class" + temp);
//		return 0;
	//	}
	
	}
	
//	    public static void main(String[] args) {
//	        
//	        Test obj = new Test();
//	        obj.getDetails("GFG");
//	        
//	    }




}
