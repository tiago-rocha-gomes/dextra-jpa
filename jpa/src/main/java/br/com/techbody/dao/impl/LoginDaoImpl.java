package br.com.techbody.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.com.techbody.dao.LoginDao;
import br.com.techbody.entities.Instrutor;

@Repository
public class LoginDaoImpl extends GenericDaoImp<Instrutor, Long> implements LoginDao{

	@Override	
	public boolean verificarLogin(Instrutor i){
	
		Map<String , Object> params = new HashMap();
		
		params.put("usuario", i.getUsuario());
		params.put("senha", i.getSenha());
		
		Instrutor byParams = this.getByParams(params);
		
		if (byParams != null){
			return true;
		}
		
		return false;
	}
	
}
