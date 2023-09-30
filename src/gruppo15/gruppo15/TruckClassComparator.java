package gruppo15.gruppo15;

import java.util.Comparator;

public class TruckClassComparator implements Comparator<Truck>{

	@Override
	public int compare(Truck o1, Truck o2) {
		if(o1.getTruckClass() == o2.getTruckClass()) {
			return o1.compareTo(o2);
		}else if(o1.getTruckClass() < o2.getTruckClass()) {
			return -1; //!!!!
		}else {
			return 1; //!!!!
		}
	}

}
