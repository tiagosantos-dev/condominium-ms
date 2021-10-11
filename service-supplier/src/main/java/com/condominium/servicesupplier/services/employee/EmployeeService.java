package com.condominium.servicesupplier.services.employee;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.servicesupplier.models.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;
	
	
	
	public List<Employee> findAll() {
		return dao.findAll();
	}
	
	public Employee getById(UUID id) {
		return dao.getById(id);
	}
	
	public Employee save(Employee company) {
		return dao.save(company);
	}
	
	public Employee update(Employee company) {
		return dao.save(company);
	}

}
