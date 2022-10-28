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
public class Class22 {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        
       double x;
        System.out.println("Enter your Marks : ");
       x=uin.nextDouble();
       
       if(x>=50){
          
           if(x>=80 && x<=100){
               System.out.println("A+");
           }
           else if(x>=100){
               System.out.println("Invalid input");
           }
           else if(x>=70 && x<=79){
               System.out.println("A");
           }
           else if(x>=60 && x<=69){
               System.out.println("B");
           }
           else if(x>=50 && x<=59){
               System.out.println("C");
           }
       }else{
               System.out.println("Fail");
           }
    }
}
