package br.com.techbody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.techbody.controller.json.MessageResponse;
import br.com.techbody.entities.Instrutor;
import br.com.techbody.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public MessageResponse login(@RequestParam String usuario, @RequestParam String senha) {

		Instrutor i = new Instrutor();
		String message = "";

		i.setUsuario(usuario);
		i.setSenha(senha);

		boolean selecionarLogin = loginService.selecionarLogin(i);

		if (!selecionarLogin) {

			message = "Falha ao logar, verifique usuário e a senha";

		} else {

			message = "Bem vindo";

		}
		return new MessageResponse(message);

	}

}
