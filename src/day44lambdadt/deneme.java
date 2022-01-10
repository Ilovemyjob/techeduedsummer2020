package day44lambdadt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.stream.IntStream;
public class deneme {

	public static void main(String[] args) throws IOException {

List<String> list = new ArrayList<>();
list.add("Ali");
list.add("John");
list.add("Ali");
list.add("Alexander");
list.add("Taylor");
list.add("Ali");
list.add("Jackson");
list.stream().filter(t->!(t.startsWith("J"))).distinct().sorted(Comparator.comparing(t->t.length()))
.map(t->t.toUpperCase()).forEach(System.out::println);

Scanner scan = new Scanner(System.in);
System.out.println("Enter an integer to calculate its factorial");
int num=scan.nextInt();
int mul=IntStream.rangeClosed(1, num)
.reduce(1,(t,u)->t*u);
			
int mul1=IntStream.iterate(2, t->t+2)
.limit(7)
.reduce(1,(t,u)->t*u);

System.out.println(mul1);

Files.lines(Paths.get("src/day44lambdadt/TextFile"))
.map(t->t.split(" "))
.flatMap(Arrays::stream)
.map(t->t.replace(".", ""))
.map(t->t.replace(",", ""))
.map(t->t.replace(" ", ""))
		.map(t->t.replace(".", " "))	
		.filter(t->t.endsWith("a"))
.distinct()
.forEach(t->System.out.println(t));
	
	}
	}
