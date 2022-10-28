
package projecttwo;

import java.util.Scanner;


public class MathClass {
    public static void main(String[] mc){
        Scanner mcin = new Scanner(System.in);
        
        int x,y;
        
        System.out.println("Enter two number: ");
        x = mcin.nextInt();
        y = mcin.nextInt();
        
        System.out.println("Maximum number = "+Math.max(x, y));
       int min = Math.min(x, y);
        System.out.println("Minimum number = "+min);
        
       int absoulet = Math.abs(y);
                System.out.println("Absoulet value of Y = "+absoulet);
                int round = Math.round(8.5f);
                System.out.println(round);
                
                System.out.println(Math.PI);
    }
    
}
