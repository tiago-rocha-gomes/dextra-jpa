package br.com.techbody.service;

import java.util.List;

import br.com.techbody.entities.Aluno;
import br.com.techbody.enums.ImcEnum;

public interface AlunoService {

	void inserirAluno(Aluno aluno);
	
	List<Aluno> getAll();
	
	void excluirAluno(List<Long> ids);

	void excluirAluno(Aluno aluno);

	Aluno update(Aluno aluno);
	
	Aluno findById(Long id);

	ImcEnum manterImc(Long id);
}
