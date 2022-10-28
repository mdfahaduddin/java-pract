
package projecttwo;

import java.util.Scanner;


public class VC {
    
    public static void main(String[] vc){
        Scanner uservc = new Scanner(System.in);
        
        char ch;
        System.out.println("Enter any letter: ");
        ch=uservc.next().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' && ch>='a' && ch<='z'){
            System.out.println("Vowel and its small letter");
        }
        else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' && ch>='A' && ch<='Z'){
            System.out.println("Vowel and its Capital letter");
        }

        else{
               System.out.println("Consonent");
           }

        
        
    }
    
}
