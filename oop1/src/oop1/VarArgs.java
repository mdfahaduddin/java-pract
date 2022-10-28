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
public class VarArgs {
    
    //variable lenth args
    void add(int ... x){
        int sum =0;
        for (int y : x) {
            sum+=y;
        }
        System.out.println(sum);
    }
}
