package handlingdate;
import java.time.*;
public class HandlingTime {
	public static void main(String[] args)
	{
		LocalDate today=LocalDate.now();
		LocalDate dob=LocalDate.of(2002, 11, 14);
		Period dif=Period.between(dob, today);
		System.out.println(dif.getYears()+"years "+dif.getMonths()+"Months "+dif.getDays()+"days");
		
	}

}

