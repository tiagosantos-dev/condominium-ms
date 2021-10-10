package com.condominium.visitor.services.visitor;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.visitor.models.Visitor;

@Service
public class VistorService {
	
	@Autowired
	private VisitorDAO dao;

	
	public Visitor getById(UUID id) {
		return dao.getById(id);
		
	}
	
	public Visitor save(Visitor visitor) {
		return dao.save(visitor);
		
	}
	
	public Visitor update(Visitor visitor) {
		return dao.save(visitor);
		
	}
}
