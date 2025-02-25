package com.jpdev.solid.lsp;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Retiro exitoso: $" + amount);
        } else {
            throw new IllegalArgumentException("Fondos insuficientes.");
        }
    }


    /*Animal hacerSonido()

        Dog implements Animal
            hacerSonido() {
                ladrar
            }
    }

    main() {
        Dog animal = new Dog(); // morder con el canimo
        animal.hacerSonido();

        Dog animal;

        animal = new DobermanDog();
        animal.hacerSonido();
        animal.mordseCarnino();

        animal = new SiberianoDog();
        animal.hacerSonido();
        animal.mordseCarnino();
    }*/
}
