package reviewday5;

import java.util.Arrays;

public class PrintArrays1 {

	//  ! Create a static void method: acceptArray
	//  It should take one String array as parameter
	//  ! and print them as an array
	//  ! e.g String[] array = { "sam", "john", "tom" };
	//  ! acceptArray(array);
	//  ! Then output: [sam,john,tom]
	
	//  ! Create another static method :acceptArray2
	//  It should take one String array as parameter
	//  ! and print each element in the array
	//  ! e.g String[] array = { "sam", "john", "tom" };
	//  ! acceptArray2(array);
	//  ! Then output: sam john tom
	    public static void main(String[] args) {
	        String[] array= {"sam", "john", "tom"};
	        //Creating Object
	        PrintArrays1 obj=new PrintArrays1();    
	        obj.acceptArray(array);
	        //acceptArray(array);
	        
	        acceptArray2(array);
	    }

	    //I cannot call a non static method in static main method
	    //If I want to use non static method, I MUST CREATE AN OBJECT
	    public void acceptArray(String[] array ) {
	        System.out.println(Arrays.toString(array));
	    }
	    
	    public static void acceptArray2(String[] array) {
	        for(String each:array) {
	            System.out.print(each+" ");
	        }
	    
	    }
}