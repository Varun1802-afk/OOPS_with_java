abstract class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    abstract void start();

    void display() {
        System.out.println("Vehicle: " + name);
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    @Override
    void start() {
        System.out.println("Car starts using a key");
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }

    @Override
    void start() {
        System.out.println("Bike starts using a self-start button");
    }
}

public class VehicleProgram {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bike("Yamaha");

        v1.display();
        v1.start();

        System.out.println();

        v2.display();
        v2.start();
    }
}
