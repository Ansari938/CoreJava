package exersisecollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Exersise_1 {
public static void main(String[] args) {
	 ArrayList A = new ArrayList();
	 A.add(4);
	 A.add(85);
	 A.add(42);
	 A.add(84);
	 A.add(41);
	 
	 
	 
	Iterator it = A.iterator(); {
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
		
		
		
	}
	 
	 
}
}
