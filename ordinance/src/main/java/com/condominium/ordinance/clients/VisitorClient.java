package com.condominium.ordinance.clients;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.condominium.ordinance.models.Visitor;

@FeignClient(url = "localhost:9000/visitor-service/", name = "visitor-service")
public interface VisitorClient {
	
	@GetMapping("/{id}")
	public ResponseEntity<Visitor> getById(@PathVariable UUID id);

}
