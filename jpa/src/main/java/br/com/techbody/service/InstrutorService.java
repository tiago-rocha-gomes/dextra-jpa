package br.com.techbody.service;


import java.util.List;

import br.com.techbody.entities.Instrutor;

public interface InstrutorService {
	
	
	void incluirInstrutor(Instrutor i);
	
	List<Instrutor> getAll();
		
	Instrutor update(Instrutor i);
	
	void excluirInstrutor(Instrutor i);
	
	void excluirInstrutor(List<Long> ids);
	
	Instrutor findById(Long id);

}
