package br.com.techbody.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.techbody.dao.InstrutorDao;
import br.com.techbody.entities.Instrutor;
import br.com.techbody.service.InstrutorService;
@Service
public class InstrutorServiceImpl implements InstrutorService {
	
	@Autowired
	private InstrutorDao instrutorDAO;

	@Override
	public void incluirInstrutor(Instrutor i) {
		instrutorDAO.save(i);
		
	}

	@Override
	public List<Instrutor> getAll() {
		return instrutorDAO.getAll();
	}


	@Override
	public Instrutor update(Instrutor i) {
		Instrutor i2  = instrutorDAO.update(i);
		return i2;
	}

	@Override
	public void excluirInstrutor(Instrutor i) {
		instrutorDAO.delete(i);
		
	}

	@Override
	public void excluirInstrutor(List<Long> ids) {
		Instrutor i = new Instrutor();
		for (int c =0 ; c<ids.size();c++){
			i.setId(ids.get(c));
			excluirInstrutor(i);
		}
		
	}

	@Override
	public Instrutor findById(Long id) {
		
		return instrutorDAO.findById(id);
	}
	
}