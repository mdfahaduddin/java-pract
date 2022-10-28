
package projecttwo;

import java.util.Scanner;


public class PalindromNumber {
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
        if(num == sum){
            System.out.println(sum+" is"+" Palindrom number");
        }else{
            System.out.println(sum+" is"+" Not Palindrom Number");
        }
    }
}
