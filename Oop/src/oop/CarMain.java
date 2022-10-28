
package oop;


public class CarMain {
    public static void main(String[] args) {
       Car car1; //object declare
        car1 = new Car();
        
        car1.getInfo();
        car1.displayInfo();
        
        System.out.println("\n");
        
        Car car2 = new Car();
        
        car2.getInfo();
        car2.displayInfo();
        
        Car car3 = new Car();
        
        car3.setInfo("MD Fahad Uddin", "Male", 173401); //parameter pass
        car3.displayInfo2();
        
        
       
        
        
        
        
    }
}
