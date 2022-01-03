package ExersiseDateandtime;

import java.time.LocalDate;
import java.time.Period;

public class Calculateage {
	public static void main(String[] args)
	{
		LocalDate today=LocalDate.now();
		LocalDate dob=LocalDate.of(1972, 1, 1);
		Period dif=Period.between(dob, today);
		System.out.println(dif.getYears()+"years "+dif.getMonths()+"Months "+dif.getDays()+"days");
		
	}
}
