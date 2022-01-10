package day42lambdadt;

import java.util.ArrayList;
import java.util.List;

public class deneme {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		list.stream()
			.filter(t->t%3==0)
			.map(t-> t*t)
			.forEach(t->System.out.print(t));
		System.out.println();
		
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Mark");
		list1.add("Jackson");
		list1.add("Amanda");
		list1.add("Chris");
		list1.add("Tucker");
		System.out.println(list1);
		int result=list1.stream()
		    .map(t->t.length())
			.reduce(Integer.MIN_VALUE, (t,u)->t>u?t:u);
			System.out.println(result);
		
		
		
		
		System.out.println();
		
		
		
				
				
		
	}
	
	
	
	
}
