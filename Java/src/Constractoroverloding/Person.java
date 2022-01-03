package Constractoroverloding;

public class Person {
private String Firstname;
private String Lastname;
private String address;
    
public Person() {
	System.out.println("defulat Constractor");
}
	
	
public Person(String fn,String ln) {
	
	Firstname=fn;
	Lastname =ln;
	System.out.println("2 perameter Constractor");
}
	
	public Person (String fn, String ln,String ad) {
		this(fn, ln);
		address=ad;
		System.out.println(ad);
	
	}
	
	public static void main(String[]args) {
		Person P = new Person("kapil", "malviya","indore");
		
		
	}


	 
	 
	 
 }



