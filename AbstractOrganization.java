package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;

import java.util.Date;
import java.util.Set;

/**
 * Interface to contain properties of an organization.
 */
public abstract class AbstractOrganization{
    /**
     * Unique identifier for an Organization.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the organization.
     */
    private String name;

    /**
     * Flag to enable or disable an organization.
     */
    private Boolean enabled;

    /**
     * Phone number of the organization.
     */
    private String phoneNumber;

    /**
     * The email address of the organization.
     */
    private String emailAddress;

    /**
     * The physical address of the organization.
     */
    private String address;

    /**
     * The country the organization is located.
     */
    private AbstractCountry country;

    /**
     * The epoch time the organization was created at.
     */
    @CreationTimestamp
    private Date createdAt;

    /**
     * The epoch time the organization was last modified.
     */
    @UpdateTimestamp
    private Date updatedAt;

    /**
     * All the SBUs that the organization owns.
     */
    private Set<AbstractStrategicBusinessUnit> strategicBusinessUnits;

    /**
     * The user that created the organization.
     */
    @CreatedBy
    private AbstractUser createdBy;

    /**
     * Flag to soft-delete an organization
     */
    private Boolean isDeleted;
}
