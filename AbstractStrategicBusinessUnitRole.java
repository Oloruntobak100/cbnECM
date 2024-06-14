package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

public abstract class AbstractStrategicBusinessUnitRole{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public AbstractStrategicBusinessUnit strategicBusinessUnit;

    public AbstractRole role;

    private Set<AbstractUser> userStrategicBusinessUnitRoles;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

    private Boolean isDeleted;
}
