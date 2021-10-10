package com.condominium.ordinance.services.permission;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.ordinance.models.Permision;

@Service
public class PermissionService {
	
	@Autowired
	private PermissionDAO dao;
	
	
	public Permision getById(UUID id){
		return dao.getById(id);
	}
	
	
	public List<Permision> getByRequestor(UUID id){
		return dao.getByRequestor(id);
	}
	
	
	public Permision save(Permision permission){
		return dao.save(permission);
	}
	
	
	public Permision update(Permision permission){
		return dao.update(permission);
	}

}
