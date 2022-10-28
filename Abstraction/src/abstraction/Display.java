
package abstraction;


public class Display {
    public static void main(String[] args) {
        MobileUser mu;
        mu = new Fahad();
        mu.sendMessage();
        
        mu = new Shuvo();
        mu.sendMessage();
        
        mu = new OtherPerson();
        mu.sendMessage();
        
    }
}
