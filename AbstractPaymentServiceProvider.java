package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Set;

/**
 * Represents an abstract model for payment service provider entities within the Hyella Payment Service.
 * This abstract class defines the structure of a payment service provider, including a unique identifier,
 * name, associated payment transaction types, transaction charges, and an enabled status. It serves as a foundation
 * for concrete payment service provider implementations, enabling the system to interface with various payment
 * gateways or financial service providers.
 */
public abstract class AbstractPaymentServiceProvider {
    /**
     * Unique identifier for the payment service provider, generated with an identity strategy to ensure uniqueness.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * The name of the payment service provider, providing a human-readable identification of the service.
     */
    private String name;

    /**
     * A set of {@link AbstractPaymentTransactionType} objects representing the types of payment transactions
     * that this service provider is capable of handling. This allows for the categorization and specialized
     * processing of different types of transactions.
     */
    private Set<AbstractPaymentTransactionType> paymentTransactionType;

    /**
     * A set of {@link AbstractTransactionCharge} objects representing the transaction charges associated
     * with this payment service provider. This facilitates the management of fees or charges that are
     * applicable to transactions processed by the provider.
     */
    private Set<AbstractTransactionCharge> transactionCharges;

    /**
     * A Boolean flag indicating whether the payment service provider is currently enabled or active.
     * This allows for the temporary or permanent disabling of providers without removing their configuration.
     */
    private Boolean enabled;


}
