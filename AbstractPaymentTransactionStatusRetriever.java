package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public abstract class AbstractPaymentTransactionStatusRetriever{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private AbstractPaymentServiceProvider paymentServiceProvider;

    private AbstractPaymentTransactionType paymentTransactionType;

    private String paymentTransactionStatusRetriever;

    private String authenticationMethod;
}
