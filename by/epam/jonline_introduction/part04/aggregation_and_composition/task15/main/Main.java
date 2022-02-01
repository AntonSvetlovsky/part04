/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 *  Учитывать возможность выбора транспорта, питания и числа дней. 
 *  Реализовать выбор и сортировку путевок.
 */

package by.epam.jonline_introduction.part04.aggregation_and_composition.task15.main;

import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TravelVoucher;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TypeOfMeal;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TypeOfTransport;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.TypeOfTravel;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity.VoucherBase;

public class Main {

	public static void main(String[] args) {

		VoucherBase base = new VoucherBase();
		Menu menu = new Menu();

		base.addTravelVoucher(new TravelVoucher("Montenegro", TypeOfTravel.RESORT, TypeOfTransport.BUS,
				TypeOfMeal.NOT_INCLUDED, 14, 1000));
		base.addTravelVoucher(new TravelVoucher("Egypt", TypeOfTravel.RESORT, TypeOfTransport.AIRPLANE,
				TypeOfMeal.ALL_INCLUSIVE, 7, 700));
		base.addTravelVoucher(
				new TravelVoucher("Italy", TypeOfTravel.RESORT, TypeOfTransport.TRAIN, TypeOfMeal.HALF_BOARD, 10, 900));
		base.addTravelVoucher(new TravelVoucher("Croatia", TypeOfTravel.RESORT, TypeOfTransport.BUS,
				TypeOfMeal.BREAKFAST_ONLY, 7, 700));
		base.addTravelVoucher(new TravelVoucher("Spain", TypeOfTravel.RESORT, TypeOfTransport.AIRPLANE,
				TypeOfMeal.FULL_BOARD, 10, 1000));
		base.addTravelVoucher(new TravelVoucher("Croatia", TypeOfTravel.HEALTH_RESORT, TypeOfTransport.AIRPLANE,
				TypeOfMeal.ALL_INCLUSIVE, 10, 800));
		base.addTravelVoucher(new TravelVoucher("Italy", TypeOfTravel.EXCURSION, TypeOfTransport.TRAIN,
				TypeOfMeal.NOT_INCLUDED, 2, 200));
		base.addTravelVoucher(new TravelVoucher("Bulgaria", TypeOfTravel.RESORT, TypeOfTransport.BUS,
				TypeOfMeal.HALF_BOARD, 14, 1200));
		base.addTravelVoucher(new TravelVoucher("France", TypeOfTravel.EXCURSION, TypeOfTransport.BUS,
				TypeOfMeal.BREAKFAST_ONLY, 2, 210));
		base.addTravelVoucher(new TravelVoucher("England", TypeOfTravel.EXCURSION, TypeOfTransport.AIRPLANE,
				TypeOfMeal.NOT_INCLUDED, 2, 220));
		base.addTravelVoucher(new TravelVoucher("Spain", TypeOfTravel.RESORT, TypeOfTransport.AIRPLANE,
				TypeOfMeal.FULL_BOARD, 7, 700));
		base.addTravelVoucher(new TravelVoucher("Iceland", TypeOfTravel.HEALTH_RESORT, TypeOfTransport.SHIP,
				TypeOfMeal.ALL_INCLUSIVE, 14, 2100));
		base.addTravelVoucher(new TravelVoucher("Turkey", TypeOfTravel.HEALTH_RESORT, TypeOfTransport.AIRPLANE,
				TypeOfMeal.ALL_INCLUSIVE, 10, 1500));
		base.addTravelVoucher(new TravelVoucher("Egypt", TypeOfTravel.RESORT, TypeOfTransport.AIRPLANE,
				TypeOfMeal.ALL_INCLUSIVE, 10, 1000));
		base.addTravelVoucher(new TravelVoucher("Germany", TypeOfTravel.SHOPPING, TypeOfTransport.BUS,
				TypeOfMeal.NOT_INCLUDED, 1, 110));
		base.addTravelVoucher(new TravelVoucher("USA", TypeOfTravel.ADVENTURE, TypeOfTransport.SHIP,
				TypeOfMeal.FULL_BOARD, 25, 3200));
		base.addTravelVoucher(new TravelVoucher("Italy", TypeOfTravel.SHOPPING, TypeOfTransport.TRAIN,
				TypeOfMeal.NOT_INCLUDED, 2, 120));
		base.addTravelVoucher(new TravelVoucher("Croatia", TypeOfTravel.ADVENTURE, TypeOfTransport.BUS,
				TypeOfMeal.FULL_BOARD, 15, 1250));
		base.addTravelVoucher(new TravelVoucher("Different countries", TypeOfTravel.CRUISE, TypeOfTransport.SHIP,
				TypeOfMeal.ALL_INCLUSIVE, 30, 3000));
		base.addTravelVoucher(new TravelVoucher("Spain", TypeOfTravel.RESORT, TypeOfTransport.TRAIN,
				TypeOfMeal.ALL_INCLUSIVE, 14, 1200));
		base.addTravelVoucher(new TravelVoucher("Different countries", TypeOfTravel.CRUISE, TypeOfTransport.SHIP,
				TypeOfMeal.ALL_INCLUSIVE, 25, 2900));
		base.addTravelVoucher(new TravelVoucher("Germany", TypeOfTravel.ADVENTURE, TypeOfTransport.BUS,
				TypeOfMeal.FULL_BOARD, 15, 1100));

		menu.menu(base.getTravelVoucherList());
	}

}
