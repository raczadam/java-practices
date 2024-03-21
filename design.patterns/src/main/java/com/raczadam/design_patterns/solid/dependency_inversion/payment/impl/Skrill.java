package com.raczadam.design_patterns.solid.dependency_inversion.payment.impl;

import com.raczadam.design_patterns.solid.dependency_inversion.payment.PaymentMethod;

// low level module
public class Skrill implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with Skrill...");
    }

}
