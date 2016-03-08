package br.com.techbody.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.techbody.dao.AlunoDao;
import br.com.techbody.entities.Aluno;
import br.com.techbody.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService{

	@Autowired
	private AlunoDao alunoDAO;

	@Override
	public void inserirAluno(Aluno aluno) {
		alunoDAO.save(aluno);
	}

	@Override
	public void excluirAluno(List<Long> ids) {
		Aluno a = new Aluno();
		for(int i = 0; i<ids.size(); i++){	
			a.setId(ids.get(i));
			excluirAluno(a);
		}
	}

	@Override
	public void excluirAluno(Aluno aluno) {
		alunoDAO.delete(aluno);
	}
}


