import java.util.Scanner;

class Account {
    protected String customerName;
    protected int accountNumber;
    protected String accountType;
    protected double balance;

    // Constructor
    public Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Accept deposit from a customer and update the balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    // Display the balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class CurrAcct extends Account {
    private double minimumBalance;
    private double serviceCharge;

    // Constructor
    public CurrAcct(String customerName, int accountNumber, double balance, double minimumBalance, double serviceCharge) {
        super(customerName, accountNumber, "Current", balance);
        this.minimumBalance = minimumBalance;
        this.serviceCharge = serviceCharge;
    }

    // Withdraw from current account
    public void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Insufficient funds. Service charge of $" + serviceCharge + " will be applied.");
            balance -= serviceCharge;
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful.");
    }
}

class SavAcct extends Account {
    private double interestRate;

    // Constructor
    public SavAcct(String customerName, int accountNumber, double balance, double interestRate) {
        super(customerName, accountNumber, "Savings", balance);
        this.interestRate = interestRate;
    }

    // Compute interest and add to balance
    public void computeInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + " added to the account.");
    }

    // Withdraw from savings account
    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Example usage
        CurrAcct currentAccount = new CurrAcct("John Doe", 1001, 5000, 1000, 10);
        SavAcct savingsAccount = new SavAcct("Jane Smith", 2001, 10000, 5);

        currentAccount.displayBalance();
        currentAccount.deposit(2000);
        currentAccount.withdraw(3000);
        currentAccount.withdraw(6000);
        currentAccount.displayBalance();

        savingsAccount.displayBalance();
        savingsAccount.computeInterest();
        savingsAccount.withdraw(2000);
        savingsAccount.displayBalance();
    }
}
