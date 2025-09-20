interface Discountable {
    double applyDiscount(double amount);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " | Price: " + price + " | Qty: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    public double applyDiscount(double amount) { return amount * 0.9; }
    public String getDiscountDetails() { return "10% discount applied"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 50; }
    public double applyDiscount(double amount) { return amount * 0.85; }
    public String getDiscountDetails() { return "15% discount applied"; }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
                new VegItem("Paneer", 200, 2),
                new NonVegItem("Chicken", 300, 1)
        };

        for (FoodItem f : order) {
            f.getItemDetails();
            double total = f.calculateTotalPrice();
            if (f instanceof Discountable) {
                total = ((Discountable) f).applyDiscount(total);
                System.out.println(((Discountable) f).getDiscountDetails());
            }
            System.out.println("Final Price: " + total);
            System.out.println(" ");
        }
    }
}
