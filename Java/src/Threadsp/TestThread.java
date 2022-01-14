package Threadsp;

public class TestThread {
	public static void main(String[] args) {
		
		HelloWithoutThread t1 = new HelloWithoutThread("ram");
		HelloWithoutThread t2 = new HelloWithoutThread("shyam");
		
	     
		
		t1.run();
	  t2.run();
		
		
	}
	
	
	
	

}
