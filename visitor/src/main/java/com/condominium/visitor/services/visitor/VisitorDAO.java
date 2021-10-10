package com.condominium.visitor.services.visitor;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.visitor.models.Visitor;
import com.condominium.visitor.repositories.VisitorRepository;

@Service
public class VisitorDAO {
	
	@Autowired
	private VisitorRepository repository;
	
	
	public Visitor getById(UUID id) {
		return repository.getById(id);
		
	}
	
	public Visitor save(Visitor visitor) {
		return repository.save(visitor);
		
	}
	
	public Visitor update(Visitor visitor) {
		return repository.save(visitor);
		
	}
	

}
