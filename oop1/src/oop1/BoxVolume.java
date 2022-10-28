/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

/**
 *
 * @author MD Fahad
 */
public class BoxVolume {
    public static void main(String[] args) {
        Box box1 = new Box(10,10,10);
        Box box2 = new Box(40,30,30);
        
        box1.displayVol(); 
        box2.displayVol();
        
        System.out.println(Math.max(11, 1));
        System.out.println(Math.min(-11, 1));
        System.out.println(Math.ceil(5.6));
        System.out.println(Math.floor(-5.1));
    }
}
