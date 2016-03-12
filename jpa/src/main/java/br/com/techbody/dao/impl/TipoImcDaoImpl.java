package br.com.techbody.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.techbody.dao.TipoImcDao;
import br.com.techbody.entities.TipoIMC;

@Repository
public class TipoImcDaoImpl extends GenericDaoImp<TipoIMC, Long> implements TipoImcDao{

	public TipoIMC getTipoImcByImc(Double value){
		
		String query = "SELECT p from TipoIMC p WHERE :value BETWEEN p.min AND p.max ";
		Map <String,Object> params = new HashMap<>();
		params.put("value", value);
		return this.getByParams(query, params);
	}

}
