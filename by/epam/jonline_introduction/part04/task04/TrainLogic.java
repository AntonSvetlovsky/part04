package by.epam.jonline_introduction.part04.task04;

import java.util.ArrayList;

public class TrainLogic {
	public ArrayList<Train> sortByNumber(ArrayList<Train> trains) {
		ArrayList<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		for (int i = 0; i < sortTrains.size(); i++) {
			int min = i;
			for (int j = i; j < sortTrains.size(); j++) {
				if (sortTrains.get(j).getNumber() < sortTrains.get(min).getNumber()) {
					min = j;
				}
			}
			sortTrains.add(i, sortTrains.get(min));
			sortTrains.remove(min + 1);
		}

		return sortTrains;
	}

	public Train findByNumber(int findNumber, ArrayList<Train> trains) {
		Train train = null;

		int i = 0;
		while (i < trains.size()) {
			if (trains.get(i).getNumber() == findNumber) {
				train = trains.get(i);
				break;
			}
			i++;
		}

		return train;
	}

	public ArrayList<Train> sortByDestination(ArrayList<Train> trains) {
		ArrayList<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		sortPartByDate(sortTrains);

		for (int i = 1; i < sortTrains.size(); i++) {
			Train key = sortTrains.get(i);
			int j = i - 1;
			while (j >= 0
					&& key.getDestinationStation().compareToIgnoreCase(sortTrains.get(j).getDestinationStation()) < 0) {
				sortTrains.set(j + 1, sortTrains.get(j));
				j--;
			}
			sortTrains.set(j + 1, key);
		}

		return sortTrains;
	}

	private void sortPartByDate(ArrayList<Train> trains) {
		for (int i = 1; i < trains.size(); i++) {
			Train key = trains.get(i);
			int j = i - 1;
			while (j >= 0 && key.getDate().compare(trains.get(j).getDate()) < 0) {
				trains.set(j + 1, trains.get(j));
				j--;
			}
			trains.set(j + 1, key);
		}
	}
}
/*
 * 
 * int n = arr.length; for (int i = 1; i < n; ++i) { int key = arr[i]; int j = i
 * - 1;
 * 
 * while (j >= 0 && arr[j] > key) { arr[j + 1] = arr[j]; j = j - 1; } arr[j + 1]
 * = key; }
 * 
 * 
 * 
 */
