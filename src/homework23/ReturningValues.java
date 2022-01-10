package homework23;

public class ReturningValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number = 1;
		String letters = "abc";
		number(number);
		letters= letters(letters);
		System.out.println(number+" "+ letters);
		
		
		
		
	}

	private static String letters(String letters1) {
		// TODO Auto-generated method stub
		
		return letters1.concat("d");
	}

	public static int number(int number) {
		number++;
		return number;
	
	
		
	
	}
	
	
	
}
