package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public abstract class AbstractPaymentTransaction{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private AbstractPaymentRequest paymentRequest;

    private AbstractPaymentServiceProvider paymentServiceProvider;

    private AbstractPaymentTransactionType paymentTransactionType;

    private Double amount;
  
    private AbstractTransactionCharge transactionCharge;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

    private AbstractPaymentTransactionStatus paymentTransactionStatus;

    private AbstractCurrency currency;

}
