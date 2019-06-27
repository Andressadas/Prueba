package com.ibm.prueba.servicio;

import java.util.List;

import com.ibm.prueba.modelo.Usuario;

/**
 * Interface con los servicios del Usuario
 * @author Andressadas
 *
 */
public interface UsuarioServicioLocal {

	/**
	 * Consulta el Usuario filtrando por el ID
	 * @param idUsuario
	 * @return
	 */
	Usuario consultarUsuario(long idUsuario);
	
	/**
	 * Retorna una lista de los Usuarios
	 * @return
	 */
	List<Usuario> consultarListaUsuario();
	
	/**
	 * Registra el Usuario
	 * @param usuario
	 */
	void registrarUsuario(Usuario usuario);
	
	/**
	 * Editar el Usuario
	 * @param usuario
	 * @param idUsuario
	 */
	void editarUsuario(Usuario usuario, long idUsuario);
	
	/**
	 * Eliminar el Usuario
	 * @param idUsuario
	 */
	void eliminarUsuario(long idUsuario);
	
}
