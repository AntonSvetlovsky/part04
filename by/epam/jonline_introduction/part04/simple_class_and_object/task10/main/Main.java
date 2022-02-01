/*
 * Создать класс Airline, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод  toString().
 * Создать второй класс, агрегирующий массив типа Airline,
 * с подходящими конструкторами и методами. Задать критерии выбора
 * данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

package by.epam.jonline_introduction.part04.simple_class_and_object.task10.main;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import by.epam.jonline_introduction.part04.simple_class_and_object.task10.entity.Airline;
import by.epam.jonline_introduction.part04.simple_class_and_object.task10.entity.AirlineList;
import by.epam.jonline_introduction.part04.simple_class_and_object.task10.entity.DayOfWeek;
import by.epam.jonline_introduction.part04.simple_class_and_object.task10.logic.AirlineLogic;
import by.epam.jonline_introduction.part04.simple_class_and_object.task10.view.AirlineView;

public class Main {

	public static void main(String[] args) {

		AirlineLogic logic = new AirlineLogic();
		AirlineView view = new AirlineView();
		AirlineList airlines = new AirlineList();
		List<Airline> airlinesWithFixedDestination;
		List<Airline> airlinesWhithFixedDayOfWeek;
		List<Airline> airlinesWithFixedDayAndTime;
		String destination = "Portland";
		DayOfWeek day1 = DayOfWeek.SUNDAY;
		DayOfWeek day2 = DayOfWeek.FRIDAY;
		LocalTime time = LocalTime.of(7, 00);

		airlines.addAirline(new Airline("Seattle", 1, "Airbus A320", LocalTime.of(8, 30),
				Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY)));
		airlines.addAirline(new Airline("Portland", 2, "Airbus A320", LocalTime.of(6, 45),
				Arrays.asList(DayOfWeek.values()[2], DayOfWeek.values()[5])));
		airlines.addAirline(new Airline("Seattle", 3, "Boeing 787", LocalTime.of(15, 50),
				Arrays.asList(DayOfWeek.SUNDAY, DayOfWeek.TUESDAY, DayOfWeek.FRIDAY)));
		airlines.addAirline(new Airline("Portland", 4, "Boeing 787", LocalTime.of(17, 00),
				Arrays.asList(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY)));
		airlines.addAirline(new Airline("Austin", 5, "Boeing 777", LocalTime.of(12, 20),
				Arrays.asList(DayOfWeek.SUNDAY, DayOfWeek.FRIDAY)));
		airlines.addAirline(new Airline("Austin", 6, "Boeing 737", LocalTime.of(7, 10),
				Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY)));

		airlinesWithFixedDestination = logic.findByDestination(airlines.getAirlineList(), destination);
		view.print("Airlines with destination: " + destination, airlinesWithFixedDestination);

		airlinesWhithFixedDayOfWeek = logic.findByDayOfWeek(airlines.getAirlineList(), day1);
		view.print("Airlines with day of week: " + day1, airlinesWhithFixedDayOfWeek);

		airlinesWithFixedDayAndTime = logic.findByDayAndTime(airlines.getAirlineList(), day2, time);
		view.print("Airlines with day of week: " + day2 + " and time after: " + time, airlinesWithFixedDayAndTime);
	}

}
