package Threadsp;

public class WithTherad extends Thread {
	
	private String name = null;
	
	public WithTherad(String n) {
		name=n;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i+  "   " + name);
		}
	}
	
}


