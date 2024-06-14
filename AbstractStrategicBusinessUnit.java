package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;

import java.util.Date;

public abstract class AbstractStrategicBusinessUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long organization;

    private Boolean enabled;

    private String phoneNumber;

    private String emailAddress;

    private String address;

    private AbstractCountry country;

    @CreatedBy
    private AbstractUser createdBy;
    
    private Boolean isDeleted;
    
    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
