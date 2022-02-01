package by.epam.jonline_introduction.part04.aggregation_and_composition.task13.entity;

public class District {

	private String districtName;
	private double districtArea;

	public District() {

	}

	public District(String districtName, double districtArea) {
		this.districtName = districtName;
		this.districtArea = districtArea;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public double getDistrictArea() {
		return districtArea;
	}

	public void setDistrictArea(double districtArea) {
		this.districtArea = districtArea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(districtArea);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((districtName == null) ? 0 : districtName.hashCode());
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
		District other = (District) obj;
		if (Double.doubleToLongBits(districtArea) != Double.doubleToLongBits(other.districtArea)) {
			return false;
		}
		if (districtName == null) {
			if (other.districtName != null) {
				return false;
			}
		} else if (!districtName.equals(other.districtName)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "District [districtName=" + districtName + ", districtArea=" + districtArea + "]";
	}

}
