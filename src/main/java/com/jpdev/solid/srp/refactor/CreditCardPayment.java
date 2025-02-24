package com.jpdev.solid.srp.refactor;

import com.jpdev.solid.srp.PaymentMethod;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class CreditCardPayment implements PaymentMethod {

    private static final Logger logger = Logger.getLogger(CreditCardPayment.class.getName());

    private String type;

    public CreditCardPayment() {
        type = "credit_card";
    }

    @Override
    public void process(String userId, BigDecimal amount) {
        logger.info("Procesando pago con tarjeta de crédito para el usuario " + userId);
    }

    public String getType() {
        return type;
    }
}
