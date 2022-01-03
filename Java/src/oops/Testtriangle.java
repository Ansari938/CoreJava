package oops;

public class Testtriangle {
	public static void main(String[] args) {
		Triangle t= new Triangle();
		t.setBase(5);
		t.setHeight(10);
		t.area();
		
		
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
	}

}
