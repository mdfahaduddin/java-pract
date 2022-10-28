
package projecttwo;

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args){
        Scanner uin = new Scanner(System.in);
        
        int num,i,count=0;
        System.out.print("Enter any positive integer: ");
        num=uin.nextInt();
        
        for(i=2;i<num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }

    }
}
