public class BankAccount {
    private String accountHolderName;
    private final int accountNumber;   // final → cannot be changed
    private double balance;

    private static String bankName = "SBI"; // shared across all accounts
    private static int totalAccounts = 0;

    // Constructor with this
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    public void display() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Account Holder: " + accountHolderName +
                    ", Account Number: " + accountNumber + ", Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Anusha", 1001, 5000);
        BankAccount acc2 = new BankAccount("Ratn", 1002, 7000);

        acc1.display();
        acc2.display();
        BankAccount.getTotalAccounts();
    }
}
