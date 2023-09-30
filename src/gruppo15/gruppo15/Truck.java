/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppo15.gruppo15;

import java.time.LocalDate;
import java.util.Objects;
import java.lang.Comparable;

/**
 *
 * @author Gruppo15
 */
public abstract class Truck implements Comparable<Truck>{
	
	//attributi
	private String chassisID;
	private LocalDate RegistrationDate;
	private DriveWheelType dw;
	private TruckType tt;
	private int truckClass;

	//costruttore
	public Truck(String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass) {
		this.chassisID = chassisID;
		this.dw = dw;
		this.RegistrationDate=LocalDate.of(year, month, dayOfMonth);
		this.tt = tt;
		this.truckClass = truckClass;
	}
	
	// getter
	public String getChassisID() {
		return chassisID;
	}
	public LocalDate getRegistrationDate() {
		return RegistrationDate;
	}
	public DriveWheelType getDw() {
		return dw;
	}
	public TruckType getTt() {
		return tt;
	}
	public int getTruckClass() {
		return truckClass;
	}

	// hashcode e equals
	@Override
	public int hashCode() {
		return Objects.hash(chassisID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Truck other = (Truck) obj;
		return Objects.equals(chassisID, other.chassisID);
	}

	// metodi
	public final int compareTo(Truck o){
		return o.chassisID.compareToIgnoreCase(getChassisID());
	}

	public abstract boolean validateTruck();

	@Override
	public String toString(){
		if(validateTruck()) {
			return "chassis ID="+getChassisID()+
					'\n'+"truck type="+getTt()+
					'\n'+"drive-wheel = "+getDw()+
					'\n'+"registration Date="+getRegistrationDate()+
					'\n'+"truck Class="+getTruckClass()+
					'\n'+"validation = PASSED";
		}
		return "chassis ID="+getChassisID()+
				'\n'+"truck type="+getTt()+
				'\n'+"drive-wheel = "+getDw()+
				'\n'+"registration Date="+getRegistrationDate()+
				'\n'+"truck Class="+getTruckClass()+
				'\n'+"validation = NOT PASSED";
	}
}
