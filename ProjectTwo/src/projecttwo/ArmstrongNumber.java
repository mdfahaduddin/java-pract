
package projecttwo;

import java.util.Scanner;


public class ArmstrongNumber {
    public static void main(String[] args) {
         Scanner uin = new Scanner(System.in);
        
        int num,temp,sum=0,reminder;
        
        System.out.print("Enter some digits: ");
        num = uin.nextInt();
        
        temp=num;
        while(temp!=0){
        reminder = temp%10;
        sum+=reminder*reminder*reminder;
        temp = temp/10;
        
        }
        if(num==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
    
}
