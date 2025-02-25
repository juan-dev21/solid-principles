package com.jpdev.solid.lsp;

public class LiskovExample {

    public static void main(String[] args) {
        BankAccount checking = new CheckingAccount(1000, 500);
        BankAccount savings = new SavingsAccount(1000);

        System.out.println("Intentando retiro en cuenta corriente:");
        processWithdrawal(checking, 1200); // Éxito (usa sobregiro)

        System.out.println("\nIntentando retiro en cuenta de ahorro:");
        processWithdrawal(savings, 1200); // Error (sin sobregiro)

    }

    public static void processWithdrawal(BankAccount account, double amount) {
        try {
            account.withdraw(amount);
            System.out.println("Nuevo saldo: $" + account.getBalance());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
