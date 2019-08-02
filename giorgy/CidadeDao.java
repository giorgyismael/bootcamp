package model.dao;

import java.util.List;

import model.entities.Cidade;

public interface CidadeDao {
	void insert(Cidade obj);
	void update(Cidade obj);
	void delete(Cidade obj);
	Cidade findById(Integer id);
	List<Cidade> findAll();
}
