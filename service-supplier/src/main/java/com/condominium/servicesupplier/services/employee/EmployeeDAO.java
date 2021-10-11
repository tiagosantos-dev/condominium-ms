package com.condominium.servicesupplier.services.employee;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.servicesupplier.models.Employee;
import com.condominium.servicesupplier.repositories.EmployeeRepository;

@Service
public class EmployeeDAO {
	
	@Autowired
	private EmployeeRepository repository;
	
	
	public List<Employee> findAll() {
		return repository.findAll();
	}
	
	public Employee getById(UUID id) {
		return repository.getById(id);
	}
	
	public Employee save(Employee company) {
		return repository.save(company);
	}
	
	public Employee update(Employee company) {
		return repository.save(company);
	}

}
