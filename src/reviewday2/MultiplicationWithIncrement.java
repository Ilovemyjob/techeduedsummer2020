package reviewday2;

public class MultiplicationWithIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Create a class : “MultiplicationWithIncrement”
//		Ask user to enter 2 integer: num1 and num2
//		Then assign two values : num1=1, num2=1
//		Then print the multiplication table using ‘increment’ 
//		Note: when you use ++ increment sign then it inreases by 1
//		Print The Following multiplication table:
//		========= 
//		1 X 1 = 1 
//		1 X 2 = 2 
//		1 X 3 = 3 
//		1 X 4 = 4 
//		1 X 5 = 5 
//		1 X 6 = 6 
//		1 X 7 = 7 
//		1 X 8 = 8 
//		1 X 9 = 9 
//		1 X 10 =10
//		=========
		
		
		int num1=1;
		int num2=1;
		
		System.out.println(1+"x"+1+"="+1);
		System.out.println(1+"x"+2+"="+2);
		System.out.println(1+"x"+3+"="+3);
		System.out.println(1+"x"+4+"="+4);
		System.out.println(1+"x"+5+"="+5);
		System.out.println(1+"x"+6+"="+6);
		System.out.println(1+"x"+7+"="+7);
		System.out.println(1+"x"+8+"="+8);
		System.out.println(1+"x"+9+"="+9);
		System.out.println(1+"x"+10+"="+10);
		
		
		
		
		
	System.out.println(num1+" x "+(num2)+" = "+(num2++));
	System.out.println(num1+" x "+(num2)+" = "+(num2++));
	System.out.println(num1+" x "+(num2)+" = "+(num2++));
	System.out.println(num1+" x "+(num2)+" = "+(num2++));
	System.out.println(num1+" x "+(num2)+" = "+(num2++));
	System.out.println(num1+" x "+(num2)+" = "+(num2++));
	System.out.println(num1+" x "+(num2)+" = "+(num2++));
	System.out.println(num1+" x "+(num2)+" = "+(num2++));
	System.out.println(num1+" x "+(num2)+" = "+(num2++));
	System.out.println(num1+" x "+(num2)+" = "+(num2++));


	
		System.out.println(num2);//1
		System.out.println(num2++);// 1  post increment :first print, then increase by 1
		System.out.println(num2++);//2
		System.out.println(num2++);//3
		System.out.println(++num2);//pre increment first increase , then print
		
		
		
	}

}
