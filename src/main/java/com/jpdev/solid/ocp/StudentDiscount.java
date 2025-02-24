package com.jpdev.solid.ocp;

public class StudentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.85;
    }
}
