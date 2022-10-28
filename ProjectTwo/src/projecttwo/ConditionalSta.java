
package projecttwo;

import java.util.Scanner;

public class ConditionalSta {
    public static void main(String[] cs){
        Scanner forcs = new Scanner(System.in);
        
        int x , y, check;
        System.out.print("Enter 1st number:");
        x=forcs.nextInt();
        
        System.out.print("Enter 2nd number:");
        y=forcs.nextInt();
        
        check = (x>y) ? x:y;
        System.out.println("Larg digit"+check);
        
    }
    
}
