/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author MD Fahad
 */
public class RecTest {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        Recursion1 obj = new Recursion1();
        int a;
        System.out.print("Enter a integer for Factorial : ");
        a=uin.nextInt();
       int res = obj.fact(a);
        System.out.println("Factorial of "+a+"  : "+res);
       
    }
}
