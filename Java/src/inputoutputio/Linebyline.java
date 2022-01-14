package inputoutputio;

import java.io.BufferedReader;
import java.io.FileReader;

public class Linebyline {
	
public static void main(String[] args) throws Exception {
		
		
		
		FileReader f = new FileReader("F:\\java.txt");
		BufferedReader bw =new BufferedReader(f);
		
		String In = bw.readLine();
		while(In!=null) {
			System.out.println(In);
			In = bw.readLine();
		}
		f.close();
		bw.close();
		
		
		
	}

	

}



