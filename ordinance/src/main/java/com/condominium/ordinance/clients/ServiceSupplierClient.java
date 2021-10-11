package com.condominium.ordinance.clients;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.condominium.ordinance.models.ServiceSupplier;



@FeignClient(url = "localhost:6000/service-supplier/")
public interface ServiceSupplierClient {
	
	@GetMapping("/{id}")
	public ResponseEntity<ServiceSupplier> getById(@PathVariable UUID id);

}
