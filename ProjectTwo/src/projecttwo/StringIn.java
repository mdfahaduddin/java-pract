
package projecttwo;

import java.util.Scanner;


public class StringIn {
    
    public static void main(String[] args){
        Scanner strin = new Scanner(System.in);
        
        String fname, lname;
        
        System.out.print("Enter your first name: ");
        fname = strin.nextLine();
        
        System.out.print("Enter your first name: ");
        lname = strin.nextLine();
        
        System.out.println("My Name is: "+fname+" "+lname);
    }
    
}
