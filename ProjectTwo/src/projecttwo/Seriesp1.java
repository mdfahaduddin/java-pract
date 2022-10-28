
package projecttwo;

import java.util.Scanner;


public class Seriesp1 {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        int i,n,sum=0;
        
        System.out.print("Enter the last number: ");
        n=uin.nextInt();
        
        for(i=1;i<=n;i++){
            sum+=i*i;
        }
        System.out.println(sum);
    }
    
}
