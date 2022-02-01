package by.epam.jonline_introduction.part04.aggregation_and_composition.task14.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.epam.jonline_introduction.part04.aggregation_and_composition.task14.entity.*;

public class AccountLogic {

	public void addFunds(Account account, double value) {
		if (account.isActive()) {
			account.setBalance(account.getBalance() + value);
		}
	}

	public Account findAccountByNumber(List<Account> accounts, String number) {

		Account searchedAccount = null;

		for (Account account : accounts) {
			if (account.getNumber().equalsIgnoreCase(number)) {
				searchedAccount = account;
			}
		}

		return searchedAccount;
	}

	public List<Account> findActiveAccounts(List<Account> accounts) {

		List<Account> activeAccounts = new ArrayList<Account>();

		for (Account account : accounts) {
			if (account.isActive()) {
				activeAccounts.add(account);
			}
		}

		return activeAccounts;
	}

	public List<Account> findBlockedAccounts(List<Account> accounts) {

		List<Account> blockedAccounts = new ArrayList<Account>();

		for (Account account : accounts) {
			if (!account.isActive()) {
				blockedAccounts.add(account);
			}
		}

		return blockedAccounts;
	}

	public List<Account> sortAccountsByBalance(List<Account> accounts) {

		List<Account> sortedAccounts = new ArrayList<Account>();
		sortedAccounts.addAll(accounts);

		Collections.sort(sortedAccounts);

		return sortedAccounts;
	}

	public double calculateSummaryBalance(List<Account> accounts) {

		double sum = 0;

		for (Account account : accounts) {
			sum += account.getBalance();
		}

		return sum;
	}

	public double calculatePositiveBalance(List<Account> accounts) {

		double sum = 0;

		for (Account account : accounts) {
			if (account.getBalance() > 0) {
				sum += account.getBalance();
			}
		}

		return sum;
	}

	public double calculateNegativeBalance(List<Account> accounts) {

		double sum = 0;

		for (Account account : accounts) {
			if (account.getBalance() < 0) {
				sum += account.getBalance();
			}
		}

		return sum;
	}
}
