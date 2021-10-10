package com.condominium.ordinance.controllers;

import java.util.HashMap;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.condominium.ordinance.models.Permision;
import com.condominium.ordinance.models.TypeRequestor;

@RestController
@RequestMapping("/ordinance-service/permission")
public class PermissionController {
	
	@PostMapping
	public ResponseEntity<Permision> permissionRequest(@RequestBody Permision permision){
		
		//CHAMARA 
		return null;
	}
	
	
	@GetMapping("/all/{typeRequestor}/{id}")
	public ResponseEntity<Permision> permissionRequest(@PathVariable TypeRequestor typeRequestor, @PathVariable UUID id){
	
		if(TypeRequestor.VISITOR.equals(typeRequestor)) {
			//chamara o microservice do visitor
		}else if(TypeRequestor.SERVICE_SUPPLIER.equals(typeRequestor)) {
			//chamara o microservice do Service SUpplier
		}
		
		return null;
	}
	


}
