//overloading const
package oop;


public class Teacher {
      String name,gender;
    int phone;
    
    Teacher(){
        System.out.println("No Info !\n");
    }
    
    Teacher(String n,String g){
        name =n;
        gender = g;
    }
    Teacher(String n,String g,int p){
        name =n;
        gender = g;
        phone = p;
    }
    
    void displayInfo(){
        System.out.println("\n");
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("\n");
    }
    
    void add(double a, double b){
        System.out.println(a+b);
    }
    
     void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
     
      void add(){
        System.out.println("Nothing add now!");
    }
    
}
