package fruits;

/**
 *
 * @author MD Fahad
 */
public class Mango extends Fruits {

    @Override
    void getFruitsInfo() {
        name = "Mango";
        colour = "Green";
        price = 120.0;
    }

    @Override
    void displayCalculate() {
        System.out.println("\nMango Total Price: " + weight + "*" + price + " = " + totalPrice + " Tk.");
    }
}
