
package filedemo;

import java.util.Formatter;
import java.util.Scanner;


public class FileDemo2 {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        
        String id,name;
        int num;
        
        
        
        try{
            Formatter formatter = new Formatter("C:\\Users\\walton\\Desktop\\person\\person1.txt");
            System.out.print("How many Student? : ");
        num = uin.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter Student id and Name : ");
            id = uin.nextLine();
            name = uin.nextLine();
            
            
         formatter.format("%s %s\r\n",id,name);
         
            
        }
        
         
         formatter.close();
         
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
   
}
