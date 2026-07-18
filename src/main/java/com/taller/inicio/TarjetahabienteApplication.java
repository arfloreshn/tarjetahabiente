package com.taller.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication(scanBasePackages = {"com.taller.controller","com.taller.services"})
public class TarjetahabienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarjetahabienteApplication.class, args);
	}

	
	@LoadBalanced
	@Bean
	public WebClient getClient() {
		
		WebClient webClient = WebClient.builder()
				  .baseUrl("http://localhost:8010")
				  .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				  .build();
		
		return webClient;
	}
	 	
}
