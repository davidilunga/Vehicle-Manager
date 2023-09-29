/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1712616_coursework;

import static java.lang.Integer.*;
import java.lang.*;

/**
 *
 * @author david
 */
public abstract class Vehicle implements Comparable<Vehicle>{
    
    //Inherired Variables for Vehicle Class
    protected String registration;
    protected int age;
    protected String FuelType;
    protected String colour;
    protected String model;
    Schedule schedule = new Schedule();
    
    //Vehicle Constructor
    public Vehicle() {
        this.FuelType = "";
        this.registration = "";
        this.age = 0;
        this.colour = "";
    }

    //Vehicle Constructor
    public Vehicle(String reg, String fuelType, int a, String colour, String model, String one, String two, String three, String four, String five, String six) {//, String one, String two, String three, String four, String five, String six){
        this.FuelType = fuelType;
        this.registration = reg;
        this.age = a;
        this.colour = colour;
        this.model = model;
        schedule.setDropOffDate(one, two, three);
        schedule.setPickUpDate(four, five, six);
    }
    
    //Set Registration
    public void setRegistration(String reg) {
        this.registration = reg;
    }
    
    //Set the fuel type
    public void setFuelType(String fuelType) {
        this.FuelType = fuelType;
    }
    
    //Set the Colour of the Vehicle
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    //Set the age of the vehicle
    public void setAge(int a) {
        this.age = a;
    }
    
    //Set the model of the vehicle
    public void setModel(String model) {
        this.model = model;
    }

    //get Registration
    public String getRegistration() {
        return registration;
    }
    
    //Get the age of the vehicle
    public int getAge() {
        return age;
    }

    //Get the Colour of the Vehicle
    public String getColour() {
        return colour;
    }
    //Get the fuel type
    public String getFuelType() {
        return FuelType;
    }
    
     //get the model of the vehicle
    public String getModel() {
        return model;
    }
    
    //Pick up date for the Date Class (Schedule)
    public String getPickUpDate() {
        return schedule.getPickUpDate();
    }
    
    //Drop off date for the Date Class (Schedule)
    public String getDropOffDate() {
        return schedule.getDropOffDate();
    }
    
    public int compareTo(Vehicle v){
        return v.getModel().compareTo(this.getModel());
    }
    
    public String toString(){
        return "Registration = " + getRegistration() + ", Vehicle Model = " + getModel()
            + "\nFuel Type = " + getFuelType() + ", Colour = " + getColour() + ", Age = " + getAge() + ", Car Type = " + getSpecificType()
            + ",\nNumber of Doors= " + getDoors()
            + "\nPick Up Date = " + getPickUpDate()+", Drop-off Date = " + getDropOffDate() ;
    }
    
    //Abstratct methods for the Car and Motorbike Class
    
    public abstract String getVehicleType();

    public abstract String getSpecificType();

    public abstract int getWheels();

    public abstract int getDoors();

}
