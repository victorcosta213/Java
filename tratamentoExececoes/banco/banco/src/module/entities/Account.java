package module.entities;

import module.exception.LimitException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withDrawnLimit;

    public Account(int number, String holder, double balance, double withDrawnLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawnLimit = withDrawnLimit;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithDrawnLimit() {
        return withDrawnLimit;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withDrawn(double amount) throws LimitException{
        if (amount>balance){
            throw new LimitException("Saldo insufiente");
        }
        if (amount>this.withDrawnLimit){
            throw new LimitException("Saque ultrapassa o limite de saque!");
        }
        this.balance -= amount;
    }

}
