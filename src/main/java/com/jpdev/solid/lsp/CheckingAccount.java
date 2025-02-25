package com.jpdev.solid.lsp;

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;

    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Retiro exitoso: $" + amount);
        } else {
            throw new IllegalArgumentException("Fondos insuficientes.");
        }
    }
}
