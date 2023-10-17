package com.minsait.curso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/biblioteca")
public class BibliotecaController {

	@GetMapping("/bienvenida")
	
	public String Bienvenida() {	
		return "Bienvenido a la Biblioteca";
	}
}
