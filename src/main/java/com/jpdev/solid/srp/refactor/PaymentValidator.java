package com.jpdev.solid.srp.refactor;

import java.math.BigDecimal;

public class PaymentValidator {

    public void validate(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El monto del pago debe ser mayor a 0");
        }
    }
}
