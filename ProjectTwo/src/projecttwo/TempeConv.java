
package projecttwo;
import java.util.Scanner;

public class TempeConv {
    
    public static void main(String[] abc){
        
        
        float Celsius;
        double Fahrenheit;
        Scanner temp = new Scanner(System.in);
        
        System.out.print("Enter Celsius:");
        Celsius = temp.nextFloat();
        
        Fahrenheit = 1.8 * Celsius + 32;
        
        System.out.println("Fahrenheit : "+ Fahrenheit);
        
    }
    
}
