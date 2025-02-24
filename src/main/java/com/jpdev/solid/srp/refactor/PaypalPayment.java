package com.jpdev.solid.srp.refactor;

import com.jpdev.solid.srp.PaymentMethod;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class PaypalPayment implements PaymentMethod {
    private static final Logger logger = Logger.getLogger(PaypalPayment.class.getName());

    @Override
    public void process(String userId, BigDecimal amount) {
        logger.info("Procesando pago con PayPal para el usuario " + userId);
    }
}
