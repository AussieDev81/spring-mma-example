package com.example.repo;

import com.example.entity.ServiceRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRoleRepository extends JpaRepository<ServiceRole, Long> {
}