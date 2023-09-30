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
public class Tanker extends Truck{
    private TankType ttype;
    private int capacity;
    
    public Tanker(TankType ttype, int capacity, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass){
        super(chassisID, dw, year, month, dayOfMonth, tt, truckClass);
        this.ttype = ttype;
        this.capacity = capacity;
    }
    
    public Tanker(TankType ttype, int capacity, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, int truckClass){
        super(chassisID, dw, year, month, dayOfMonth, TruckType.STANDARD, truckClass);
        this.ttype = ttype;
        this.capacity = capacity;
    }

    public TankType getTtype() {
        return ttype;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean validateTruck(){
    	if(getTruckClass()>1 && getTruckClass()<8){
			return getChassisID().matches("T\\w{3}\\\\d{3}");
		}
		return false;
	}
    
    @Override
    public String toString() {   
        return "Tank Truck\nTank Type: " + getTtype() + "\nTank capacity: " +
                getCapacity() + "\nChassis ID =" + super.toString();       
    } 
}
