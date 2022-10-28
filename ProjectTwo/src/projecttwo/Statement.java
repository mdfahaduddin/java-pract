
package projecttwo;

import java.util.Scanner;


public class Statement {
    public static void main(String[] ifelseif){
        Scanner statement = new Scanner(System.in);
        
        int num;
        
        System.out.println("Enter yor password: ");
        num = statement.nextInt();
        
        if(num==32783815){
            System.out.println("Login Success !");
        }
        else{
            System.out.println("Password Not match!");
        }
    }
    
}
