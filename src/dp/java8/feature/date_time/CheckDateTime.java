package dp.java8.feature.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class CheckDateTime {

	public static void main(String[] args) {
		/**
LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)
LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)
LocalDateTime of(LocalDate date, LocalTime time)
		 */
		LocalDate ld1 =  LocalDate.of(2021,03,17);
		LocalTime lt1 = LocalTime.of(11, 38);
		LocalDateTime ldt = LocalDateTime.of(ld1, lt1);
		System.out.println(ldt);
	}

}
