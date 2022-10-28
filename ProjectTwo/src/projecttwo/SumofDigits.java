
package projecttwo;

import java.util.Scanner;


public class SumofDigits {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        
        int num,temp,sum=0,reminder;
        
        System.out.println("Enter some digits: ");
        num = uin.nextInt();
        
        temp=num;
        while(temp!=0){
        reminder = temp%10;
        sum+=reminder;
        temp = temp/10;
        
        }
        System.out.println("sum of digits: "+sum);
    }
    
}
