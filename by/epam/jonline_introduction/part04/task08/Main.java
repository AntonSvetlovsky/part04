/*
 * Создать класс Customer, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод  toString().                                         +
 * Создать второй класс, агрегирующий массив типа Customer, с
 * подходящими конструкторами и методами. Задать критерии выбора
 * данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной
 * карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится
 * в заданном интервале.
 */

package by.epam.jonline_introduction.part04.task08;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		CustomerList customerList = new CustomerList();
		CustomerLogic customerLogic = new CustomerLogic();
		CustomerView customerView = new CustomerView();

		customerList.addCustomer(
				new Customer("Jack", "Peter", "Grealish", "Manchester", "4568000011112358", "1111222233334444"));
		customerList
				.addCustomer(new Customer("Harry", "Edward", "Kane", "London", "7582335511112341", "5555666677778888"));
		customerList.addCustomer(
				new Customer("Kalvin", "Mark", "Phillips", "Leeds", "5875222211115671", "8888999900001111"));
		customerList.addCustomer(
				new Customer("Jordan", "Brian", "Henderson", "Liverpool", "4001333311117894", "2222333344445555"));
		customerList.addCustomer(
				new Customer("Philip", "Walter", "Foden", "Manchester", "2525121211110201", "6666555577778888"));
		customerList.addCustomer(
				new Customer("Benjamin", "James", "Chilwell", "London", "2455333311115801", "9999000011112222"));
		customerList
				.addCustomer(new Customer("Mason", "Tony", "Mount", "London", "4202000058281212", "2222111100007777"));

		List<Customer> sortedList;
		List<Customer> specialList;

		String menuText = "MENU:\n" + "1. Show all customers.\n" + "2. Show all customers in alphabetical order.\n"
				+ "3. Show customers with special card number.\n" + "4. Exit.\n"
				+ "Please select option and press Enter.";
		boolean menu = true;

		while (menu) {

			System.out.println(menuText);
			int key = customerView.readNumber();

			switch (key) {
			case 1:
				customerView.print("All customers", customerList.getCustomers());
				break;
			case 2:
				sortedList = customerLogic.sortByName(customerList.getCustomers());
				customerView.print("All customers sorted in alphabetical order", sortedList);
				break;
			case 3:
				System.out.println("Please enter min card number");
				long min = customerView.readCardNumber();
				System.out.println("Please enter max card number");
				long max = customerView.readCardNumber();
				specialList = customerLogic.findBySpecialCardNumber(customerList.getCustomers(), min, max);
				customerView.print("Customers with special card number", specialList);
				break;
			case 4:
				menu = false;
				break;
			default:
				System.out.println("Please try again.");
				break;
			}
		}

	}
}
