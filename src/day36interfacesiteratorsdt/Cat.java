package day36interfacesiteratorsdt;

public class Cat implements Animal,Mammal,Carnivorous{
/*
 * inside the parent interfaces,you can use same methods with same return type,
 * but you can not use same methods with different return types . Java complain
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("mother make everything");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat and sleep");
	}
		
	
	}


