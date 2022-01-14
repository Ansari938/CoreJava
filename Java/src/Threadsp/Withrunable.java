package Threadsp;

public class Withrunable implements Runnable {

	private String name = null;

	public Withrunable(String n) {
		this.name = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " " + name);
		}
		

	}

	public static void main(String[] args) {

		Withrunable w = new Withrunable("FAHIM");
		Withrunable t = new Withrunable("kapil");
		Thread th = new Thread(w);
		Thread tt = new Thread(t);
		th.start();
		tt.start();

	}

}
