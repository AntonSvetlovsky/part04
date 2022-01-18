package by.epam.jonline_introduction.part04.task14.entity;

public class Account implements Comparable<Account> {

	private String number;
	private boolean active;
	private double balance;

	public Account() {

	}

	public Account(String number, boolean active, double balance) {
		this.number = number;
		this.active = active;
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public boolean isActive() {
		return active;
	}

	public void activate() {
		active = true;
	}

	public void deactivate() {
		active = false;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		Account other = (Account) obj;
		if (active != other.active) {
			return false;
		}
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance)) {
			return false;
		}
		if (number == null) {
			if (other.number != null) {
				return false;
			}
		} else if (!number.equals(other.number)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", active=" + active + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account o) {

		if (this.getBalance() < o.getBalance()) {
			return -1;
		} else if (this.getBalance() > o.getBalance()) {
			return 1;
		} else {
			return 0;
		}
	}

}
