package com.hyella.hyellapaymentservice.common.abstracts;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public abstract class AbstractTransactionStatement{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private AbstractStrategicBusinessUnit strategicBusinessUnit;

    private AbstractPaymentTransaction paymentTransaction;

    private AbstractUser statementLoadedBy;

    private double debitAmount;

    private double creditAmount;

    private AbstractCurrency currency;

    private String referenceNumber;

    private String description;

    // source(String for now, but we need to make more robust for use for bank account interaction service)
    private String source;

    private LocalDateTime transactionDate;

    private LocalDateTime postingDate;
}
