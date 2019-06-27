package com.ibm.prueba.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.ibm.prueba.modelo.Consumo;
import org.springframework.stereotype.Repository;

/**
 * Repositorio Consumo
 * @author Andressadas
 *
 */
@Repository
public interface ConsumoRepositorio extends CrudRepository<Consumo, Long>{

}
