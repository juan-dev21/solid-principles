package com.jpdev.solid.srp.refactor;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class PaymentRepository {

    private static final Logger logger = Logger.getLogger(PaymentRepository.class.getName());

    public void save(String userId, BigDecimal amount, String paymentMethod) {
        logger.info("Guardando pago en la base de datos para el usuario " + userId + " con método " + paymentMethod);
    }
}
