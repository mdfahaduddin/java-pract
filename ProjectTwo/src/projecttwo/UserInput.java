package projecttwo;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int num1, num2, total;
        
        System.out.println("Enter 1st number: ");
        num1 = userinput.nextInt();
        
        System.out.println("Enter 2nd number: ");
        num2 = userinput.nextInt();
        
        total = num1 + num2;
        
        System.out.println("\nTotal sum = "+total);
    }
}
