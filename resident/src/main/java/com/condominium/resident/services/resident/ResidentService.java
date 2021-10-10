package com.condominium.resident.services.resident;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.resident.models.Resident;

@Service
public class ResidentService {
	
	@Autowired
	private ResidentDAO dao;

	public List<Resident> findAll() {
		return dao.findAll();
	}

	public Resident save(Resident resident) {
		return dao.save(resident);
	}

	public Resident update(Resident resident) {
	
		return dao.update(resident);
	}
	
	public Resident getById(UUID id) {
		return dao.getById(id);
	}

}
