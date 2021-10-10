package com.condominium.ordinance.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.condominium.ordinance.models.Permision;

@Repository
public interface PermissionRepository extends JpaRepository<Permision, UUID>{
	
	
	List<Permision> findByRequestor(UUID id);
	
	List<Permision> findByResident(UUID id);

}
