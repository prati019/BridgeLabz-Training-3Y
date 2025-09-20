public class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " more " + itemName + "(s). Total = " + quantity);
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Removed " + qty + " " + itemName + "(s). Remaining = " + quantity);
        } else {
            System.out.println("Not enough items to remove!");
        }
    }

    public double totalCost() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity + ", Total = " + totalCost());
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Laptop", 50000, 1);
        cart.display();
        cart.addItem(1);
        cart.removeItem(1);
        cart.display();
    }
}
