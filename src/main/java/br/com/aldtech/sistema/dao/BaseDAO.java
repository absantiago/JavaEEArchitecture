package br.com.aldtech.sistema.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RequestScoped
public abstract class BaseDAO<T extends Serializable, PK extends Serializable> {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public T findOne(PK id) {
		return (T) entityManager.find(getTypeClass(), id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return entityManager.createQuery("from " + getTypeClass().getName()).getResultList();
	}

	public void persist(T entity) {
		entityManager.persist(entity);
	}

	public T merge(T entity) {
		return entityManager.merge(entity);
	}

	public void remove(T entity) {
		entityManager.remove(entity);
	}

	public void deleteById(PK entityId) {
		T entity = findOne(entityId);
		remove(entity);
	}

	protected EntityManager getEntityManager() {
		return getEntityManager();
	}
	
	protected Class<?> getTypeClass() {
		return (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
}
