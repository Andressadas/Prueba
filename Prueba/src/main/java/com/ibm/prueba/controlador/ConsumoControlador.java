package com.ibm.prueba.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.prueba.modelo.Consumo;
import com.ibm.prueba.servicio.ConsumoServicioLocal;

/**
 * Clase que controla los Rest del Consumo
 * @author Andressadas
 *
 */
@RestController
public class ConsumoControlador{

	@Autowired
	ConsumoServicioLocal consumoServicioLocal;
	
	/**
	 * Metodo que permite consultar filtrando por el ID
	 * @param id
	 * @return
	 */
	@GetMapping("/consultaConsumo/{id}")
	public Consumo consultarConsumo(@PathVariable(value = "id") long id) {
		return consumoServicioLocal.consultarConsumo(id);
	}
	
	/**
	 * Metodo que permite consultar la lista
	 * @return
	 */
	@GetMapping("/istaConsumos")
	public List<Consumo> consultarListaConsumo(){
		return consumoServicioLocal.consultarListaConsumo();
	}
	
	/**
	 * Metodo que permite registrar
	 * @param usuario
	 */
	@PostMapping("/registrarConsumo")
	public void registrarConsumo(Consumo consumo) {
		consumoServicioLocal.registrarConsumo(consumo);
	}
	
	/**
	 * Metodo que permite actualizar
	 * @param usuario
	 * @param id
	 */
	@PutMapping("/actualizaronsumo/{id}")
	public void editarConsumo(Consumo consumo, @PathVariable(value = "id") long id) {
		consumoServicioLocal.editarConsumo(consumo, id);
	}
	
	/**
	 * Metodo que permite eliminar
	 * @param id
	 */
	@DeleteMapping("/eliminarConsumo/{id}")
	public void eliminarConsumo(@PathVariable(value = "id") long id) {
		consumoServicioLocal.eliminarConsumo(id);
	}
	
}
