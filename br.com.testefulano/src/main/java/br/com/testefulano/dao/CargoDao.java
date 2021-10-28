package br.com.testefulano.dao;

import java.util.List;

import br.com.testefulano.domain.Cargo;

public interface CargoDao {
	
	public void save(Cargo cargo);
	
	public void update(Cargo cargo);
	
	public void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();

}
