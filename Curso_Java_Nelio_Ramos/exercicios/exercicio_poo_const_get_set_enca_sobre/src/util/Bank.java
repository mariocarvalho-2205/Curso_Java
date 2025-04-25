package util;

public class Bank {
    private int account;
    private String holder;
    private double balance;

    public Bank(int account, String holder, double balance) {
        this.account = account;
        this.holder = holder;
        this.balance = balance;
    }

    public Bank(int account, String holder) {
        this.account = account;
        this.holder = holder;
        this.balance = 0.00;
    }

    public String toString () {
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", this.account, this.holder, this.balance);
    }

}
