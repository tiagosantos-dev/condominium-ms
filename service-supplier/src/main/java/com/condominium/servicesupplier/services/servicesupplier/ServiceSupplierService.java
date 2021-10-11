package com.condominium.servicesupplier.services.servicesupplier;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominium.servicesupplier.models.ServiceSupplier;

@Service
public class ServiceSupplierService {
	
	@Autowired
	private ServiceSupplierDAO dao;
	
	
	public List<ServiceSupplier> findAll() {
		return dao.findAll();
	}
	
	public ServiceSupplier getById(UUID id) {
		return dao.getById(id);
	}
	
	public ServiceSupplier save(ServiceSupplier serviceSupplier) {
		return dao.save(serviceSupplier);
	}
	
	public ServiceSupplier update(ServiceSupplier serviceSupplier) {
		return dao.save(serviceSupplier);
	}

}
