package day26encapsulationdt;

public class E02 {

	//public E02() {
		
		//System.out.println(super.getClass());i try to get value but i cannot
	//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//E02 e02=new E02();
		
		E01 obj1 = new E01();
 		
//		E01 obj4 = new E01();
//		System.out.println(obj1.retired);
//		
		System.out.println(obj1.getName());//Suleyman Alptekin
		//System.out.println(obj1.getName());
		
		//Before updating salary
		System.out.println(obj1.getSalary());//80000
//		System.out.println(obj1.getSalary());
		
		//Updating salary
		obj1.setSalary(90000);
		//obj1.setSalary(9999999);
		
	//	obj1.setSalary(100000);
		
		//After updating salary
		System.out.println(obj1.getSalary());//90000
	


		
	}

}
