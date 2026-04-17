// Base class
class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    // Constructor
    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    int numberOfSeats;
    boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType); // constructor chaining
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    // Method overriding
    void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

// Subclass ElectricCar
class ElectricCar extends Car {
    int batteryCapacity;
    int chargingTime;

    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int numberOfSeats, boolean ACavailable,
                int batteryCapacity, int chargingTime) {

        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    // Method overriding
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Charging Time: " + chargingTime);
    }
}

// Main class
class Practical25 {
    public static void main(String[] args) {
        System.out.println("Maulie Jain.240390107024");
        Vehicle v = new Vehicle("GJ01AB1234", "Toyota", "Petrol");
        System.out.println("Vehicle Details:");
        v.displayDetails();

        Car c = new Car("GJ02CD5678", "Honda", "Diesel", 5, true);
        System.out.println("\nCar Details:");
        c.displayDetails();

        ElectricCar e = new ElectricCar("GJ03EF9012", "Tesla", "Electric", 5, true, 75, 2);
        System.out.println("\nElectric Car Details:");
        e.displayDetails();

        // Upcasting
        Vehicle v2 = new Car("GJ04GH3456", "Hyundai", "Petrol", 5, false);

        // Downcasting with instanceof
        if (v2 instanceof Car) {
            Car c2 = (Car) v2;
            System.out.println("\nDowncasting Example:");
            System.out.println("Seats: " + c2.numberOfSeats);
        }
    }
}