
package projecttwo;

import java.util.Scanner;


public class Tringle {
    public static void main(String[] abc){
        
        Scanner bh = new Scanner(System.in);
        float base,height,radius;
        double area,areaofradius;
        
        System.out.println("Enter Base:");
        base = bh.nextFloat();
        
        System.out.println("Enter Height:");
        height = bh.nextFloat();
        
        System.out.println("Enter radius:");
        radius = bh.nextFloat();
        
        area = 0.5 * base * height;
        areaofradius = 3.1416*radius*radius;
        
        
        System.out.println("Area of Rectangle :"+area);
        System.out.println("Area of Radius :"+areaofradius);
    }
}
