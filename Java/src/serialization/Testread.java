package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Testread {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("f:/object.ser");
		ObjectInputStream in = new ObjectInputStream(file);
		SerialEmpl e = (SerialEmpl)in.readObject();
		//SerialEmpl e = new SerialEmpl(10, "ssss", "ppp");
		
		
		System.out.println("id:" + e.getId());
		System.out.println("f" + e.getFirstname());
		System.out.println("l" + e.getLastname());
		
		//in.readObject();
		in.close();
		
		
		
		
		
		
		
		
		
	}

	private static String lastname() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getfirstname() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
