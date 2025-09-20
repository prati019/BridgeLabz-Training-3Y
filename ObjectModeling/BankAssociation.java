import java.util.*;

class Customer {
    String name;
    Map<String, Double> accounts = new HashMap<>();

    Customer(String name) { this.name = name; }

    void viewBalance(String accNo) {
        System.out.println(name + "'s Balance in " + accNo + ": " + accounts.getOrDefault(accNo,0.0));
    }
}

class Bank {
    String bankName;
    Bank(String name) { this.bankName = name; }

    void openAccount(Customer c, String accNo, double initBalance) {
        c.accounts.put(accNo, initBalance);
        System.out.println(bankName + ": Account " + accNo + " opened for " + c.name);
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        Customer alice = new Customer("Alice");
        bank.openAccount(alice, "SB123", 5000);
        alice.viewBalance("SB123");
    }
}
