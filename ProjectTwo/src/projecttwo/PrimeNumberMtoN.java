
package projecttwo;

import java.util.Scanner;


public class PrimeNumberMtoN {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        
        int m,n,i,j,count=0,totalPrimeNum=0;
        
        System.out.print("Enter initial number: ");
        m=uin.nextInt();
        
        System.out.print("Enter ending number: ");
        n=uin.nextInt();
        
        for(i=m; i<=n; i++){
            for(j=2; j<=i-1; j++){
            if(i%j==0){
                count++;
                break;
            }
        }
            if(count==0){
                System.out.println(i);
                totalPrimeNum++;
            }
                count=0;
            
        }
        System.out.println("Total prime number: "+totalPrimeNum);
    }
    
}
