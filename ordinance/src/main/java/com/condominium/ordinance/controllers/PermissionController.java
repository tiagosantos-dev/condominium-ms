package com.condominium.ordinance.controllers;

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

import com.condominium.ordinance.clients.ResidentClient;
import com.condominium.ordinance.clients.VisitorClient;
import com.condominium.ordinance.models.Permision;
import com.condominium.ordinance.models.PermisionStatus;
import com.condominium.ordinance.models.PermissionResponse;
import com.condominium.ordinance.models.Resident;
import com.condominium.ordinance.models.TypeRequestor;
import com.condominium.ordinance.models.Visitor;
import com.condominium.ordinance.services.permission.PermissionService;

@RestController
@RequestMapping("/ordinance-service/permission")
public class PermissionController {
	
	@Autowired
	private PermissionService service;
	
	@Autowired
	private ResidentClient residentClient;
	
	
	@Autowired
	private VisitorClient visitorClient;
	
	@PostMapping
	public ResponseEntity<PermissionResponse> permissionRequest(@RequestBody Permision permision){
		permision.setStatus(PermisionStatus.IN_PROGRESS);
		Resident resident = residentClient.getById(permision.getResident()).getBody();
		PermissionResponse response = new PermissionResponse();
		
		if(resident == null) {
			return ResponseEntity.badRequest().build();
		}else {
			response.setResident(resident);
		}
		
		if(TypeRequestor.VISITOR.equals(permision.getType())) {
			Visitor visitor = visitorClient.getById(permision.getRequestor()).getBody();
			response.setRequestor(visitor);
			
			
		}else if(TypeRequestor.SERVICE_SUPPLIER.equals(permision.getType())) {
			//chamara o microservice do Service SUpplier
			response.setRequestor(null);
		}

		Permision permission = service.save(permision);
		
		response.setId(permission.getId());
		response.setStatus(permission.getStatus());
		response.setType(permission.getType());
		response.setCreatedAt(permision.getCreatedAt());
		
		return ResponseEntity.ok(response);
	}
	
	
	@GetMapping("/all/{typeRequestor}/{id}")
	public ResponseEntity<List<Permision>> getByRequestor(@PathVariable TypeRequestor typeRequestor, @PathVariable UUID id){
	
		if(TypeRequestor.VISITOR.equals(typeRequestor)) {
			Visitor visitor = visitorClient.getById(id).getBody();
			
		}else if(TypeRequestor.SERVICE_SUPPLIER.equals(typeRequestor)) {
			//chamara o microservice do Service SUpplier
		}
		
		return ResponseEntity.ok(service.getByRequestor(id));
	}
	
	
	@GetMapping("/resident/{id}")
	public ResponseEntity<List<Permision>> getByRequestor(@PathVariable UUID id){
		return ResponseEntity.ok(service.getByResident(id));
	}
	
	
	@PutMapping
	public ResponseEntity<Permision> permissionRequestAlter(@RequestBody Permision permision){
		
		if(permision.getId() == null) {
			return ResponseEntity.badRequest().build();
		}else {
			//CHAMARA 
			return  ResponseEntity.ok(service.update(permision));
		}
		
	}

}
