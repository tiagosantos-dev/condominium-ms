package com.condominium.ordinance.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.condominium.ordinance.models.Permision;

@RestController
@RequestMapping("/ordinance-service/permission")
public class PermissionController {
	
	@PostMapping
	public ResponseEntity<Permision> permissionRequest(@RequestBody Permision permision){
		
		//CHAMARA 
		return null;
	}
	

}
