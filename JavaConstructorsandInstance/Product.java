public class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Instance.Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.50);
        Product p2 = new Product("Mouse", 25.99);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
