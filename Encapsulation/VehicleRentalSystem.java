import java.util.*;

// Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle: " + type + " | Number: " + vehicleNumber + " | Rate/day: " + rentalRate);
    }
}

class SedanVehicle extends Vehicle implements Insurable {
    public SedanVehicle(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Sedan", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Sedan insurance: 10% of rental rate";
    }
}

class SportsBikeVehicle extends Vehicle implements Insurable {
    public SportsBikeVehicle(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "SportsBike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8; // cheaper for bikes
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "SportsBike insurance: 5% of rental rate";
    }
}

class HeavyTruckVehicle extends Vehicle implements Insurable {
    public HeavyTruckVehicle(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "HeavyTruck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; // trucks are heavier
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2;
    }

    @Override
    public String getInsuranceDetails() {
        return "HeavyTruck insurance: 20% of rental rate";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new SedanVehicle("SED123", 1000));
        vehicles.add(new SportsBikeVehicle("BIKE456", 300));
        vehicles.add(new HeavyTruckVehicle("TRUCK789", 2000));

        for (Vehicle v : vehicles) {
            v.displayDetails();
            double cost = v.calculateRentalCost(5);
            Insurable ins = (Insurable) v;
            System.out.println("Rental for 5 days: " + cost);
            System.out.println("Insurance: " + ins.calculateInsurance());
            System.out.println(ins.getInsuranceDetails());
            System.out.println(" ");
        }
    }
}
