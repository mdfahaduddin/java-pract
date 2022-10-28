package fruits;

/**
 *
 * @author MD Fahad
 */
public class Olive extends Fruits {

    @Override
    void getFruitsInfo() {
        name = "Olive";
        colour = "Green";
        price = 100.0;
    }

    @Override
    void displayCalculate() {
        System.out.println("\nOlive Total Price: " + weight + "*" + price + " = " + totalPrice + " Tk.");
    }
}
