package com.condominium.ordinance.clients;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.condominium.ordinance.models.Resident;

@FeignClient(url = "localhost:7000/resident-service/", name = "resident-service")
public interface ResidentClient {
	
	@GetMapping("/{id}")
	public ResponseEntity<Resident> getById(@PathVariable UUID id);
		
	

}
