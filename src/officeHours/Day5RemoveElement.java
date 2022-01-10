package officeHours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day5RemoveElement {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		write a Java program to removes a specific element from an array 
		//and put the remaining elements in a new array ant prints the new array  
//		Input : {1,2,3,4,5,6}  element:6
//		Output : [1,2,3,4,5]
	
	int input[]= {1,2,3,4,5,6};
	int remove=1;
	
	List<Integer> list=new ArrayList<>();
	for(int each:input) {
		
		if(each!=remove) {
			list.add(each);
		}
	}
	System.out.println(list);
	
	int newArray[]=new int[list.size()];
	for (int i = 0; i < newArray.length; i++) {
		newArray[i]=list.get(i);
	} 
		System.out.println(Arrays.toString(newArray));
	
		
		Integer newArray1[]=list.toArray(new Integer[0]);
		System.out.println(Arrays.toString(newArray1));
	}

}
