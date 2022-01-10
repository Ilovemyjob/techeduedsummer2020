package officeHours;

public class day03CheckString {

	static boolean result=true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "abc";
		String checkString = "abckahdkjahsjh924923948";
				
	turn(input,checkString);
	System.out.println(result);
	}

	
	public static boolean turn(String input,String checkString) {
		
		for(int i=0;i<input.length();i++) {
			if(!checkString.contains(input.toLowerCase().subSequence(i, i+1))) {
				result=false;
			}
		}
		
		
		return result;
		
		
		
	}
}
