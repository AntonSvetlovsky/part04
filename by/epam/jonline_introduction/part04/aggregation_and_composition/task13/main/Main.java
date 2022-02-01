/*
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

package by.epam.jonline_introduction.part04.aggregation_and_composition.task13.main;

import by.epam.jonline_introduction.part04.aggregation_and_composition.task13.entity.*;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task13.view.CountryView;

public class Main {

	public static void main(String[] args) {

		Region region1 = new Region("Region1", new City("City1"));
		Region region2 = new Region("Region2", new City("City2"));
		Region region3 = new Region("Region1", new City("City3"));

		region1.addDistrict(new District("District1", 10));
		region1.addDistrict(new District("District2", 20));
		region2.addDistrict(new District("District3", 25.5));
		region2.addDistrict(new District("District4", 12.5));
		region3.addDistrict(new District("District5", 19));
		region3.addDistrict(new District("District6", 23.5));

		Country country1 = new Country("Country1", new City("City0"));

		country1.addRegion(region1);
		country1.addRegion(region2);
		country1.addRegion(region3);

		CountryView view = new CountryView();

		view.showCountryName(country1);
		view.showCountryCapital(country1);
		view.showNumberOfRegions(country1);
		view.showCountryArea(country1);
		view.showAllRegionalCentres(country1);
	}

}
