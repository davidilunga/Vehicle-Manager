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
public class Motorbike extends Vehicle {

    protected String bikeCategory;  //Category of the bike such as: Chopper, Dirt Bike, Cruiser etc --> additional variable
    protected int wheelNo;      ////Number of wheels on the motorbiek as an additional variable
    
    //Constructor
    public Motorbike() {
        this.wheelNo = 0;
        this.bikeCategory = "";
    }
    
    //Constructor
    public Motorbike(int wheels, String type) {
        this.wheelNo = wheels;
        this.bikeCategory = type;
    }
    
    //Constructor
    public Motorbike(String model, String type, int a, String reg, String fuelType, String colour, int wheels, String one, String two, String three, String four, String five, String six) {
        super(reg, fuelType, a, colour, model, one, two, three, four, five, six);
        this.bikeCategory = type;
        this.wheelNo = wheels;

    }
    
    //Set the category of the bike
    public void setBikeType(String type) {
        this.bikeCategory = type;
    }
    
    //Set the number of wheels on the bike
    public void setWheels(int wheels) {
        this.wheelNo = wheels;
    }

    @Override
    //get the type of Vehicle
    public String getVehicleType() {
        return "Motorbike";
    }

    @Override
    //get the category of the bike
    public String getSpecificType() {
        return bikeCategory;
    }

    @Override
    //Get the number of wheels on the bike
    public int getWheels() {
        return wheelNo;
    }
    
    public int getDoors() {
        return 0;
    }

}
