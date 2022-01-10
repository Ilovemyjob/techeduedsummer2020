package reviewday8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class deneme {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		Iterator<String> it = list.listIterator();
		
		while(it.hasNext()) {
			String str=it.next();
			if(str.contains("a") ||str.contains("i") ) {
				it.remove();
			}
			
		
		}
		System.out.println(list);	
		
		List<String> array = new ArrayList<>();
		array.add("john");
		array.add("sam");
		array.add("tom");
		array.add("matt");
		
		array.remove(2);
		array.set(0, "juan");
		System.out.println(array);
		
		
      	List<String> ll = new LinkedList<>();
		ll.add("zoe");
		ll.add("marry");
		ll.add("sue");
		ll.add("elon");
		
//		for(String w : ll) {
//			if(w.contains("n")) {
//				ll.remove(w);
//			}
//			
//		}
		for(int i=0; i<ll.size();i++) {
			if(ll.get(i).contains("n")) {
				ll.remove(i);
				
			}
		}
		Map<String,Integer> salaryMap = new HashMap<>();
		salaryMap.put("doctor", 500000);
		salaryMap.put("nurse", 70000);
		salaryMap.put("developer", 110000);
		salaryMap.put("president", 200000);
		salaryMap.put("tester", 100000);
		salaryMap.put("lawyer", 150000);
		salaryMap.put("teacher", 50000);
		salaryMap.replace("nurse", 75000);
		
		
		System.out.println(salaryMap);
		
		
		
		System.out.println(ll);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
