
package projecttwo;

import java.util.Scanner;


public class BitWise {
    public static void main(String[] bor){
        Scanner uin = new Scanner(System.in);
        
        int x,y,z;
        System.out.println("Enter two number : ");
        x=uin.nextInt();
        y=uin.nextInt();
        
        z = x & y;
        System.out.println("x & y = "+z);
        
         z = x | y;
        System.out.println("x | y = "+z);
        
         z = x ^ y;
        System.out.println("x ^ y = "+z);
        
        z = x >> 3;
        System.out.println("x >> 3 = "+z);
        
         z = x << 3;
        System.out.println("x << 3 = "+z);
    }
}
