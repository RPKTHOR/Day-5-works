package java8_casestudy;

import java.time.LocalDate;
import java.time.Period;

public class BookingDuration {

	public static void main(String[] args) {
		LocalDate checkIn = LocalDate.of(2025, 7,7);
		LocalDate checkOut = LocalDate.of(2025,8,10);
		
		Period stayperiod = Period.between(checkIn, checkOut);
		System.out.println("stay duation: "+stayperiod.getDays());

	}

}
