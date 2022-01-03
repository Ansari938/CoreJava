package ExersiseDateandtime;

import java.util.Calendar;
import java.util.Date.*;

public class CalculateDateTime {
	
	public static void main(String[] args) {
		Calendar cal =Calendar.getInstance();
System.out.println("The installation date is "+cal.getTime());
System.out.println("");
	for (int i = 1; i < 10; i++) {
		
	
		cal.add(Calendar.DATE, +30);
		System.out.println("The "+i+" service date is : "+cal.getTime());
		
	}
		
	}
	}
	
	
	
	