package com.jpdev.solid.lsp;

abstract public class BankAccount {

    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount);
}
