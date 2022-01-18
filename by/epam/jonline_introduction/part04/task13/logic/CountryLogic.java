package by.epam.jonline_introduction.part04.task13.logic;

import by.epam.jonline_introduction.part04.task13.entity.Country;
import by.epam.jonline_introduction.part04.task13.entity.District;
import by.epam.jonline_introduction.part04.task13.entity.Region;

public class CountryLogic {

	public int calculateNumberOfRegions(Country country) {

		return country.getRegions().size();
	}

	public double calculateCountryArea(Country country) {
		double area = 0;

		for (Region region : country.getRegions()) {
			for (District district : region.getDistricts()) {
				area += district.getDistrictArea();
			}
		}

		return area;
	}
}
