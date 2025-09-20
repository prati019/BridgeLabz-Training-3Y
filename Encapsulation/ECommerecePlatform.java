interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.1; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST applied"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.2; }
    public double calculateTax() { return getPrice() * 0.05; }
    public String getTaxDetails() { return "5% GST applied"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics(101, "Laptop", 60000),
                new Clothing(102, "Shirt", 1500),
                new Groceries(103, "Rice", 1000)
        };

        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println(p.getName() + " | Price: " + p.getPrice());
            System.out.println("Discount: " + discount + " | Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println(" ");
        }
    }
}
