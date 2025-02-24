package com.jpdev.solid.srp;

import com.jpdev.solid.srp.refactor.*;

import java.math.BigDecimal;

public class SrpMain {

    public static void main(String[] args) {
        PaymentValidator validator = new PaymentValidator();
        PaymentRepository repository = new PaymentRepository();
        PaymentNotifier notifier = new PaymentNotifier();
        PaymentProcessor processor = new PaymentProcessor(validator, repository, notifier);

        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod paymentMethod = new PaypalPayment();

        processor.processPayment("user123", new BigDecimal("100.50"), creditCardPayment);
        processor.processPayment("user567", new BigDecimal("50.70"), paymentMethod);
    }
}
