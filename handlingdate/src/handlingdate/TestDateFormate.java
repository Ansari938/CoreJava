package handlingdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormate {
	public static void main(String[] args) throws ParseException {
		String s = "18/05/2002";
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = f.parse(s);
		System.out.println(d1);
	}
}
