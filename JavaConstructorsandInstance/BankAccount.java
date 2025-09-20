public class BankAccount {
    // Access modifiers
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods to access and modify private balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to demonstrate access to accountNumber and accountHolder
    public void displaySavingsDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // public
        System.out.println("Account Holder: " + accountHolder); // protected
        System.out.println("Balance: $" + getBalance());
    }
}

// Main class for demo
class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("ACC123", "John Doe", 5000.0);
        ba.displayDetails();

        ba.setBalance(5500.0);
        System.out.println("Updated Balance: $" + ba.getBalance());

        SavingsAccount sa = new SavingsAccount("ACC456", "Jane Smith", 7000.0);
        sa.displaySavingsDetails();
    }
}
