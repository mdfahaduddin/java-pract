/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author MD Fahad
 */
public class SubPoly extends PolyMorphism1 {
    String add="Dhaka";
    
    @Override
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Add : "+add);
    }
    
}
