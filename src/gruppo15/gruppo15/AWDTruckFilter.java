package gruppo15.gruppo15;

public class AWDTruckFilter implements TruckFilter{

	@Override
	public boolean checkTruck(Truck t) {
		//Controlla se il Truck è a trazione integrale
		if(t.getDw() == DriveWheelType.AWD_4X4 || t.getDw() == DriveWheelType.AWD_6X6) {
			return true;
		}else {
			return false;
		}
	}

}
