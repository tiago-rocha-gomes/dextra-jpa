package br.com.techbody.dao;

import br.com.techbody.entities.TipoIMC;

public interface TipoImcDao extends GenericDao<TipoIMC, Long>{
	
	TipoIMC getTipoImcByImc(Double value);

}
