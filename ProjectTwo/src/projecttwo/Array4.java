
package projecttwo;

import java.util.Scanner;


public class Array4 {
    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);
        String[] names = {"Md Fahad Uddin","Md Safayet Hossain","Md Sumon Khan","Md Zobayer","Md Bappy"};
        int [] num ={10,20,30,40,50,60,70,80,90,100};
        
        //for each
        for (String x: names) {
           System.out.println(x); 
        }
        int sum=0;
        for(int numbers: num){
            sum+=numbers;
            
        }
        System.out.println("Total = "+sum);
        
    }
    
}
