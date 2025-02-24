package com.jpdev.solid.ocp;


public class OcpMain {

    public static void main(String[] args) {
        double price = 100.0;

        // Cliente regular
        PaymentProcessor regularPayment = new PaymentProcessor(new RegularDiscount());
        System.out.println("Precio final para cliente regular: " + regularPayment.processPayment(price));

        // Cliente VIP
        PaymentProcessor vipPayment = new PaymentProcessor(new VipDiscount());
        System.out.println("Precio final para cliente VIP: " + vipPayment.processPayment(price));

        // Cliente estudiante
        PaymentProcessor studentPayment = new PaymentProcessor(new StudentDiscount());
        System.out.println("Precio final para estudiante: " + studentPayment.processPayment(price));
    }
}
