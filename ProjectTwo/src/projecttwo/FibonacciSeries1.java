
package projecttwo;

import java.util.Scanner;


public class FibonacciSeries1 {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        int num,first=0,second=1,fibonacci;
        System.out.println("___________Fibonacci Series___________");
        
        System.out.print("How many numbers : ");
        num = uin.nextInt();
        
        System.out.print(first+" "+second);
        for (int i = 3; i <=num; i++) {
            fibonacci = first+second;
            System.out.print(" "+fibonacci);
            first = second;
            second = fibonacci;
        }
        System.out.println("\n");
        
        
    }
    
}
