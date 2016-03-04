package br.com.techbody.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.techbody.dao.EnderecoDao;
import br.com.techbody.entities.Endereco;
import br.com.techbody.service.EnderecoService;

@Service
public class EnderecoServiceImpl implements EnderecoService{

	@Autowired
	private EnderecoDao enderecoDAO;
	
	@Override
	public void incluirEndereco(Endereco p) {
		enderecoDAO.save(p);
	}

	@Override
	public Endereco consultarEndereco(Long id) {
		return enderecoDAO.findById(id); 
	}

	@Override
	public void removerEndereco(Long id) {
		Endereco enderecoParaDeletar = new Endereco();
		enderecoParaDeletar.setId(id);
		enderecoDAO.delete(enderecoParaDeletar);
	}

}
