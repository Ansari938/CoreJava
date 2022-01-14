package testtry;

public class Catchtry {
public static void main(String[] args) {
	
	
	
	try {
		  double s = 50/0;
		  System.out.println(s);
		
	} catch (ArithmeticException E) { 
		System.out.println("not divide by zero");
	}
	// finally use as a message print any type of msg pass
	finally { 
		System.out.println("this is finally");
		
		
		
	}
	
	
}
}
