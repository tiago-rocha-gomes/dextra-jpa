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

import br.com.techbody.controller.json.InstrutorResponse;
import br.com.techbody.controller.json.MessageResponse;
import br.com.techbody.entities.Instrutor;
import br.com.techbody.entities.Sexo;
import br.com.techbody.enums.SexoEnum;
import br.com.techbody.service.InstrutorService;

@Controller
public class InstrutorController {

	@Autowired
	private InstrutorService instrutorService;

	@RequestMapping("/cadastro-instrutor")
	public String cadastroInstrutor() {
		return "cadastro-instrutor";
	}

	@RequestMapping("/inserir-instrutor")
	@ResponseBody
	public MessageResponse inserirInstrutor(@RequestParam String nome,
			@RequestParam String sobrenome, @RequestParam int idade,
			@RequestParam char sexo, @RequestParam double salario,
			@RequestParam String login, @RequestParam String senha,
			HttpServletResponse response) {

		String message = "";
		try {
			Instrutor i = new Instrutor();

			i.setNome(nome);
			i.setDataCadastro(new Date());
			i.setIdade(idade);
			i.setSobrenome(sobrenome);
			i.setUsuario(login);
			i.setSenha(senha);
			i.setSalario(salario);
			SexoEnum byDesc = SexoEnum.getByDesc(sexo);
			Sexo generateSexoEntity = SexoEnum.generateSexoEntity(byDesc);
			i.setSexo(generateSexoEntity);

			instrutorService.incluirInstrutor(i);

			message = "Instrutor inserido com sucesso.";
		} catch (Exception e) {
			message = "Problema ao inserir Instrutor";
			response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
		return new MessageResponse(message);
	}

	@RequestMapping("/consulta-instrutores")
	@ResponseBody
	public List<Instrutor> getAll() {
		String message = "";
		List<Instrutor> lista = new ArrayList<>();
		try {
			lista = instrutorService.getAll();
		} catch (Exception e) {
			message = "Houve um problema na consulta do Instrutor!";
		}
		return lista;
	}

	@RequestMapping("/remover-instrutores")
	@ResponseBody
	public MessageResponse remover(@RequestBody List<Long> ids) {

		String message = "";
		try {
			instrutorService.excluirInstrutor(ids);

			message = "Instrutores removidos com sucesso.";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return new MessageResponse(message);

	}

	@RequestMapping("/atualiza-instrutor")
	@ResponseBody
	public InstrutorResponse update(@RequestParam Long id,
			@RequestParam String nome, @RequestParam String sobrenome,
			@RequestParam int idade, @RequestParam char sexo,
			@RequestParam double salario, @RequestParam String login,
			@RequestParam String senha) {

		Boolean success = null;
		String message = "";
		try {
			Instrutor i = instrutorService.findById(id);

			i.setNome(nome);
			i.setDataCadastro(new Date());
			i.setIdade(idade);
			i.setSobrenome(sobrenome);
			i.setUsuario(login);
			i.setSenha(senha);
			i.setSalario(salario);
			SexoEnum byDesc = SexoEnum.getByDesc(sexo);
			Sexo generateSexoEntity = SexoEnum.generateSexoEntity(byDesc);
			i.setSexo(generateSexoEntity);

			instrutorService.update(i);
			success = true;
			message = "Instrutor atualizado com sucesso.";
			return new InstrutorResponse(success, message, Arrays.asList(i));

		} catch (Exception e) {
			success = false;
			message = "Houve um problema na atualizacao do Instrutor! / Instrutor nao encontrado!";
			return new InstrutorResponse(success, message);
		}
	}

}
