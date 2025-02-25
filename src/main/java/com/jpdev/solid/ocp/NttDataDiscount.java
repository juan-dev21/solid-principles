package com.jpdev.solid.ocp;

public class NttDataDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price * 0.5;
    }
}
