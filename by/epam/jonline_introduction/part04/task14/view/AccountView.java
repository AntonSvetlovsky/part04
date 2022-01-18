package by.epam.jonline_introduction.part04.task14.view;

import java.util.List;

import by.epam.jonline_introduction.part04.task14.entity.Account;
import by.epam.jonline_introduction.part04.task14.entity.Customer;

public class AccountView {

	public void showBalance(String message, Customer customer, double balance) {
		System.out.println(message);
		System.out.format("%16s%16s%16s", "First Name", "Last Name", "Balance");
		System.out.println();
		System.out.format("%16s%16s%16.2f", customer.getFirstName(), customer.getLastName(), balance);
		System.out.println();
	}

	public void showAccounts(String message, Customer customer, List<Account> accounts) {
		System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
		System.out.println(message);
		System.out.format("%16s%12s%16s", "Account Number", "Active", "Balance");
		System.out.println();
		for (Account account : accounts) {
			System.out.format("%16s%12b%16.2f", account.getNumber(), account.isActive(), account.getBalance());
			System.out.println();
		}
	}

	public void showAccounts(String message, Customer customer, Account account) {
		System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
		System.out.println(message);
		System.out.format("%16s%12s%16s", "Account Number", "Active", "Balance");
		System.out.println();
		System.out.format("%16s%12s%16.2f", account.getNumber(), account.isActive(), account.getBalance());
		System.out.println();
	}
}
