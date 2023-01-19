package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class ClientController {

	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path = "/clients")
	@CircuitBreaker(name="/catalog",fallbackMethod="getCatalogFallback")
	public String getCatalouge() {
		return template.getForObject("http://localhost:1010/api/v1/catalog", String.class);
	}
	
public String getCatalogFallback(Exception e) {
		
		return "{Fallback}";
		
	}
	
}
