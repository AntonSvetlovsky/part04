package by.epam.jonline_introduction.part04.aggregation_and_composition.task13.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private String regionName;
	private City regionCapitalCity;
	private List<District> districts;

	{
		districts = new ArrayList<District>();
	}

	public Region() {

	}

	public Region(String regionName, City regionCapitalCity) {
		this.regionName = regionName;
		this.regionCapitalCity = regionCapitalCity;
	}

	public Region(String regionName, City regionCapitalCity, List<District> districts) {
		this.regionName = regionName;
		this.regionCapitalCity = regionCapitalCity;
		this.districts = districts;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public City getRegionCapitalCity() {
		return regionCapitalCity;
	}

	public void setRegionCapitalCity(City regionCapitalCity) {
		this.regionCapitalCity = regionCapitalCity;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public void addDistrict(District district) {
		districts.add(district);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((regionCapitalCity == null) ? 0 : regionCapitalCity.hashCode());
		result = prime * result + ((regionName == null) ? 0 : regionName.hashCode());
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
		Region other = (Region) obj;
		if (districts == null) {
			if (other.districts != null) {
				return false;
			}
		} else if (!districts.equals(other.districts)) {
			return false;
		}
		if (regionCapitalCity == null) {
			if (other.regionCapitalCity != null) {
				return false;
			}
		} else if (!regionCapitalCity.equals(other.regionCapitalCity)) {
			return false;
		}
		if (regionName == null) {
			if (other.regionName != null) {
				return false;
			}
		} else if (!regionName.equals(other.regionName)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Region [regionName=" + regionName + ", regionCapitalCity=" + regionCapitalCity + ", districts="
				+ districts + "]";
	}

}
