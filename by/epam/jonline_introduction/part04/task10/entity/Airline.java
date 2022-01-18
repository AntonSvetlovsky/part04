package by.epam.jonline_introduction.part04.task10.entity;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airline {

	private String destination;
	private int flightNumber;
	private String airplaneType;
	private LocalTime time;
	private List<DayOfWeek> days;
	private static final int CAPACITY = 7;

	{
		days = new ArrayList<DayOfWeek>(CAPACITY);
	}

	public Airline() {

	}

	public Airline(String destination, int flightNumber, String airplaneType, LocalTime time, List<DayOfWeek> days) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airplaneType = airplaneType;
		this.time = time;
		this.days = days;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public List<DayOfWeek> getDays() {
		return days;
	}

	public void setDays(List<DayOfWeek> days) {
		this.days = days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Airline other = (Airline) obj;
		if (airplaneType == null) {
			if (other.airplaneType != null) {
				return false;
			}
		} else if (!airplaneType.equals(other.airplaneType)) {
			return false;
		}
		if (days == null) {
			if (other.days != null) {
				return false;
			}
		} else if (!days.equals(other.days)) {
			return false;
		}
		if (destination == null) {
			if (other.destination != null) {
				return false;
			}
		} else if (!destination.equals(other.destination)) {
			return false;
		}
		if (flightNumber != other.flightNumber) {
			return false;
		}
		if (time == null) {
			if (other.time != null) {
				return false;
			}
		} else if (!time.equals(other.time)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", airplaneType="
				+ airplaneType + ", time=" + time + ", days=" + days + "]";
	}

}
