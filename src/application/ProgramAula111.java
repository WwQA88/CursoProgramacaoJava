package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

// Datas em Java

// https://docs.oracle.com/javase/17/docs/api/java/time/format/DateTimeFormatter.html

public class ProgramAula111 {

	public static void main(String[] args) {



		LocalDate d04 = LocalDate.parse("2023-05-15"); // Texto no formato ISO8601
		LocalDateTime d05 = LocalDateTime.parse("2023-05-15T01:30:26"); // Texto no formato ISO8601
		Instant d06 = Instant.parse("2023-05-15T01:30:26Z"); // Texto no formato ISO8601 Global - Zulo time ou GMT
		
		// Local Date
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		// Local Date Time
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		System.out.println("d05 = " + d05.format(fmt2));
		
		// Instant Date Time - Data hora global
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d06 = " + fmt3.format(d06));
		
		// Local Date Time com biblioteca pronta - ISO_DATE_TIME
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println("d05 = " + d05.format(fmt4));
		
		
		// Instant Date Time - com biblioteca pronta - ISO_INSTANT
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString());
		
	}
}