package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramAula115 {

	public static void main(String[] args)  {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2023-06-12T22:20:00Z"));
		
		System.out.println(sdf.format(d));
		
		// Adicionando unidade de tempo
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		// Obtendo uma unidade de tempo		
		
		int minutes = cal.get(Calendar.MINUTE);		
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("minutes: " + (minutes));
		System.out.println("month: " + (month));
		
		
	}
}