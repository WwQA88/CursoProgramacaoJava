package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

// Datas em Java

// https://docs.oracle.com/javase/17/docs/api/java/time/format/DateTimeFormatter.html

public class ProgramAula112 {

	public static void main(String[] args) {



		LocalDate d04 = LocalDate.parse("2023-05-15"); // Texto no formato ISO8601
		LocalDateTime d05 = LocalDateTime.parse("2023-05-15T01:30:26"); // Texto no formato ISO8601
		Instant d06 = Instant.parse("2023-05-15T01:30:26Z"); // Texto no formato ISO8601 Global - Zulo time ou GMT

		// Conversao de Instant para data local considerando fuso horário do computador
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("R1 = " + r1);
		System.out.println("R2 = " + r2);
		
		// Conversao de Local Date Time para data local considerando fuso horário do computador
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("R3 = " + r3);
		System.out.println("R4 = " + r4);	
	
		// Local Date
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		// Local DateTime
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
		System.out.println("d05 segundo = " + d05.getSecond());

	}
}