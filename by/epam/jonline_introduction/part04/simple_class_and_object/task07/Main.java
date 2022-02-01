/*
 * Описать класс, представляющий треугольник. Предусмотреть
 * методы для создания объектов, вычисления площади, периметра
 * и точки пересечения медиан.
 */

package by.epam.jonline_introduction.part04.simple_class_and_object.task07;

public class Main {

	public static void main(String[] args) {

		Triangle triangle1 = new Triangle(0, 0, 1, 1, 2, 2);
		Triangle triangle2 = new Triangle(0, 0, 2, 3.4641, 4, 0);
		TriangleLogic logic = new TriangleLogic();
		TriangleView view = new TriangleView();
		view.printTriangleInfo(triangle2);
		if (logic.checkValidity(triangle2)) {

			view.printNumber("Area", logic.calculateArea(triangle2));
			view.printNumber("Perimeter", logic.calculatePerimeter(triangle2));
			view.printPoint("Centroid", logic.findCentroid(triangle2));

		} else {

			System.out.println("Invalid Triangle!");
		}

		view.printTriangleInfo(triangle1);
		if (logic.checkValidity(triangle1)) {

			view.printNumber("Area", logic.calculateArea(triangle1));
			view.printNumber("Perimeter", logic.calculatePerimeter(triangle1));
			view.printPoint("Centroid", logic.findCentroid(triangle1));

		} else {

			System.out.println("Invalid Triangle!");
		}
	}

}
