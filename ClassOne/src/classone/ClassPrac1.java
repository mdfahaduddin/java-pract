
package classone;

import java.util.Scanner;


public class ClassPrac1 {
    Scanner uin = new Scanner(System.in);
   String name,id; 
   int age;
   
   void getInfo(){
       System.out.print("Enter your name : ");
       name = uin.nextLine();
       
       System.out.print("Enter your ID : ");
       id = uin.nextLine();
       
       System.out.print("Enter your Age : ");
       age = uin.nextInt();
   }
   
   void displayInfo(){
       System.out.println();
       System.out.println("Name : "+name);
       System.out.println("ID : "+id);
       System.out.println("Age : "+age);
   }
   
   
}
