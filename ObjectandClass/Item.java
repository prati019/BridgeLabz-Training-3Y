public class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double totalCost(int quantity) {
        return price * quantity;
    }

    public void display() {
        System.out.println("Item Code: " + itemCode + ", Name: " + itemName + ", Price: " + price);
    }

    public static void main(String[] args) {
        Item i1 = new Item(101, "Pen", 10);
        i1.display();
        System.out.println("Total cost for 5 items: " + i1.totalCost(5));
    }
}
