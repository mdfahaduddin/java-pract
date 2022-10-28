
package projecttwo;

import java.util.Scanner;

public class Loops {
    public static void main(String[] loops){
        Scanner userin = new Scanner(System.in);
        
        int x,y;
        System.out.println("Enter a number: ");
        x= userin.nextInt();
        
        System.out.println("Enter a number: ");
        y= userin.nextInt();
        
        for(x=x;x<=10;x++){
            if(x==10){
                System.out.println(x);
            }else{
            System.out.println("0"+x);
            }
            
        }
        while(y<=10){
            System.out.println(y+"BD");
            y=y+2;
        }
        
        do{
            System.out.println("Bangladesh");
            y++;
        }while(y<=12);
        
        
    }
    
}
