package com.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "partner")
public class Partner extends Stakeholder {

    @Column(name = "ABN")
    private String ABN;

    @ManyToMany
    @JoinTable(
            name = "partner_service_roles",
            joinColumns = @JoinColumn(name = "partner_id"),
            inverseJoinColumns = @JoinColumn(name = "service_role_id"))
    private Set<ServiceRole> serviceRoles;// Employer/Placement Provider etc

    public Partner(Long id, String name, String email, String ABN, Set<ServiceRole> serviceRoles) {
        super(id, name, email);
        this.ABN = ABN;
        this.serviceRoles = serviceRoles;
    }
}