package com.ibm.prueba.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.ibm.prueba.modelo.Usuario;
import org.springframework.stereotype.Repository;

/**
 * Repositorio Usuario
 * @author Andressadas
 *
 */
@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {

}
