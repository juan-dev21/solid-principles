package com.jpdev.solid.srp;

import java.math.BigDecimal;

public interface PaymentMethod {

    void process(String userId, BigDecimal amount);
}
