interface Vehicle{
    default void method(){ // use either default or static keyword

    }
    void start(); // without static or default keyword it is considered public
}

class Car implements Vehicle{
    public  void start(){
        System.out.println("Car started.");
    }
}

class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike started.");
    }
}

public class testToday {
    public static void main(String[] args) {
        Vehicle obj = new Bike();
        obj.start();
    }
}
