package day35interfacedt;

public class  King extends Hotel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//king cannot be abstract bec. we need to create obj. whenn visiters came	
		
	//	tea is mandatory but we can not make abstract bec king class concreate.
	}

	@Override
	public void breakfast() {
      System.out.println("Breakfast for kings");		
	}

	@Override
	public void clean() {
		System.out.println("Clean the room for kings");	
	}
	
	public void tea() {
		System.out.println("Tea, twice in a day ");
	}


}
