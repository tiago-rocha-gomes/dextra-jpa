package br.com.techbody.service;

import br.com.techbody.entities.Endereco;

public interface EnderecoService {

	void incluirEndereco(Endereco p);

	Endereco consultarEndereco(Long id);

	void removerEndereco(Long id);

}
