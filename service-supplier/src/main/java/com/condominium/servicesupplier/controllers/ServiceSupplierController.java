package com.condominium.servicesupplier.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.condominium.servicesupplier.models.ServiceSupplier;
import com.condominium.servicesupplier.services.servicesupplier.ServiceSupplierService;

@RestController
@RequestMapping("service-supplier-service")
public class ServiceSupplierController {
	
	@Autowired
	private ServiceSupplierService service;
	
	@GetMapping
	public ResponseEntity<List<ServiceSupplier>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ServiceSupplier> getById(@PathVariable UUID id){
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<ServiceSupplier> save(@RequestBody ServiceSupplier serviceSupplier){
		return ResponseEntity.ok(service.save(serviceSupplier));
	}
	
	
	@PutMapping
	public ResponseEntity<ServiceSupplier> update(@RequestBody ServiceSupplier serviceSupplier){
		return ResponseEntity.ok(service.update(serviceSupplier));
	}

}
