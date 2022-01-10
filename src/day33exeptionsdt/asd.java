package day33exeptionsdt;

public class asd {


 
    public static void main(String[] args) {
        //while loop
        int i = 1;
        while (i <= 9) {
            if (i == 3) {
                // break statement
                i++;
                break;//it will break the loop
            }
            System.out.println(i);
            i++;
        }
        de(4, 3);
    }

	private static void de(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+j);
	}
	private static void de(Integer i, Integer j) {
		// TODO Auto-generated method stub
		System.out.println(i-j);

	}

    	

}
