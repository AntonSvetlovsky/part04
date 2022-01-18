package by.epam.jonline_introduction.part04.task07;

public class TriangleLogic {
	public boolean checkValidity(Triangle tr) {

		double a = Point.distance(tr.getA(), tr.getB());
		double b = Point.distance(tr.getB(), tr.getC());
		double c = Point.distance(tr.getA(), tr.getC());

		if (a + b <= c || c + a <= b || b + c <= a) {
			return false;
		} else {
			return true;
		}
	}

	public double calculatePerimeter(Triangle tr) {
		double a = Point.distance(tr.getA(), tr.getB());
		double b = Point.distance(tr.getB(), tr.getC());
		double c = Point.distance(tr.getA(), tr.getC());

		return a + b + c;
	}

	public double calculateArea(Triangle tr) {
		double a = Point.distance(tr.getA(), tr.getB());
		double b = Point.distance(tr.getB(), tr.getC());
		double c = Point.distance(tr.getA(), tr.getC());
		double s = calculatePerimeter(tr) / 2;

		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public Point findCentroid(Triangle tr) {
		double x = (tr.getA().getX() + tr.getB().getX() + tr.getC().getX()) / 3;
		double y = (tr.getA().getY() + tr.getB().getY() + tr.getC().getY()) / 3;

		return new Point(x, y);
	}
}
