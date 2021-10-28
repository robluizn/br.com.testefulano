package br.com.testefulano.dao;

import org.springframework.stereotype.Repository;

import br.com.testefulano.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

}
