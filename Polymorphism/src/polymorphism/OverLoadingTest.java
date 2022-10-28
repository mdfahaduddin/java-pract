
package polymorphism;

public class OverLoadingTest {
    
    private String addition(int value1, int value2){
        return String.format("%d",value1+value2);
    }
       private String addition(double value1, double value2){
        return String.format("%.3f",value1+value2);
    }
           private String addition(float value1, float value2, float value3){
           return String.format("%.2f",value1+value2+value3);
    }
          private String addition(String value1, String value2){
        return String.format("%.2f",Double.parseDouble(value1)+Double.parseDouble(value2));
    }
   
          
          public static void main(String[] args) {
        OverLoadingTest test = new OverLoadingTest();
              System.out.println(test.addition(200,200));
              System.out.println(test.addition(6.000,9.000));
              System.out.println(test.addition(5,6,7));
              System.out.println(test.addition("9","9"));
    }
}
