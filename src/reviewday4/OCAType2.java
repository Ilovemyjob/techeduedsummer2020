package reviewday4;

public class OCAType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// concat =add
		String str = "M ";   //M 
		str = str.concat("E ");//M E  
		String add = "S ";   //M E
		str = str.concat(add); //M E S 
		str.replace("S", "T"); //PAY ATTENTION. we replace S and T but do not assign to str
		//So there will not be any change on str. STILL M E S 
		str = str.replace("S", "T");// M E T
		str = str.concat(add); // M E T S
		System.out.println(str);// str=M E T S
	}

}
