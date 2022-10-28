package universityclasspract;

import java.util.Scanner;

public class Vehicle {
    
  Scanner inputInfo = new Scanner(System.in);
    
  String Model,BrandName,Price,Color;
  
  
  void Info(){
  }
}

class Car extends Vehicle {
     @Override
     void Info(){
         System.out.print("----Enter Car Information----");
         
         System.out.print("\nCar Model : ");
         Model = inputInfo.nextLine();
         
         System.out.print("\nCar Brand Name : ");
         BrandName = inputInfo.nextLine();
         
         System.out.print("\nCar Price : ");
         Price = inputInfo.nextLine();
         
         System.out.print("\nCar Color : ");
         Color = inputInfo.nextLine();
         
         System.out.print("\n----Car Information----");
         System.out.println("\nModel : "+Model);
         System.out.println("BrandName : "+BrandName);
         System.out.println("Price : "+Price);
         System.out.println("Color : "+Color);
  }
}

class Bus extends Vehicle{
   @Override
   void Info(){
         System.out.print("\n----Enter Bus Information----");
         
         System.out.print("\nBus Model : ");
         Model = inputInfo.nextLine();
         
         System.out.print("\nBus Brand Name : ");
         BrandName = inputInfo.nextLine();
         
         System.out.print("\nBus Price : ");
         Price = inputInfo.nextLine();
         
         System.out.print("\nBus Color : ");
         Color = inputInfo.nextLine();
         
         System.out.print("\n----Bus Information----");
         System.out.println("\nModel : "+Model);
         System.out.println("BrandName : "+BrandName);
         System.out.println("Price : "+Price);
         System.out.println("Color : "+Color);
  }
}

class Bike extends Vehicle{
    @Override
    void Info(){
         System.out.print("\n----Enter Bike Information----");
         
         System.out.print("\nBike Model : ");
         Model = inputInfo.nextLine();
         
         System.out.print("\nBike Brand Name : ");
         BrandName = inputInfo.nextLine();
         
         System.out.print("\nBike Price : ");
         Price = inputInfo.nextLine();
         
         System.out.print("\nBike Color : ");
         Color = inputInfo.nextLine();
         
         System.out.print("\n----Bike Information----");
         System.out.println("\nModel : "+Model);
         System.out.println("BrandName : "+BrandName);
         System.out.println("Price : "+Price);
         System.out.println("Color : "+Color);
  }
}

class Taxi extends Vehicle {
      @Override
      void Info(){
         System.out.print("\n----Enter Taxi Information----");
         
         System.out.print("\nTaxi Model : ");
         Model = inputInfo.nextLine();
         
         System.out.print("\nTaxi Brand Name : ");
         BrandName = inputInfo.nextLine();
         
         System.out.print("\nTaxi Price : ");
         Price = inputInfo.nextLine();
         
         System.out.print("\nTaxi Color : ");
         Color = inputInfo.nextLine();
         
         System.out.print("\n----Taxi Information----");
         System.out.println("\nModel : "+Model);
         System.out.println("BrandName : "+BrandName);
         System.out.println("Price : "+Price);
         System.out.println("Color : "+Color);
  }
}

class DisplayAllInfo{
    public static void main(String[] args) {
        Car car1 = new Car();
        Bus bus1 = new Bus();
        Bike bike1 = new Bike();
        Taxi taxi1 = new Taxi();
        
        car1.Info();
        bus1.Info();
        bike1.Info();
        taxi1.Info();
    }
}
