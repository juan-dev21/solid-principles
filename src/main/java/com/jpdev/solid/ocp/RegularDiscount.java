package com.jpdev.solid.ocp;

public class RegularDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price; // No aplica descuento
    }

}
