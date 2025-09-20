interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle: " + vehicleId + " | Driver: " + driverName);
    }

    public abstract double calculateFare(double distance);
}

class Car extends RideVehicle implements GPS {
    private String location = "Unknown";
    public Car(String id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { location = loc; }
}

class Bike extends RideVehicle implements GPS {
    private String location = "Unknown";
    public Bike(String id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { location = loc; }
}

class Auto extends RideVehicle implements GPS {
    private String location = "Unknown";
    public Auto(String id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return getRatePerKm() * distance + 20; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { location = loc; }
}

public class RideHailingApp {
    public static void main(String[] args) {
        RideVehicle[] rides = {
                new Car("C101", "Ramesh", 15),
                new Bike("B202", "Suresh", 8),
                new Auto("A303", "Mahesh", 10)
        };

        double distance = 10;
        for (RideVehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            if (v instanceof GPS) {
                ((GPS) v).updateLocation("Downtown");
                System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            }
            System.out.println("-----------------");
        }
    }
}
