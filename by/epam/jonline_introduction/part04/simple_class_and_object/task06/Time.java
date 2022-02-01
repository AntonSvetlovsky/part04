package by.epam.jonline_introduction.part04.simple_class_and_object.task06;

public class Time {

	private int hrs;
	private int min;
	private int sec;

	public Time(int hrs, int min, int sec) {
		setHrs(hrs);
		setMin(min);
		setSec(sec);
	}

	public Time() {
		this(0, 0, 0);
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		if (hrs < 0 || hrs > 23) {
			this.hrs = 0;
		} else {
			this.hrs = hrs;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min < 0 || min > 59) {
			this.min = 0;
		} else {
			this.min = min;
		}
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		if (sec < 0 || sec > 59) {
			this.sec = 0;
		} else {
			this.sec = sec;
		}
	}

	public void changeHrs(int hrs) {
		this.hrs = (this.hrs + hrs) % 24;
	}

	public void changeMin(int min) {
		int sumMin = this.min + min;
		this.min = sumMin % 60;
		changeHrs(sumMin / 60);
	}

	public void changeSec(int sec) {
		int sumSec = this.sec + sec;
		this.sec = sumSec % 60;
		changeMin(sumSec / 60);
	}

	@Override
	public String toString() {
		return "Time [hrs=" + hrs + ", min=" + min + ", sec=" + sec + "]";
	}

}
