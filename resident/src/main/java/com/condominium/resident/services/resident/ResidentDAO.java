package com.condominium.resident.services.resident;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.resident.models.Resident;
import com.condominium.resident.repositories.ResidentRepository;

@Service
public class ResidentDAO  {
	
	@Autowired
	private ResidentRepository repository;

	public List<Resident> findAll() {
		return repository.findAll();
	}


	public Resident getById(UUID id) {
		return repository.getById(id);
	}

	
	public Resident save(Resident entity) {
		return repository.save(entity);
	}

	
	public void deleteById(UUID id) {
		
	}

	
	public void delete(Resident entity) {
		
	}

	

}
