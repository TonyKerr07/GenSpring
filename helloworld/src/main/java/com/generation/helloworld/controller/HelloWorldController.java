package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/BSMS")
	public String listaBsmsGen() {
		return "Generation - Lista de BSM's:"
				+ "\n1 - Comunicação;"
				+ "\n2 - Habilidades comportamentais e mentalidades;"
				+ "\n3 - Mentalidade de crescimento;"
				+ "\n4 - Orientação ao Detalhe;"
				+ "\n5 - Orientação ao futuro;"
				+ "\n6 - Persistencia;"
				+ "\n7 - Proatividade;"
				+ "\n8 - Responsabilidade pessoal;"
				+ "\n9 - Trabalho em equipe.";
	}

	@GetMapping("/Objetivos")
	public String objetivosSemana() {
		return "Generation - Objetivos da semana:"
				+ "\n1 - Aumentar minha contribuição durante os momentos sincronos;"
				+ "\n2 - Finalizar as entregas dentro do prazo;"
				+ "\n3 - Dar andamento ao blog pessoal;"
				+ "\n4 - Contribuir efetivamente com o grupo do projeto integrador.";
	}
}
