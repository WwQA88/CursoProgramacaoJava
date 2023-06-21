package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Datas em Java

// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

public class ProgramAula110 {

	public static void main(String[] args) {

		// HORA AGORA

		LocalDate d01 = LocalDate.now(); // Data Local
		LocalDateTime d02 = LocalDateTime.now(); // Data Hora Local
		Instant d03 = Instant.now(); // Data Hora Global - Zulo time ou GMT

		// HORA NO FORMATO ISO8601

		LocalDate d04 = LocalDate.parse("2023-05-15"); // Texto no formato ISO8601
		LocalDateTime d05 = LocalDateTime.parse("2023-05-15T01:30:26"); // Texto no formato ISO8601
		Instant d06 = Instant.parse("2023-05-15T01:30:26Z"); // Texto no formato ISO8601 Global - Zulo time ou GMT
		Instant d07 = Instant.parse("2023-05-15T01:30:26-03:00"); // Texto no formato ISO8601 com time zone diferente de
																	// Zulu time ou GMT

		// TEXTO FORMATO CUSTOMIZADO
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
		LocalDate d08 = LocalDate.parse("15/05/2023", fmt1);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("15/05/2023 01:30", fmt2);
		
		// DIA / MES / ANO
		
		LocalDate d10 = LocalDate.of(2023, 5, 15);
		LocalDateTime d11 = LocalDateTime.of(2023, 5, 15, 1, 30);

		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);

	}
}