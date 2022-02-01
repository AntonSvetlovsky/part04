package by.epam.jonline_introduction.part04.simple_class_and_object.task08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerLogic {

	public List<Customer> sortByName(List<Customer> customers) {

		List<Customer> sortCustomers = new ArrayList<Customer>();
		sortCustomers.addAll(customers);

		Comparator<Customer> nameComparator = new NameComparator();
		Collections.sort(sortCustomers, nameComparator);

		return sortCustomers;
	}

	public List<Customer> findBySpecialCardNumber(List<Customer> customers, long min, long max) {

		if (min > max) {
			long temp = min;
			min = max;
			max = temp;
		}

		List<Customer> specialCustomers = new ArrayList<Customer>();

		for (int i = 0; i < customers.size(); i++) {
			String cardNumber = customers.get(i).getCardNumber();
			long cardNum = Long.parseLong(cardNumber);

			if (cardNum >= min && cardNum <= max) {
				specialCustomers.add(customers.get(i));
			}
		}

		return specialCustomers;
	}
}
