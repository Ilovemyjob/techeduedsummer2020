package day37iteratorscollectionsdt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list= new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		
		
		for(int w :list) {
			w=w+5;
			System.out.print(w + " ");
			
		}
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			Object el = it.next();
			it.remove();
			

		}
		System.out.println();
		
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(31);
		list1.add(32);
		list1.add(33);
		System.out.println(list1);
		
		ListIterator<Integer> lit = list1.listIterator();
		while(lit.hasNext())	{
			Integer el = lit.next();
			lit.set(el+5);
		}
		System.out.println(list1);
		
		
		
		List<String> list2 = new ArrayList<>();
		list2.add("Automation");
		list2.add("Testing");
		list2.add("Database");
		list2.add("Restful");
		System.out.println(list2);
		
		
		ListIterator<String>  lit2 = list2.listIterator();
		
		while(lit2.hasNext()) {
			String el2 = lit2.next();
			lit2.set(el2.replace(el2.substring(el2.length()-3), "***"));
			
			
			
			
		}
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
