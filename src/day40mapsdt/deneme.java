package day40mapsdt;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class deneme {

	//Hashtable
	
	public static void main(String[] args) {
		Map<String,String> ht= new Hashtable<>();
		
		ht.put("a", "A");
		ht.put("b", "B");
		System.out.println(ht);
	//	ht.clear();
		System.out.println(ht);
		
		System.out.println(ht.get(1));
		System.out.println(ht.get("A"));
		
		Map<String,String> ht2= new Hashtable<>();
		
		ht2.put("c", "C");
		ht2.put("d", "D");
		
		//ht.putAll(ht2);
		System.out.println(ht);
        System.out.println(ht.keySet());	
        
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "A");
        hm.put(2, "B");
        System.out.println(hm);
        
        System.out.println(hm.containsKey(1));
        System.out.println(hm.equals(ht));
        hm.putIfAbsent(3, "abc");
        System.out.println(hm);
        hm.replace(1, "z");
        System.out.println(hm);
        hm.replace(1, "z", "a");
        System.out.println(hm);
        
        
        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);
        		
        Set<String> ts = new TreeSet<>();
        ts.add("a");
        ts.add("b");
        System.out.println(ts);
        
        LocalTime lt2 = LocalTime.now();
        System.out.println(lt2);
        
        Queue<String> qe = new LinkedList<>();
        
        qe.add("A");
        qe.add("B");
        System.out.println(qe);
   //     qe.remove();
        System.out.println(qe);
        
        System.out.println(qe.element());
        System.out.println(qe);
        System.out.println(qe.peek());
        System.out.println(qe);
        System.out.println(qe.poll());
        System.out.println(qe);
        
        Queue<String> qe2 = new PriorityQueue<>();
        
        Set<String> lhs= new LinkedHashSet<>();
        LocalTime lt3 = LocalTime.now();
        
        String pickname = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       char ch1= pickname.charAt(9);
       char ch2 = pickname.charAt(0);
       char ch3 = pickname.charAt(21);
       char ch4 = ch2;

       System.out.println("" +ch1 + ch2 + ch3 + ch4);
       
//        Scanner input=  new Scanner(System.in);
//        System.out.println("job");
//        String jobTitle= input.nextLine();
//        
//        if(jobTitle.toLowerCase().equals("qa")){
//        	System.out.println("sjfklsajfkl");
//        }else if(jobTitle.equalsIgnoreCase("ba")) {
//        	
//        }else if() {
//        	
//        }else if() {
//        	
//        }else {
//        	
//        }
//        
      //  int i = 2;
//        System.out.println(i);
//        System.out.println(i++);
//        System.out.println(i);
//        System.out.println(++i);
        
        
        int j = 1;
        
        for(int i=1;i<=10;i++) {
        	System.out.println("1 x "+ i + " = " + i*1);
        	
        }
        
        
        
        
        
        
        
        

		
	}
	
		
}
