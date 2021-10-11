package com.condominium.servicesupplier.services.servicesupplier;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.servicesupplier.models.ServiceSupplier;
import com.condominium.servicesupplier.repositories.ServiceSupplierRepository;

@Service
public class ServiceSupplierDAO {
	
	@Autowired
	private ServiceSupplierRepository repository;

	
	public List<ServiceSupplier> findAll() {
		return repository.findAll();
	}
	
	public ServiceSupplier getById(UUID id) {
		return repository.getById(id);
	}
	
	public ServiceSupplier save(ServiceSupplier ServiceSupplier) {
		return repository.save(ServiceSupplier);
	}
	
	public ServiceSupplier update(ServiceSupplier ServiceSupplier) {
		return repository.save(ServiceSupplier);
	}
}
