package br.com.techbody.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.techbody.dao.AlunoDao;
import br.com.techbody.entities.Aluno;

@Transactional
@Repository
public class AlunoDaoImpl implements AlunoDao{
	
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		if (entityManager == null)
			throw new IllegalAccessError("ERRO");
		
		return this.entityManager;
	}

	@PersistenceContext
	protected void setEntityManager(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}
	
	
	@Override
	public Class<?> getObjectClass() {
		return this.getObjectClass();
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Aluno save(Aluno object) {
		getEntityManager().clear();
		getEntityManager().persist(object);
		return object;
		
	}

	@Override
	public Aluno findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno update(Aluno object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Aluno object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Aluno> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listByParams(String query, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listByQuery(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno getByParams(String query, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno getByParams(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
