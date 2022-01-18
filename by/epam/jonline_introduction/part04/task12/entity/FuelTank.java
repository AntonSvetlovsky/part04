package by.epam.jonline_introduction.part04.task12.entity;

public class FuelTank {

	private int volume;
	private Status fuelTankStatus;

	{
		fuelTankStatus = Status.EMPTY;
	}

	public FuelTank() {

	}

	public FuelTank(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Status getFuelTankStatus() {
		return fuelTankStatus;
	}

	public void setFuelTankStatus(Status fuelTankStatus) {
		this.fuelTankStatus = fuelTankStatus;
	}

	public void refuel() {
		fuelTankStatus = Status.FULL;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fuelTankStatus == null) ? 0 : fuelTankStatus.hashCode());
		result = prime * result + volume;
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
		FuelTank other = (FuelTank) obj;
		if (fuelTankStatus != other.fuelTankStatus) {
			return false;
		}
		if (volume != other.volume) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "FuelTank [volume=" + volume + ", fuelTankStatus=" + fuelTankStatus + "]";
	}

}
