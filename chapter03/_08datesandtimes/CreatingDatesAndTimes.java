package com.oracle.javacert.associate.chapter03._08datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author tutku
 * 
 * The <b>date</b> and <b>time</b> classes have private constructors to force you to use the static methods
 * */

public class CreatingDatesAndTimes {
	public static void main(String[] args) {
		System.out.println("Local Date : " + LocalDate.now());
		System.out.println("Local Time : " + LocalTime.now());
		System.out.println("Local Date Time : " + LocalDateTime.now()); // Java uses T to  separate the date and time
		
		System.out.println("--------------------");
		
		LocalDate date1 = LocalDate.of(2017, Month.AUGUST, 16);
		LocalDate date2 = LocalDate.of(2017, 8, 16);
		System.out.println("date1 : " + date1);
		System.out.println("date2 : " + date2);
		
		System.out.println("--------------------");
		
		LocalTime time1 = LocalTime.of(13, 42);
		LocalTime time2 = LocalTime.of(13, 42, 30);
		LocalTime time3 = LocalTime.of(13, 42, 30, 200);
		System.out.println("time1 : " + time1);
		System.out.println("time2 : " + time2);
		System.out.println("time3 : " + time3);
		
		System.out.println("--------------------");
		
		LocalDateTime dateTime1 = LocalDateTime.of(2017, Month.AUGUST, 16, 13, 44, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println("dateTime1 : " + dateTime1);
		System.out.println("dateTime2 : " + dateTime2);
		
		System.out.println("--------------------");
		
		// LocalDate date = new LocalDate(); 	// DOES NOT COMPILE
		// LocalDate.of(2017, Month.AUGUST, 32);// throws DateTimeException
		
	}
}
