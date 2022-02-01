/*
 * Создайте класс Test1 двумя переменными.
 * Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных,
 * и метод, который находит наибольшее значение из этих двух переменных.
 */

package by.epam.jonline_introduction.part04.simple_class_and_object.task01;

public class Main1 {

	public static void main(String[] args) {
		Test1 box = new Test1();
		box.setHeight(5);
		box.setLength(8);

		System.out.println(box.toString());

		System.out.println("Sum = " + box.calculateSum());
		System.out.println("Max value = " + box.findMaxValue());
	}
}
