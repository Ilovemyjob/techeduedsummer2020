package reviewday5;

import java.util.Arrays;

public class PrintArrays2 {


		// TODO Auto-generated method stub

///  ! Create a static method name: acceptString
	//  It should accept 3 strings as parameter
	//  ! and print them as an array
	//  ! e.g. String[] array = { "sam", "john", "tom" };
	//  ! acceptString(“sam”,”john”,”tom”);
	//  ! Then output: [sam,john,tom]
	
	//  ! Create another static method name: acceptString2
	//  It should take accept 3 strings as parameter
	//  ! and print each element in the array
	//  ! e.g. String[] array = { "sam", "john", "tom" };
	//  ! acceptString(“sam”,”john”,”tom”);
	//  ! Then output: sam john tom
	    public static void main(String[] args) {
	        String name1 = "sam";
	        String name2 = "john";
	        String name3 = "tom";
	        acceptString(name1, name2, name3);
	//        acceptString("sam", "john", "tom"); 2.way
	        
	       acceptString2(name1,name2,name3);
	    }
	    public static void acceptString(String str1, String str2, String str3) {
	        // Storing multiple strings into the array
	        String[] array = { str1, str2, str3 };
	        System.out.println(Arrays.toString(array));
	    }
	    
	    public static void acceptString2(String name1, String name2, String name3) {
//	      String[] names=new String[3];
//	      names[0]=name1;
//	      names[1]=name2;
//	      names[2]=name3;
	        String[] names = { name1, name2, name3 };
	        for(String each:names) {
	            System.out.print(each+" ");
	        }
	        
	        

		
	}
	
	
	
	}
