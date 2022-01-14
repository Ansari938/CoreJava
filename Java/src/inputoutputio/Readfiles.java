package inputoutputio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;

public class Readfiles {
	public static void main(String[] args) throws Exception {
		
		// open a file 
		FileReader reader = new FileReader("F:\\java.txt");
		
		int ch = reader.read();
		char chr;
		 // chr is -1  if no more  is left in file 
		while (ch !=-1) {
			chr = (char) ch;
			System.out.println(chr);
			ch = reader.read();
			
			
			
		}
		
		
		
		
	}

}
