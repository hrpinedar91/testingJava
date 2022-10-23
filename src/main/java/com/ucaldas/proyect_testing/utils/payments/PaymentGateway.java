package com.ucaldas.proyect_testing.utils.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
