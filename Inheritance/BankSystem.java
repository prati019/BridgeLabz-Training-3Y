class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int acc,double bal){ accountNumber=acc; balance=bal; }
    void displayAccountType(){ System.out.println("Generic Bank Account"); }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(int acc,double bal,double rate){
        super(acc,bal); interestRate=rate;
    }
    @Override void displayAccountType(){ System.out.println("Savings Account with Interest Rate: "+interestRate); }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(int acc,double bal,double limit){
        super(acc,bal); withdrawalLimit=limit;
    }
    @Override void displayAccountType(){ System.out.println("Checking Account, Limit: "+withdrawalLimit); }
}

class FixedDepositAccount extends BankAccount {
    int term;
    FixedDepositAccount(int acc,double bal,int term){
        super(acc,bal); this.term=term;
    }
    @Override void displayAccountType(){ System.out.println("Fixed Deposit Account for "+term+" years"); }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount(101,5000,4.5),
                new CheckingAccount(102,2000,1000),
                new FixedDepositAccount(103,10000,5)
        };
        for(BankAccount b : accounts) b.displayAccountType();
    }
}
