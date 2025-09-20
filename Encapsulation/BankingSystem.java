interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { if (amt <= balance) balance -= amt; }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int no, String name, double bal) { super(no, name, bal); }
    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amount) { System.out.println("Savings loan applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() >= 5000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int no, String name, double bal) { super(no, name, bal); }
    public double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan(double amount) { System.out.println("Current loan applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() >= 2000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount(101, "Alice", 10000),
                new CurrentAccount(102, "Bob", 3000)
        };

        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.getAccountNumber() + " | Holder: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                System.out.println("Loan Eligible? " + ((Loanable) acc).calculateLoanEligibility());
                ((Loanable) acc).applyForLoan(5000);
            }
            System.out.println(" ");
        }
    }
}
