package day24varargsaccessmodifiersstringbuilderdt;

public class deneme {
	
	
public static void main(String[] args) {
StringBuilder b = new StringBuilder();
b.append("A");
System.out.println(b);
b.append("A");
System.out.println(b);
StringBuilder b1 = new StringBuilder("java"+9);
System.out.println(b1);


System.out.println(b1.substring(2));

b1.append("a").append("a");
b1.insert(0, 1);
b1.delete(0, 1);
b1.deleteCharAt(0);
b1.reverse();
System.out.println(b1.length());
System.out.println(b1.capacity());



System.out.println(b1);


}
}
