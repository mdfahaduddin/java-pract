/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruits;

/**
 *
 * @author MD Fahad
 */
public class Orange extends Fruits {
    
        @Override
    void getFruitsInfo() {
        name = "Orange";
        colour = "Orange";
        price = 250.0;
    }

    @Override
    void displayCalculate() {
        System.out.println("\nOrange Total Price: " + weight + "*" + price + " = " + totalPrice + " Tk.");
    }
    
}
