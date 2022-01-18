package by.epam.jonline_introduction.part04.task03;

import java.util.Random;

public class StudentLogic {

	public static Student[] createStudentArray(Student[] arrStudent) {
		final int NUMBER_OF_EXAMS = 5;
		Random r = new Random();
		for (int i = 0; i < arrStudent.length; i++) {
			int[] marks = new int[NUMBER_OF_EXAMS];
			for (int j = 0; j < marks.length; j++) {
				marks[j] = r.nextInt(3) + 8;
			}
			int group = r.nextInt(4) + 10;
			arrStudent[i] = new Student("Student" + (i + 1), group, marks);
		}
		return arrStudent;
	}

	public static boolean isExcellent(Student student, int bound) {
		int[] marks = student.getRating();

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < bound) {
				return false;
			}
		}
		return true;
	}
}
