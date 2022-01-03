package oops;

public class TextAutomobile {
	public static void main(String[] args) {
		Automobile a = new Automobile();
		
		a.setColour("blue");
		a.setMake("Tata");
		a.setSpeed(100);
		a.changeGear();
		System.out.println(a.getColour());
		System.out.println(a.getSpeed());
		System.out.println(a.getMake());
	}

}
