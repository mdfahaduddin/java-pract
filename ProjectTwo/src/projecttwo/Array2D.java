
package projecttwo;

import java.util.Scanner;


public class Array2D {
    public static void main(String[] args) {
        
    
    Scanner uin = new Scanner(System.in);
    
    int [][] number = new int[2][3];
    
        System.out.println("Enter 6 number: ");
      for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                number[row][col] = uin.nextInt();
            }
            
        }
        
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+number[row][col]);
            }
            System.out.println();
        }
    
    }
    
    
}
