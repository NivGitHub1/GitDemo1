package GitDemo1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWorld1 {

	public static void main(String[] args) throws IOException {
		String h = "Hello";
		String w = "World";
		int i = 1;
		
		System.out.println("Output: "+h+w+i);
		System.out.println("First Line..");
		System.out.println("Second Line..");
		System.out.println("Third Line..");
		System.out.println("-----------------");
		System.out.println("-----------------");
		System.out.println("-----------------1");
		System.out.println("-----------------2");
		System.out.println("First change after clone");

		System.out.println("Total: 3 lines of code plus lot of blank lines.");
		System.out.println("More TO DO...");
		System.out.println(".");

		System.out.println("=============");
		System.out.println("... for loop ...");
		
		for (int j = 0; i<10; i++){
			System.out.println("Line no. "+i);
			
		}
		System.out.println("Last line - END!");
			
	}

}
