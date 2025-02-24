package com.jpdev.solid.srp.refactor;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class PaymentNotifier {

    private static final Logger logger = Logger.getLogger(PaymentNotifier.class.getName());

    public void notifyUser(String userId, BigDecimal amount) {
        logger.info("Enviando notificación de pago al usuario " + userId + " por el monto de " + amount);
    }
}
