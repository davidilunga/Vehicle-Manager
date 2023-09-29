/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1712616_coursework;

/**
 *
 * @author w1712616
 */
public class W1712616_Coursework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RentalVehicleManager sys = new WestminsterRentalVehicleManager(50);
        boolean exit = false;

        while (!exit) {
            exit = sys.runMenu();
        }

    }

}
