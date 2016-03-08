package br.com.techbody.service;

import java.util.List;

import br.com.techbody.entities.Aluno;

public interface AlunoService {

	void inserirAluno(Aluno aluno);
	
	void excluirAluno(List<Long> ids);

	void excluirAluno(Aluno aluno);

	
}
