package com.ibm.prueba.servicio;

import java.util.List;
import org.springframework.stereotype.Service;

import com.ibm.prueba.modelo.Usuario;
import com.ibm.prueba.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Clase con los servicios del Usuario
 * @author Andressadas
 *
 */
@Service
public class UsuarioServicio implements UsuarioServicioLocal {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	/**
	 * Consulta el Usuario filtrando por el ID
	 * @param idUsuario
	 * @return
	 */
	@Override
	public Usuario consultarUsuario(long idUsuario) {
		return usuarioRepositorio.findById(idUsuario).get();
	}

	/**
	 * Retorna una lista de los Usuarios
	 * @return
	 */
	@Override
	public List<Usuario> consultarListaUsuario() {
		return (List<Usuario>) usuarioRepositorio.findAll();
	}

	/**
	 * Registra el Usuario
	 * @param usuario
	 */
	@Override
	public void registrarUsuario(Usuario usuario) {
		usuarioRepositorio.save(usuario);
	}

	/**
	 * Editar el Usuario
	 * @param usuario
	 * @param idUsuario
	 */
	@Override
	public void editarUsuario(Usuario usuario, long idUsuario) {
		usuarioRepositorio.findById(idUsuario).ifPresent((x)->{
			usuario.setIdUsuario(idUsuario);
			usuarioRepositorio.save(usuario);
		});
	}

	/**
	 * Eliminar el Usuario
	 * @param idUsuario
	 */
	@Override
	public void eliminarUsuario(long idUsuario) {
		usuarioRepositorio.deleteById(idUsuario);
	}

}
