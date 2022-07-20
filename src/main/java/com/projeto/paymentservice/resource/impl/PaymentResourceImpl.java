package com.projeto.paymentservice.resource.impl;


import com.projeto.paymentservice.model.Payment;
import com.projeto.paymentservice.resource.PaymentResource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentResourceImpl<PaymentService> implements PaymentResource {

    private final PaymentService paymentService;


    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
