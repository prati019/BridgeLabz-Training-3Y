public class Product {
    private String productName;
    private double price;
    private int quantity;
    private final int productID; // unique

    private static double discount = 10.0; // % discount

    // Constructor with this
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void display() {
        if (this instanceof Product) {
            double total = (price * quantity) * (1 - discount / 100);
            System.out.println("Product ID: " + productID + ", Name: " + productName +
                    ", Price: " + price + ", Qty: " + quantity + ", After Discount: " + total);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1, 301);
        Product p2 = new Product("Phone", 20000, 2, 302);

        p1.display();
        p2.display();

        Product.updateDiscount(15);
        System.out.println("Updated Discount applied:");
        p1.display();
        p2.display();
    }
}
