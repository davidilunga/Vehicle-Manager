/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1712616_coursework;

/**
 *
 * @author david
 */
public interface RentalVehicleManager {

    public abstract void addVehicle(Vehicle auto);

    public abstract void printVehicleList();

    public abstract void deleteVehicleList();

    public abstract void saveVehicleList();

    public abstract boolean runMenu();

}
