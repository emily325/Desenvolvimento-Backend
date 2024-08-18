package com.example.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@SpringBootApplication
public class ExApplication {
	private List <ilhaDeCalor> ilhasDeCalor = new ArrayList<>();
	
	@GetMapping
	public void listarIlhaDeCalor(){
		for (ilhasDeCalor a : ilhasDeCalor) {
			
		}
	}

	@PostMapping
	public void adicionarIlhaDeCalor(){

	}


	public static void main(String[] args) {
		SpringApplication.run(ExApplication.class, args);
	}

	
}
