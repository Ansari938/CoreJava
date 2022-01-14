package Threadsp;

import basic.ForLoop;
import basic.forloopjava;

public class HelloWithoutThread {

	private String name = null;

	public HelloWithoutThread(String n) {
        name = n;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			
		System.out.println(i+ "   " + name);

	}

}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}