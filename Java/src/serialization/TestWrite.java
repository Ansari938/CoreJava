package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestWrite {
	
	

	
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("f:/object.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);

		SerialEmpl emp = new SerialEmpl(10, "delhi", "madhya pradesh");
		

		out.writeObject(emp);

		out.close();
		
		
		
	}
}