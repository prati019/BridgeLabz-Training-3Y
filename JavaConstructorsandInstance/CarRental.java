class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 1000;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Basic Model";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    private double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayRental() {
        System.out.println("Customer: " + customerName + " | Car: " + carModel + " | Days: " + rentalDays + " | Total Cost: " + calculateTotalCost());
    }
}

class CarRentalMain {
    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Alice", "Honda City", 5);

        r1.displayRental();
        r2.displayRental();
    }
}
