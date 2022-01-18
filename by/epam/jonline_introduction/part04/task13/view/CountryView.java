package by.epam.jonline_introduction.part04.task13.view;

import by.epam.jonline_introduction.part04.task13.entity.*;
import by.epam.jonline_introduction.part04.task13.logic.CountryLogic;

public class CountryView {

	CountryLogic logic = new CountryLogic();

	public void showCountryName(Country country) {
		System.out.println("Country: " + country.getCountryName() + "\n");
	}

	public void showCountryCapital(Country country) {
		System.out.println("Capital: " + country.getCapitalCity().getCityName() + "\n");
	}

	public void showNumberOfRegions(Country country) {
		System.out.println("Number of regions: " + logic.calculateNumberOfRegions(country) + "\n");
	}

	public void showCountryArea(Country country) {
		System.out.println("Country area: " + logic.calculateCountryArea(country) + " sq.km" + "\n");
	}

	public void showAllRegionalCentres(Country country) {
		System.out.println("Regional centres: ");
		for (Region region : country.getRegions()) {
			System.out.println(region.getRegionCapitalCity().getCityName());
		}
	}
}
