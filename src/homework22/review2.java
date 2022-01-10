package homework22;

import java.util.ArrayList;
import java.util.List;

public class review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Create a list find the sum of all elements by using for-each loop
//		and print the sum on the console
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
System.out.println(list);
		
       int sum = 0;
		for(Integer w : list) {
			sum = sum + w;
		}
		System.out.println(sum);
		
		
	}

}
