package fruits;

/**
 *
 * @author MD Fahad
 */
public class Apple extends Fruits {

    @Override
    void getFruitsInfo() {
        name = "Apple";
        colour = "Red";
        price = 140.0;
    }

    @Override
    void displayCalculate() {
        System.out.println("\nApple Total Price: " + weight + "*" + price + " = " + totalPrice + " Tk.");
    }
}
