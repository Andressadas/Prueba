package com.ibm.prueba.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.ibm.prueba.modelo.Asesor;
import org.springframework.stereotype.Repository;

/**
 * Repositorio Asesor
 * @author Andressadas
 *
 */
@Repository
public interface AsesorRepositorio extends CrudRepository<Asesor, Long>{

}
