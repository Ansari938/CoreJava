package oops;

public abstract class  Shape {
	private int borderWidth;
	private String color;
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
 //public void area() {
	
public abstract double area();

	
	

}
