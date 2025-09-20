public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee = 100.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John Doe", "Car");
        Vehicle v2 = new Vehicle("Jane Smith", "Bike");

        System.out.println("Before updating fee:");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(150.0);

        System.out.println("\nAfter updating fee:");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
