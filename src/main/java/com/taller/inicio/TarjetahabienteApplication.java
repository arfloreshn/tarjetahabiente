package com.taller.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.taller.controller"})
public class TarjetahabienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarjetahabienteApplication.class, args);
	}

}
