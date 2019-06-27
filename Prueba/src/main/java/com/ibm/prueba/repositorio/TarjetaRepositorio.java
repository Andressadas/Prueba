package com.ibm.prueba.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.ibm.prueba.modelo.Tarjeta;
import org.springframework.stereotype.Repository;

/**
 * Repositorio Tarjeta
 * @author Andressadas
 *
 */
@Repository
public interface TarjetaRepositorio extends CrudRepository<Tarjeta, Long>{

}
