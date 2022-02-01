package by.epam.jonline_introduction.part04.simple_class_and_object.task10.view;

import java.util.List;

import by.epam.jonline_introduction.part04.simple_class_and_object.task10.entity.Airline;

public class AirlineView {

	public void print(String message, List<Airline> airlines) {

		System.out.println(message);
		System.out.format("%14s%16s%16s%8s%42s", "FLIGHT NUMBER", "DESTINATION", "AIRPLANE TYPE", "TIME",
				"DAYS OF WEEK");
		System.out.println();

		for (Airline airline : airlines) {
			System.out.format("%14d%16s%16s%8s%42s", airline.getFlightNumber(), airline.getDestination(),
					airline.getAirplaneType(), airline.getTime(), airline.getDays());
			System.out.println();
		}

		System.out.println();
	}
}
