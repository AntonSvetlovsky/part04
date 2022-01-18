package by.epam.jonline_introduction.part04.task10.logic;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import by.epam.jonline_introduction.part04.task10.entity.Airline;
import by.epam.jonline_introduction.part04.task10.entity.DayOfWeek;

public class AirlineLogic {

	public List<Airline> findByDestination(List<Airline> airlines, String destination) {

		List<Airline> airlinesWithFixedDestination = new ArrayList<Airline>();

		for (Airline airline : airlines) {
			if (airline.getDestination().equalsIgnoreCase(destination)) {
				airlinesWithFixedDestination.add(airline);
			}
		}

		return airlinesWithFixedDestination;
	}

	public List<Airline> findByDayOfWeek(List<Airline> airlines, DayOfWeek fixedDay) {

		List<Airline> airlinesWithFixedDay = new ArrayList<Airline>();

		for (Airline airline : airlines) {
			for (DayOfWeek day : airline.getDays()) {
				if (day == fixedDay) {
					airlinesWithFixedDay.add(airline);
				}
			}
		}

		return airlinesWithFixedDay;
	}

	public List<Airline> findByDayAndTime(List<Airline> airlines, DayOfWeek fixedDay, LocalTime time) {

		List<Airline> airlinesWithFixedDay = findByDayOfWeek(airlines, fixedDay);
		List<Airline> airlinesWithFixedDayAndTime = new ArrayList<Airline>();

		for (Airline airline : airlinesWithFixedDay) {
			if (airline.getTime().compareTo(time) > 0) {
				airlinesWithFixedDayAndTime.add(airline);
			}
		}

		return airlinesWithFixedDayAndTime;
	}
}
