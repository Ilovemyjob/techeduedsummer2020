package homework18;

public class MyConstructor {

	int x= 5;
	
	MyConstructor(){
		System.out.println("-x" + x);
	}
		MyConstructor(int x){
			this();
		
			System.out.println("-x" + x);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyConstructor mc1 = new MyConstructor(4);
		MyConstructor mc2 = new MyConstructor();

		
		
	}

}
