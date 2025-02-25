package com.jpdev.solid.lsp;

public class LiskovViolationExample {

    public static void main(String[] args) {
        BankAccount account = new InvalidInvestmentAccount(1000);

        System.out.println("Saldo inicial: $" + account.getBalance());

        account.withdraw(200); // Se espera que reste 200, pero restará solo 180

        System.out.println("Saldo después del retiro: $" + account.getBalance());
    }
}
