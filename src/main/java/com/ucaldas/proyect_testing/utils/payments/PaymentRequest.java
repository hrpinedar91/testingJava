package com.ucaldas.proyect_testing.utils.payments;

public class PaymentRequest {
    private double mount;

    public PaymentRequest(double mount) {
        this.mount = mount;
    }
    public  double getAmount() {
        return mount;
    }
}
