package projecttwo;

import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        Scanner uin = new Scanner(System.in);

        double[] num = new double[5];
        double sum = 0, avg;
        int i;

        System.out.print("Enter 5 Integer: ");

        for (i = 0; i < 5; i++) {
            num[i] = uin.nextDouble();
        }

        for (i = 0; i < 5; i++) {
            sum += num[i];
        }
        avg = sum / num.length;
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + avg);
        
        double max = num[0],min =num[0];
        
        for ( i = 1; i < 5; i++) {
            if(max<num[i]){
                max= num[i];
            }
            if(min>num[i]){
                min = num[i];
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}
