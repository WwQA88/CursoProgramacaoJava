package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// Datas em Java

// https://docs.oracle.com/javase/17/docs/api/java/time/format/DateTimeFormatter.html

public class ProgramAula113 {

	public static void main(String[] args) {



		LocalDate d04 = LocalDate.parse("2023-05-15"); // Texto no formato ISO8601
		LocalDateTime d05 = LocalDateTime.parse("2023-05-15T01:30:26"); // Texto no formato ISO8601
		Instant d06 = Instant.parse("2023-05-15T01:30:26Z"); // Texto no formato ISO8601 Global - Zulo time ou GMT
		
		
		// Acrescentando tempos com locaDate
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		// Acrescentando tempos com locaDateTime
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		// Acrescentando tempos com Instant
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("pastWeekInstant = " + nextWeekInstant);
		
		// Calculo de Duracao com LocalDateTime
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("t1 dias = " + t1.toDays());
		
		// Calculo de Duracao com LocalDate
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println("t2 dias = " + t2.toDays());
		
		// Calculo de Duracao com Instant
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("t3 dias = " + t3.toDays());
		
		// Calculo de Duracao com Instant - Invertido
		Duration t4 = Duration.between(d06, pastWeekInstant);
		System.out.println("t4 dias = " + t4.toDays());


	}
}