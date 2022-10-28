package vehicle;

public abstract class Vehicle {

    String  Name, Model,  Price;
    int wheel;
    private String Message;
    

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getMessage() {
        return Message;
    }

    abstract void Info();

    void infoDisplay() {
        System.out.println("Display Vehicle Information");
    }
}

class Bus extends Vehicle {

    @Override
    void Info() {
        Model = "hyundai";
        Name = "Desh Travels";
        Price = "1264567";
        wheel = 6;

    }

    @Override
    void infoDisplay() {
        System.out.print("\nBus Information");
        System.out.println("\nModel : " + Model);
        System.out.println("Name : " + Name);
        System.out.println("Wheel : " + wheel);
        System.out.println("Price : " + Price);
    }
}

class MiniBus extends Vehicle {

    @Override
    void Info() {
        Model = "tata24";
        Name = "Anabil";
        Price = "123456";
        wheel = 4;

    }

    @Override
    void infoDisplay() {
        System.out.print("\nMini Bus Information");
        System.out.println("\nModel : " + Model);
        System.out.println("Name : " + Name);
        System.out.println("Wheel : " + wheel);
        System.out.println("Price : " + Price);
    }
}

class Car extends Vehicle {

    @Override
    void Info() {
        Model = "hyundai123";
        Name = "Hyundai";
        Price = "123456";
        wheel = 4;

    }

    @Override
    void infoDisplay() {
        System.out.print("\nCar Information");
        System.out.println("\nModel : " + Model);
        System.out.println("Name : " + Name);
        System.out.println("Wheel : " + wheel);
        System.out.println("Price : " + Price);
    }
}



class Bike extends Vehicle {

    @Override
    void Info() {
        Model = "honda";
        Name = "Honda";
        Price = "123456";
        wheel = 2;

    }

    @Override
    void infoDisplay() {
        System.out.print("\nBike Information");
        System.out.println("\nModel : " + Model);
        System.out.println("Name : " + Name);
        System.out.println("Wheel : " + wheel);
        System.out.println("Price : " + Price);
    }
}

class Taxi extends Vehicle {

    @Override
    void Info() {
        Model = "bajaj123";
        Name = "Bajaj";
        Price = "123456";
        wheel = 4;

    }

    @Override
    void infoDisplay() {
        System.out.print("\nTaxi Information");
        System.out.println("\nModel : " + Model);
        System.out.println("Name : " + Name);
        System.out.println("Wheel : " + wheel);
        System.out.println("Price : " + Price);
    }
}

class DisplayInfo {

    public static void main(String[] args) {
        Vehicle message = new Vehicle() {
            @Override
            void Info() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        message.setMessage("Vehicle Project");
        System.out.println(message.getMessage());
        
        Bus bus = new Bus();
        MiniBus minibus = new MiniBus();
        Car car = new Car();
        Bike bike = new Bike();
        Taxi taxi = new Taxi();

        bus.Info();
        minibus.Info();
        car.Info();
        bike.Info();
        taxi.Info();
        
        bus.infoDisplay();
        minibus.infoDisplay();
        car.infoDisplay();
        bike.infoDisplay();
        taxi.infoDisplay();

    }
}
