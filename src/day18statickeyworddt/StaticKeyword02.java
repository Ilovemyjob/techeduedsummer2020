 package day18statickeyworddt;

public class StaticKeyword02 {

	public static void main(String[] args) {
		// i = 12 ==> static     and      k = 13 ==> non-static
		//        System.out.println(StaticKeyword01.i);//12
		          System.out.println(StaticKeyword01.i);		
		int[] a = {1,2,3};
		int[] b = {1,2,3,4,5};
		b=a;
		System.out.println(b.length);
		for(int x:a) {
			System.out.println(x);

		}
		
		
				//StaticKeyword01 obj1 = new StaticKeyword01();
		          
		          StaticKeyword01 obj1= new StaticKeyword01();
		          System.out.println(obj1.k);
		          System.out.println(obj1.i);
				
//				System.out.println(obj1.k);//13
//				System.out.println(obj1.i);//12
		          
				//As you see to access variablce i(static), we did not create any object we used just the 
				//class name, but to access variable k()non-static we created on object otherwise 
				//Java did not show us variable k
				
				//You can access to a static variable by using class name(recommended),
				//You can access to a static variable by using object as well but it is not recommended
				
				//Static variables are common variables for every object because of that if you make
				//any update on a static variable all objects will see the update
	}
				
	

}
