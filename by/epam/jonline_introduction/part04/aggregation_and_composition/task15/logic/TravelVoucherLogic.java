package by.epam.jonline_introduction.part04.aggregation_and_composition.task15.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TravelVoucher;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TypeOfMeal;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TypeOfTransport;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TypeOfTravel;

public class TravelVoucherLogic {

	public List<TravelVoucher> findByTypeOfTravel(List<TravelVoucher> list, TypeOfTravel typeOfTravel) {

		List<TravelVoucher> requestedList = new ArrayList<TravelVoucher>();

		for (TravelVoucher travelVoucher : list) {
			if (travelVoucher.getTypeOfTravel() == typeOfTravel) {
				requestedList.add(travelVoucher);
			}
		}

		return requestedList;
	}

	public List<TravelVoucher> findByCountry(List<TravelVoucher> list, String country) {

		List<TravelVoucher> requestedList = new ArrayList<TravelVoucher>();

		for (TravelVoucher travelVoucher : list) {
			if (travelVoucher.getCountry().equalsIgnoreCase(country)) {
				requestedList.add(travelVoucher);
			}
		}

		return requestedList;
	}

	public List<TravelVoucher> findByNumberOfDays(List<TravelVoucher> list, int numberOfDays) {

		List<TravelVoucher> requestedList = new ArrayList<TravelVoucher>();

		for (TravelVoucher travelVoucher : list) {
			if (travelVoucher.getNumberOfDays() == numberOfDays) {
				requestedList.add(travelVoucher);
			}
		}

		return requestedList;
	}

	public List<TravelVoucher> findByTypeOfMeal(List<TravelVoucher> list, TypeOfMeal typeOfMeal) {

		List<TravelVoucher> requestedList = new ArrayList<TravelVoucher>();

		for (TravelVoucher travelVoucher : list) {
			if (travelVoucher.getTypeOfMeal() == typeOfMeal) {
				requestedList.add(travelVoucher);
			}
		}

		return requestedList;
	}

	public List<TravelVoucher> findByTypeOfTransport(List<TravelVoucher> list, TypeOfTransport typeOfTransport) {

		List<TravelVoucher> requestedList = new ArrayList<TravelVoucher>();

		for (TravelVoucher travelVoucher : list) {
			if (travelVoucher.getTypeOfTransport() == typeOfTransport) {
				requestedList.add(travelVoucher);
			}
		}

		return requestedList;
	}

	public void sortByTypeOfTravel(List<TravelVoucher> list) {

		list.sort(Comparator.comparing((TravelVoucher voucher) -> voucher.getTypeOfTravel()));

	}

	public void sortByCountry(List<TravelVoucher> list) {

		list.sort(Comparator.comparing((TravelVoucher voucher) -> voucher.getCountry()));
	}

	public void sortByNumberOfDays(List<TravelVoucher> list) {

		list.sort(Comparator.comparing((TravelVoucher voucher) -> voucher.getNumberOfDays()));

	}

	public void sortByTypeOfMeal(List<TravelVoucher> list) {

		list.sort(Comparator.comparing((TravelVoucher voucher) -> voucher.getTypeOfMeal()));

	}

	public void sortByTypeOfTransport(List<TravelVoucher> list) {

		list.sort(Comparator.comparing((TravelVoucher voucher) -> voucher.getTypeOfTransport()));

	}

	public List<Integer> createListNumberOfDays(List<TravelVoucher> list) {

		List<Integer> daysList = new ArrayList<Integer>();

		for (TravelVoucher voucher : list) {
			boolean flag = true;
			for (Integer integer : daysList) {
				if (integer.equals(voucher.getNumberOfDays())) {
					flag = false;
				}
			}
			if (flag) {
				daysList.add(voucher.getNumberOfDays());
			}
		}

		Collections.sort(daysList);

		return daysList;
	}

	public List<TypeOfMeal> createListTypesOfMeal(List<TravelVoucher> list) {

		List<TypeOfMeal> mealList = new ArrayList<TypeOfMeal>();

		for (TravelVoucher voucher : list) {
			boolean flag = true;
			for (TypeOfMeal typeOfMeal : mealList) {
				if (voucher.getTypeOfMeal() == typeOfMeal) {
					flag = false;
				}
			}
			if (flag) {
				mealList.add(voucher.getTypeOfMeal());
			}
		}

		return mealList;
	}

	public List<TypeOfTransport> createListTypesOfTransport(List<TravelVoucher> list) {

		List<TypeOfTransport> transportList = new ArrayList<TypeOfTransport>();

		for (TravelVoucher voucher : list) {
			boolean flag = true;
			for (TypeOfTransport typeOfTransport : transportList) {
				if (voucher.getTypeOfTransport() == typeOfTransport) {
					flag = false;
				}
			}
			if (flag) {
				transportList.add(voucher.getTypeOfTransport());
			}
		}

		return transportList;
	}
}
