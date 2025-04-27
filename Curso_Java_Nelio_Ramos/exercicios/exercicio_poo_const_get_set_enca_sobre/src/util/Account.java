package util;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        balance += balance;
    }

    public void deposit (double amount) {
         balance += amount;
    }

    public void withdraw (double amount) {
        double tax = 5.00;
        // this.balance -= (amount + tax);
        if (this.balance >= (amount + tax)) {
            this.balance -= (amount + tax);
        } else {
            System.out.println("Saldo insulficiente para saque e taxa.");
        }
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f", this.number, this.holder, this.balance);
    }

}
