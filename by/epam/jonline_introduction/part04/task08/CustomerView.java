package by.epam.jonline_introduction.part04.task08;

import java.util.List;
import java.util.Scanner;

public class CustomerView {

	public void print(String message, List<Customer> customers) {
		System.out.println(message);
		System.out.println(".".repeat(114));
		System.out.println(
				"|" + "ID Number " + "|" + "Last Name       " + "|" + "Fist Name       " + "|" + "Second Name     "
						+ "|" + "Address         " + "|" + "Card Number     " + "|" + "Account Number  " + "|");
		System.out.println("|" + "=".repeat(112) + "|");
		for (int i = 0; i < customers.size(); i++) {
			StringBuilder idNumber = new StringBuilder("          ");
			StringBuilder lastName = new StringBuilder("                ");
			StringBuilder firstName = new StringBuilder("                ");
			StringBuilder secondName = new StringBuilder("                ");
			StringBuilder address = new StringBuilder("                ");
			StringBuilder cardNumber = new StringBuilder("                ");
			StringBuilder accountNumber = new StringBuilder("                ");
			String id = "" + customers.get(i).getId();
			String lName = customers.get(i).getLastName();
			String fName = customers.get(i).getFirstName();
			String sName = customers.get(i).getSecondName();
			String addr = customers.get(i).getAddress();
			String cardNum = customers.get(i).getCardNumber();
			String accountNum = customers.get(i).getAccountNumber();

			idNumber.replace(0, id.length(), id);
			lastName.replace(0, lName.length(), lName);
			firstName.replace(0, fName.length(), fName);
			secondName.replace(0, sName.length(), sName);
			address.replace(0, addr.length(), addr);
			cardNumber.replace(0, cardNum.length(), cardNum);
			accountNumber.replace(0, accountNum.length(), accountNum);

			System.out.println("|" + idNumber + "|" + lastName + "|" + firstName + "|" + secondName + "|" + address
					+ "|" + cardNumber + "|" + accountNumber + "|");
			if (i < customers.size() - 1) {
				System.out.println("|" + "`".repeat(10) + "|" + "`".repeat(16) + "|" + "`".repeat(16) + "|"
						+ "`".repeat(16) + "|" + "`".repeat(16) + "|" + "`".repeat(16) + "|" + "`".repeat(16) + "|");
			}
		}
		System.out.println("`".repeat(114));
	}

	public int readNumber() {
		int input;
		@SuppressWarnings("unused")
		String temp;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(">>");

		while (!sc.hasNextInt()) {
			temp = sc.nextLine();
			System.out.println(">>");
		}

		input = sc.nextInt();

		return input;
	}

	public long readCardNumber() {
		long number;
		@SuppressWarnings("unused")
		String temp;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(">>");

		while (!sc.hasNextLong()) {
			temp = sc.nextLine();
			System.out.println(">>");
		}

		number = sc.nextLong();
		return number;
	}
}
