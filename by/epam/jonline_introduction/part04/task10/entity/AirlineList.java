package by.epam.jonline_introduction.part04.task10.entity;

import java.util.ArrayList;
import java.util.List;

public class AirlineList {

	private List<Airline> airlineList;

	{
		airlineList = new ArrayList<Airline>();
	}

	public AirlineList() {

	}

	public AirlineList(List<Airline> airlineList) {
		this.airlineList = airlineList;
	}

	public List<Airline> getAirlineList() {
		return airlineList;
	}

	public void setAirlineList(List<Airline> airlineList) {
		this.airlineList = airlineList;
	}

	public void addAirline(Airline airline) {
		airlineList.add(airline);
	}

	public void removeAirline(Airline airline) {
		airlineList.remove(airline);
	}

	public void removeAirline(int i) {
		airlineList.remove(i);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlineList == null) ? 0 : airlineList.hashCode());
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
		AirlineList other = (AirlineList) obj;
		if (airlineList == null) {
			if (other.airlineList != null) {
				return false;
			}
		} else if (!airlineList.equals(other.airlineList)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "AirlineList [airlineList=" + airlineList + "]";
	}

}
