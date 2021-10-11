package com.condominium.servicesupplier.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.condominium.servicesupplier.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,UUID>{

}
