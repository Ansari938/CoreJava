package polymorphism;

import oops.Shape;

public class Rectangle extends Shape{
	private int breath;
	private int length;
	public int getBreath() {
		return breath;
	}
	public Rectangle(int b,int l) {
		breath=b;
		length=l;
	}
		
	public int getLength() {
		return length;
	}
	
	public double area() {
		double are= length*breath;
		System.out.println("ractangle"+are);
		return are;
	}
}
