package br.com.testefulano.dao;

import org.springframework.stereotype.Repository;

import br.com.testefulano.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
