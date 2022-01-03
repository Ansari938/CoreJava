package TestCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(265);
		a.add(526);
		a.add(56);
		a.add(365);
		a.add(26);
		
		
	/*Iterator it = a.iterator();
while (it.hasNext()) {
	Object object = (Object) it.next();
	System.out.println(object);
}*/
	
		ArrayList g = new ArrayList();
		g.add(265);
		g.add(526);
		g.add(56);
		g.add(365);
		g.add(26);
		
		
		g.addAll(a);
		System.out.println(g);
		
		
		
	}

	private static Iterator itoraror() {
		// TODO Auto-generated method stub
		return null;
	}

}
