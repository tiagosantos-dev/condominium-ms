package com.condominium.ordinance.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "localhost:900/visitor-service/", name = "visitor-service")
public interface VisitorClient {

}
