package by.epam.jonline_introduction.part04.task12.view;

import by.epam.jonline_introduction.part04.task12.entity.Car;

public class CarView {

	public void showCarsBrand(Car car) {
		System.out.println("Cars Brand : " + car.getBrandName());
	}
}
