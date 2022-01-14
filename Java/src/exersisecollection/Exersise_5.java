package exersisecollection;

import java.util.ArrayList;
import java.util.HashSet;

public class Exersise_5 {
	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();

		ArrayList A = new ArrayList();

		for (int i = 1; i <= 50; i++) {

			A.add(i);

		}

		HashSet h = new HashSet<>();
		h.addAll(A);

		System.out.println(h);
		
		for (int j = 1; j <= 50; j++) {
			System.out.println(" is contains hashset "     + h.contains(j));
			
			System.out.println("Time Take ny Hashset"   + System.currentTimeMillis());
			
			
			for (int k = 1; k <= 50; k++) {
				
				
				System.out.println("Time Take ny Hashset" +  "  "  + h.contains(k));
				
				System.out.println("Time Take ny Hashset" +  "  "   + System.currentTimeMillis());
				
			}
			
			
		}
			
		
		
		

	}

}
