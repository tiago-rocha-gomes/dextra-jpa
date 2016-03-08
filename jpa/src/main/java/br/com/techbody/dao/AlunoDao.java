package br.com.techbody.dao;

import java.util.List;

import br.com.techbody.entities.Aluno;

public interface AlunoDao extends GenericDao<Aluno, Long>{

	
	List<Aluno> getAll();
	
	
	
	
	
	
}
