package by.epam.jonline_introduction.part04.task12.entity;

public class Wheel {

	private int diameter;
	private Status status;

	{
		status = Status.EMPTY;
	}

	public Wheel() {

	}

	public Wheel(int diameter, Status status) {
		this.diameter = diameter;
		this.status = status;
	}

	public Wheel(int diameter) {
		this.diameter = diameter;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public Status getStatus() {
		return status;
	}

	public void inflate() {
		status = Status.FULL;
	}

	public void deflate() {
		status = Status.EMPTY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Wheel other = (Wheel) obj;
		if (diameter != other.diameter) {
			return false;
		}
		if (status != other.status) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", status=" + status + "]";
	}

}
