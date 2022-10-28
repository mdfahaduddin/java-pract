/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

import java.util.Scanner;

/**
 *
 * @author MD Fahad
 */
public class CarPrice extends Car {
    private String price;
    String name,model,price2;
    Scanner uin = new Scanner(System.in);
    public String getCarPrice(){
        return price;
    }
    
    public void setCarPrice(String price){
        this.price = price;
    }
    
    void getInfo(){
        System.out.print("Enter Car Name: ");
        name = uin.nextLine();
        
        System.out.print("Enter Car Model: ");
        model = uin.nextLine();
        
        System.out.print("Enter Car Price: ");
        price2 = uin.nextLine();
        
        setCarName(name);
        setCarModel(model);
        setCarPrice(price2);
    }
    void display(){
        System.out.println();
        System.out.println("Car Information");
        System.out.println(getCarName());
        System.out.println(getCarModel());
        System.out.println(getCarPrice());
    }
}
