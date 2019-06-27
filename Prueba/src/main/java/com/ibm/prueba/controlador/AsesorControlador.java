package com.ibm.prueba.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.prueba.modelo.Asesor;
import com.ibm.prueba.servicio.AsesorServicioLocal;

/**
 * Clase que controla los Rest del Asesor
 * @author Andressadas
 *
 */
@RestController
public class AsesorControlador {

	@Autowired
	AsesorServicioLocal asesorServicioLocal;
	
	/**
	 * Metodo que permite consultar filtrando por el ID
	 * @param id
	 * @return
	 */
	@GetMapping("/consultarAsesor/{id}")
	public Asesor consultarAsesor(@PathVariable(value = "id") long id) {
		return asesorServicioLocal.consultarAsesor(id);
	}
	
	/**
	 * Metodo que permite consultar la lista
	 * @return
	 */
	@GetMapping("/listaAsesores")
	public List<Asesor> consultarListaAsesor(){
		return asesorServicioLocal.consultarListaAsesor();
	}
	
	/**
	 * Metodo que permite registrar
	 * @param usuario
	 */
	@PostMapping("/registrarAsesor")
	public void registrarAsesor(Asesor asesor) {
		asesorServicioLocal.registrarAsesor(asesor);
	}
	
	/**
	 * Metodo que permite actualizar
	 * @param usuario
	 * @param id
	 */
	@PutMapping("/actualizarAsesor/{id}")
	public void editarAsesor(Asesor asesor, @PathVariable(value = "id") long id) {
		asesorServicioLocal.editarAsesor(asesor, id);
	}
	
	/**
	 * Metodo que permite eliminar
	 * @param id
	 */
	@DeleteMapping("/eliminarAsesor/{id}")
	public void eliminarAsesor(@PathVariable(value = "id") long id) {
		asesorServicioLocal.eliminarAsesor(id);
	}
	
}
