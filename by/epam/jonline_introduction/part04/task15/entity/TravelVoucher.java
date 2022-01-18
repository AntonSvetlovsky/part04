package by.epam.jonline_introduction.part04.task15.entity;

public class TravelVoucher {

	private String country;
	private TypeOfTravel typeOfTravel;
	private TypeOfTransport typeOfTransport;
	private TypeOfMeal typeOfMeal;
	private int numberOfDays;
	private double price;

	public TravelVoucher() {

	}

	public TravelVoucher(String country, TypeOfTravel typeOfTravel, TypeOfTransport typeOfTransport,
			TypeOfMeal typeOfMeal, int numberOfDays, double price) {
		this.country = country;
		this.typeOfTravel = typeOfTravel;
		this.typeOfTransport = typeOfTransport;
		this.typeOfMeal = typeOfMeal;
		this.numberOfDays = numberOfDays;
		this.price = price;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public TypeOfTravel getTypeOfTravel() {
		return typeOfTravel;
	}

	public void setTypeOfTravel(TypeOfTravel typeOfTravel) {
		this.typeOfTravel = typeOfTravel;
	}

	public TypeOfTransport getTypeOfTransport() {
		return typeOfTransport;
	}

	public void setTypeOfTransport(TypeOfTransport typeOfTransport) {
		this.typeOfTransport = typeOfTransport;
	}

	public TypeOfMeal getTypeOfMeal() {
		return typeOfMeal;
	}

	public void setTypeOfMeal(TypeOfMeal typeOfMeal) {
		this.typeOfMeal = typeOfMeal;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + numberOfDays;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((typeOfMeal == null) ? 0 : typeOfMeal.hashCode());
		result = prime * result + ((typeOfTransport == null) ? 0 : typeOfTransport.hashCode());
		result = prime * result + ((typeOfTravel == null) ? 0 : typeOfTravel.hashCode());
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
		TravelVoucher other = (TravelVoucher) obj;
		if (country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!country.equals(other.country)) {
			return false;
		}
		if (numberOfDays != other.numberOfDays) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		if (typeOfMeal != other.typeOfMeal) {
			return false;
		}
		if (typeOfTransport != other.typeOfTransport) {
			return false;
		}
		if (typeOfTravel != other.typeOfTravel) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "TravelVoucher [country=" + country + ", typeOfTravel=" + typeOfTravel + ", typeOfTransport="
				+ typeOfTransport + ", typeOfMeal=" + typeOfMeal + ", numberOfDays=" + numberOfDays + ", price=" + price
				+ "]";
	}

}
