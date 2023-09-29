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
public class Car extends Vehicle {

    protected String carCategory;
    protected int NoOfDoors;
    

    //Constructor
    public Car() {
        this.NoOfDoors = 0;  //Number of Doors on the car as an additional variable
        this.carCategory = "";          //Category of the car such as: SUV, Hatchback, Sedan etc --> additional variable
    }

    //Constructor
    public Car(int doors, String type) {
        this.NoOfDoors = doors;
        this.carCategory = type;
    }
    
    //Constructor
    public Car(String model, String type, int a, String reg, String fuelType, String colour, int doors, String one, String two, String three, String four, String five, String six) {
        super(reg, fuelType, a, colour, model, one, two, three, four, five, six);
        this.carCategory = type;
        this.NoOfDoors = doors;

    }

    //set the category of the car
    public void setCarType(String type) {
        this.carCategory = type;
    }

    //Set the number of doors on the car
    public void setDoors(int doors) {
        this.NoOfDoors = doors;
    }

    @Override
    //get the type of Vehicle
    public String getVehicleType() {
        return "Car";
    }

    @Override
    //get the category of the car
    public String getSpecificType() {
        return carCategory;
    }

    public int getWheels() {
        return 4;
    }
    
    //Get the number of doors on the car
    public int getDoors() {
        return NoOfDoors;
    }

    
}
