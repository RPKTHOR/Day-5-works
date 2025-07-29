package java8_casestudy;

import java.time.LocalDate;

public class DateValidator {
	public static boolean isValidBooking(LocalDate checkIn, LocalDate checkOut) {
		return checkOut.isAfter(checkIn);
	}

	public static void main(String[] args) {
		LocalDate checkIn = LocalDate.of(2025, 7,7);
		LocalDate checkOut = LocalDate.of(2025,8,10);
		
		if(isValidBooking(checkIn,checkOut)) {
			System.out.println("valid booking");
		} else {
			System.out.println("Invalid booking, checkout must be after checkin");
		}
		
	}

}
