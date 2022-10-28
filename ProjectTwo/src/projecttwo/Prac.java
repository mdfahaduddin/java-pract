
package projecttwo;

import java.util.Scanner;


public class Prac {
    public static void main(String[] abc){
        Scanner userin = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.println("Enter first number: ");
        a=userin.nextInt();
        
        System.out.println("Enter second number: ");
        b=userin.nextInt();
        
        c=a+b;
        
        System.out.println("Sum = "+c);
    }
    
}
