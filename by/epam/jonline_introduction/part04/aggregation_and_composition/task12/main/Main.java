/*
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

package by.epam.jonline_introduction.part04.aggregation_and_composition.task12.main;

import by.epam.jonline_introduction.part04.aggregation_and_composition.task12.entity.Car;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task12.entity.Wheel;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task12.logic.CarLogic;

public class Main {

	public static void main(String[] args) {

		Car car = new Car("Skoda");
		car.getEngine().setVolume(2.0);
		car.getFuelTank().setVolume(40);

		car.getWheels().add(new Wheel(15));
		car.getWheels().add(new Wheel(15));
		car.getWheels().add(new Wheel(15));
		car.getWheels().add(new Wheel(15));

		car.getWheels().get(0).inflate();
		car.getWheels().get(1).inflate();
		car.getWheels().get(2).inflate();
		// car.getWheels().get(3).inflate();

		car.getSpareWheel().setDiameter(15);
		car.getSpareWheel().inflate();

		CarLogic logic = new CarLogic();
		System.out.println(car.toString());
		logic.driveCar(car);
		logic.changeWheel(car, 3);
		System.out.println(car.toString());
		logic.driveCar(car);
		logic.refuelCar(car);
		System.out.println(car.toString());
		logic.driveCar(car);
		System.out.println(car.toString());
	}
}
