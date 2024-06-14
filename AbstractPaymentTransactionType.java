package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public abstract class AbstractPaymentTransactionType{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String paymentTransactionType;
}
