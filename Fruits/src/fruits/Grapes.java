package fruits;

/**
 *
 * @author MD Fahad
 */
public class Grapes extends Fruits {

    
    @Override
    void getFruitsInfo() {
        name = "Grapes";
        colour = "Green";
        price = 350.0;
    }

    @Override
    void displayCalculate() {
        System.out.println("\nGrapes Total Price: " + weight + "*" + price + " = " + totalPrice + " Tk.");
    }
}
