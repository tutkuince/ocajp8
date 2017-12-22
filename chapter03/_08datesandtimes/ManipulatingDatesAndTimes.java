package com.oracle.javacert.associate.chapter03._08datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author tutku
 * 
 * The <b>date</b> and <b>time</b> classes are immutable.
 * */

public class ManipulatingDatesAndTimes {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2017, Month.AUGUST, 16);
		System.out.println(date);
		
		date = date.plusDays(2);
		System.out.println(date + " => plus two days");
		
		date = date.plusWeeks(1);
		System.out.println(date + " => plus 1 week");
		
		date = date.plusMonths(1);
		System.out.println(date + " => plus 1 month");
		
		date = date.plusYears(5);
		System.out.println(date + " => plus 5 years");
		
		date.plusDays(15);	// we did not assign the result of the method to date
		System.out.println(date + " => nothing changed");
		
		System.out.println("\n- - - Chaining Methods - - -");
		
		LocalDate d = LocalDate.of(2017, Month.AUGUST, 16);
		LocalTime t = LocalTime.of(13, 57);
		LocalDateTime dt = LocalDateTime.of(d, t).minusDays(1).minusWeeks(1).minusMonths(1).minusYears(1);
		System.out.println(dt.plusYears(10));	// we did not assign so nothing change
		System.out.println(dt);
		
		System.out.println("\n- - - - - - - - - - - - - - ");
		// LocalDate date1 = LocalDate.of(2018, Month.AUGUST, 16);
		// date1 = date1.plusMinutes(1); 		// DOES NOT COMPILE
		
	}
}
