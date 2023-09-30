/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppo15.gruppo15;
import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Giada
 */
public class TruckFleet implements Filterable, Iterable<Truck>{
    private List<Truck> fleet = new ArrayList<>();
    private String name;
    
    public TruckFleet(String name){
        this.name = name;
    }
    
    public void add(Truck t) throws NotValidChassisIDException{
        try{
            if(!t.validateTruck())
                throw new NotValidChassisIDException();
            else 
                fleet.add(t);
        } catch(NotValidChassisIDException ex){
        	System.out.println("Errore. Truck non validato.");
        }
    }
    
    public void remove(Truck t){
    	fleet.remove(t);
    }
    
    public void sort(Comparator<Truck> t){
    	TruckClassComparator c = new TruckClassComparator();
    	if(t!=null) {
    		fleet.sort(t);
    	} else {
    		fleet.sort(c);
    	}
    }
    
    public Iterator<Truck> iterator(){
    	/*
        Iterator<Truck> it = fleet.iterator();
        
        while(it.hasNext()) {
        	Truck t = it.next();
        }
        return it;
        */
    	return fleet.iterator();
  	}
    
    @Override
    public TruckFleet filter(TruckFilter t, Comparator<Truck> c) {
    	TruckFleet sl = new TruckFleet(name);
    	TruckClassComparator cc = new TruckClassComparator();
    	for(Truck f : fleet){
    		if(t.checkTruck(f)){
    			try {
					sl.add(f);
				} catch (NotValidChassisIDException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                if(!c.equals(null)) {
                	sl.sort(c);
                }else {
                	sl.sort(cc);
                }
                
    		}
    	}
    	return sl;
    }
    
    @Override
    public String toString() {
    	String s = "My " + name + " contains " + fleet.size() + " trucks.\nListing:\n";
    	for(Truck t : fleet){
    		if(t instanceof Tanker) {
    			s+=((Tanker)t).toString();
    		}
    		else if(t instanceof Dumper) {
    			s+=((Dumper)t).toString();
    		}
    		else if(t instanceof BoxTruck) {
    			s+=((BoxTruck)t).toString();
    		}
    		else {
    			s+=t.toString();
    		}
    	}
    	return s;
    }
}
