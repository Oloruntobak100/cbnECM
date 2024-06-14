package com.hyella.hyellapaymentservice.common.abstracts;

import com.hyella.hyellapaymentservice.common.enums.BankAccountTypeEnum;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * This abstract class represents a bank account in the system.
 * It provides common attributes and methods for concrete bank account implementations.
 */
public abstract class AbstractBankAccount {

    /**
   * Unique identifier for the bank account.
   */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
   * The bank associated with this account.
   */
    private AbstractBank bank;

    /**
   * Unique account number for this account within the bank.
   */
    private Long accountNumber;

    /**
   * Name associated with the bank account (e.g., account holder name).
   */
    private String accountName;

    /**
   * Type of bank account (e.g., Debit, Credit).
   */
    private BankAccountTypeEnum accountType;

    /**
   * The organization associated with this account
   */
    private AbstractOrganization organization;

    /**
   * The strategic business unit associated with this account
   */
    private AbstractStrategicBusinessUnit strategicBusinessUnit;

}
