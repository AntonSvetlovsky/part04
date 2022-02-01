package by.epam.jonline_introduction.part04.simple_class_and_object.task04;

import java.util.ArrayList;

public class Depo {

	private ArrayList<Train> trains;

	{
		trains = new ArrayList<Train>();
	}

	public Depo(ArrayList<Train> trains) {
		this.trains = trains;
	}

	public Depo() {
	}

	public ArrayList<Train> getTrains() {
		return trains;
	}

	public void addTrain(Train train) {
		boolean exist = false;
		int index = 0;
		int i = 0;
		while (i < trains.size()) {
			if (trains.get(i).getNumber() == train.getNumber()) {
				exist = true;
				index = i;
				break;
			}
			i++;
		}
		if (!exist) {
			trains.add(train);
		} else {
			trains.set(index, train);
		}
	}

	public void removeTrain(Train train) {
		trains.remove(train);
	}

	@Override
	public String toString() {
		return "Depo [trains=" + trains + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Depo other = (Depo) obj;
		if (trains == null) {
			if (other.trains != null) {
				return false;
			}
		} else if (!trains.equals(other.trains)) {
			return false;
		}
		return true;
	}

}
