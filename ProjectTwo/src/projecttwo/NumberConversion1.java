/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttwo;

import java.util.Scanner;

/**
 *
 * @author MD Fahad
 */
public class NumberConversion1 {
    public static void main(String[] args) {
        
        Scanner uin = new Scanner(System.in);
        String b,o,h;
        System.out.println("Enter any Binary digit : ");
        b = uin.nextLine();
        
        System.out.println("Enter any Octal Number : ");
        o = uin.nextLine();
        
        System.out.println("Enter any Hexa Number : ");
        h = uin.nextLine();
        
        
        String binary = b;
        Integer dec = Integer.parseInt(binary, 2);
        System.out.println("Binary - Decimal = "+ dec);
        
        String octal = o;
        Integer dec1 = Integer.parseInt(octal, 8);
        System.out.println("Oct - Decimal = "+ dec1);
        
        String hex = h;
        Integer dec2 = Integer.parseInt(hex, 16);
        System.out.println("Hex - Decimal = "+ dec2);
        
        
    }
}
