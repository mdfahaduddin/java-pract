
package inheritance2;


public class Vehicle {
    String color;
    double weight;
    
    Vehicle(String c, double w){
        color = c;
        weight = w;
    }
    
    void getInfo(){
        System.out.println("Color : "+color);
        System.out.println("Weight : "+weight);
    }
    
}
