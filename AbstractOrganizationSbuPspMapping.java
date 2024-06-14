package com.hyella.hyellapaymentservice.common.abstracts;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public abstract class AbstractOrganizationSbuPspMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private AbstractOrganization organization;

    private AbstractStrategicBusinessUnit strategicBusinessUnit;
    
    private AbstractPaymentServiceProvider paymentServiceProvider;
    
    private String metadata;

    @CreationTimestamp
    private Date createdAt;

    @CreatedBy
    private AbstractUser createdBy;
}
