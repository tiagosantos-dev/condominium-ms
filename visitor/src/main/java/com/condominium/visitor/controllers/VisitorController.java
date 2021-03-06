package com.condominium.visitor.controllers;

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

import com.condominium.visitor.models.Visitor;
import com.condominium.visitor.services.visitor.VistorService;

@RestController
@RequestMapping("/visitor-service")
public class VisitorController {
	
	@Autowired
	private VistorService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Visitor> getById(@PathVariable UUID id) {
		return ResponseEntity.ok(service.getById(id));
		
	}
	
	@PostMapping
	public ResponseEntity<Visitor> save(@RequestBody Visitor visitor) {
		return ResponseEntity.ok(service.save(visitor));
		
	}
	
	@PutMapping
	public ResponseEntity<Visitor> update(@RequestBody  Visitor visitor) {
		return ResponseEntity.ok(service.update(visitor));
		
	}

}
