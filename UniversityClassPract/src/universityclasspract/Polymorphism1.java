
package universityclasspract;

public class Polymorphism1 {
    int num1=20, num2=10;
    
    void calculate(){
    }
}
    
    class addition extends Polymorphism1 {
        @Override
        void calculate(){
          int sum = num1 + num2;
            System.out.println("Addition = "+sum);
        }
        
    }
    
    class Substraction extends Polymorphism1 {
        @Override
        void calculate(){
          int sub = num1 - num2;
            System.out.println("Substraction = "+sub);
        }
        
    }
    
       class Multiplication extends Polymorphism1 {
        @Override
        void calculate(){
          int mul = num1 * num2;
            System.out.println("Multiplication = "+mul);
        }
        
    }

       class Division extends Polymorphism1 {
        @Override
        void calculate(){
          int div = num1 / num2;
            System.out.println("Division = "+div);
        }
        
    }

class Output {
    public static void main(String[] args) {
        addition a1 = new addition();
        a1.calculate();
        
        Substraction s1 = new Substraction();
        s1.calculate();
        
        Multiplication m1 = new Multiplication();
        m1.calculate();
        
        Division d1 = new Division();
        d1.calculate();
    }
}
