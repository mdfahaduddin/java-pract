/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitystudent;

/**
 *
 * @author MD Fahad
 */
public class Student {
    String name,id;
   static int count =0;
    static String universityName ="University of South Asia";
    
    Student(String n, String i){
        name =n;
        id=i;
    }
    Student(){
        count++;
    }
    void totalStudent(){
        System.out.println("Total Student : "+count);
    }
    
    void studentInfoDisplay(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println(universityName);
    }
}
