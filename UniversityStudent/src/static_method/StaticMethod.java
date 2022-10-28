
package static_method;

import java.util.Scanner;


public class StaticMethod {
    String sname,sid,sgender,scontact;
    void display1(){
        System.out.println("I am non static method");
    }
    
   static void display2(){
        System.out.println("I am static method");
    }
   
   
   
   void getInfo(){
       Scanner uin = new Scanner(System.in);
       
       System.out.println();
       System.out.println("Input Student Details");
       
       System.out.print("Name : ");
       sname = uin.nextLine();
       System.out.print("ID : ");
       sid = uin.nextLine();
       System.out.print("Gender : ");
       sgender = uin.nextLine();
       System.out.print("Contact : ");
       scontact = uin.nextLine();
       
   }
   
   void displayInfo(){
       System.out.println();
       System.out.println("Admission Success!");
       System.out.println("Student Name : "+sname);
       System.out.println("Student ID : "+sid);
       System.out.println("Student Gender : "+sgender);
       System.out.println("Student Contact : "+scontact);
   }
   
}
