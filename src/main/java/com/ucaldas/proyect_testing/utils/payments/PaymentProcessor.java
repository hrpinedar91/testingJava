package com.ucaldas.proyect_testing.utils.payments;

public class PaymentProcessor {

    private static PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public static boolean makePayment(double amount) {
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        if(response.getStatus() == PaymentResponse.PaymentStatus.OK){
            return true;
        } else {
            return false;
        }
    }
}
