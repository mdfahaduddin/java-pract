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
public class NumberConversion2 {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        
        int d,o,h;
        System.out.println("Enter decimal digit for Binary : ");
        d=uin.nextInt();
        
        System.out.println("Enter decimal digit for Oct : ");
        o=uin.nextInt();
        
        System.out.println("Enter decimal digit for Hex : ");
        h=uin.nextInt();
        
        String binary  = Integer.toBinaryString(d);
        System.out.println("Dec - Binary = "+binary);
        
        String octal  = Integer.toOctalString(o);
        System.out.println("Dec - Octal = "+octal);
        
        String hex  = Integer.toHexString(h);
        System.out.println("Dec - Hex = "+hex);
        
    }
}
