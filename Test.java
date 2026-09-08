// import java.util.Scanner;

abstract class pracAbstract {
    abstract void start();
}

class Car extends pracAbstract{
    void start(){
        System.out.println("Car started");
    }
}

class Bike extends pracAbstract{
    void start(){
        System.out.println("Bike started");
    }
}

class Test{
    public static void main(String[] args) {
        // pracAbstract obj = new pracAbstract();
        pracAbstract obj = new Car();
        obj.start();
    }
}