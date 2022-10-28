/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttwo;

import java.util.Random;

/**
 *
 * @author MD Fahad
 */
public class RandomNumberGen {
    public static void main(String[] args) {
        Random random = new Random();
        
        int randomNum = random.nextInt(10);
        System.out.println(randomNum);
        
        int rndn = (int) (Math.random()*5);
        System.out.println("Math random : "+rndn);
    }
}
