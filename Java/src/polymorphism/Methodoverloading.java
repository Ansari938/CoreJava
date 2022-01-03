package polymorphism;

public class Methodoverloading {
	public static void main(String[] args) {
	Methodoverloading a= new Methodoverloading();
	a.add(5,6,20);
	
	}
public void add(int a, int b) {
	System.out.println(a+b);
}
	
	public void add(int a ,int b ,int c) {
		System.out.println(a+b+c);
	}
	public void add(int a, float b) {
		System.out.println(a+b);
	}
	
	
	
}
	


