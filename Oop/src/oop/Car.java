
package oop;

import java.util.Scanner;

public class Car {
    String brandname,type,model,name,gender;
    int price,phone;
    
    void getInfo(){
        Scanner uin = new Scanner(System.in);
      
       
        System.out.print("Enter Brand Name : ");
        brandname = uin.nextLine();
        System.out.print("Enter Car Type: ");
        type = uin.nextLine();
        System.out.print("Enter Car Model: ");
        model = uin.nextLine();
        System.out.print("Enter Car Price: ");
        price = uin.nextInt();

        
    }
    
    void setInfo(String n, String m, int ph){
        name = n;
        gender = m;
        phone = ph;
    }
    
    void displayInfo(){
        System.out.println("\n");
        System.out.println("Brand Name : "+brandname);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
        System.out.println("Type : "+type);
        
    }
    
     void displayInfo2(){
        System.out.println("\n");
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        
        
    }
     
     
    
}
