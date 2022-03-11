package com.API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(path = "/hola")//localhost:8080/hola
	public String getProduct() {
		return "Hola Mundo";
	}
	
}
