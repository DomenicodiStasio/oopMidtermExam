/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppo15.gruppo15;

import java.util.Comparator;

/**
 *
 * @author lucagreco
 */
public interface Filterable { 
    
    
    TruckFleet filter(TruckFilter f, Comparator<Truck> c);
    
}
