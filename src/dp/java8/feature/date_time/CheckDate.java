package dp.java8.feature.date_time;

import java.time.LocalDate;
import java.time.Month;

public class CheckDate {

	public static void main(String[] args) {
		///////////// Date ////////////////
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2021,3,17);
		System.out.println(date2);
		
	}

}
