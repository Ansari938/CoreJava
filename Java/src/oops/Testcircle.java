package oops;

public class Testcircle {
public static void main(String[] args) {
	
	Circle c =new Circle();
	c.setBorderWidth(52);
	c.area();
	c.setRadius(5);
	c.setColor("blue");
	
	
	System.out.println(c.getColor());
     System.out.println(c.getBorderWidth());

}
}
