
package projecttwo;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        
        int[] num = new int[5];
        int sum=0,i,avg;
        
        System.out.print("Enter 5 Integer: ");
        
       
        for ( i = 0; i < 5; i++) {
            num[i] = uin.nextInt();
        }
        
        for ( i = 0; i < 5; i++) {
            sum+=num[i];
        }
        avg=sum/num.length;
        System.out.println("Sum = "+sum);
        System.out.println("Avg = "+avg);
    }
    
}
