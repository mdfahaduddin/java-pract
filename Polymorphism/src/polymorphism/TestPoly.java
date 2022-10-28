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
public class TestPoly {
    public static void main(String[] args) {
        SubPoly obj1 = new SubPoly();
        obj1.display();
        
         PolyMorphism1 obj2 = new SubPoly();
         obj2.display();
         
           obj2 = new SubPoly2();
         obj2.display();
         
         
        
    }
}
