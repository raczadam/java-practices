package com.raczadam.design_patterns.solid.dependency_inversion;

import com.raczadam.design_patterns.solid.dependency_inversion.payment.impl.PayPal;
import com.raczadam.design_patterns.solid.dependency_inversion.payment.impl.Payoneer;
import com.raczadam.design_patterns.solid.dependency_inversion.payment.impl.Skrill;
import com.raczadam.design_patterns.solid.dependency_inversion.payment.service.PaymentController;

import java.util.Map;

// high-level module
public class WebStore {


    public enum Payment {
        PAYONEER, PAYPAL, SKRILL
    }


    private final Map<Payment, PaymentController> PAYMENT_CONTROLLER_CONTAINER =
            Map.of(Payment.PAYONEER, new PaymentController(new Payoneer()),
                    Payment.PAYPAL, new PaymentController(new PayPal()),
                    Payment.SKRILL, new PaymentController(new Skrill()));


    public void pay(Payment payment) {
        PAYMENT_CONTROLLER_CONTAINER.get(payment).pay();
    }

}
