package com.oracle.javacert.associate.chapter03._08datesandtimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDatesAndTimes {
	public static void main(String[] args) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		// LocalDate date = LocalDate.parse("2017-01-01");
		LocalDate date = LocalDate.parse("01 01 2017", f);
		LocalTime time = LocalTime.parse("11:22");
		System.out.println(date);
		System.out.println(time);
		
		
	}
}
