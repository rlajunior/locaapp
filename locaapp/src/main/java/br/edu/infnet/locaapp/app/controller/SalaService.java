package br.edu.infnet.locaapp.app.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.edu.infnet.locaapp.app.model.Sala;
import br.edu.infnet.locaapp.app.model.persistence.SalaDao;


@Service
public class SalaService {
 
	@Autowired
	private SalaDao dao;

	public SalaService() {
	}
	
	@Transactional(propagation = Propagation.NEVER)
	public List<Sala> getSalas() {
		return dao.getAll();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void persite(Sala sala) {
		dao.salvar(sala);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Sala sala) {
		dao.editar(sala);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(Integer id) {
		dao.deletar(id);
	}

	@Transactional(propagation = Propagation.NEVER)
	public Sala getSala(String id) {
		Objects.requireNonNull(id, "vai para lá com esse id nullo");
		
		Integer integer = Integer.valueOf(id);
		return dao.findOne(integer);
	}

	public SalaDao getDao() {
		return dao;
	}

	public void setDao(SalaDao dao) {
		this.dao = dao;
	}

}
