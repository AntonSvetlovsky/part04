/*
 * Создайте класс Train, содержащий поля:
 * название пункта назначения, номер поезда, время отправления.
 * - создайте данные в массив из пяти элементов типа Train,
 * - добавьте возможность сортировки элементов массива по номерам поездов,
 * - добавьте возможность вывода информации о поезде,
 * номер которого введен пользователем,
 * - добавьте возможность сортировки массив по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны
 * быть упорядочены по времени отправления.
 */

package by.epam.jonline_introduction.part04.task04;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Depo depo = new Depo();
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();

		depo.addTrain(new Train("Minsk", 123, new Date(8, 10)));
		depo.addTrain(new Train("Gomel", 230, new Date(10, 18)));
		depo.addTrain(new Train("Grodno", 138, new Date(15, 50)));
		depo.addTrain(new Train("Grodno", 139, new Date(11, 30)));
		depo.addTrain(new Train("Vitebsk", 168, new Date(4, 52)));
		depo.addTrain(new Train("Grodno", 135, new Date(23, 25)));
		depo.addTrain(new Train("Brest", 148, new Date(17, 10)));

		ArrayList<Train> sorted;
		Train train;
		String menuText = "Menu:\n" + "1. Sort trains by number.\n" + "2. Show information about the train by number.\n"
				+ "3. Sort trains by destination station.\n" + "4. Exit.\n" + "Please select option and press enter.";
		boolean menu = true;

		while (menu) {
			System.out.println(menuText);
			int input = view.readNumber();

			switch (input) {
			case 1:
				sorted = logic.sortByNumber(depo.getTrains());
				view.print("By Number", sorted);
				break;
			case 2:
				view.printAvailableTrainNumbers("Available train numbers:", depo.getTrains());
				train = logic.findByNumber(view.readNumber(), depo.getTrains());
				if (train != null) {
					view.print(train);
				} else {
					System.out.println("Invalid number, please try again!");
				}
				break;
			case 3:
				sorted = logic.sortByDestination(depo.getTrains());
				view.print("By Destination Station", sorted);
				break;
			case 4:
				menu = false;
				break;

			default:
				System.out.println("Invalid input, please try again!");
				break;
			}
		}
	}
}
