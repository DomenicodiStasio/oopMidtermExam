/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppo15.gruppo15;

/**
 *
 * @author Gruppo15
 */
public class Dumper extends Truck{
	// Attributi
	private boolean sideDumpCapable;
	//costruttore per dumper con ribaltamento laterale
	public Dumper(boolean sideDumpCapable, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass){
		super(chassisID,dw,year,month,dayOfMonth,tt,truckClass);
		this.sideDumpCapable=sideDumpCapable;
	}
	//costruttore per dumper senza ribaltamento
	public Dumper(String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass){
		super(chassisID,dw,year,month,dayOfMonth,tt,truckClass);
		this.sideDumpCapable=false;
	}
	//dumper senza ribaltamento e con truckType a singola unità
	public Dumper(String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, int truckClass){
		super(chassisID,dw,year,month,dayOfMonth,TruckType.STANDARD,truckClass);

	}
	//restituisce true se il dumper ptò essere ribaltato
	public boolean isSideDumpCapable() {
		return sideDumpCapable;
	}
	//restituisce true se se le info sullo chassisID e sulla classe di peso sono valide:
	//chassisID= D\\w{2}\\d{4}
	public boolean validateTruck(){
		if(getTruckClass()>1 && getTruckClass()<8){
			return getChassisID().matches("D\\w{2}\\\\d{4}");
		}
		return false;
	}

	@Override
	public String toString() {
		if(sideDumpCapable) {
			return "Dump Truck\n" + 
					super.toString() + 
					"Side Dump= available\n";
		}
		return "Dump Truck\n" + super.toString();
	}
}
