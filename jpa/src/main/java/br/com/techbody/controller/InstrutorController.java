package br.com.techbody.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InstrutorController {

	
	@RequestMapping("/cadastro-instrutor")
	public String cadastroInstrutor(){		
		return "cadastro-instrutor";
	}
	
}
