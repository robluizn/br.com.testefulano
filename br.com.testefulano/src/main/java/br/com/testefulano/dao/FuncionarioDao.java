package br.com.testefulano.dao;

import java.util.List;

import br.com.testefulano.domain.Funcionario;



public interface FuncionarioDao {
	
	public void save(Funcionario funcionario);
	
	public void update(Funcionario funcionario);
	
	public void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();

}
