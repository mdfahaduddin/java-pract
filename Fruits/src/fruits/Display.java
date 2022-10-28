package fruits;

/**
 *
 * @author MD Fahad
 */
public class Display {

    public static void main(String[] args) {
        System.out.println("                ____________________Welcom to Fruit Shop____________________                ");

        //for Apple
        Apple apple = new Apple();
        apple.getFruitsInfo();
        apple.DisplayFruitsInfo();
        apple.Calculate();

        //for Mango
        Mango mango = new Mango();
        mango.getFruitsInfo();
        mango.DisplayFruitsInfo();
        mango.Calculate();

        //for Grapes
        Grapes grapes = new Grapes();
        grapes.getFruitsInfo();
        grapes.DisplayFruitsInfo();
        grapes.Calculate();

        //for Oliv
        Olive olive = new Olive();
        olive.getFruitsInfo();
        olive.DisplayFruitsInfo();
        olive.Calculate();

        //for Strawberry
        Strawberry strawberry = new Strawberry();
        strawberry.getFruitsInfo();
        strawberry.DisplayFruitsInfo();
        strawberry.Calculate();

        //for Orange
        Orange orange = new Orange();
        orange.getFruitsInfo();
        orange.DisplayFruitsInfo();
        orange.Calculate();

        Fruits total = new Fruits() {
            @Override
            void displayCalculate() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        total.setTotal(apple.totalPrice + mango.totalPrice + grapes.totalPrice + olive.totalPrice + strawberry.totalPrice + orange.totalPrice);
        double totalTk = total.getTotal();

        if (totalTk == 0) {
            System.out.println("_____________________________________________");
            total.purchaseMessage("\nYou have no purchases !");
        } else {
            System.out.println("_____________________________________________");
            apple.displayCalculate();
            mango.displayCalculate();
            grapes.displayCalculate();
            olive.displayCalculate();
            strawberry.displayCalculate();
            orange.displayCalculate();
            System.out.println("_____________________________________________");
            System.out.println("\nTotal = " + totalTk + " Tk.");
            total.purchaseMessage("\nThanks for buying. Amount", totalTk);
        }

    }
}
