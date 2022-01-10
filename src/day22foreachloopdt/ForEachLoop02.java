package day22foreachloopdt;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(16);
		
//		//Find the average value of all elements by using for-each loop
//		//For example; Average Value for 2, 4, 6 is (2+4+6)/3
//		
//		//To be able to get the average value in decimal I have to use double data
//		//type otherwise Java will cancel the decimal parts and return integer value
		double sum = 0;		
		for(Integer w : list) {
			sum = sum + w;
		}
		System.out.println(sum/list.size());
		
		//Print all elements which are not starting with lower cases form the list 
		//by using for-each loop and continue
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Ab");
		list1.add("cd");
		list1.add("Ef");
		list1.add("gh");
		list1.add("Ij");
		ArrayList<String> list2 = new ArrayList<String>();

		for(String m:list1) {
			if(m.charAt(0)>='a' && m.charAt(0)<='z') {
				continue;
			}
			list2.add(m);
			System.out.println(list1);//[Ab, Ef, Ij]

		}
		System.out.println(list2);//[Ab, Ef, Ij]
		
		//Print just first 2 elements of list
		int count = 0; 
		for(int w : list) {
			System.out.print(w + " ");
			count++;
			if(count==2) {
				break;
			}
		}
		System.out.println();
		
	int count1 = 0;
	for(int w1 : list) {
		
		if(count>=2) {
			continue;
		}count++;
		System.out.print(w1 + " ");
	}
	
	
	
	
	}
	
	
	
}




