package com.condominium.servicesupplier.services.person;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.servicesupplier.models.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDAO dao;
	
	
	public List<Person> findAll() {
		return dao.findAll();
	}
	
	public Person getById(UUID id) {
		return dao.getById(id);
	}
	
	public Person save(Person company) {
		return dao.save(company);
	}
	
	public Person update(Person company) {
		return dao.save(company);
	}

}
