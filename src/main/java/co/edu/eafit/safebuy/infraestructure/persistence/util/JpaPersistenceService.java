package co.edu.eafit.safebuy.infraestructure.persistence.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

@Component
public class JpaPersistenceService implements PersistenceService {

//	 @PersistenceContext
	private EntityManager entityManager;

	@Override
	public <T> T save(T entity) {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public <T> T update(T entity) {
		return entityManager.merge(entity);
	}

	@Override
	public <T> void remove(T entity) {
		entityManager.remove(entityManager.merge(entity));
	}

	@Override
	public <T> T findById(Class<T> entityClass, int id) {
		return entityManager.find(entityClass, id);
	}

	@Override
	public <T> List<T> executeQuery(Class<T> resultClass, String query,
			String... parameters) {
		TypedQuery<T> typedQuery = entityManager
				.createQuery(query, resultClass);
		if (parameters != null) {
			for (int i = 0; i < parameters.length; i++) {
				typedQuery.setParameter(i + 1, parameters[i]);
			}
		}
		return typedQuery.getResultList();
	}

}