package polymorphism;

import oops.Shape;

public class Reaturntype {
	public static void main(String[] args) {
		Shape [] s = new Shape[3];
		

		for (int i = 0; i <= s.length-1; i++) {
			s[i]= getShape(i+1);
		}
		double totalarea= Calculatearea(s);
		System.out.println("The total area" + totalarea);
		
		}
	public static double Calculatearea(Shape[] s) {
		double totalarea=0;
		System.out.println(s.length);
	for (int i = 0; i < s.length; i++) {
		totalarea+=s[i].area();
	}
	return totalarea;
		
	}
		public static Shape getShape(int i ) {
				if (i==1) return new Rectangle(12,45);
				if (i==2) return new Circle(5);
				if (i==3)  return new Trangle(5,10);
				Shape s=new Shape();
				return s;
	}
	

		
	}


