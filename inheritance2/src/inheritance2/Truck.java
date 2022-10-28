
package inheritance2;

public class Truck extends Vehicle{
    int gear;
    
    Truck(String c, double w, int g){
        //super keyword
        super(c,w);
        gear = g;
   }
    @Override
    void getInfo(){
        super.getInfo();
        System.out.println("Gear : "+gear);
    }
}
