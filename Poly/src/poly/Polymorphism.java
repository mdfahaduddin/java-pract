package poly;

public class Polymorphism {
    int n1=40, n2=20;
    
    void calculate(){
    }
}

    class addition extends Polymorphism {
        @Override
        void calculate(){
          int addition = n1 + n2;
            System.out.println("Addition: "+addition);
        }
        
    }

    class Substraction extends Polymorphism {
        @Override
        void calculate(){
          int Substraction = n1 - n2;
            System.out.println("Substraction: "+Substraction);
        }
        
    }
    
       class Multiplication extends Polymorphism {
        @Override
        void calculate(){
          int Multiplication = n1 * n2;
            System.out.println("Multiplication: "+Multiplication);
        }
        
    }

       class Division extends Polymorphism {
        @Override
        void calculate(){
          int Division = n1 / n2;
            System.out.println("Division: "+Division);
        }
        
    }

class Test {
    public static void main(String[] args) {
        addition a = new addition();
        a.calculate();
        
        Substraction s = new Substraction();
        s.calculate();
        
        Multiplication m = new Multiplication();
        m.calculate();
        
        Division d = new Division();
        d.calculate();
    }
}
