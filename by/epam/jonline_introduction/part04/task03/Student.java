package by.epam.jonline_introduction.part04.task03;

import java.util.Arrays;

public class Student {
	private String name;
	private int groupNumber;
	private static final int NUMBER_OF_EXAMS = 5;
	private int[] rating = new int[NUMBER_OF_EXAMS];

	public Student(String name, int group, int[] rating) {
		this.name = name;
		this.groupNumber = group;
		this.rating = rating;
	}

	public Student(String name, int group) {
		this.name = name;
		this.groupNumber = group;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setGroup(int group) {
		this.groupNumber = group;
	}

	public int getGroup() {
		return this.groupNumber;
	}

	public void setRating(int[] rating) {
		this.rating = rating;
	}

	public int[] getRating() {
		return this.rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(rating);
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
		Student other = (Student) obj;
		if (groupNumber != other.groupNumber) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (!Arrays.equals(rating, other.rating)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", groupNumber=" + groupNumber + ", rating=" + Arrays.toString(rating) + "]";
	}

}
