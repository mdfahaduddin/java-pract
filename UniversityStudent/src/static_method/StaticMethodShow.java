/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_method;

/**
 *
 * @author MD Fahad
 */
public class StaticMethodShow {
    public static void main(String[] args) {
        StaticMethod ob1 = new StaticMethod();
        ob1.display1();
        
        StaticMethod.display2();
        
        
        
        StaticMethod s1 = new StaticMethod();
        StaticMethod s2 = new StaticMethod();
        StaticMethod s3 = new StaticMethod();
        StaticMethod s4 = new StaticMethod();
        
        
        
        s1.getInfo();
        s2.getInfo();
        s3.getInfo();
        s4.getInfo();
        
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
        
        
    }
}
