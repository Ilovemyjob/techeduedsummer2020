package reviewday5;

import java.util.Arrays;

public class Warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
111111 Clearte a package: day_05 Create a class: WarmUp
Declare 3 chars: ch1=‘S’, ch2=‘A’, ch3= ‘M’
Declare a String: name;
Store these chars in that string and print: ‘SAM’ using the name variable
222222Declare 3 Strings: name1=sam, name2=john, name3=tom Declare a String Array: array;
Store this strings in that array
And print: sam john tom
And then print [sam,john,tom]
Create the same array using different ways.
 */
	//1.question
	char ch1 ='S';
	char ch2 ='A';
	char ch3 ='M';
	String name = "";//initializing
	
	name+=""+ch1+ch2+ch3;//if we add"" add letter otherwise add value
	
	System.out.println(name);
	
	//2.question
	String name1 = "sam";
	String name2 = "john";
	String name3 = "tom";
	
	String array[] = {name1,name2,name3};// i can not add integer,boolean they must be same type
  // array combination int, string ,..vey useful instead of alot string just write one array
	
	
	System.out.print(name1+name2+name3);
	               //array[0],array[1],array[2]
    System.out.println(); 
    
	for(String each:array) {  //give me each string
	System.out.print(each + " ");
	}
	System.out.println();
	System.out.print(array[0]+" "+array[1]+" "+array[2]);

	System.out.println();
	
	
	System.out.print(Arrays.toString(array));// print as a array with braket
	//System.out.print(arr.toString());  error not print this way
	
	}

}
