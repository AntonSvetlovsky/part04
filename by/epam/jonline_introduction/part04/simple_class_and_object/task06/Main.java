/*
 * Составьте описание класса для представления времени. Предусмотрте
 * возможности установки времени и изменения его отдельных полей (час,
 * минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

package by.epam.jonline_introduction.part04.simple_class_and_object.task06;

public class Main {

	public static void main(String[] args) {

		Time t = new Time(22, 45, 35);
		t.changeSec(3821);
		System.out.println(t.toString());
	}

}
