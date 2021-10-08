package com.condominium.resident.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.condominium.resident.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, UUID>{

}
