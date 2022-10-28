
package projecttwo;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        
        int m,n,mul,i,j;
        
        System.out.print("Enter initial number: ");
        m=uin.nextInt();
        
        System.out.print("Enter initial number: ");
        n=uin.nextInt();
        
        
        for (i = m; i <=n; i++) {
                for(j=1;j<=10;j++){
            mul = i*j;
            System.out.println(i+"*"+j+" = "+mul);
        }
                System.out.println("");
        }
    }
}
