package vehicle2;

 public abstract class Vehicle2 {
    private String headerMessage;
    String Model, BrandName,maxSpeed, Price;
    
    public void setMessage(String Message){
        headerMessage = Message;
    }
    
     public String getMessage(){
        return headerMessage;
    }

    

    abstract void Info();
}

class Bus extends Vehicle2 {

    @Override
    void Info() {
        Model = "hino567";
        BrandName = "Hino";
        Price = "10000000";
        maxSpeed = "150km";

        System.out.print("\nBus Info");
        System.out.println("\nModel : " + Model);
        System.out.println("BrandName : " + BrandName);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Price : " + Price);
    }
}


class Car extends Vehicle2 {

    @Override
    void Info() {
        Model = "hyundai123";
        BrandName = "Hyundai";
        Price = "45000000";
        maxSpeed = "160km";

        System.out.print("\nCar Info");
        System.out.println("\nModel : " + Model);
        System.out.println("BrandName : " + BrandName);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Price : " + Price);
        
    }
}



class miniBus extends Vehicle2 {

    @Override
    void Info() {
        Model = "tata24";
        BrandName = "Tata";
        Price = "2500000";
        maxSpeed = "120km";

        System.out.print("\nMini Bus Info");
        System.out.println("\nModel : " + Model);
        System.out.println("BrandName : " + BrandName);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Price : " + Price);
    }
}


class Train extends Vehicle2 {

    @Override
    void Info() {
        Model = "EMT9";
        BrandName = "Mohanagar Express";
        Price = "15820000";
        maxSpeed = "90km";

        System.out.print("\nTrain Info");
        System.out.println("\nModel : " + Model);
        System.out.println("BrandName : " + BrandName);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Price : " + Price);
    }
}

class Cng extends Vehicle2 {

    @Override
    void Info() {
        Model = "bajaj23";
        BrandName = "Bajaj";
        Price = "1500000";
        maxSpeed = "120km";

        System.out.print("\nCng Info");
        System.out.println("\nModel : " + Model);
        System.out.println("BrandName : " + BrandName);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Price : " + Price);
    }
}


class Bike extends Vehicle2 {

    @Override
    void Info() {
        Model = "suzuki123";
        BrandName = "Suzuki";
        Price = "250000";
        maxSpeed = "140km";

        System.out.print("\nBike Info");
        System.out.println("\nModel : " + Model);
        System.out.println("BrandName : " + BrandName);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Price : " + Price);
    }
}



class DisplayInfo {

    public static void main(String[] args) {
        Vehicle2 message = new Vehicle2() {
            @Override
            void Info() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        message.setMessage("---------------Vehicle Information---------------");
        System.out.println(message.getMessage());
        Bus bus1 = new Bus();
        Car car1 = new Car();
        miniBus minibus = new miniBus();
        Train train1 = new Train();
        Cng cng1 = new Cng();
        Bike bike1 = new Bike();
        
        

        bus1.Info();
        car1.Info();
        minibus.Info();
        train1.Info();
        cng1.Info();
        bike1.Info();
        
        
    }
}
