package com.raczadam.design_patterns.principles.solid.dependency_inversion.payment.impl;

import com.raczadam.design_patterns.principles.solid.dependency_inversion.payment.PaymentMethod;

// low level module
public class PayPal implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with PayPal...");
    }

}
