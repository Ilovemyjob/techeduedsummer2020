package reviewday8;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1. Create a Map :
	         * Map<String,Integer> salaryMap=new HashMap<> ();
	         * 2. add the job title and salary pairs:
	         * "doctor", 500000
	         * "nurse", 70000
	         * "developer", 110000
	         * "president", 200000
	         * "tester", 100000
	         * "lawyer", 150000
	         * "teacher", 50000
	         * 3. print the value of a doctor's salary only
	         * 4. replace the nurce's salary with 75000
	         * 5. replace the developer's salary with 120000 using put method
	         * 6. remove lawyer from the list
	         * 7. print true if there is a key called "judge". print false otherwise
	         * 8. print true if there is a value called 10000. print false otherwise
	         * 
	         */
		Map<String,Integer> salaryMap=new HashMap<>();
		salaryMap.put("doctor", 500000);
		salaryMap.put("nurse", 70000);
		salaryMap.put("developer", 110000);
		salaryMap.put("president", 200000);
		salaryMap.put("tester", 100000);
		salaryMap.put("lawyer", 150000);
		salaryMap.put("teacher", 50000);
		System.out.println(salaryMap);
		
		
		System.out.println(salaryMap.get("doctor"));
		salaryMap.replace("nurse", 75000);
		System.out.println(salaryMap);
		salaryMap.put("nurse", 90000);
		
		
		
		
		
		
		
	}

}
