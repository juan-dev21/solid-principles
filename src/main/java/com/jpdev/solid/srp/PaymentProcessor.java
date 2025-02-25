package com.jpdev.solid.srp;

import com.jpdev.solid.srp.refactor.*;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 * Single Responsibility Principle.
 * Principio de Responsabilidad Única
 *
 *
 */
public class PaymentProcessor {

    private static final Logger logger = Logger.getLogger(PaymentProcessor.class.getName());

    private PaymentValidator paymentValidator;
    private PaymentRepository paymentRepository;
    private PaymentNotifier paymentNotifier;


    public PaymentProcessor(PaymentValidator paymentValidator, PaymentRepository paymentRepository, PaymentNotifier paymentNotifier) {
        this.paymentValidator = paymentValidator;
        this.paymentRepository = paymentRepository;
        this.paymentNotifier = paymentNotifier;
    }

    public void processPayment(String userId, BigDecimal amount, PaymentMethod paymentMethod) {

        paymentValidator.validate(amount);

        // Validación del pago
       /* if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El monto del pago debe ser mayor a 0");
        }*/

        // Procesamiento del pago según el método de pago
        //if (paymentMethod instanceof CreditCardPayment) {
            paymentMethod.process(userId, amount);
            //processCreditCardPayment(userId, amount);
        //} else if (paymentMethod instanceof PaypalPayment) {
            //paymentMethod.process(userId, amount);
            //processPaypalPayment(userId, amount);
        //} else {
           // throw new IllegalArgumentException("Método de pago no soportado");
        //}

        // Registro en la base de datos (simulado)
        String paymentMethodName = paymentMethod.getClass().getSimpleName();
        paymentRepository.save(userId, amount, paymentMethodName);
        //(userId, amount, paymentMethod);

        // Envío de notificación al usuario
        paymentNotifier.notifyUser(userId, amount);
        //sendPaymentNotification(userId, amount);
    }

    private void processCreditCardPayment(String userId, BigDecimal amount) {
        // Lógica para procesar pagos con tarjeta de crédito
        logger.info("Procesando pago con tarjeta de crédito para el usuario " + userId);
    }

    private void processPaypalPayment(String userId, BigDecimal amount) {
        // Lógica para procesar pagos con PayPal
        logger.info("Procesando pago con PayPal para el usuario " + userId);
    }

    private void savePaymentToDatabase(String userId, BigDecimal amount, PaymentMethod paymentMethod) {
        // Simulación de almacenamiento en base de datos
        logger.info("Guardando pago en la base de datos para el usuario " + userId);
    }

    private void sendPaymentNotification(String userId, BigDecimal amount) {
        // Simulación de notificación
        logger.info("Enviando notificación de pago al usuario " + userId);
    }

}
