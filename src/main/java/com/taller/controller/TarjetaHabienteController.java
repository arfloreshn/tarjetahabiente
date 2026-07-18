package com.taller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.taller.dto.TarjetaHabiente;
import com.taller.services.TarjetaHabienteServices;

import reactor.core.publisher.Flux;





@RequestMapping("api/")
@RestController
public class TarjetaHabienteController {

	@Autowired
	TarjetaHabienteServices services;
	
	@Autowired
	WebClient webClient;	
	
	@GetMapping(value="tarjetahabiente")
	public Flux<TarjetaHabiente> getAll() {
		
		  return services.getAll();
		
	}
}
