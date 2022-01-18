package by.epam.jonline_introduction.part04.task04;

public class Train {
	private String destinationStation;
	private int number;
	private Date date;

	public Train(String destinationStation, int number, Date date) {
		this.destinationStation = destinationStation;
		this.number = number;
		this.date = date;
	}

	public Train() {
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((destinationStation == null) ? 0 : destinationStation.hashCode());
		result = prime * result + number;
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
		Train other = (Train) obj;
		if (date == null) {
			if (other.date != null) {
				return false;
			}
		} else if (!date.equals(other.date)) {
			return false;
		}
		if (destinationStation == null) {
			if (other.destinationStation != null) {
				return false;
			}
		} else if (!destinationStation.equals(other.destinationStation)) {
			return false;
		}
		if (number != other.number) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Train [destinationStation=" + destinationStation + ", number=" + number + ", date=" + date + "]";
	}

}
