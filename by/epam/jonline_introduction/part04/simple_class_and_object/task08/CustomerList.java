package by.epam.jonline_introduction.part04.simple_class_and_object.task08;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {

	private List<Customer> customers;

	{
		customers = new ArrayList<>();
	}

	public CustomerList(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public CustomerList() {

	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CustomerList other = (CustomerList) obj;
		if (customers == null) {
			if (other.customers != null) {
				return false;
			}
		} else if (!customers.equals(other.customers)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "CustomerList [customers=" + customers + "]";
	}

}