
package projecttwo;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args){
    Scanner swex = new Scanner(System.in);
    
    int num;
   
    System.out.print("Enter a number: ");
    num = swex.nextInt();
    
    switch(num){
        case 0:
            System.out.println("Zero");
            
            case 1:
            System.out.println("One");
            break;
            
            case 2:
            System.out.println("Two");
            break;
            
            case 3:
            System.out.println("Three");
            break;
            
            case 4:
            System.out.println("Four");
            break;
            
            case 5:
            System.out.println("Five");
            break;
            case 6:
            System.out.println("six");
            break;
            case 7:
            System.out.println("seven");
            break;
            case 8:
            System.out.println("eight");
            break;
            case 9:
            System.out.println("nine");
            break;
            
            default:
                System.out.println("Not match");
           
            
    }
        
    }
}
