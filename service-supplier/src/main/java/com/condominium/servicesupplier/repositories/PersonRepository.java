package com.condominium.servicesupplier.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.condominium.servicesupplier.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, UUID>{

}
