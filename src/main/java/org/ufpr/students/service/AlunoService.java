package org.ufpr.students.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.ufpr.students.model.Aluno;
import org.ufpr.students.repository.AlunoRepository;

/**
 * Created by roberto on 29/01/18.
 */
@Stateless
public class AlunoService {

	@Inject
	private AlunoRepository repository;

	public List<Aluno> findAll() {
		return repository.findAll();
	}

	public Aluno find(Long id) {
		System.out.println( "aqu2" );
		return repository.find( id );
	}

	public Aluno create(Aluno aluno) {
		return repository.merge( aluno );
	}

	public Aluno update(Aluno aluno) {
		return repository.merge( aluno );
	}

	public Aluno delete(Long id) {
		return repository.delete( id );
	}
}
