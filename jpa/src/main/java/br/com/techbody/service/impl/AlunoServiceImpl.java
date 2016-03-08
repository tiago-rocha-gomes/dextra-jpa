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
	public List<Aluno> getAll() {
		return alunoDAO.getAll();
	}
	
	
	

	
	
	
}
