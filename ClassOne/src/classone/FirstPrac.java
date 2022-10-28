package classone;

import java.util.Scanner;


public class FirstPrac {
    public static void main(String[] args) {
       
       Scanner userInput = new Scanner(System.in);
        
        int a,b,c;
        System.out.print("Enter starting point: ");
        b=userInput.nextInt();
        
        System.out.print("Enter ending point: ");
        c=userInput.nextInt();
        
        for(a=c;a>=b;a--){    
            System.out.print(a+" ");
  
        }

    }
    
}
