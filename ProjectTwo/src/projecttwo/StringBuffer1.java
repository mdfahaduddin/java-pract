
package projecttwo;

import java.util.Scanner;

public class StringBuffer1 {
     public static void main(String[] args) {
         
         Scanner sin = new Scanner(System.in);
         System.out.println("Enter 1st string : ");
         String sinput = sin.nextLine();
         
        
         
         
         
        StringBuffer sb = new StringBuffer(sinput); 
         System.out.println(sb);
         
        
         
         
         
         
         
         sb.append(" Shuvo ");
         sb.append(30);
         System.out.println(sb);
         
         sb.delete(0, 5);
         System.out.println(sb);
         
         sb.reverse();
         System.out.println(sb);
         
         
         
         
         
         sb.setLength(5);
         System.out.println(sb);
         
         
    }
}
