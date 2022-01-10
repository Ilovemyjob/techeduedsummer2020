package homework16;

public class Student1 {

	String name;
	int age;
	String phone;
	
	Student1(){
		
	}
	Student1(String name, int age, String phone){
		this.name=name;
		this.phone=phone;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s1=new Student1();
		Student1 s2 = new Student1("John",25,"6786897897");
		System.out.println(s2.name + ", "+ s2.age +", "+ s2.phone);
		
		
		
		
	}

}
