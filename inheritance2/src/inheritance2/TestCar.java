
package inheritance2;




public class TestCar {
    public static void main(String[] args) {
        
        CarPrice carInfo = new CarPrice();
       
        
        
        carInfo.getInfo();
        
        carInfo.display();
        
        System.out.println(carInfo instanceof Car);
        
    }
}
