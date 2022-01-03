package oops;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testperson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat s=new SimpleDateFormat("dd/mm/yyyy");
		
		Person pr = new Person();
		
			pr.setAddress("indore");
		    pr.setName("fahim");
			pr.setDob(s.parse("2/5/2000"));
	
			System.out.println(pr.getAddress());
			System.out.println(pr.getName());
			System.out.println(pr.getDob());
			
			
}
}
