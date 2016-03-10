package br.com.techbody.dao;

import java.util.List;


import br.com.techbody.entities.Instrutor;

public interface InstrutorDao extends GenericDao<Instrutor, Long> {
	
	List<Instrutor> getAll();
	
	Instrutor update(Instrutor i);
	
	
}
