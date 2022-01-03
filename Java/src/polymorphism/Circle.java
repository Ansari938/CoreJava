package polymorphism;

import oops.Shape;

public class Circle extends Shape {
 private int radius;
 public Circle () {
	 
 }
 public Circle(int r) {
 radius=r;
 
}
public int getRadius() {
	return radius;
}
  /*public double area() {
	double arr1 =3.14*radius*radius;
	System.out.println("circle"+arr1);
	return arr1;*/
  
  @Override
	public double area() {
		double d = 3.14 * radius * radius;
		System.out.println("Area of Circle......"+d);
		return d;
}
  }