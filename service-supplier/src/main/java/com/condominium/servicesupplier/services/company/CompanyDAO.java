package com.condominium.servicesupplier.services.company;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.servicesupplier.models.Company;
import com.condominium.servicesupplier.repositories.CompanyRepository;

@Service
public class CompanyDAO {

	@Autowired 
	private CompanyRepository repository;
	
	
	public List<Company> findAll() {
		return repository.findAll();
	}
	
	public Company getById(UUID id) {
		return repository.getById(id);
	}
	
	public Company save(Company company) {
		return repository.save(company);
	}
	
	public Company update(Company company) {
		return repository.save(company);
	}
	
}
