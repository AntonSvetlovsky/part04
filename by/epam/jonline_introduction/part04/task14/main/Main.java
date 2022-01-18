/*
 * Счета. Клиент может иметь несколько счетов в банке.
 * Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей
 * суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 */

package by.epam.jonline_introduction.part04.task14.main;

import by.epam.jonline_introduction.part04.task14.entity.*;
import by.epam.jonline_introduction.part04.task14.logic.AccountLogic;
import by.epam.jonline_introduction.part04.task14.view.AccountView;

public class Main {

	public static void main(String[] args) {

		AccountLogic logic = new AccountLogic();
		AccountView view = new AccountView();
		Customer customer = new Customer("John", "Smith");

		customer.addAccount(new Account("1111000000002222", false, 0));
		customer.addAccount(new Account("1111000000003333", true, 2358));
		customer.addAccount(new Account("1111000000004444", true, 5723.85));
		customer.addAccount(new Account("1111000000005555", true, -756.35));
		customer.addAccount(new Account("1111000000006666", false, -3256.15));
		customer.addAccount(new Account("1111000000007777", true, 2556.95));
		customer.addAccount(new Account("1111000000008888", true, -56.25));
		customer.addAccount(new Account("1111000000009999", true, -856.35));

		Account account1;
		account1 = logic.findAccountByNumber(customer.getAccounts(), "1111000000002222");
		view.showAccounts("------", customer, account1);
		logic.addFunds(account1, 1522);
		account1.activate();
		view.showAccounts("Account was activated", customer, account1);
		logic.addFunds(account1, 1522);
		view.showAccounts("Account was activated, funds was added:", customer, account1);

		Account account2;
		account2 = logic.findAccountByNumber(customer.getAccounts(), "1111000000003333");
		view.showAccounts("------", customer, account2);
		account2.deactivate();
		view.showAccounts("------", customer, account2);

		view.showAccounts("Accounts sorted by balance:", customer, logic.sortAccountsByBalance(customer.getAccounts()));
		view.showBalance("Summary balance: ", customer, logic.calculateSummaryBalance(customer.getAccounts()));
		view.showBalance("Negative balance:", customer, logic.calculateNegativeBalance(customer.getAccounts()));
		view.showBalance("Positive balance:", customer, logic.calculatePositiveBalance(customer.getAccounts()));

		view.showAccounts("Active accounts", customer, logic.findActiveAccounts(customer.getAccounts()));
		view.showAccounts("Blocked accounts", customer, logic.findBlockedAccounts(customer.getAccounts()));
		view.showBalance("Summary balance on active accounts", customer,
				logic.calculateSummaryBalance(logic.findActiveAccounts(customer.getAccounts())));
	}

}
