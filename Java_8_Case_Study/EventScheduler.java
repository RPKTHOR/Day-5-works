package java8_casestudy;

import java.time.LocalDate;

public class EventScheduler {
	public static void main(String[] args) {
		LocalDate startdate = LocalDate.of(2025,8,1);
		
		for (int i=0;i<5;i++) {
			LocalDate eventDate = startdate.plusWeeks(i);
			System.out.println("event $"+(i+1)+" on: "+eventDate);
		}
	}

}
