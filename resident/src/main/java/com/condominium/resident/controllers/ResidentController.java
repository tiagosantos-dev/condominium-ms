package com.condominium.resident.controllers;

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

import com.condominium.resident.models.Resident;
import com.condominium.resident.services.resident.ResidentService;

@RestController()
@RequestMapping("/resident-service")
public class ResidentController {

	@Autowired
	private ResidentService residentService;
	
	@PostMapping
	public ResponseEntity<Resident> save(@RequestBody Resident resident){
		return ResponseEntity.ok(residentService.save(resident));
	}
	
	
	@PutMapping
	public ResponseEntity<Resident> u(@RequestBody Resident resident){
		Resident newResident = residentService.update(resident);
		return ResponseEntity.ok(newResident);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Resident>> findAll(){
		List<Resident> listResident = residentService.findAll();
		if(listResident.isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(listResident);
		}
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Resident> getById(@PathVariable UUID id){
			return ResponseEntity.ok(residentService.getById(id));
		
	}
}
