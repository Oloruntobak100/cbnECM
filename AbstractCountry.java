package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.Id;

import java.util.Set;

/**
 * Represents an abstract model for country entities within the Hyella Payment Service.
 * This abstract class defines the basic structure of a country, including its code, name, and associated currencies.
 * It serves as a foundation for concrete country implementations, facilitating the management and representation
 * of country-specific information in the system.
 */
public abstract class AbstractCountry {
    /**
     * Unique identifier for the country, typically using a standardized country code notation (e.g., ISO 3166-1 alpha-2).
     */
    @Id
    private String countryCode;

    /**
     * The name of the country, providing a human-readable identification.
     */
    private String countryName;

    /**
     * A set of {@link AbstractCurrency} objects representing the currencies associated with the country.
     * This relationship allows for the modeling of countries that use multiple currencies.
     */
    private Set<AbstractCurrency> currency;
}
