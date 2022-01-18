package by.epam.jonline_introduction.part04.task12.entity;

public class Engine {

	private double volume;
	private EngineStatus engineStatus;

	{
		engineStatus = EngineStatus.OFF;
	}

	public Engine() {

	}

	public Engine(double volume) {
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public EngineStatus getEngineStatus() {
		return engineStatus;
	}

	public void startEngine() {
		engineStatus = EngineStatus.ON;
	}

	public void stopEngine() {
		engineStatus = EngineStatus.OFF;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engineStatus == null) ? 0 : engineStatus.hashCode());
		long temp;
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Engine other = (Engine) obj;
		if (engineStatus != other.engineStatus) {
			return false;
		}
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Engine [volume=" + volume + ", engineStatus=" + engineStatus + "]";
	}

}
