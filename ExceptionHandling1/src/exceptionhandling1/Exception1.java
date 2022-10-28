
package exceptionhandling1;

import java.util.Scanner;


public class Exception1 {
    public static void main(String[] args) {
        int count = 1;
        do{
             try{
        
        Scanner uin = new Scanner(System.in);
        
        System.out.println("Enter number 1 : ");
        int num1 = uin.nextInt();
        
        System.out.println("Enter number 2 : ");
        int num2 = uin.nextInt();
        
        int res = num1/num2;
        
        System.out.println("\nResult : "+res);
        count = 2;
        }catch(Exception e){
            System.out.println("Exception : "+e);
            System.out.println("You must Enter integer please try again");
            
        } 
        }while(count == 1);
       
        
        
    }
    
}
