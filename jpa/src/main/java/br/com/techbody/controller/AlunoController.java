package br.com.techbody.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.techbody.controller.json.AlunoResponse;
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
	@ResponseBody
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
			message = "Problema ao inserir aluno";
		}	
		return new MessageResponse(message);
	}
	
	@RequestMapping("/excluir-aluno")
	@ResponseBody
	public MessageResponse excluirAluno(@RequestParam List<Long> ids){
		String message = "";
		try{
			alunoService.excluirAluno(ids);

			message = "Aluno excluido com sucesso";
		}catch(Exception e){
			message = e.getMessage();
		}
		
		return new MessageResponse(message);
	}
	
	

	
	
	
	
	
	
	
	

	@RequestMapping("/consulta-alunos")
	@ResponseBody
	public AlunoResponse getAll(){
		Boolean success = null;
		String message= "";
		try{
			
			List<Aluno> lista = alunoService.getAll();
			success = true;
			message = lista != null ? "Pessoas consultadas com sucesso!" : "Nao existem pessoas cadastradas.";
			return new AlunoResponse(success, message, lista);
		
		}catch(Exception e){
			success = false;
			message = "Houve um problema na consulta da Pessoa!";
			return new AlunoResponse(success, message);
		}
		
		
	}
	
	
	
	
	
	
}
