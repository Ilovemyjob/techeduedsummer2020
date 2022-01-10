package day43lambdadt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class deneme {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
//		list.add(7);
//		list.add(5);
//		list.add(1);
//		list.add(4);
//		list.add(3);
//		
//		Collections.sort(list);
//		
//		System.out.println(list.stream()
//			.filter(t->list.lastIndexOf(t)>1)
//			.map(t->t*t)
//			.reduce(0, (t,u)->t+u));
		
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Ali");
		list.add("Mark");
		
		list.stream()
			
			.filter(t->t.length()<7)
			.map(t->t.toUpperCase())
			.collect(Collectors.toSet())
			
			.forEach(t->System.out.print(t+" "));
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
