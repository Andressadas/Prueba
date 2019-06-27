package com.ibm.prueba.controlador;

import java.util.List;

import com.ibm.prueba.modelo.Usuario;
import com.ibm.prueba.servicio.UsuarioServicioLocal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Clase que controla los Rest del Usuario
 * @author Andressadas
 *
 */
@RestController
public class UsuarioControlador {

	@Autowired
	UsuarioServicioLocal usuarioServicioLocal;
	
	/**
	 * Metodo que permite consultar filtrando por el ID
	 * @param id
	 * @return
	 */
	@GetMapping("/consultarUsuario/{id}")
	public Usuario consultarUsuario(@PathVariable(value = "id") long id) {
		return usuarioServicioLocal.consultarUsuario(id);
	}
	
	/**
	 * Metodo que permite consultar la lista
	 * @return
	 */
	@GetMapping("/listaUsuarios")
	public List<Usuario> consultarListaUsuario(){
		return usuarioServicioLocal.consultarListaUsuario();
	}
	
	/**
	 * Metodo que permite registrar
	 * @param usuario
	 */
	@PostMapping("/registrarUsuario")
	public void registrarUsuario(Usuario usuario) {
		usuarioServicioLocal.registrarUsuario(usuario);
	}
	
	/**
	 * Metodo que permite actualizar
	 * @param usuario
	 * @param id
	 */
	@PutMapping("/actualizarUsuario/{id}")
	public void editarUsuario(Usuario usuario, @PathVariable(value = "id") long id) {
		usuarioServicioLocal.editarUsuario(usuario, id);
	}
	
	/**
	 * Metodo que permite eliminar
	 * @param id
	 */
	@DeleteMapping("/eliminarUsuario/{id}")
	public void eliminarUsuario(@PathVariable(value = "id") long id) {
		usuarioServicioLocal.eliminarUsuario(id);
	}
	
}
