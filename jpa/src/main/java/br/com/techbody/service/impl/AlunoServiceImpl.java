package br.com.techbody.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.techbody.dao.AlunoDao;
import br.com.techbody.dao.HistoricoImcDAO;
import br.com.techbody.dao.TipoImcDao;
import br.com.techbody.entities.Aluno;
import br.com.techbody.entities.HistoricoImc;
import br.com.techbody.entities.TipoIMC;
import br.com.techbody.enums.ImcEnum;
import br.com.techbody.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService{

	@Autowired
	private AlunoDao alunoDAO;
	
	@Autowired
	private TipoImcDao tipoImcDAO;
	
	@Autowired
	private HistoricoImcDAO historicoIMC;

	@Override
	public void inserirAluno(Aluno aluno) {
		alunoDAO.save(aluno);
	}
	
	@Override
	public List<Aluno> getAll() {
		return alunoDAO.getAll();
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
	
		
	@Override
	public Aluno update(Aluno aluno) {
		Aluno pessoaAtualizada = alunoDAO.update(aluno);
		return pessoaAtualizada;
	}
	

	@Override
	public Aluno findById(Long id) {
		return alunoDAO.findById(id);
	}
	
	private double getImcAluno(Long id){
		Aluno a = findById(id);				
		return a.getPeso()/(Math.pow(a.getAltura(),2)); 		
	}

	@Override
	public ImcEnum manterImc(Long id) {
		double totalIMC = 0;
		
		Aluno a = findById(id);			
		totalIMC = a.getPeso()/(Math.pow(a.getAltura(),2)); 
		TipoIMC tipoImc = tipoImcDAO.getTipoImcByImc(totalIMC);
		

				
		HistoricoImc histIMC = new HistoricoImc();
		histIMC.setDataCalculo(new Date());
		histIMC.setAluno(a);
		histIMC.setImc(tipoImc);
		histIMC.setImcAtual(totalIMC);
		
		historicoIMC.save(histIMC);
		
		return ImcEnum.getById(tipoImc.getId().intValue());
		
		// select tipoIMC
		//popular uma instancia de historico imc
		//inserir no banco historico
	}
	
	
}
