package serialization;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class keyboard {
	public static void main(String[] args) throws IOException {
		
		FileReader r = new FileReader("f:/java.txt");
		
		Scanner sc = new Scanner(r);
		
		while (sc.hasNext()) {
			String s = (String) sc.next();
			System.out.println(s);
			
		}
		
		
		
		
	}

}
