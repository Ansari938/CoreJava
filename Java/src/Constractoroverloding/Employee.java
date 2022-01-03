package Constractoroverloding;

public class Employee extends Protected {
	
	protected String Designation;
	
	public Employee() {
		System.out.println("defualt constractor");
	}
	 
	public Employee (String fn, String ln,String ad , String Dn) {
		super(fn,ln,ad);
		Designation=Dn;
		System.out.println(Dn);
	
	
}
public static void main(String[] args) {
	Protected P=new Employee("first","last","address","Dawas");
	
}
}