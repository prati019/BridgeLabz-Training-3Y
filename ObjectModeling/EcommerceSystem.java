import java.util.*;

public class EcommerceSystem {

    static class Item {
        private String itemName;
        private double price;

        public Item(String itemName, double price) {
            this.itemName = itemName;
            this.price = price;
        }

        public String getItemName() { return itemName; }
        public double getPrice() { return price; }
    }

    static class EcommerceOrder {
        private static int counter = 1000;
        private String orderId;
        private List<Item> items;

        public EcommerceOrder() {
            this.orderId = "EORD" + (++counter);
            this.items = new ArrayList<>();
        }

        public String getOrderId() { return orderId; }

        public void addItem(Item item) {
            items.add(item);
            System.out.println(item.getItemName() + " added to Order " + orderId);
        }

        public double calculateTotal() {
            double total = 0;
            for (Item i : items) {
                total += i.getPrice();
            }
            return total;
        }

        public void showOrderDetails() {
            System.out.println("\nOrder ID: " + orderId);
            if (items.isEmpty()) {
                System.out.println("No items in this order.");
                return;
            }
            for (Item i : items) {
                System.out.println("• " + i.getItemName() + " : ₹" + i.getPrice());
            }
            System.out.println("Total: ₹" + calculateTotal());
        }
    }

    static class EcommerceCustomer {
        private String name;
        private String email;
        private List<EcommerceOrder> orders;

        public EcommerceCustomer(String name, String email) {
            this.name = name;
            this.email = email;
            this.orders = new ArrayList<>();
        }

        public void placeOrder(EcommerceOrder order) {
            orders.add(order);
            System.out.println(name + " placed order ID: " + order.getOrderId());
        }

        public void showOrderHistory() {
            System.out.println("\n=== Order History of " + name + " ===");
            for (EcommerceOrder order : orders) {
                order.showOrderDetails();
            }
        }
    }

    public static void main(String[] args) {
        Item laptop = new Item("Laptop", 75000);
        Item phone = new Item("Smartphone", 25000);
        Item headphones = new Item("Headphones", 5000);

        EcommerceCustomer customer = new EcommerceCustomer("Charlie", "charlie@example.com");

        EcommerceOrder order1 = new EcommerceOrder();
        order1.addItem(laptop);
        order1.addItem(phone);
        customer.placeOrder(order1);

        EcommerceOrder order2 = new EcommerceOrder();
        order2.addItem(headphones);
        customer.placeOrder(order2);

        customer.showOrderHistory();
    }
}
