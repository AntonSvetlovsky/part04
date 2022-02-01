package by.epam.jonline_introduction.part04.simple_class_and_object.task02;

public class Test2 {
	private int height;
	private int length;

	public Test2(int height, int length) {
		this.height = height;
		this.length = length;
	}

	public Test2() {
		height = 20;
		length = 50;
	}

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

	@Override
	public String toString() {
		return "Test2 [height=" + height + ", length=" + length + "]";
	}

}
