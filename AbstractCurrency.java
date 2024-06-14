package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.Id;

import java.util.Set;

/**
 * Represents an abstract model for currency entities within the Hyella Payment Service.
 * This abstract class defines the basic structure of a currency, including its code, name, associated countries,
 * and the number of digits to display after the decimal point. It serves as a foundation for concrete currency
 * implementations, facilitating the management and representation of currency-specific information in the system.
 */
public abstract class AbstractCurrency {
    /**
     * Unique identifier for the currency, typically using a standardized currency code notation (e.g., ISO 4217).
     */
    @Id
    private String currencyCode;

    /**
     * A set of {@link AbstractCountry} objects representing the countries where this currency is officially used.
     * This allows for modeling of currencies that are used in multiple countries.
     */
    private Set<AbstractCountry> country;

    /**
     * The name of the currency, providing a human-readable identification.
     */
    private String currencyName;

    /**
     * The number of digits to display after the decimal point for this currency.
     * This is important for financial calculations and display purposes, ensuring consistency across the system.
     */
    private int digitsAfterDecimal;

}
