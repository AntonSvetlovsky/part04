package by.epam.jonline_introduction.part04.task04;

public class Date {

	private int hrs;
	private int min;

	public Date() {
	}

	public Date(int hrs, int min) {
		this.hrs = hrs;
		this.min = min;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getTimeInMin() {
		int time;
		time = hrs * 60 + min;
		return time;
	}

	public int compare(Date date) {
		int a;
		if (this.getTimeInMin() > date.getTimeInMin()) {
			a = 1;
		} else if (this.getTimeInMin() < date.getTimeInMin()) {
			a = -1;
		} else {
			a = 0;
		}

		return a;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hrs;
		result = prime * result + min;
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
		Date other = (Date) obj;
		if (hrs != other.hrs) {
			return false;
		}
		if (min != other.min) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Date [hrs=" + hrs + ", min=" + min + "]";
	}

}
