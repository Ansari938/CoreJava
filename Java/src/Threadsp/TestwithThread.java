package Threadsp;

public class TestwithThread {
	public static void main(String[] args) {

		HelloWithoutThread t1 = new HelloWithoutThread("ram");
		HelloWithoutThread t2 = new HelloWithoutThread("shyam");

		t1.start();
		t2.start();

	}
}
