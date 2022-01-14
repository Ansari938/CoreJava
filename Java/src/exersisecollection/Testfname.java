package exersisecollection;

import java.util.Comparator;

public class Testfname implements Comparator<Exersise_3> {

	@Override
	public int compare(Exersise_3 o1, Exersise_3 o2) {
		return o1.getFname().compareTo(o2.getFname());
	

	
	
	
	}
}
