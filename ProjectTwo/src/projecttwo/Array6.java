
package projecttwo;

import java.util.Arrays;


public class Array6 {
    public static void main(String[] args) {
        int[] num = {10,-19,-34,80,90};
        Arrays.sort(num);
        System.out.println("Ascending : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+num[i]);
        }
        System.out.println();
        System.out.println("Descending : ");
        for (int i = 4; i > -1; i--) {
            System.out.print(" "+num[i]);
        }
        
        String[] names = {"MD Fahad Uddin","MD Safayet","Galib","Zobayer","Bappy","Yeasin"};
        
        Arrays.sort(names);
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print(names[i]+", ");
        }
    }
    
}
