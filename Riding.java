import java.util.Scanner;

// Abstract base class
abstract class Vehicle {
    String driverName;
    String vehicleNumber;

    public Vehicle(String driverName, String vehicleNumber) {
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
    }

    public abstract double calculateFare(double distance);

    public void showDetails() {
        System.out.println("Driver: " + driverName);
        System.out.println("Vehicle No: " + vehicleNumber);
    }
}

// Subclass for Bike
class Bike extends Vehicle {
    public Bike(String driverName, String vehicleNumber) {
        super(driverName, vehicleNumber);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 5; // ₹5 per km for Bike
    }
}

// Subclass for Car
class Car extends Vehicle {
    public Car(String driverName, String vehicleNumber) {
        super(driverName, vehicleNumber);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 10; // ₹10 per km for Car
    }
}

// Subclass for Auto
class Auto extends Vehicle {
    public Auto(String driverName, String vehicleNumber) {
        super(driverName, vehicleNumber);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 7; // ₹7 per km for Auto
    }
}

// Main class
public class Riding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle type (bike/car/auto):");
        String type = scanner.nextLine().toLowerCase();

        System.out.println("Enter driver name:");
        String driverName = scanner.nextLine();

        System.out.println("Enter vehicle number:");
        String vehicleNumber = scanner.nextLine();

        System.out.println("Enter distance traveled (in km):");
        double distance = scanner.nextDouble();

        Vehicle vehicle;

        switch (type) {
            case "bike":
                vehicle = new Bike(driverName, vehicleNumber);
                break;
            case "car":
                vehicle = new Car(driverName, vehicleNumber);
                break;
            case "auto":
                vehicle = new Auto(driverName, vehicleNumber);
                break;
            default:
                System.out.println("Invalid vehicle type!");
                scanner.close();
                return;
        }

        System.out.println("\n--- Ride Details ---");
        vehicle.showDetails();
        System.out.printf("Distance: %.2f km\n", distance);
        System.out.printf("Total Income: ₹%.2f\n", vehicle.calculateFare(distance));

        scanner.close();
    }
}
