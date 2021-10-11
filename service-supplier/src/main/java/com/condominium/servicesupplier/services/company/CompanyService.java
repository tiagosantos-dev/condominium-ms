package com.condominium.servicesupplier.services.company;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.servicesupplier.models.Company;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyDAO dao;

	
	public List<Company> findAll() {
		return dao.findAll();
	}
	
	public Company getById(UUID id) {
		return dao.getById(id);
	}
	
	public Company save(Company company) {
		return dao.save(company);
	}
	
	public Company update(Company company) {
		return dao.save(company);
	}
}
