package TestCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Testlist {
        public static void main(String[] args) {
        	
        	
         List l =new LinkedList();
     	l.add(265);
		l.add(526);
		l.add(56);
		l.add(365);
		l.add(26);
		System.out.println(l);
		System.out.println(l.contains(445));
		
		ArrayList g = new ArrayList();
		g.add(265);
		g.add(56);
		g.add(365);
		g.add(26);
		g.size();
	//	g.removeAll(g);//
		/*System.out.println(g.containsAll(l));
		System.out.println(g.isEmpty());
		System.out.println(g.retainAll(l));
		System.out.println(l.retainAll(g));*/
		
        System.out.println(g);
        System.out.println(l.size());
          

}

}
