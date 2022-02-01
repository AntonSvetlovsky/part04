package by.epam.jonline_introduction.part04.aggregation_and_composition.task12.logic;

import by.epam.jonline_introduction.part04.aggregation_and_composition.task12.entity.*;

public class CarLogic {

	public void refuelCar(Car car) {
		if (car.getFuelTank().getFuelTankStatus() == Status.FULL) {
			System.out.println("You cant refuel, cars fuel tank is full!");
		} else {
			car.getFuelTank().refuel();
			System.out.println("Your car was refueled!");
		}
	}

	public void changeWheel(Car car, int numberOfWheel) {
		if (numberOfWheel < 0 || numberOfWheel > 3) {
			System.out.println("The car has only 4 wheels, you cant replace unexisting wheel!");
		} else {
			car.setSpareWheel(car.getWheels().set(numberOfWheel, car.getSpareWheel()));
		}
	}

	public void driveCar(Car car) {

		if (checkWheels(car) && checkFuelLevel(car)) {
			car.getEngine().startEngine();
			System.out.println("Enjoy your riding!");
		} else {
			System.out.println("You cant drive, you have to fix some problems!");
		}
	}

	public boolean checkFuelLevel(Car car) {
		if (car.getFuelTank().getFuelTankStatus() == Status.EMPTY) {
			System.out.println("You cant drive, you have to refuel your car!");
			return false;
		} else {
			return true;
		}
	}

	public boolean checkWheels(Car car) {
		for (Wheel wheel : car.getWheels()) {
			if (wheel == null) {
				System.out.println("You cant drive, you've got some problems with wheels!");
				return false;
			}
			if (wheel.getStatus() == Status.EMPTY) {
				System.out.println("You cant drive, you have to inflate the wheels, or replace the broken one!");
				return false;
			}
		}

		return true;
	}
}
