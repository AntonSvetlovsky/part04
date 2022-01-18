package by.epam.jonline_introduction.part04.task13.entity;

import java.util.ArrayList;
import java.util.List;

public class Country {

	private String countryName;
	private City capitalCity;
	private List<Region> regions;

	{
		regions = new ArrayList<Region>();
	}

	public Country() {

	}

	public Country(String countryName, City capitalCity) {
		this.countryName = countryName;
		this.capitalCity = capitalCity;
	}

	public Country(String countryName, City capitalCity, List<Region> regions) {
		this.countryName = countryName;
		this.capitalCity = capitalCity;
		this.regions = regions;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public City getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(City capitalCity) {
		this.capitalCity = capitalCity;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public void addRegion(Region region) {
		regions.add(region);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitalCity == null) ? 0 : capitalCity.hashCode());
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		Country other = (Country) obj;
		if (capitalCity == null) {
			if (other.capitalCity != null) {
				return false;
			}
		} else if (!capitalCity.equals(other.capitalCity)) {
			return false;
		}
		if (countryName == null) {
			if (other.countryName != null) {
				return false;
			}
		} else if (!countryName.equals(other.countryName)) {
			return false;
		}
		if (regions == null) {
			if (other.regions != null) {
				return false;
			}
		} else if (!regions.equals(other.regions)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capitalCity=" + capitalCity + ", regions=" + regions + "]";
	}

}
