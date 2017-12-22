package com.oracle.javacert.associate.chapter03._08datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesAndTimes {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2017, Month.AUGUST, 16);
		System.out.println("Day of Month : " + date.getDayOfMonth());
		System.out.println("Month : " + date.getMonth());
		System.out.println("Year : " + date.getYear());
		System.out.println("Day of Week : " + date.getDayOfWeek());
		System.out.println("Day of Year : " + date.getDayOfYear());
		
		System.out.println("-----------------------");
		
		LocalDate d = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime t = LocalTime.of(11, 12, 34);
		LocalDateTime dt = LocalDateTime.of(d, t);
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(d.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(t.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		System.out.println("-----------------------");
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dt));
		
		System.out.println("-----------------------");
		
		DateTimeFormatter sdt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(dt.format(sdt));
		System.out.println(d.format(sdt));
		// System.out.println(t.format(sdt)); // Throws an exception
		
		System.out.println("-----------------------");

		LocalDate ld = LocalDate.of(2020, Month.JANUARY, 2);
		LocalTime lt = LocalTime.of(11, 12, 13);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		
		System.out.println(shortF.format(ldt));
		System.out.println(mediumF.format(ldt));
		
		System.out.println("-----------------------");
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd MMMM, yyyy, hh:mm");
		System.out.println(ldt.format(f1));
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm");
		System.out.println(ldt.format(f2));
		
		System.out.println("-----------------------");
		
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(f3.format(ldt));
		System.out.println(f3.format(lt));
		// System.out.println(f3.format(ld));	// Throws an exception
		
		System.out.println("-----------------------");
		
		DateTimeFormatter f4 = DateTimeFormatter.ofPattern("hh:mm dd.MMMM.yyyy");
		System.out.println(ldt.format(f4));
		
		
	}
}
