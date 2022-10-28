
package projecttwo;

import java.util.Scanner;

public class ArrayDiagonalSum {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        
        int[][] num1 = new int[3][3];
        int sumdiagonal=0;
        int sumupper=0;
        int sumlower=0;
        
           System.out.println("Enter 9 integer : ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Array[%d][%d] = ",row,col);
                num1 [row][col] = uin.nextInt();
            }
            System.out.println();
        }
        
          for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if(row==col)
                {
                    sumdiagonal += num1 [row][col];
                }
                if(row<col){
                    sumupper += num1 [row][col];
                }
                     if(row>col){
                    sumlower += num1 [row][col];
                }
            }
              
            System.out.println();
        }
          System.out.println("Sum of Diagonal elements: "+sumdiagonal);
          
           System.out.println("Sum of Upper elements: "+sumupper);
           
            System.out.println("Sum of Lower elements: "+sumlower);
    }
    
}
