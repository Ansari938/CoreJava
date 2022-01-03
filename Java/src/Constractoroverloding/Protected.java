package Constractoroverloding;

public class Protected {

	protected String Firstname;
	protected String Lastname;
	protected String address;
	    
	public Protected () {
		System.out.println("defulat Constractor");
	}
		
		
	public Protected (String fn,String ln) {
		
		Firstname=fn;
		Lastname =ln;
		System.out.println("2 perameter Constractor");
	}
		
		public Protected (String fn, String ln,String ad) {
			this(fn, ln);
			address=ad;
			System.out.println(ad);
		
		}
		
	public static void main(String[] args) {
		Person P = new Person("kapil", "malviya","indore");
	}
			
			
			
		}


		 
		 
		 
	 





