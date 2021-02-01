package epita.fr.classExample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss.SSS");
		System.out.println(s.format(date));
		System.out.println(date.toInstant());
		System.out.println(date.toInstant().atZone(TimeZone.getDefault().toZoneId()).toLocalDate());
		
		
		// USE LOCALDATETIME INSTEAD OF DATE IT IS BETTER
		
	}

}
