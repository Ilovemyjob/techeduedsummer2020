package reviewday3;

public class StringManipulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create a string : name and assign a 3 word sentences
		//if name is one or two words print “enter 3 words sentences”
		//otherwise reverse the order of the words
		//e.g: I love java ==> java love I
		
		String name = "I love Java";
		int first= name.indexOf(" ");
		System.out.println(first);
	//	int first = name.indexOf(" ");
		
		int second =name.indexOf(" ", first+1);
		System.out.println(second);
		int last = name.lastIndexOf(" ");
		//System.out.println(last); ===> alttakiyle ayni
	//	int second= name.indexOf(" ", first+1);<====
		
		if(first != -1&& second != -1) {
			System.out.println(name.substring(second+1) +" "+ name.substring(first+1, second) +" "+ name.substring(0, first));
		}else {
			System.out.println("enter 3 words sentences");
		}
		
				
				
		
		
		
	}

}
