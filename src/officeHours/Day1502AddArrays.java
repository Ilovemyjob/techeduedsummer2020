package officeHours;

import java.util.Arrays;

public class Day1502AddArrays {

	public static void main(String[] args) {
	
		/*
		 Write a return method that accepts 2 integer Arrays as parameters 
		 and adds 2 array into a new Array and prints it.
		 Input1={1,2,3,4}
		 Input2={5,6}
		 Output={1,2,3,4,5,6}
		 */
		 int input1[]={1,2,3,4};
		 int input2[]={5,6};
		 
		 addArrays(input1,input2);
		
	}
	private static void addArrays(int[] input1, int[] input2) {
		// TODO Auto-generated method stub
int newArray[]=Arrays.copyOf(input1, input1.length+input2.length);   //
		
		for (int i = 0; i < input2.length; i++) {
			newArray[input1.length+i]=input2[i];
		}
		System.out.println(Arrays.toString(newArray));
	}
	
	
	}
	

