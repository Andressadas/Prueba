package com.ibm.prueba.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.prueba.modelo.Tarjeta;
import com.ibm.prueba.servicio.TarjetaServicioLocal;

/**
 * Clase que controla los Rest de la Tarjeta
 * @author Andressadas
 *
 */
@RestController
public class TarjetaControlador {

	@Autowired
	TarjetaServicioLocal tarjetaServicioLocal;
	
	/**
	 * Metodo que permite consultar filtrando por el ID
	 * @param id
	 * @return
	 */
	@GetMapping("/consultarTarjeta/{id}")
	public Tarjeta consultarTarjeta(@PathVariable(value = "id") long id) {
		return tarjetaServicioLocal.consultarTarjeta(id);
	}
	
	/**
	 * Metodo que permite consultar la lista
	 * @return
	 */
	@GetMapping("/listaTarjetas")
	public List<Tarjeta> consultarListaTarjeta(){
		return tarjetaServicioLocal.consultarListaTarjeta();
	}
	
	/**
	 * Metodo que permite registrar
	 * @param usuario
	 */
	@PostMapping("/registrarTarjeta")
	public void registrarTarjeta(Tarjeta tarjeta) {
		tarjetaServicioLocal.registrarTarjeta(tarjeta);
	}
	
	/**
	 * Metodo que permite actualizar
	 * @param usuario
	 * @param id
	 */
	@PutMapping("/actualizarTarjeta/{id}")
	public void editarTarjeta(Tarjeta tarjeta, @PathVariable(value = "id") long id) {
		tarjetaServicioLocal.editarTarjeta(tarjeta, id);
	}
	
	/**
	 * Metodo que permite eliminar
	 * @param id
	 */
	@DeleteMapping("/eliminarTarjeta/{id}")
	public void eliminarTarjeta(@PathVariable(value = "id") long id) {
		tarjetaServicioLocal.eliminarTarjeta(id);
	}
	
}
