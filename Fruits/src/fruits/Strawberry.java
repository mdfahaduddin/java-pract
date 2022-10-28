package fruits;

/**
 *
 * @author MD Fahad
 */
public class Strawberry extends Fruits {

    @Override
    void getFruitsInfo() {
        name = "Strawberry";
        colour = "Red";
        price = 550.0;
    }

    @Override
    void displayCalculate() {
        System.out.println("\nStrawberry Total Price: " + weight + "*" + price + " = " + totalPrice + " Tk.");
    }

}
