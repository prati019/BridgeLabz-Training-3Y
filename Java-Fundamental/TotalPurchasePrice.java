import java.util.Scanner;

class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        double totalPrice = unitPrice * quantity;

        System.out.println("\nTotal purchase price = INR " + totalPrice);
    }
}
