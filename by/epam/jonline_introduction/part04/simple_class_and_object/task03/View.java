package by.epam.jonline_introduction.part04.simple_class_and_object.task03;

import java.util.Arrays;

public class View {

	public static void printExcellent(Student[] students, int bound) {
		int count = 0;

		for (int i = 0; i < students.length; i++) {
			if (StudentLogic.isExcellent(students[i], bound)) {
				if (count == 0) {
					System.out.println("============================================");
					System.out.println(
							"Students with rating >" + (bound - 1) + "\n_____________________________________________");
				}

				System.out.println(students[i].getName() + "\t" + students[i].getGroupNumber() + "\t"
						+ Arrays.toString(students[i].getRating()));
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There are no students with rating >" + (bound - 1));
		}
	}

	public static void printAllStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.printf(students[i].getName() + "\t%d\t" + Arrays.toString(students[i].getRating()) + "\n",
					students[i].getGroupNumber());
		}
	}
}