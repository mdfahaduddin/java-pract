
package projecttwo;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList2 {
    public static void main(String[] args) {
    ArrayList<Integer> num1 = new ArrayList<>();
    ArrayList<Integer> num2 = new ArrayList<>();
    ArrayList<Integer> num3 = new ArrayList<>();
    
    num1.add(10);
     num1.add(70);
     num1.add(40);
     
    num2.add(20);
    num2.add(50);
    num2.add(80);
    
    num3.addAll(num1);
        System.out.println("Number 3 = "+num3);
        
       boolean res = num1.equals(num2);
        System.out.println("Num1 == Num2 : "+res);
        
        Collections.sort(num1);
        System.out.println("After sorting asc : "+num1);
        
        Collections.sort(num1,Collections.reverseOrder());
        System.out.println("After des : "+num1);
    
    
    }
    
}
