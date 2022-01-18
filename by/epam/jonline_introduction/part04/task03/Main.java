/*
 *  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 *  из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 *  номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

package by.epam.jonline_introduction.part04.task03;

public class Main {

	public static void main(String[] args) {
		Student[] arrStudent = new Student[10];

		StudentLogic.createStudentArray(arrStudent);
		View.printAllStudents(arrStudent);
		View.printExcellent(arrStudent, 9);

	}

}
