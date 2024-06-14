package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.hyella.hyellapaymentservice.common.enums.TransactionChargeRecepientEnum;
import com.hyella.hyellapaymentservice.common.enums.TransactionChargeTypeEnum;

public abstract class AbstractTransactionCharge{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private AbstractPaymentServiceProvider paymentServiceProvider;

    private AbstractPaymentTransactionType paymentTransactionType;

    private AbstractCountry country;

    private TransactionChargeTypeEnum chargeType;

    private double serviceChargeAmount;

    private double serviceChargePercent;

    private TransactionChargeRecepientEnum recepientType;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}