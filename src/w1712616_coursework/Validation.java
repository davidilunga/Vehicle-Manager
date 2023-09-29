/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1712616_coursework;

import java.util.*;

/**
 *
 * @author KingSnipez
 */
public class Validation {

    protected String regexNum = "[\\d]";
    protected String regexString = "^[a-zA-Z0-9\\s]+$";

    public int CheckNumber() { // this is the integer validator using Regular Expression

        Scanner input = new Scanner(System.in);
        int number;
        while (true) {
            try {
                number = input.nextInt();
                if (number > 0 && number < 6) {
                    return number;
                } else if (number < 0 || number > 6) {
                    System.err.println("That choice isnot available. Please enter a valid number : ");
                    number = input.nextInt();
                }
            } catch (InputMismatchException ex) { // if the seat is not valid
                System.err.println("This is an invalid input. Please enter a valid number: ");
                number = input.nextInt();
            }

        }
    }
}
