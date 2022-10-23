package com.ucaldas.proyect_testing.utils.payments;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private  PaymentProcessor paymentProcessor;

   @BeforeEach
    public void setup() {
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
   }

   @Test
    public void payment_is_correct() {
       Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

       Assertions.assertTrue(PaymentProcessor.makePayment(1000));
   }

}