package com.raczadam.design_patterns.principles.solid.dependency_inversion.payment.service;

import com.raczadam.design_patterns.principles.solid.dependency_inversion.payment.PaymentMethod;

// this is the pure abstract layer
public class PaymentController {

    private final PaymentMethod paymentMethod;

    public PaymentController(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        paymentMethod.pay();
    }

}
