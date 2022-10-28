
package projecttwo;

import java.util.Scanner;

public class Array2D2 {
    public static void main(String[] args){
        Scanner uin = new Scanner(System.in);
        
        int[][] num1 = new int[3][3];
        int[][] num2 = new int[3][3];
        
        System.out.println("Enter 9 integer for 1st matrix : ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("1st[%d][%d] = ",row,col);
                num1 [row][col] = uin.nextInt();
            }
            System.out.println();
        }
        
                System.out.println("Enter 9 integer for 2nd matrix : ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("2nd[%d][%d] = ",row,col);
                num2 [row][col] = uin.nextInt();
            }
            System.out.println();
        }
        
        
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+(num1[row][col]+num2[row][col]));
            }
            System.out.println();
        }
    }
    
}
