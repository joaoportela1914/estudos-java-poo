package date_application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date_Main_2 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2026-08-12");
		LocalDateTime d05 = LocalDateTime.parse("2026-08-12T01:30:26.0478");
		Instant d06 = Instant.parse("2026-08-12T01:30:26.0478Z");
		
		DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter ftm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter ftm4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter ftm5 = DateTimeFormatter.ISO_INSTANT;
		
		
		System.out.println("d04 " + d04.format(ftm1));
		System.out.println("d05 " + d05.format(ftm2));
		System.out.println("d06 " + ftm3.format(d06));
		System.out.println("d05 " + ftm4.format(d05));
		System.out.println("d06 " + ftm5.format(d06));
	
		
	}

}
