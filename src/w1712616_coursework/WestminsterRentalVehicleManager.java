/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1712616_coursework;

import java.io.*;
import static java.lang.Integer.*;
import java.util.*;
import java.text.*;  
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David Ilunga
 */
public class WestminsterRentalVehicleManager implements RentalVehicleManager {

    private ArrayList<Vehicle> vehicleList;
    private int numObject;
//    protected String regexNum = "[\\d]";
//    protected String regexString = "^[a-zA-Z0-9\\s]+$";

    Scanner s = new Scanner(System.in);
    Validation a = new Validation();

    public WestminsterRentalVehicleManager(int listLength) {
        this.numObject = listLength;
        vehicleList = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle type) {

        if (vehicleList.size() < numObject) {
            vehicleList.add(type);
        } else {
            System.out.println("No more spaces in the list");
        }

    }

    public void printVehicleList() {
        System.out.println("");
        System.out.println("You have chosen to print the Vehicle list.");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        if (vehicleList.size() == 0) {
            System.err.println("The Array is empty.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
        } else {
            Collections.sort(vehicleList);
            for (int i = 0; i < vehicleList.size(); i++) {
                if (vehicleList.get(i).getVehicleType().equals("Car")) {
                    System.out.println("");
                    System.out.println((i + 1) + ") Vehicle = Car, " + vehicleList.get(i).toString());
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                } else if (vehicleList.get(i).getVehicleType().equals("Motorbike")) {
                    System.out.println("");
                    System.out.println((i + 1) + ") Vehicle = Motorbike, " + vehicleList.get(i).toString());
                } else {
                    System.out.println("This position is empty");
                }
            }
        }

    }

    //Delete a Vehicle
    public void deleteVehicleList() {
        System.out.println("");
        System.out.println("You have chosen to delete a Vehicle from the list.");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        if (vehicleList.size() == 0) {
            System.err.println("The Array is empty.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
        } else {
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.print("Which vehicle would you like to delete from the list? Please enter the registration: ");
            String reg = s.next();

            for (int i = 0; i < vehicleList.size(); i++) {
                if (reg.equals(vehicleList.get(i).getRegistration())) {
                    vehicleList.remove(i);
                }
            }
        }
    }

    // Save Vehicle list in an external file
    public void saveVehicleList() {
        System.out.println("");
        System.out.println("You have chosen to save the Vehicle List.");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        try {
            FileWriter VehicleList = new FileWriter("VehicleSaveList.txt", true);
            try (PrintWriter CourseworkLoad = new PrintWriter(VehicleList)) { // saves in a new file
                for (int i = 0; i < vehicleList.size(); i++) {
                    if (vehicleList.get(i).getVehicleType().equals("Car")) {
                        CourseworkLoad.write((i + 1) + ") Vehicle = Car, " + vehicleList.get(i).toString()
                                + "\n ------------------------------------------------------------------------------------------------------------------");
                    } else if (vehicleList.get(i).getVehicleType().equals("Motorbike")) {
                        CourseworkLoad.write((i + 1) + ") Vehicle = Motorbike, " + vehicleList.get(i).toString()
                                + "\n ------------------------------------------------------------------------------------------------------------------");
                        System.out.println("------------------------------------------------------------------------------------------------------------------");
                    }
                }
            }
            System.out.println("");
            System.out.println("You have successfully saved the vehicle list.");

            VehicleList.close();
        } catch (IOException e) {
            System.out.println("Invalid Entry");
        }
    }

    //Boolean Run Menu
    public boolean runMenu() {
        boolean exit = false;

        System.out.println("To add a new Vehicle, please press 1");
        System.out.println("To print the list of Vehicles, please press 2");
        System.out.println("To delete a Vehicle from the list, please press 3");
        System.out.println("To save the Vehicle list, please press 4");
        System.out.println("To Exit, please press 5");
        System.out.print("Now, please enter your choice: ");

        int choice = CheckNumber();

        switch (choice) {
            case 1:

                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println("Please press 1 is you would like to add a Car");
                System.out.println("Please press 2 is you would like to add a Motorbike");

                System.out.print("Now, please enter your choice: ");

                int choice2 = CheckNumberChoice();

                System.out.println("------------------------------------------------------------------------------------------------------------------");

                System.out.print("Please enter your Vehicle registration number: ");
                String temp = s.next();
                String regNo = "";

                if (temp.length() > 7 || temp.length() < 7) {
                    while (true) {
                        System.out.print("Sorry that is an invalid registration number.Please try again: ");
                        temp = s.next();
                        break;
                    }
                } else if (temp.length() == 7) {
                    regNo = temp;
                }

                System.out.print("Please enter the current age of your Vehicle: ");
                int age = CheckAge();

                System.out.print("Please enter the colour of your vehicle: ");
                String colour = s.next();

                System.out.print("Please enter the make of your vehicle: ");
                String model = s.next();

                System.out.print("Please enter the type of fuel your vehicle uses: ");
                String fuelType = s.next();
                
                System.out.print("Please enter the date you picked up the vehicle (dd/mm/yy): ");
                String str = CheckDate();

                String[] array1 = str.split("/");
                String x = array1[0];
                String y = array1[1];
                String z = array1[2];

                System.out.print("Please enter the date you dropped off the vehicle (dd/mm/yy): ");
                
                String str2 = CompareDate(str);
        
                String[] array2 = str2.split("/");
                String h = array2[0];
                String i = array2[1];
                String j = array2[2];

                switch (choice2) {

                    case 1:

                        System.out.print("Please enter the type of your car you have (eg: hatchback, SUV,Sedan,Compact etc): ");
                        String type = s.next();

                        System.out.print("Please enter how many doors you have on your Car: ");
                        int doors = s.nextInt();

                        Car c = new Car(model, type, age, regNo, fuelType, colour, doors, x, y, z, h, i, j);
                        this.addVehicle(c);

                        System.out.println("------------------------------------------------------------------------------------------------------------------");

                        break;

                    case 2:

                        System.out.print("Please enter the type of your motorbike you have (eg: Chopper, Dirt, Cruiser etc): ");
                        type = s.next();

                        System.out.print("Please enter how many wheels your motorbike: ");
                        int wheels = s.nextInt();

                        Motorbike b = new Motorbike(model, type, age, regNo, fuelType, colour, wheels, x, y, z, h, i, j);
                        this.addVehicle(b);

                        System.out.println("------------------------------------------------------------------------------------------------------------------");

                        break;

                }

                break;

            case 2:

                this.printVehicleList();
                break;

            case 3:

                this.deleteVehicleList();
                break;

            case 4:

                this.saveVehicleList();
                break;

            case 5:

                exit = true;
                break;

        }

        return exit;

    }

    // Validation
    public int CheckNumber() {
        Scanner input = new Scanner(System.in);
        int number;
        while (true) {
            try {
                number = input.nextInt();
                if (number > 0 && number < 6) {
                    return number;
                } else if (number < 0 || number > 6 || number == 6) {
                    System.err.print("That choice is not available. Please enter a valid number : ");
                }
            } catch (InputMismatchException e) { // if the seat is not valid
                System.err.print("This is an invalid input. Please enter a valid number: ");
                input.next();
            }
        }
    }

    public int CheckNumberChoice() {
        Scanner input = new Scanner(System.in);
        int number;
        while (true) {
            try {
                number = input.nextInt();
                if (number > 0 && number < 3) {
                    return number;
                } else if (number < 0 || number > 3 || number == 3) {
                    System.err.print("That choice is not available. Please enter a valid number : ");
                }
            } catch (InputMismatchException e) { // if the seat is not valid
                System.err.print("This is an invalid input. Please enter a valid number: ");
                input.next();
            }
        }
    }
    
    public int CheckAge() {
        int number;
        while (true) {
            try {
                number = s.nextInt();
                return number;
            } catch (InputMismatchException e) { // if the seat is not valid
                System.err.print("This is an invalid input. Please enter a valid age: ");
                s.next();
            }
        }
    }
    
    public String CheckDate(){ 
        String date;
        while (true){
            try{
                date = s.next();
                String[] array1 = date.split("/");
                int x = parseInt(array1[0]);
                int y = parseInt(array1[1]);
                if (x >= 1 && x <= 31){
                    if (y >= 1 && y <= 12){
                        return date;
                    }else{
                        System.err.print("This date is not available. Please enter a valid date : ");
                    }
                }else{
                        System.err.print("This date is not available. Please enter a valid date : ");
                    }
            } catch (InputMismatchException e) { // if the seat is not valid
                System.err.print("This date is not available. Please enter a valid date: ");
                s.next(); 
            }
        }
    }
    
    public String CompareDate(String pickUpDate) {
        String dropOffDate;
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        while (true){
            try{
                Date dropOff = formatter1.parse(pickUpDate);
                while (true){
                    dropOffDate = s.next();
                    Date pickUp = formatter1.parse(dropOffDate);
                    if (pickUp.compareTo(dropOff) >= 0)
                        return dropOffDate;
                    else{
                        System.err.print("This date is not available. Please enter a valid date : ");
                    }
                }
            }catch (ParseException ex) {
                System.out.println("This is an invalid date enrty please try again.");
            }
        }
        
    }
}
