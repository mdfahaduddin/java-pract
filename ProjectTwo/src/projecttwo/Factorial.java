
package projecttwo;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args){
        Scanner uin = new Scanner(System.in);
        
        int i,num,fact=1;
        System.out.print("Enter any positive integer: ");
        num = uin.nextInt();
        
        for(i=num; i>=1; i--){
           fact = fact*i; 
        }
        System.out.println("!"+num+" = "+fact);
    }
    
}
