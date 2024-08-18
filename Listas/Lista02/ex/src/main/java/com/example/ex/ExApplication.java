package com.example.ex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app")
@RestController
@SpringBootApplication
public class ExApplication {
	private List<IlhaDeCalor> ilha = new ArrayList<>();
	
	@GetMapping("/ilhas-de-calor")
	public List<IlhaDeCalor> getIlhaDeCalor(){
		return ilha;
	}

	@PostMapping("/ilhas-de-calor")
	public String adicionarIlhaDeCalor(@RequestBody IlhaDeCalor ilhas){
		ilha.add(ilhas);
		return "ilha de calor " + ilhas.getBairro() + " adicionada com sucesso";
	}


	public static void main(String[] args) {
		SpringApplication.run(ExApplication.class, args);
	}

	public void setIlha(List<IlhaDeCalor> ilha) {
		this.ilha = ilha;
	}	
}