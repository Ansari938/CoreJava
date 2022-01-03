package datetime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import  java.util.*;
public class Datetime {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat srd = new SimpleDateFormat("dd/mm/yyyy");
		String dt = srd.format(d);
		System.out.println(dt);
		
		String s = "13/12/2021";
		Date dd = srd.parse(s);
		System.out.println(dd);
	}

}

