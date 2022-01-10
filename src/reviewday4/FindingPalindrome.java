package reviewday4;

public class FindingPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a string variable
//		If the string is palindrome then print “Palindrome”
//		If the string is not palindrome then print “Not Palindrome” 1234321
//		abcba
//		"Able was I ere I saw Elba”
//		A string is palindrome if reversed is equal to the string
		
		
		String original="Able was I ere I saw Elba";
		//     lenght:25 LAST INDEX:24
		String reversed="";
		//FIRST FIND THE REVERSED
		for(int i=original.length()-1;i>=0;i--) {
			reversed+=original.charAt(i);
		}
		System.out.println(reversed);
		System.out.println(original);
		///CHECKING IF IT IS PALINDROME OR NOT
	
		if(original.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

	
	
	
}
