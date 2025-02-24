package com.jpdev.solid.ocp;

public class PaymentProcessor {

    private final DiscountStrategy discountStrategy;

    public PaymentProcessor(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double processPayment(double price) {
        return discountStrategy.applyDiscount(price);
    }
}
