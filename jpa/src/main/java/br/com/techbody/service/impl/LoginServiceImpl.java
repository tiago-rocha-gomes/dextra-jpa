package br.com.techbody.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.techbody.dao.LoginDao;
import br.com.techbody.entities.Instrutor;
import br.com.techbody.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDao loginDao;

	@Override
	public boolean selecionarLogin(Instrutor instrutor) {
			
		return loginDao.verificarLogin(instrutor);
		
	}

}
