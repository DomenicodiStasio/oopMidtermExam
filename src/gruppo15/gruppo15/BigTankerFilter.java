package gruppo15.gruppo15;

public class BigTankerFilter implements TruckFilter{
	private int minCapacity;
	public BigTankerFilter (int minCapacity) {
		this.minCapacity = minCapacity;
	}
	@Override
	public boolean checkTruck(Truck t) {
		if(t instanceof Tanker) {
			if(((Tanker) t).getCapacity() >= minCapacity) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
