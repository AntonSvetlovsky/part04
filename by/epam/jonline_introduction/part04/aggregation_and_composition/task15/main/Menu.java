package by.epam.jonline_introduction.part04.aggregation_and_composition.task15.main;

import java.util.ArrayList;
import java.util.List;

import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TravelVoucher;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TypeOfMeal;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TypeOfTransport;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TypeOfTravel;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.logic.TravelVoucherLogic;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.view.TravelVoucherView;

public class Menu {

	public void menu(List<TravelVoucher> list) {

		TravelVoucherView view = new TravelVoucherView();
		TravelVoucherLogic logic = new TravelVoucherLogic();

		List<TravelVoucher> list01 = new ArrayList<TravelVoucher>();
		TypeOfTravel[] arr1 = TypeOfTravel.values();
		String typesOfTravel = "";
		for (int i = 0; i < arr1.length; i++) {
			typesOfTravel = typesOfTravel + (i + 1) + ". " + arr1[i] + "\n";
		}
		int key = 0;
		boolean correctInput = false;
		while (!correctInput) {

			key = view.read("Choose a type of travel" + "\n" + typesOfTravel + "Enter a choise (1 - 6)");

			switch (key) {
			case 1:
				list01 = logic.findByTypeOfTravel(list, TypeOfTravel.RESORT);
				logic.sortByNumberOfDays(list01);
				view.showVouchers(list01);
				correctInput = true;
				break;
			case 2:
				list01 = logic.findByTypeOfTravel(list, TypeOfTravel.EXCURSION);
				logic.sortByNumberOfDays(list01);
				view.showVouchers(list01);
				correctInput = true;
				break;
			case 3:
				list01 = logic.findByTypeOfTravel(list, TypeOfTravel.CRUISE);
				logic.sortByNumberOfDays(list01);
				view.showVouchers(list01);
				correctInput = true;
				break;
			case 4:
				list01 = logic.findByTypeOfTravel(list, TypeOfTravel.ADVENTURE);
				logic.sortByNumberOfDays(list01);
				view.showVouchers(list01);
				correctInput = true;
				break;
			case 5:
				list01 = logic.findByTypeOfTravel(list, TypeOfTravel.HEALTH_RESORT);
				logic.sortByNumberOfDays(list01);
				view.showVouchers(list01);
				correctInput = true;
				break;
			case 6:
				list01 = logic.findByTypeOfTravel(list, TypeOfTravel.SHOPPING);
				logic.sortByNumberOfDays(list01);
				view.showVouchers(list01);
				correctInput = true;
				break;
			default:
				view.showError("Invalid input. Please repeat.");
				correctInput = false;
				break;
			}
		}

		List<Integer> daysList = logic.createListNumberOfDays(list01);
		String availableDays = "";
		for (int i = 0; i < daysList.size(); i++) {
			availableDays = availableDays + (i + 1) + ". " + daysList.get(i) + "\n";
		}
		boolean correctInput1 = false;

		while (!correctInput1) {
			key = view.read("Choose number of days :" + "\n" + availableDays);
			if (key > 0 && key <= daysList.size()) {
				correctInput1 = true;
			}
		}

		List<TravelVoucher> list02;
		list02 = logic.findByNumberOfDays(list01, daysList.get(key - 1));
		logic.sortByTypeOfMeal(list02);
		view.showVouchers(list02);

		List<TypeOfMeal> mealList = logic.createListTypesOfMeal(list02);
		String availableMeal = "";

		for (int i = 0; i < mealList.size(); i++) {
			availableMeal = availableMeal + (i + 1) + ". " + mealList.get(i) + "\n";
		}

		boolean correctInput2 = false;

		while (!correctInput2) {
			key = view.read("Choose a type of meal :" + "\n" + availableMeal);
			if (key > 0 && key <= mealList.size()) {
				correctInput2 = true;
			}
		}
		List<TravelVoucher> list03;
		list03 = logic.findByTypeOfMeal(list02, mealList.get(key - 1));
		logic.sortByTypeOfTransport(list03);
		view.showVouchers(list03);

		List<TypeOfTransport> transportList = logic.createListTypesOfTransport(list03);
		String availableTransport = "";

		for (int i = 0; i < transportList.size(); i++) {
			availableTransport = availableTransport + (i + 1) + ". " + transportList.get(i) + "\n";
		}

		boolean correctInput3 = false;

		while (!correctInput3) {
			key = view.read("Choose a type of transport :" + "\n" + availableTransport);
			if (key > 0 && key <= transportList.size()) {
				correctInput3 = true;
			}
		}
		List<TravelVoucher> list04;
		list04 = logic.findByTypeOfTransport(list03, transportList.get(key - 1));
		logic.sortByCountry(list04);
		view.showVouchers(list04);

		boolean correctInput4 = false;

		while (!correctInput4) {
			key = view.read("Choose your tour from above!");
			if (key > 0 && key <= list04.size()) {
				correctInput4 = true;
			}
		}

		TravelVoucher yourTour = list04.get(key - 1);
		view.showTour("Congratulations!!! Your tour is :\n", yourTour);

	}
}
