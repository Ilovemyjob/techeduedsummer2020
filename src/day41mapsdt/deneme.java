package day41mapsdt;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class deneme {

	public static void main(String[] args) throws IOException {
//		Map<Integer,String> tm = new TreeMap<>();
//		tm.put(1, "A");
//		tm.put(2, "b");
//		tm.put(3, "c");
//		System.out.println(tm);
//		
//		tm.computeIfAbsent(4, k->"Pretty");
//		System.out.println(tm);
//		Map<String, Integer> count = new HashMap<>();
//	
//		List<String> lines =Files.readAllLines(Paths.get("src/day41mapsdt/TextFile"), StandardCharsets.UTF_8);
//		
//		for(String w:lines) {
//			
//			String words[] =w.split(" ");
//			
//			for(String m : words) {
//				
//				if(m.endsWith(",")|| m.endsWith(".")) {
//					m=m.substring(0, m.length()-1);
//				}
//				if(!count.containsKey(m)) {
//					count.put(m, 1);
//				}else {
//				count.put(m, count.get(m)+1);
//				
//				
//				
//			}
			
			
			
			
			
			
		
		
		
		
		
	
	//System.out.println(count);
	
	List<String> codes = new ArrayList<>();
	codes.add("rgb(255,160,122)");
	codes.add("rgb(250,128,114)");
	codes.add("rgb(233,150,122)");
	codes.add("rgb(240,128,128)");
	codes.add("rgb(205,92,92)");
	codes.add("rgb(220,20,60)");
	codes.add("rgb(178,34,34)");
	
	
	List<String> colors = new ArrayList<>();
	colors.add("lightsalmon");
	colors.add("salmon");
	colors.add("darksalmon");
	colors.add("lightcoral");
	colors.add("indianred");
	colors.add("crimson");
	colors.add("firebrick");
	
	Map<String,String> colorscodes = new TreeMap<>();
	colorscodes.put(colors.get(0), codes.get(0));
	
	for(int i=0;i<colors.size();i++) {
		colorscodes.put(colors.get(i), codes.get(i));
		
	}
	
	System.out.print(colorscodes);
	
	System.out.println();
	Map<String,Object>obj = new HashMap<>();
	obj.put("A",1);
	obj.put("B", new Integer(2));
	obj.put("C", new Integer(3));
	System.out.println(obj.values());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
}