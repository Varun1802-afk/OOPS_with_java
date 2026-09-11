interface Rentable{
    static final double TAX_RATE = 0.05;
    double calculateRent(int day);
}

class Car implements Rentable{
    static int totalVehiclesRented = 0;
    public double calculateRent(int day){
        totalVehiclesRented++;
        return (double)day*1500.0;
    }
}
class Bike implements Rentable{
    public double calculateRent(int day){
        Car.totalVehiclesRented++;
        return (double)day*500.0;
    }
}

public class useCase3 {
    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();
 
        double carRent = car.calculateRent(3);
        double bikeRent = bike.calculateRent(2);
 
        System.out.println("Car rent incl. tax: " + (carRent + carRent * Car.TAX_RATE));
        System.out.println("Bike rent incl. tax: " + (bikeRent + bikeRent * Bike.TAX_RATE));
        System.out.println("Total vehicles rented: " + Car.totalVehiclesRented);
    }
}

