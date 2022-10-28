/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classone;

import java.util.Scanner;

/**
 *
 * @author MD Fahad
 */
public class CityName {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
    
    char ch;
        System.out.println("Enter City Name 1st Character : ");
        ch = uin.next().charAt(0);
        
        switch(ch){
            case 'd': 
            case 'D': System.out.println("Dhaka");
            break;
            case 'c': 
            case 'C': System.out.println("CTG");
            break;
            case 'n': 
            case 'N': System.out.println("Noakhali");
            break;
            
            default: System.out.println("Not found !");
            break;
            
        }
    
    }
    
}
