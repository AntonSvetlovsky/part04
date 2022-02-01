package by.epam.jonline_introduction.part04.aggregation_and_composition.task15.view;

import java.util.List;
import java.util.Scanner;

import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TravelVoucher;

public class TravelVoucherView {

	public void showError(String error) {
		System.err.println(error);
	}

	public void showVouchers(List<TravelVoucher> list) {

		System.out.printf("%3s%20s%16s%20s%16s%16s", "##", "COUNTRY", "TYPE OF TRAVEL", "TYPE OF TRANSPORT",
				"TYPE OF MEAL", "NUMBER OF DAYS");
		System.out.println();
		System.out.println();
		int i = 1;
		for (TravelVoucher voucher : list) {
			System.out.printf("%4s%20s%16s%20s%16s%16d", i + ".", voucher.getCountry(), voucher.getTypeOfTravel(),
					voucher.getTypeOfTransport(), voucher.getTypeOfMeal(), voucher.getNumberOfDays());
			System.out.println();
			i++;
		}
		System.out.println();
		System.out.println();
	}

	public void showTour(String message, TravelVoucher voucher) {
		System.out.println(message);
		System.out.printf("%8s%20s%16s%20s%16s%16s", "PRICE", "COUNTRY", "TYPE OF TRAVEL", "TYPE OF TRANSPORT",
				"TYPE OF MEAL", "NUMBER OF DAYS");
		System.out.println();
		System.out.println();
		System.out.printf("%8.2f%20s%16s%20s%16s%16d", voucher.getPrice(), voucher.getCountry(),
				voucher.getTypeOfTravel(), voucher.getTypeOfTransport(), voucher.getTypeOfMeal(),
				voucher.getNumberOfDays());
		System.out.println();
	}

	public int read(String message) {
		int input;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		System.out.println(">>");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
			System.out.println(">>");
		}

		input = sc.nextInt();

		return input;
	}
}
