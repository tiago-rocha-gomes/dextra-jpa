package br.com.techbody.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.techbody.controller.json.MessageResponse;
import br.com.techbody.entities.Aluno;
import br.com.techbody.entities.Sexo;
import br.com.techbody.enums.SexoEnum;
import br.com.techbody.service.AlunoService;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@RequestMapping("/cadastro-aluno")
	public String cadastroAluno(){
		
		return "cadastro-aluno";
	}
	
	@RequestMapping("/inserir-aluno")
	public MessageResponse inserirAluno(@RequestParam String nome,
			@RequestParam String sobrenome,
			@RequestParam int idade,
			@RequestParam char sexo,
			@RequestParam double altura,
			@RequestParam double peso){
				
		String message = "";
		try{
			Aluno a = new Aluno();
			
			SexoEnum.getByDesc(sexo);
			
			a.setAltura(altura);
			a.setDataCadastro(new Date());
			a.setIdade(idade);
	
			a.setNome(nome);
			a.setPeso(peso);
			SexoEnum byDesc = SexoEnum.getByDesc(sexo);
			Sexo generateSexoEntity = SexoEnum.generateSexoEntity(byDesc);
			a.setSexo(generateSexoEntity);
			a.setSobrenome(sobrenome);
		
			alunoService.inserirAluno(a);
			
			message = "Aluno inserido com sucesso.";
		}catch(Exception e){
			message = "Falha ao inserir aluno.";
		}
		
		return new MessageResponse(message);
	}

}
