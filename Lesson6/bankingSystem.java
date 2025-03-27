package com.cmcglobal.Lesson6;

//Create an abstract class BankAccount
abstract class bankAccount{
    protected String accountHolder;
    protected double balance;
//Create constructor
    public bankAccount (String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    //Create method of bankAccount Class
    abstract void withdraw(double amount);
    void displayBalance(){
        System.out.println(accountHolder + "'s balance: $" + balance);
    }
}
// Create an interface Transaction
interface Transaction {
    void deposit(double amount);
    void deposit (double amount,String currency);
    void withdraw(double amount);
}

//Subclass savingsAccount
class savingsAccount extends bankAccount implements Transaction {
    private static final double MIN_BALANCE = 100.0;
    public savingsAccount (String accountHolder, double balance) {
        super(accountHolder,balance); // call constructor of parent class
    }

    @Override
    public void withdraw (double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount; //balance = balance - amount
            System.out.println("Withdraw $" + amount + " from Savings Account.");
        }
        else {
            System.out.println("Withdrawal failed! Minimum balance of $" + MIN_BALANCE + " must be maintained.");
        }
    }

    @Override
    public void deposit (double amount) {
        balance += amount;
        System.out.println("Deposit $" + amount + " into Savings Account.");
    }

    @Override
    public void deposit (double amount,String currency){
        double convertedAmount = convertCurrency(amount,currency);
        balance += convertedAmount;
        System.out.println("Deposited " + amount + " " + currency + " (Converted: $" + convertedAmount + ") into Savings Account.");
    }

    private double convertCurrency (double amount, String currency) {
        return switch (currency.toUpperCase()){
            case "EUR"-> amount * 1.1;
            case "GBP" -> amount * 1.3;
            default -> amount; //USD
        };

    }

}

//Subclass currentAccount
class currentAccount extends bankAccount implements Transaction {
    private static final double OVERDRAFT_LIMIT = 500.0; //giới hạn thấu chi cho phép số dư dưới 0 nhưng ko quá -500

    public currentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Current Account.");
        } else {
            System.out.println("Withdrawal failed! Overdraft limit of $" + OVERDRAFT_LIMIT + " exceeded.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit $" + amount + " into Current Account.");
    }

    @Override
    public void deposit(double amount, String currency) {
        double convertedAmount = convertCurrency(amount, currency);
        balance += convertedAmount;
        System.out.println("Deposited " + amount + " " + currency + " (Converted: $" + convertedAmount + ") into Current Account.");
    }

    private double convertCurrency(double amount, String currency) {
        return switch (currency.toUpperCase()) {
            case "EUR" -> amount * 1.1;
            case "GBP" -> amount * 1.3;
            default -> amount; //USD
        };
    }


    //Main class to test
    public static class bankingSystem {
        public static void main(String[] args) {
            savingsAccount savings = new savingsAccount("Helen", 800);
            savings.displayBalance();
            savings.deposit(100);
            savings.displayBalance();
            savings.withdraw(500);
            savings.displayBalance();
            savings.deposit(200, "EUR");
            savings.displayBalance();

            System.out.println("-----------------------------");

            currentAccount currentbalance = new currentAccount("Helen", 500);
            currentbalance.displayBalance();
            currentbalance.deposit(200);
            currentbalance.displayBalance();
            currentbalance.withdraw(123.5);
            currentbalance.displayBalance();
            currentbalance.deposit(156.5,"GBP");
            currentbalance.displayBalance();
        }

    }
}
