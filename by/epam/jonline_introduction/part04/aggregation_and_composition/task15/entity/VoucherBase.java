package by.epam.jonline_introduction.part04.aggregation_and_composition.task15.entity;

import java.util.ArrayList;
import java.util.List;

public class VoucherBase {

	private List<TravelVoucher> travelVoucherList;

	{
		travelVoucherList = new ArrayList<TravelVoucher>();
	}

	public VoucherBase() {

	}

	public VoucherBase(List<TravelVoucher> travelVoucherList) {
		this.travelVoucherList = travelVoucherList;
	}

	public List<TravelVoucher> getTravelVoucherList() {
		return travelVoucherList;
	}

	public void setTravelVoucherList(List<TravelVoucher> travelVoucherList) {
		this.travelVoucherList = travelVoucherList;
	}

	public void addTravelVoucher(TravelVoucher travelVoucher) {
		travelVoucherList.add(travelVoucher);
	}

	public void deleteTravelVoucher(TravelVoucher travelVoucher) {
		travelVoucherList.remove(travelVoucher);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((travelVoucherList == null) ? 0 : travelVoucherList.hashCode());
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
		VoucherBase other = (VoucherBase) obj;
		if (travelVoucherList == null) {
			if (other.travelVoucherList != null) {
				return false;
			}
		} else if (!travelVoucherList.equals(other.travelVoucherList)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "VoucherBase [travelVoucherList=" + travelVoucherList + "]";
	}

}
