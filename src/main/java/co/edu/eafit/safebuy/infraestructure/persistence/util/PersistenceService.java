package co.edu.eafit.safebuy.infraestructure.persistence.util;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface PersistenceService {

	@Transactional
	<T> T save(T entity);

	@Transactional
	<T> T update(T entity);

	@Transactional
	<T> void remove(T entity);

	<T> T findById(Class<T> entityClass, int id);

	@Transactional
	<T> List<T> executeQuery(Class<T> resultClass, String query,
			String... parameters);

}
