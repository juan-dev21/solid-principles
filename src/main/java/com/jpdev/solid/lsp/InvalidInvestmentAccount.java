package com.jpdev.solid.lsp;

public class InvalidInvestmentAccount extends BankAccount{

    public InvalidInvestmentAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= (amount * 0.9); // Aplica una penalización del 10%
        System.out.println("Retiro penalizado: Se descontó $" + (amount * 0.9));
    }
}
