package com.oracle.javacert.associate.chapter03._08datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Periods {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Period p1 = Period.ofYears(3); // every 3 years
		Period p2 = Period.ofMonths(3); // every 3 months
		Period p3 = Period.ofWeeks(3); // every 3 weeks
		Period p4 = Period.ofDays(3); // every 3 days
		Period p5 = Period.of(3, 3, 3); // every 3 years, 3 months and 3 day

		// Period wrong = Period.ofYears(2).ofWeeks(2); only last method used 
		// Because Period.ofXXX methods are static methods
		// You cannot chain methods when creating a Period.
		
		LocalDate date = LocalDate.of(2017, 8, 16);
		LocalTime time = LocalTime.of(14, 15);
		LocalDateTime dt = LocalDateTime.of(date, time);
		System.out.println(dt);
		Period period = Period.ofMonths(13);
		System.out.println(date.plus(period));
		System.out.println(dt.plus(period));
		// System.out.println(time.plus(period));	// UnsupportedTemporalTypeException
	}
}
