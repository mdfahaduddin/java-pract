
package polymorphism;

import java.util.Scanner;

public class See {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        int i;
        System.out.println("Enter array size : ");
        i=uin.nextInt();
        
        Shape[] s = new Shape[i];
        
         s[0] = new Shape();
         s[1] = new Rectangle(10,20);
         s[2] = new Triangle(30,40);
        
         for (int j = 0; j < 3; j++) {
            System.out.println(s[j].area());
        
        }
        
    }
}
