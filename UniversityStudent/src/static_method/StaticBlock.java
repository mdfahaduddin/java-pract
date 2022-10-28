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
public class StaticBlock {
    static int id;
    static String name;
    
    //static block
    static{
        id=101;
        name="MD Fahad Uddin";
    }
    
   static void display(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
   
    public static void main(String[] args) {
        StaticBlock.display();
    }
    
}
