package officeHours;

public class Day1503CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Write a return method that accepts a sentence as parameter
		 Then converts it to Camelcase
		 (without any space or specialCharacter)
		 Input : I am writing code easily, it is great
		 Output : IAmWritingCodeEasilyItIsGreat
		 */	
		String input1 = "I am writing code easily";
			
		String input2 = "I am writing code easily, it is great";
		camelCase(input1);
		camelCase2(input2);	
	}
	private static void camelCase(String input1) {
		String camel= "";
		String words[]=input1.split(" ");
		for(int i=0;i<words.length;i++) {
		
			camel+=words[i].substring(0, 1).toUpperCase()+words[i].substring(1, words[i].length());			
		}		
		System.out.println(camel);
	}			
	private static void camelCase2(String input2) {
			String outcome= "";
			String words[]=input2.split(" ");
			
			for(int i=0;i<words.length;i++) {
				String word = words[i].replaceAll("[^a-zA-Z]", "");
				outcome+=word.substring(0, 1).toUpperCase()+word.substring(1, word.length());						
			}
			
			System.out.println(outcome);
	}
	
	
	
	
	

}
