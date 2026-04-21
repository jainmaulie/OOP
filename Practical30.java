abstract class Vehicle {

    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {

    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {

    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

public class Practical30 {
    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();
        System.out.println("Maulie Jain.240390107024");

        System.out.println("Car:");
        System.out.println("Fuel Type: " + c.fuelType());
        System.out.println("Wheels: " + c.noOfWheels());

        System.out.println("\nBike:");
        System.out.println("Fuel Type: " + b.fuelType());
        System.out.println("Wheels: " + b.noOfWheels());
    }
}