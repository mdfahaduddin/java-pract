
package projecttwo;

import java.util.Scanner;


public class DigitsReverse {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        
        int num,temp,sum=0,reminder;
        
        System.out.print("Enter some digits: ");
        num = uin.nextInt();
        
        temp=num;
        while(temp!=0){
        reminder = temp%10;
        sum = sum*10+reminder;
        temp = temp/10;
        
        }
        System.out.println("Reverse of digits: "+sum);
    }
    
}
