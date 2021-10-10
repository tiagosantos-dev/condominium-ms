package com.condominium.visitor.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.condominium.visitor.models.Visitor;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, UUID> {

}
