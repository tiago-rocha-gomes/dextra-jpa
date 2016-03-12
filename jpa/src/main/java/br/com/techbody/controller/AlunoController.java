package br.com.techbody.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
			@RequestParam double peso,
			HttpServletResponse response){
				
		String message = "";
		try{
			Aluno a = new Aluno();
			
			
			
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
			response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}	
		return new MessageResponse(message);
	}
	
	
	@RequestMapping("/excluir-aluno")
	@ResponseBody
	public MessageResponse excluirAluno(@RequestBody List<Long> ids){
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
	public List<Aluno> getAll() {
		Boolean success = null;
		String message = "";
		List<Aluno> lista = new ArrayList<>();
		try {

			lista = alunoService.getAll();
			success = true;
			message = lista != null ? "Alunos consultados com sucesso!"
					: "Nao existem pessoas cadastradas.";
			return lista;

		} catch (Exception e) {
			success = false;
			message = "Houve um problema na consulta do aluno!";
			return lista;
		}

	}

	
	
	@RequestMapping("/atualiza-aluno")
	@ResponseBody
	public AlunoResponse update(@RequestParam Long id, @RequestParam String nome,
			@RequestParam String sobrenome, @RequestParam int idade,
			@RequestParam char sexo, @RequestParam double altura,
			@RequestParam double peso) {
		
		Boolean success = null;
		String message= "";
		try{
			Aluno a = alunoService.findById(id);

			a.setNome(nome);
			a.setSobrenome(sobrenome);
			a.setIdade(idade);

			SexoEnum byDesc = SexoEnum.getByDesc(sexo);
			Sexo generateSexoEntity = SexoEnum.generateSexoEntity(byDesc);
			
			a.setSexo(generateSexoEntity);
			a.setPeso(peso);
			a.setAltura(altura);
			
			alunoService.update(a);
			success = true;
			message = "Aluno atualizado com sucesso.";
			return new AlunoResponse(success, message, Arrays.asList(a));
		
		}catch(Exception e){
			success = false;
			message = "Houve um problema na atualizacao do aluno! / Aluno nao encontrado!";
			return new AlunoResponse(success, message);
		}
	}
	
	
	
	
	
	
}
