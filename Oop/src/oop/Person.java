
package oop;


public class Person {
    String name;
    int age;
    int x =20;
    
    //constructor
    Person(){
        System.out.println("A constructor");
    }
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
