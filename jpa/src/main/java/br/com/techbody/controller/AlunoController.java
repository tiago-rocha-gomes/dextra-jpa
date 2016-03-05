package br.com.techbody.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.techbody.entities.Aluno;

@Controller
public class AlunoController {
	
	@RequestMapping("/cadastro-aluno")
	public String cadastroAluno(){
		
		return "cadastro-aluno";
	}
	
	@RequestMapping("/inserir-aluno")
	public String inserirAluno(@RequestParam String nome,
			@RequestParam String sobreNome,
			@RequestParam int idade,
			@RequestParam char sexo,
			@RequestParam String login,
			@RequestParam String senha,
			@RequestParam double altura,
			@RequestParam double peso){
		
	//	String sexo;

		Aluno a = new Aluno();
		
		a.setAltura(altura);
		a.setDataCadastro(new Date());
		a.setIdade(idade);
		a.setLogin(login);
		a.setNome(nome);
		a.setPeso(peso);
		a.setSenha(senha);
	
		
		
		return "";
	}

}
