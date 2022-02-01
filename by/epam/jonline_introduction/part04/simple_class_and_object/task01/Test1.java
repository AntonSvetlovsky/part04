package by.epam.jonline_introduction.part04.simple_class_and_object.task01;

public class Test1 {

	private int height;
	private int length;

	public void setHeight(int height) {
		this.height = height;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public int getLength() {
		return length;
	}

	public int calculateSum() {
		return height + length;
	}

	public int findMaxValue() {
		return height > length ? height : length;
	}

	@Override
	public String toString() {
		return "Test1 [height=" + height + ", length=" + length + "]";
	}

}
