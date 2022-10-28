
package projecttwo;

import java.util.Scanner;

public class LoopEx2 {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        int sum=0;
        int m,n;
        System.out.println("Enter initial number: ");
        m=uin.nextInt();
        
        System.out.println("Enter final number: ");
        n=uin.nextInt();
        for (int i = m; i <= n; i++) {
            if(i%2==0){
                sum+=i;
            }
            
        }
        System.out.println(m+"-"+n+" Even Sum = "+sum);
    }
    
}
