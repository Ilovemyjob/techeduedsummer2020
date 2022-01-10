package day31exceptionsdt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

	
		// TODO Auto-generated method stub
		
		/*
		 1)FileNotFoundException is used for "path problems" or "file existence problems" ok
		 
		 2)IOException is used for every kind of problems about Input and Output like reading a file, ok
		   writing a file, closing a file, path problems, file existence problems...
		
		 3)IOException class is the parent class of FileNotFoundException class. ok
		 
		 4)If you need to throw more than 1 exceptions after "throws" keyword type the names of the
		   exception classes  with a comma between them 
		   like ==> throws IOException, ArithmeticException, IllegalArgumentException ok
		   
		 5)FileNotFoundException and IOException are "Checked Exceptions"(Compile Time Exceptions)  ok
		 6)If you have  "Checked Exceptions Error" you have to fix(handle) it.    we are making thats why write handle ok
		 */
	public static void main(String[] args) throws IOException  {

				FileInputStream fis = new FileInputStream("src/day31exceptionsdt/TextFile");

				int i = 0;
				while ((i = fis.read()) != -1) {// inside read i++
					System.out.print((char) i);
				}
				fis.close();

		
		}
		
	}


