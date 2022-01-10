package homework16;

public class Order {

	int a;
	int b;
	
	Order (int a,int b){
		this.a=a;
		this.b=b;
		
	}
	Order(){
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order or = new Order (3,5);// like int a = 5;(assign operation)
		or = new Order();          //   (new value)       a =3; bir kere kullanirsan baska kulanmaya gerek yok)
		System.out.println(or.a+or.b);
		
		
	}

}
