package br.com.techbody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.techbody.controller.json.MessageResponse;
import br.com.techbody.entities.Endereco;
import br.com.techbody.service.EnderecoService;

@Controller
public class CadastroEnderecoExemploController {

	@Autowired
	private EnderecoService enderecoService;
	
	@RequestMapping(value="/cadastro-exemplo")
	public String direcionarTela(){
		return "cadastro-exemplo";
	}
	
	
	@RequestMapping(value="/cadastrar-endereco", method=RequestMethod.POST)
	@ResponseBody
	public MessageResponse populaEndereco(
			@RequestParam String endereco, 
			@RequestParam String bairro, 
			@RequestParam Integer numero,
			@RequestParam(required=false) String complemento
	){
		String message = "";
		try{
			Endereco obj = new Endereco();
			obj.setNomeEndereco(endereco);
			obj.setBairro(bairro);
			obj.setNumero(numero);
			obj.setComplemento(complemento);
			
			enderecoService.incluirEndereco(obj);
			
			message = "Endereço inserido com sucesso.";
		}catch(Exception e){
			message = "Houve um problema na inserção do Endereço!";
		}
		return new MessageResponse(message);
	}
}
