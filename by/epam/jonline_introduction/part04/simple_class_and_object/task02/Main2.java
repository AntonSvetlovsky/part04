/*
 * Создйте класс Test2 двумя переменными.
 * Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию.
 * Добавьте set- и get- методы для полей экземпляра класса.
 */

package by.epam.jonline_introduction.part04.simple_class_and_object.task02;

public class Main2 {
	public static void main(String[] args) {
		Test2 box1 = new Test2(20, 70);
		Test2 box2 = new Test2();

		System.out.println("box1 : " + box1.toString());
		System.out.println("box2 : " + box2.toString());

		Test2 box3 = box2;
		box3.setHeight(10);
		box3.setLength(30);

		System.out.println();
		System.out.println("box2 : " + box2.toString());
		System.out.println("box3 : " + box3.toString());
	}
}
