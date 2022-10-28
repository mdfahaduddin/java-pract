/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;


public class TestPerson {
    public static void main(String[] args) {
        TeacherOverriding t1 = new TeacherOverriding();
        
        t1.name="Md Fahad Uddin";
        t1.age = 22;
        t1.qualification = "BCSE";
        
        t1.display();
    }
 
}
