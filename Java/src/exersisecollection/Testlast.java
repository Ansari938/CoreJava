package exersisecollection;

import java.util.Comparator;

public class Testlast implements Comparator<Exersise_3>{

	@Override
	public int compare(Exersise_3 o1, Exersise_3 o2) {
		if(o1.getLname().compareTo(o2.getLname())==0) {
			return o1.getFname().compareTo(o2.getFname());
		}
		
		return o1.getLname().compareTo(o2.getLname());

	}

}
