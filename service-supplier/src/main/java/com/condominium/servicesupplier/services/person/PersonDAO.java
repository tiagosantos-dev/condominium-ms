package com.condominium.servicesupplier.services.person;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.servicesupplier.models.Person;
import com.condominium.servicesupplier.repositories.PersonRepository;

@Service
public class PersonDAO {
	
	@Autowired
	private PersonRepository repository;
	

	
	public List<Person> findAll() {
		return repository.findAll();
	}
	
	public Person getById(UUID id) {
		return repository.getById(id);
	}
	
	public Person save(Person Person) {
		return repository.save(Person);
	}
	
	public Person update(Person Person) {
		return repository.save(Person);
	}
}
