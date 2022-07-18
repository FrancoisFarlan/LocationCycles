package fr.eni.ecole.locationsCycles;

import java.time.LocalDate;
import java.time.Month;

public class ListeCycles {

	public static void main(String[] args) {
	Cycle[] enLocation = {
			new Velo("Lapierre", "speed 400", LocalDate.of(2021, Month.MAY, 1), 27),
			new Velo("Btwin", "riverside 900", LocalDate.of(2022, Month.MAY, 1), 10),
			new Gyropode("Segway", "Ninebot Elite", LocalDate.of(2021, Month.DECEMBER, 15), 40, 150),
			new Gyropode("Weebot", "Echo", LocalDate.of(2021, Month.JANUARY, 15), 35, 160),
			new Gyroroue("Immotion", "v8", LocalDate.of(2022, Month.APRIL, 22), 40),
			new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2022, Month.APRIL, 22), 30)
			
	};
	
	System.out.println("Voici les cycles que nous proposons à la location : ");
	for(Cycle c : enLocation) {
		System.out.printf(" - %-65s %5.2f€/heure%n", c.toString(),
				c.getTarif());
	}
	
}
}