package gruppo15.gruppo15;

public class BoxTruck extends Truck{
	// Attributi
	private final boolean lutonBody;
	
	// Costruttori
	public BoxTruck(boolean lutonBody, String chassisID, DriveWheelType dw, int year, int month,
			int dayOfMonth, TruckType tt, int truckClass) {
		super(chassisID, dw, year, month, dayOfMonth, tt, truckClass);
		this.lutonBody = lutonBody;
	}
	public BoxTruck(String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth,
			TruckType tt, int truckClass) {
		super(chassisID, dw, year, month, dayOfMonth, tt, truckClass);
		this.lutonBody = false;
	}
	
	public boolean hasLutonBody() {
		return lutonBody;
	}
	
	public boolean validateTruck() {
		if(getChassisID().matches("B\\w{3}\\d{3}") && getTruckClass()<8 && getTruckClass()>1) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		if(lutonBody) {
			return "BoxTruck\n" + super.toString() + "with Luton Body";
		}
		return "BoxTruck\n" + super.toString();
	}
}
