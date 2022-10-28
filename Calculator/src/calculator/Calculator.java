package calculator;

import java.util.Scanner;



public abstract class Calculator {

    Scanner input = new Scanner(System.in);
    private String headerMessage;
    double num1, num2, total;

    public void setHeaderMessage(String headerMessage) {
        this.headerMessage = headerMessage;
    }

    public String getHeaderMessage() {
        return headerMessage;
    }

    abstract void calculate();

}

class Add extends Calculator {

    
    @Override
    void calculate() {
        System.out.println("Enter 1st number : ");
        num1 = input.nextDouble();
        System.out.println("Enter 2nd number : ");
        num2 = input.nextDouble();
        total = num1 + num2;
        System.out.println("Sum = " + total);
    }
}

class Sub extends Calculator {

    @Override
    void calculate() {
        System.out.println("Enter 1st number : ");
        num1 = input.nextDouble();
        System.out.println("Enter 2nd number : ");
        num2 = input.nextDouble();
        total = num1 - num2;
        System.out.println("Sub = " + total);
    }
}

class Mul extends Calculator {

    @Override
    void calculate() {
        System.out.println("Enter 1st number : ");
        num1 = input.nextDouble();
        System.out.println("Enter 2nd number : ");
        num2 = input.nextDouble();
        total = num1 * num2;
        System.out.println("Mul = " + total);
    }
}

class Div extends Calculator {

    @Override
    void calculate() {
        System.out.println("Enter 1st number : ");
        num1 = input.nextDouble();
        System.out.println("Enter 2nd number : ");
        num2 = input.nextDouble();
        total = num1 / num2;
        System.out.println("Div = " + total);
    }
}

class Mod extends Calculator {

    @Override
    void calculate() {
        System.out.println("Enter 1st number : ");
        num1 = input.nextDouble();
        System.out.println("Enter 2nd number : ");
        num2 = input.nextDouble();
        total = num1 % num2;
        System.out.println("Mod = " + total);
    }
}

class Display {

    public static void main(String[] args) {
        Calculator message = new Calculator() {
            @Override
            void calculate() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        message.setHeaderMessage("_________Simple Calculator_________");
        System.out.println(message.getHeaderMessage());
        
        Add sum = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();
        Mod mod = new Mod();

        sum.calculate();
        sub.calculate();
        mul.calculate();
        div.calculate();
        mod.calculate();

    }

}
