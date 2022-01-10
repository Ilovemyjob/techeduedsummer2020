package homework21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Create a String list whose elements are A, C, E, and F. Print it on the console.
	
	List<String> list = new ArrayList<String>();
	
	list.add("A");
	list.add("C");
	list.add("E");
	list.add("F");
	System.out.println(list);
	
//	By using add() with index method, add B into the 1st index.
//	List elements should be like A, B, C, E, and F. Print it on the console
	list.add(1, "B");
	System.out.println(list);
	
//	By using set() method, convert E to D.
	//List elements should be like A, B, C, D, and F. Print it on the console
	
	list.set(3, "D");
	System.out.println(list);
	
//	By using remove() method, remove F from the list.
//	List elements should be like A, B, C, D. Print it on the console
//	
	
	list.remove(4);
	System.out.println(list);
	
	//Find the size of the list and print the size on the console.
	
	System.out.println(list.size());
	
//	Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array.
//			For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
//	
	
	int arr1 [][]= { {1,2,3}, {4,5}, {6,7} };
	
	int arr2[] = new int[arr1.length];
	
	for(int i=0 ; i<arr1.length; i++) {
		
		int sum=0;
		for(int k=0; k<arr2.length;i++) {
			sum+= arr1[i][k];
		}
		System.out.println(sum + " ");
	}

	
	
	
	}

}
