package dp.java8.feature.date_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Period_01 {

	public static void main(String[] args) {
		//A java.time.Period example to find out differently (years, months, days) between two LocalDates
        
        System.out.println("\n--- Period.between --- ");
        LocalDate oldDate = LocalDate.of(2022, Month.MARCH, 17);
        LocalDate newDate = LocalDate.of(2021, Month.MARCH, 17);
     // check period between dates
        Period period = Period.between(oldDate, newDate);
        
        System.out.println(period.getYears());
        /*
        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");
        */
        	
	}

}
