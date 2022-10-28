
package carproject;

import java.util.Scanner;


public class CarInfo {
   String bname,colour,capacity,price;
   Scanner uin = new Scanner(System.in);
   
   void getInfo(){
       System.out.println("Get Car Info");
       System.out.print("Enter Car Brand Name: ");
       bname = uin.nextLine();
       System.out.print("Enter Car color: ");
       colour = uin.nextLine();
       System.out.print("Enter  Car capacity: ");
       capacity = uin.nextLine();
       System.out.print("Enter Car Price: ");
       price = uin.nextLine();
       
   }
   
   void displayInfo(){
       System.out.println("\n\nCar Brand Name : "+bname);
       System.out.println("Car Colour: "+colour);
       System.out.println("Car Capacity: "+capacity);
       System.out.println("Car Price: "+price);
   }
}
