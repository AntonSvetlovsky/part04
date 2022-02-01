package by.epam.jonline_introduction.part04.aggregation_and_composition.task12.entity;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private String brandName;
	private Engine engine;
	private List<Wheel> wheels;
	private FuelTank fuelTank;
	private Wheel spareWheel;
	private static final int NUMBER_OF_WHEELS = 4;

	{
		wheels = new ArrayList<Wheel>(NUMBER_OF_WHEELS);
		engine = new Engine();
		fuelTank = new FuelTank();
		spareWheel = new Wheel();
	}

	public Car() {

	}

	public Car(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public FuelTank getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
	}

	public Wheel getSpareWheel() {
		return spareWheel;
	}

	public void setSpareWheel(Wheel spareWheel) {
		this.spareWheel = spareWheel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((fuelTank == null) ? 0 : fuelTank.hashCode());
		result = prime * result + ((spareWheel == null) ? 0 : spareWheel.hashCode());
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Car other = (Car) obj;
		if (brandName == null) {
			if (other.brandName != null) {
				return false;
			}
		} else if (!brandName.equals(other.brandName)) {
			return false;
		}
		if (engine == null) {
			if (other.engine != null) {
				return false;
			}
		} else if (!engine.equals(other.engine)) {
			return false;
		}
		if (fuelTank == null) {
			if (other.fuelTank != null) {
				return false;
			}
		} else if (!fuelTank.equals(other.fuelTank)) {
			return false;
		}
		if (spareWheel == null) {
			if (other.spareWheel != null) {
				return false;
			}
		} else if (!spareWheel.equals(other.spareWheel)) {
			return false;
		}
		if (wheels == null) {
			if (other.wheels != null) {
				return false;
			}
		} else if (!wheels.equals(other.wheels)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Car [brandName=" + brandName + ", engine=" + engine + ", wheels=" + wheels + ", fuelTank=" + fuelTank
				+ ", spareWheel=" + spareWheel + "]";
	}

}
