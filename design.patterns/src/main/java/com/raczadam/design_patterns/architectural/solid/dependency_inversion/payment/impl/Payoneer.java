package com.raczadam.design_patterns.architectural.solid.dependency_inversion.payment.impl;

import com.raczadam.design_patterns.architectural.solid.dependency_inversion.payment.PaymentMethod;

// low level module
public class Payoneer implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with Payoneer...");
    }

}
