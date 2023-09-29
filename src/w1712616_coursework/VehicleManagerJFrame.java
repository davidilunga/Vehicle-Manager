/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1712616_coursework;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author w1712616
 */
public class VehicleManagerJFrame extends JFrame{
    
    public VehicleManagerJFrame(){
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        JLabel info = new JLabel();
        
    }
    
    public static void main(String [] args){
        VehicleManagerJFrame VehicleManager = new VehicleManagerJFrame();
        VehicleManager.setVisible(true);
        VehicleManager.setTitle("Westminster Vehicle Manager");
        VehicleManager.setSize(700, 400);
        VehicleManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
