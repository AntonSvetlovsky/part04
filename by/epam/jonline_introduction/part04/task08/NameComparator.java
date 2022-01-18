package by.epam.jonline_introduction.part04.task08;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		int a = o1.getLastName().compareToIgnoreCase(o2.getLastName());
		if (a != 0) {
			return a;
		}
		int b = o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
		if (b != 0) {
			return b;
		}
		int c = o1.getSecondName().compareToIgnoreCase(o2.getSecondName());
		return c;
	}

}
