
package oop;


public class TeacherOverriding extends Person {
    String qualification;
    int x=30;
    
    //constructor
    TeacherOverriding(){
        super();
        System.out.println("B constructor");
    }
    @Override
    void display(){
        //System.out.println("Name : "+name);
       // System.out.println("Age : "+age);
       super.display();
        System.out.println("Qualafication : "+qualification);
        System.out.println("x = "+super.x);
    }
}
