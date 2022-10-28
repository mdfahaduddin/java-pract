
package projecttwo;

import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        int num,mul,i;
        
        System.out.print("Enter a integer number: ");
        num=uin.nextInt();
        
        for(i=1;i<=10;i++){
            mul = num*i;
            System.out.println(num+"*"+i+" = "+mul);
        }
        
    }
    
}

