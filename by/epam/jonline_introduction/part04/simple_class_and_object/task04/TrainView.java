package by.epam.jonline_introduction.part04.simple_class_and_object.task04;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainView {
	public void print(String message, ArrayList<Train> trains) {
		System.out.println(message);
		System.out.println("........................................");
		System.out.println("|" + "Number  " + "|" + "Destination Station " + "|" + "Time    " + "|");
		System.out.println("|======================================|");
		for (int i = 0; i < trains.size(); i++) {
			StringBuilder number = new StringBuilder("        ");
			StringBuilder destinationStation = new StringBuilder("                    ");
			StringBuilder time = new StringBuilder("        ");
			String num = "" + trains.get(i).getNumber();
			String destination = trains.get(i).getDestinationStation();
			String t = "" + trains.get(i).getDate().getHrs() + ":" + trains.get(i).getDate().getMin();

			number.replace(0, num.length(), num);
			destinationStation.replace(0, destination.length(), destination);
			time.replace(0, t.length(), t);

			System.out.println("|" + number + "|" + destinationStation + "|" + time + "|");
			if (i < trains.size() - 1) {
				System.out.println("|````````|````````````````````|````````|");
			}
		}
		System.out.println("````````````````````````````````````````");
	}

	public void print(Train train) {
		StringBuilder number = new StringBuilder("        ");
		StringBuilder destinationStation = new StringBuilder("                    ");
		StringBuilder time = new StringBuilder("        ");
		String num = "" + train.getNumber();
		String destination = train.getDestinationStation();
		String t = "" + train.getDate().getHrs() + ":" + train.getDate().getMin();

		number.replace(0, num.length(), num);
		destinationStation.replace(0, destination.length(), destination);
		time.replace(0, t.length(), t);

		System.out.println("........................................");
		System.out.println("|" + "Number  " + "|" + "Destination Station " + "|" + "Time    " + "|");

		System.out.println("|======================================|");
		System.out.println("|" + number + "|" + destinationStation + "|" + time + "|");
		System.out.println("````````````````````````````````````````");
	}

	public int readNumber() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int input;
		@SuppressWarnings("unused")
		String temp;

		System.out.println(">>");

		while (!scanner.hasNextInt()) {
			temp = scanner.nextLine();
			System.out.println(">>");
		}

		input = scanner.nextInt();
		return input;
	}

	public void printAvailableTrainNumbers(String message, ArrayList<Train> trains) {
		System.out.println(message);
		for (Train train : trains) {
			System.out.println(train.getNumber());
		}
	}
}
