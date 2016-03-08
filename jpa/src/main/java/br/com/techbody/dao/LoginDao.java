package br.com.techbody.dao;

import br.com.techbody.entities.Instrutor;

public interface LoginDao extends GenericDao<Instrutor, Long>{

	boolean verificarLogin(Instrutor i);
	
	
}
