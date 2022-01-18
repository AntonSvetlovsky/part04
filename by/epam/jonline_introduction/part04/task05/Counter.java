package by.epam.jonline_introduction.part04.task05;

public class Counter {
	private int minValue;
	private int maxValue;
	private int currentValue;

	public Counter(int minValue, int maxValue, int currentValue) {
		if (minValue > maxValue) {
			this.minValue = maxValue;
			this.maxValue = minValue;
		} else {
			this.minValue = minValue;
			this.maxValue = maxValue;
		}
		if (currentValue < this.minValue || currentValue > this.maxValue) {
			this.currentValue = this.minValue;
		} else {
			this.currentValue = currentValue;
		}
	}

	public Counter() {
		this(0, 99, 0);
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public void increaseValue() {
		if (currentValue == maxValue) {
			currentValue = minValue;
		} else {
			currentValue++;
		}
	}

	public void decreaseValue() {
		if (currentValue == minValue) {
			currentValue = maxValue;
		} else {
			currentValue--;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentValue;
		result = prime * result + maxValue;
		result = prime * result + minValue;
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
		Counter other = (Counter) obj;
		if (currentValue != other.currentValue) {
			return false;
		}
		if (maxValue != other.maxValue) {
			return false;
		}
		if (minValue != other.minValue) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Counter [minValue=" + minValue + ", maxValue=" + maxValue + ", currentValue=" + currentValue + "]";
	}

}
