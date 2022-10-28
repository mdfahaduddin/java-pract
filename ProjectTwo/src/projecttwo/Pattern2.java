
package projecttwo;

import java.util.Scanner;


public class Pattern2 {
     public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        int n,row,col;
        System.out.println("Enter line Number: ");
        n=uin.nextInt();
        
        for (row = n; row >= 1; row--) {
             for (col = 1; col <= row; col++) {
                 System.out.print("*"+col);
        }
             System.out.println();
        }
    }
}
