package exersisecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exersise_3last {
public static void main(String[] args) {
	Exersise_3 e1 = new Exersise_3();
    e1.setFname("fahim");
    e1.setLname("sharma");
    e1.setSalary(30000);
    
    Exersise_3 e2 =new Exersise_3();
    e2.setFname("kapil");
    e2.setLname("malwya");
	 e2.setSalary(28000); 
    	 
	 Exersise_3 e3 =new Exersise_3();
	 e3.setFname("dheerj");
	 e3.setLname("shah");
	 e3.setSalary(58000);
	 
	 Exersise_3 e4 =new Exersise_3();
	 e4.setFname("tanveer");
	 e4.setLname("khan");
	 e4.setSalary(40000);
	 
	 Exersise_3 e5 =new Exersise_3();
	 e5.setFname("monti");
	 e5.setLname("jain");
	 e5.setSalary(36000);
	 
	 
	 ArrayList<Exersise_3> A = new ArrayList<Exersise_3>();
		A.add(e1);
		A.add(e2);
		A.add(e3);
	    A.add(e4); 
	    A.add(e5);
	    
	    Collections.sort(A , new Testlast());
	    Iterator<Exersise_3> t = A.iterator();
	    while (t.hasNext()) {
			Exersise_3 e = (Exersise_3) t.next();
			System.out.println(e.getFname()+""+e.getLname());
			
		}
	    
	    
	    
}
}
