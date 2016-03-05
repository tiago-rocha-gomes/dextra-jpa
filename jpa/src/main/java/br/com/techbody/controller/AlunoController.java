package br.com.techbody.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlunoController {
	
	@RequestMapping("/cadastro-aluno")
	public String cadastroAluno(){
		
		return "cadastro-aluno";
	}

}
