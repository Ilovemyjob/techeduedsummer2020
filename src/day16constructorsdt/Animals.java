package day16constructorsdt;

public class Animals {

	
	int height = 50;
	String name = "Rabbit";
	boolean mammal = true;
	
    Animals () {
		
	}
    Animals(int height) {
	this.height = height;
 }
//	Animals(){
//		
//	}
//	Animals(int height, String name){
//		this.height=height;
//		this.name;
	//}
//	Animals (){
//		
//	}
//	Animals (int height){
//		this.height = height;
//	}
    public static void main(String[] args) {
		/*
		 Create 2 constructors one is with parameters, the other one is without parameter.
		 By using that constructors create at least 2 objects then print their features
		 on the console.
		 */
		
    	
    	Animals an5= new Animals();
    	an5.height = 70;
    	System.out.println(an5.height);
    	System.out.println(an5.mammal);
    	System.out.println(an5.name);
    	
    	System.out.println("=========");
    	Animals an= new Animals();
    	System.out.println(an.height);
    	
    	Animals an6= new Animals(100);
    	System.out.println(an6.height);
    	System.out.println(an6.mammal);
    	System.out.println(an6.name);
    	
    	System.out.println("=======");
    //	Animals an7 = new Animals(40,false);  it must same data type
    	
    	
    	System.out.println("============");
    	Animals an1 =new Animals();
    	System.out.println(an1.height);
    	System.out.println(an1.mammal);
    	System.out.println(an1.name);
    	System.out.println("===================");
    	Animals an2 = new Animals(60);
    	an2.mammal=false;
    	System.out.println(an2.height);
    	System.out.println(an2.mammal);
    	System.out.println(an2.name);
    	
    	
    	
    	
    	
    	
    	
//		Animals an1 = new Animals();
//		System.out.println(an1.height);//50
//		System.out.println(an1.mammal);//true
//		System.out.println(an1.name);//Rabbit
//		
//		System.out.println("=================");
//		
//		Animals an2 = new Animals(60);
//		System.out.println(an2.height);//60
//		System.out.println(an2.mammal);//true
//		System.out.println(an2.name);//Rabbit

		
		
		
	}

}
