package com.condominium.ordinance.services.permission;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.ordinance.models.Permision;
import com.condominium.ordinance.repositories.PermissionRepository;

@Service
public class PermissionDAO {
	
	@Autowired
	private PermissionRepository repository;

	
	public Permision getById(UUID id){
		return repository.getById(id);
	}
	
	
	public List<Permision> getByRequestor(UUID id){
		return repository.findByRequestor(id);
	}
	
	public List<Permision> getByResident(UUID id){
		return repository.findByResident(id);
	}
	
	
	public Permision save(Permision permission){
		return repository.save(permission);
	}
	
	
	public Permision update(Permision permission){
		return repository.save(permission);
	}
}
