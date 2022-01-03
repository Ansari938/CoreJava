package oops;

public class Testshape {
public static void main(String[] args) {
	Shape s = new Shape();
	
	s.setBorderWidth(6);
	s.setColor ("blue");
	
	String c =s.getColor();
	System.out.println(c);
	System.out.println(s.getBorderWidth());
	
	
	
}
}
