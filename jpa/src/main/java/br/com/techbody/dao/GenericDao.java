package br.com.techbody.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface GenericDao<T, ID extends Serializable> {
	public Class<?> getObjectClass();
	public T save(T object);
	public T findById(ID id);
	public T update(T object);
	public void delete(T object);
	public List<T> getAll();
	public List<T> listByParams(String query, Map<String, Object> params);
	public List<T> listByQuery(String query);
	public T getByParams(String query, Map<String, Object> params);
	public T getByParams(Map<String, Object> params);
	
}
