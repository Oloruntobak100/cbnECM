package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

/**
 * Represents an abstract model for payment request entities within the Hyella Payment Service.
 * This abstract class defines the structure of a payment request, including unique identifiers,
 * transaction details, associated business units and customers, and payment service provider information.
 * It serves as a foundation for concrete payment request implementations, enabling comprehensive
 * management and tracking of payment requests in the system.
 */
public abstract class AbstractPaymentRequest {

    /**
     * Unique identifier for the payment request, generated using UUID strategy for guaranteed uniqueness.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    /**
     * Identifier for the transaction from the source system that initiated this payment request.
     */
    private String sourceTransactionId;

    /**
     * The strategic business unit associated with this payment request, indicating the specific part of the organization
     * or business context to which the request is relevant.
     */
    private AbstractStrategicBusinessUnit strategicBusinessUnit;

    /**
     * The amount of money requested for payment, specified in the currency of the associated payment service provider.
     */
    private double amount;

    /**
     * The email address of the customer making the payment request, used for notifications or confirmations.
     */
    private String customerEmail;

    /**
     * The phone number of the customer, providing an alternative contact method for notifications or confirmations.
     */
    private String customerPhoneNumber;

    /**
     * External reference ID provided by the customer for linking the payment request to customer-specific data or systems.
     */
    private String customerReferenceIDExternal;

    /**
     * The type of payment transaction being requested, defining the nature or category of the payment within the system.
     */
    private AbstractPaymentTransactionType paymentTransactionType;

    /**
     * A brief description of the payment request, offering context or additional information about the transaction.
     */
    private String description;

    /**
     * The payment service provider through which the payment request is to be processed, indicating the specific
     * payment gateway or financial service to be used.
     */
    private AbstractPaymentServiceProvider paymentServiceProvider;

    
    /**
     * Timestamp representing when the payment request was created, automatically set at the time of creation.
     */
    @CreationTimestamp
    private Date createdAt;

}
