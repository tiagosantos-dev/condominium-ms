package com.condominium.ordinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrdinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdinanceApplication.class, args);
	}

}
