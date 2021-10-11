package com.condominium.servicesupplier.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.condominium.servicesupplier.models.ServiceSupplier;

@Repository
public interface ServiceSupplierRepository extends JpaRepository<ServiceSupplier, UUID>{

}
