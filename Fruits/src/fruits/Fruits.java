package fruits;

import java.util.Scanner;

/**
 *
 * @author MD Fahad
 */
abstract public class Fruits {

    Scanner userinput = new Scanner(System.in);
    private double total;
    String name, colour;
    double weight, price, totalPrice;

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    void getFruitsInfo() {
        System.out.println("Get Fruits Info");
    }

    void DisplayFruitsInfo() {
        System.out.println("\nFruit Name : " + name);
        System.out.println("Colour : " + colour);
        System.out.println("Price per Kg : " + price + " Tk.");
    }

     void Calculate(){
        System.out.print("How many KG would you like to buy ? : ");
        weight = userinput.nextDouble();
        totalPrice = weight * price;
    }

    abstract void displayCalculate();

    void purchaseMessage(String message, double Amount) {
        System.out.println(message + " " + Amount + " Tk.");
    }

    void purchaseMessage(String message) {
        System.out.println(message);
    }

}
