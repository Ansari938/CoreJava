package polymorphism;

import oops.Shape;

public class Trangle extends Shape {
	private int base;
	private int height;
	public int getBase() {
		return base;
	}
	public Trangle(int b,int h) {
		base=b;
		height=h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double area() {
		double ar =0.5*base*height;
		System.out.println("traiangle "+ar);
		return ar;
		
}


	/*public double area1() {
		double T = *base * height;
		System.out.println("Area of Triangle......" + T);
		return T;*/
}