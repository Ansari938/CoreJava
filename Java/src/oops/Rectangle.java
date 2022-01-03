package oops;

public class Rectangle {
private int breath;
private int length;
public int getBreath() {
	return breath;
}
public void setBreath(int breath) {
	this.breath = breath;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public void area() {
	double area= length*breath;
	System.out.println(area);
	
}
}