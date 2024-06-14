package com.hyella.hyellapaymentservice.common.abstracts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;

import java.util.Set;
import java.util.Date;

public abstract class AbstractUser{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private AbstractOrganization Organization;

    private String sourceSystemUserId;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

    private Set<AbstractStrategicBusinessUnitRole> strategicBusinessUnitRoles;

    @CreatedBy
    private AbstractUser created_by;

    private Boolean isDeleted;
}
