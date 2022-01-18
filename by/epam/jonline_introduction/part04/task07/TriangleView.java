package by.epam.jonline_introduction.part04.task07;

public class TriangleView {

	public void printTriangleInfo(Triangle tr) {
		System.out.println("Coordinates of Triangle :" + "A(" + tr.getA().getX() + " , " + tr.getA().getY() + ") "
				+ "B(" + tr.getB().getX() + " , " + tr.getB().getY() + ") " + "C(" + tr.getC().getX() + " , "
				+ tr.getC().getY() + ")");
	}

	public void printNumber(String message, double num) {
		System.out.println(message + ": " + num);
	}

	public void printPoint(String message, Point point) {
		System.out.println(message + ": (" + point.getX() + " , " + point.getY() + ")");
	}
}
