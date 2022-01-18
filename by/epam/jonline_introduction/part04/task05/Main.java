/*
 * Опишите класс, реализующий десятичный счетчик, который может
 * увеличивать или уменьшать свое значение на единицу в заданном
 * диапазоне. Предусмотрите инициализацию счетчика значениями по
 * умолчанию и произвольными значениями. Счетчик имеет методы
 * увеличения и уменьшения состояния, и метод позволяющее получить
 * его текущее состояние. Написать код, демонстрирующий все
 * возможности класса.
 */

package by.epam.jonline_introduction.part04.task05;

public class Main {

	public static void main(String[] args) {
		Counter c1 = new Counter(90, 15, 10);
		// Counter c2 = new Counter();

		System.out.println(c1.toString());

		for (int i = 0; i < c1.getMaxValue(); i++) {
			c1.increaseValue();
			System.out.println(c1.getCurrentValue());
			// c2.decreaseValue();
		}

		System.out.println(c1.toString());
		// System.out.println(c2.toString());
	}

}
