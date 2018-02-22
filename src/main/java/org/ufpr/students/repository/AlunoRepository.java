package org.ufpr.students.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.ufpr.students.model.Aluno;

/**
 * Created by roberto on 22/10/17.
 */

@Stateless
public class AlunoRepository {

	@PersistenceContext(unitName = "JpaContext")
	private EntityManager entityManager;

	public List<Aluno> findAll() {
		return entityManager.createQuery( "SELECT A FROM Aluno A", Aluno.class ).getResultList();
	}

	public Aluno find(Long id) {
		return entityManager.find( Aluno.class, id );
	}

	public Aluno merge(Aluno aluno) {
		return entityManager.merge( aluno );
	}

	public Aluno delete(Long id) {
		Aluno aluno = find( id );
		entityManager.remove( aluno );
		return aluno;
	}
}
